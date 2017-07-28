package test;

import java.io.IOException;

import com.android.uiautomator.core.UiDevice;
import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiScrollable;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

import android.provider.SyncStateContract.Helpers;
import jp.jun_nama.test.utf7ime.helper.Utf7ImeHelper;

public class buy extends UiAutomatorTestCase {  
    public static void main(String[] args) throws IOException {  
    	new UiAutomatorHelper("buy", "test.buy", "testDemo()", "1");  
        String workspase, className, jarName, androidId, sdkpath; 
        workspase = "E:\\java\\AND"; // 工程路径，右击项目名-Properties,查看路径，注意路径写双斜杠  
        className = "test.buy"; // 包名.类名  
        jarName = "buy"; // 要生成的jar包名字  
        androidId = "1"; // android list的id值  
        sdkpath = "E:\\SDK\\adt-bundle-windows-x86-20140702\\sdk"; // android-skd的路径,注意路径间是双斜杠  
        CtsHelper cts = new CtsHelper(workspase, className, jarName, androidId, sdkpath);  
        cts.setDevices("A6EAHMGYGIO7Y9RG"); // 真机设备信息，从cts\tools目录下运行run-cts.bat查看设置信息  
        cts.runTest();   
    }  
    
    Create create;
    
    public void testDemo() throws UiObjectNotFoundException, InterruptedException,IOException { 
    	

   	    create=new Create(getUiDevice());
    	UiScrollable listScrollable = new UiScrollable(new UiSelector().scrollable(true));
    	getUiDevice().pressHome();
    	
    	create.ClickByText("和宝贝家长端");
    	    
    	create.ClickById("com.cmcc.hbb.android.phone.parents:id/index_find");
    	listScrollable.scrollForward();
    	
    	UiDevice mdevice1=getUiDevice();;
         mdevice1.click(0,300);
        mdevice1.pressBack();
        
    	create.ClickByClass("android.view.View",21);
    	
    	create.ClickByClass("android.view.View",6);

    	create.ClickByDesc("￥ 48元 / 半年立即订购");
         
    	create.ClickByDesc("下一步");
        
        mdevice1.click(300,1700);
        create.ClickByDesc("下一步");

    	UiObject babyname=new UiObject((new UiSelector()).description("请输入宝宝姓名"));
    	babyname.setText(Utf7ImeHelper.e("天天"));
    	
    	UiObject babyid=new UiObject((new UiSelector()).description("请输入宝宝身份证号"));
    	babyid.setText("130455201605052323");
    	
    	UiObject fathername=new UiObject((new UiSelector()).description("请输入宝宝监护人的姓名"));
    	fathername.setText(Utf7ImeHelper.e("张三"));
    	
    	
    	
    	UiObject relation=new UiObject((new UiSelector()).description("请输入宝宝与监护人关系"));
    	relation.setText(Utf7ImeHelper.e("父子"));
    	
    	UiObject fatherid=new UiObject((new UiSelector()).description("请输入宝宝监护人的身份证号"));
    	fatherid.setText("130455198805056767");
    	
    	
    	UiObject emai=new UiObject((new UiSelector()).description("请输入您的E-mail"));
    	emai.setText("1066578654@qq.com");
    	
    	create.ClickByDesc("提交");
    	
    	
    }
    }
