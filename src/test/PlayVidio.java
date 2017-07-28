package test;

import java.io.IOException;  

import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

import android.provider.SyncStateContract.Helpers;
public class PlayVidio extends UiAutomatorTestCase {  
	public static void main(String[] args) throws IOException {  
    	new UiAutomatorHelper("playvidio", "test.playvidio", "testDemo2()", "1");  
        String workspase, className, jarName, androidId, sdkpath; 
        workspase = "E:\\java\\AND"; // 工程路径，右击项目名-Properties,查看路径，注意路径写双斜杠  
        className = "test.TestMain"; // 包名.类名  
        jarName = "test"; // 要生成的jar包名字  
        androidId = "1"; // android list的id值  
        sdkpath = "E:\\SDK\\adt-bundle-windows-x86-20140702\\sdk"; // android-skd的路径,注意路径间是双斜杠  
        CtsHelper cts = new CtsHelper(workspase, className, jarName, androidId, sdkpath);  
        cts.setDevices("A6EAHMGYGIO7Y9RG"); // 真机设备信息，从cts\tools目录下运行run-cts.bat查看设置信息  
        cts.runTest();      
    }  
  
    Create create1;
    public void testDemo2() throws UiObjectNotFoundException, InterruptedException,IOException {  
    	create1=new Create(getUiDevice());
    	getUiDevice().pressHome();
    create1.ClickByText("和宝贝家长端");

    create1.ClickById("com.cmcc.hbb.android.phone.parents:id/index_find");
 
    create1.ClickByClass("android.view.View",10);

    create1.ClickByClass("android.view.View",8);
		
    create1.ClickByClass("android.view.View",2);
		
    create1.ClickByClass("android.widget.Button",1);
    create1.ClickByClass("android.view.View",1);
    create1.ClickByClass("android.view.View",2);
    
}
}
    

