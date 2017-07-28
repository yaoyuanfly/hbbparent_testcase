package test;


import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;

import com.android.uiautomator.core.UiDevice;
import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;



public class Create extends UiAutomatorTestCase{
	 UiDevice mdevice;
	 Create(UiDevice device)
	     {
	         mdevice =device;
	     }
	
final int CLICK_ID=2000;
final int CLICK_TEXT=2001;
final int CLICK_CLASS=2002;
final int CLICK_DESC=2003;

public boolean ClickById(String id) throws InterruptedException {
	return ClickByInfo(CLICK_ID,id);
}

public boolean ClickByText(String text) throws InterruptedException {
	return ClickByInfo(CLICK_TEXT,text);
}
public boolean ClickByClass(String cla,int num) throws InterruptedException {
	return ClickByInfo2(cla,num);
}
public boolean ClickByDesc(String str) throws InterruptedException {
		return ClickByInfo(CLICK_DESC,str);
	}

private boolean ClickByInfo(int CLICK,String str) throws InterruptedException {
	
	UiSelector us=null;
	switch(CLICK){
		case CLICK_ID:  us=new UiSelector().resourceId(str);break;
		case CLICK_TEXT:  us=new UiSelector().text(str);    break;
		case CLICK_DESC:  us=new UiSelector().description(str);   break;
		default:return false;
	}
	UiObject uiobject=new UiObject(us);
	int i=0;
	while(!uiobject.exists()&& i<5) {
		Thread.sleep(2000);
		if(i==4) {
			return false;
		}
		i++;
	}
	
	try {
		UiAutomationLog("click type:"+CLICK+" content:"+str );
		uiobject.clickAndWaitForNewWindow();
	}catch(UiObjectNotFoundException e) {
		e.printStackTrace();
	}
	return true;
}
public String m_logpathString = "/mnt/sdcard/PerformanceLog.txt";
private boolean ClickByInfo2(String str,int num) throws InterruptedException {
	
	UiSelector us=new UiSelector().className(str).index(num); 
	UiObject uiobject=new UiObject(us);
	int i=0;
	while(!uiobject.exists()&& i<5) {
		SolveProblems();
		Thread.sleep(2000);
		if(i==4) {
			return false;
		}
		i++;
	}
	
	try {
		UiAutomationLog("click type:CLICK_Class content:"+str+" instance:"+num );
		uiobject.click();
	}catch(UiObjectNotFoundException e) {
		e.printStackTrace();
	}
	return true;
}


     private void SolveProblems() {
	// TODO Auto-generated method stub
	
}

	/* 打log记录在手机中 */
     public void UiAutomationLog(String str) 
     {
         // 取得当前时间
        Calendar calendar = Calendar.getInstance();
         calendar.setTimeInMillis(System.currentTimeMillis());
         String datestr = calendar.get(Calendar.HOUR_OF_DAY) + ":" + calendar.get(Calendar.MINUTE) + ":" + calendar.get(Calendar.SECOND) + calendar.get(Calendar.MILLISECOND) + ":";
 
         FileWriter fwlog = null;
         try
         {
            fwlog = new FileWriter(m_logpathString, true);
             fwlog.write(datestr + str + "\r\n");
             System.out.println(datestr + str);
             fwlog.flush();
 
         } catch (IOException e)
         {
             e.printStackTrace();
         } finally
         {
             try
             {
                 fwlog.close();
             } catch (IOException e)
             {
                 e.printStackTrace();
             }
         }

}
     
     
}


