package test;

import java.io.IOException;

import com.android.uiautomator.core.UiDevice;
import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;

import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;
 

public class TestMain extends UiAutomatorTestCase {  


    public static void main(String[] args) throws IOException {  
    	new UiAutomatorHelper("register", "test.TestMain", "testDemo", "1");  
        String workspace, className, jarName, androidId, sdkpath; 
        workspace = "E:\\java\\AND"; // 工程路径，右击项目名-Properties,查看路径，注意路径写双斜杠  
        className = "test.TestMain"; // 包名.类名  
        jarName = "register"; // 要生成的jar包名字  
        androidId = "1"; // android list的id值  
//        sdkpath = "E:\\SDK\\adt-bundle-windows-x86-20140702\\sdk"; // android-skd的路径,注意路径间是双斜杠  
//        CtsHelper cts = new CtsHelper(workspace, className, jarName, androidId, sdkpath);  
//        cts.setDevices("A6EAHMGYGIO7Y9RG"); // 真机设备信息，从cts\tools目录下运行run-cts.bat查看设置信息  
        //cts.runTest();   
          
    }  
    
    public static void testDemo() throws UiObjectNotFoundException {  
    	
    	UiObject username=new UiObject((new UiSelector()).resourceId("com.cmcc.hbb.android.phone.parents:id/login_phone"));
    	username.clearTextField();
    	username.setText("17000000007");
    	UiObject password=new UiObject((new UiSelector()).resourceId("com.cmcc.hbb.android.phone.parents:id/login_pwd"));
    	password.clearTextField();
    	password.setText("000007");
    	UiObject login=new UiObject(new UiSelector().resourceId("com.cmcc.hbb.android.phone.parents:id/login_bt"));
    	login.clickAndWaitForNewWindow();    
    	
    }  
      
}  
