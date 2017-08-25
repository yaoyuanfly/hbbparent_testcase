package test;

import java.io.IOException;

import com.android.uiautomator.core.UiCollection;
import com.android.uiautomator.core.UiDevice;
import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.core.UiWatcher;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;
public class PlayVidio extends UiAutomatorTestCase {  
	public static void main(String[] args) throws IOException {  
    	new UiAutomatorHelper("playvidio", "test.PlayVidio", "testDemo2", "1");  
//        String workspase, className, jarName, androidId, sdkpath; 
//        workspase = "E:\\java\\AND"; // 工程路径，右击项目名-Properties,查看路径，注意路径写双斜杠  
//        className = "test.TestMain"; // 包名.类名  
//        jarName = "test"; // 要生成的jar包名字  
//        androidId = "1"; // android list的id值  
//        sdkpath = "E:\\SDK\\adt-bundle-windows-x86-20140702\\sdk"; // android-skd的路径,注意路径间是双斜杠  
//        CtsHelper cts = new CtsHelper(workspase, className, jarName, androidId, sdkpath);  
//        cts.setDevices("A6EAHMGYGIO7Y9RG"); // 真机设备信息，从cts\tools目录下运行run-cts.bat查看设置信息  
//        cts.runTest();      
    }  
	public void testwatcher() {
		UiDevice.getInstance().registerWatcher("yes", new UiWatcher() {
			
			@Override
			public boolean checkForCondition() {
				UiCollection col=new UiCollection(new UiSelector().resourceId("com.cmcc.hbb.android.phone.parents:id/nonVideoLayout"));
				UiSelector childPattern=new UiSelector().className("android.view.View");
				UiObject obj;
				try {
					obj = col.getChildByInstance(childPattern, 3);
					UiDevice device=getUiDevice();
					if(obj.exists()) {
						System.out.println("chufale...");
						device.click(800, 1100);
						sleep(1000);
						
						return true;
					}
					

				} catch (UiObjectNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				return false;
			}
		});
		
		
	}
  
	ClickNew ClickNew;
    public void testDemo2() throws UiObjectNotFoundException, InterruptedException,IOException {  
    	ClickNew=new ClickNew(getUiDevice());
    	getUiDevice().pressHome();
    ClickNew.ClickByText("和宝贝家长端");

    ClickNew.ClickById("com.cmcc.hbb.android.phone.parents:id/index_find");
 
    ClickNew.ClickByClass("android.view.View",10);

    ClickNew.ClickByClass("android.view.View",8);
		
    ClickNew.ClickByClass("android.view.View",2);
		
    ClickNew.ClickByClass("android.widget.Button",1);
    
    UiCollection col=new UiCollection(new UiSelector().className("android.webkit.WebView"));
	UiSelector childPattern=new UiSelector().className("android.view.View");
	UiObject obj = col.getChildByInstance(childPattern, 3);
		UiDevice device=getUiDevice();
		if(obj.exists()) {
			device.click(800, 1100);
			sleep(1000);
    
		}
}
}
    

