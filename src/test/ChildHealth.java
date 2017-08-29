package test;

import java.io.IOException;

import com.android.uiautomator.core.UiDevice;
import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiScrollable;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;
import test.GetObject;

import jp.jun_nama.test.utf7ime.helper.Utf7ImeHelper;

public class ChildHealth extends UiAutomatorTestCase  {  
    public static void main(String[] args) throws IOException {  
    	new UiAutomatorHelper("ChildHealth", "test.ChildHealth", "ProductBuy", "1");  
    	
//        String workspase, className, jarName, androidId, sdkpath; 
//        workspase = "E:\\java\\AND"; // 工程路径，右击项目名-Properties,查看路径，注意路径写双斜杠  
//        className = "test.buy"; // 包名.类名  
//        jarName = "buy"; // 要生成的jar包名字  
//        androidId = "1"; // android list的id值  
//        sdkpath = "E:\\SDK\\adt-bundle-windows-x86-20140702\\sdk"; // android-skd的路径,注意路径间是双斜杠  
//        CtsHelper cts = new CtsHelper(workspase, className, jarName, androidId, sdkpath);  
//        cts.setDevices("A6EAHMGYGIO7Y9RG"); // 真机设备信息，从cts\tools目录下运行run-cts.bat查看设置信息  
//        cts.runTest();   
    }  
    
    
    ClickNew ClickNew=new ClickNew(getUiDevice());
    UiScrollable listScrollable = new UiScrollable(new UiSelector().scrollable(true));
    
	@Override
	protected void tearDown() throws Exception {
		UiObject obj=GetObject.ById("com.cmcc.hbb.android.phone.parents:id/left_layout");
		while(obj.exists()) {
			obj.click();
		}
	}
	public void ProductBuy() throws InterruptedException, UiObjectNotFoundException {
		GetObject.ById("com.cmcc.hbb.android.phone.parents:id/index_find").clickAndWaitForNewWindow();
		listScrollable.scrollForward();
		UiObject obj=GetObject.ByChildClass("android.webkit.WebView","android.view.View",20);
		listScrollable.scrollIntoView(obj);
		obj.clickAndWaitForNewWindow();
    	ClickNew.ClickById("com.cmcc.hbb.android.phone.parents:id/left_layout");
    	ClickNew.ClickByChild("android.webkit.WebView","android.view.View",21);
    	ClickNew.ClickByDesc("儿童健康绿通计划");
    	ClickNew.ClickByDesc("￥ 48元 / 半年立即订购");
    	ClickNew.ClickByDesc("下一步");
    	UiDevice.getInstance().click(300,1700);
        ClickNew.ClickByDesc("下一步");
    	UiObject babyname=new UiObject((new UiSelector()).description("请输入宝宝姓名"));
    	babyname.setText(Utf7ImeHelper.e("张天天"));	
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
    	ClickNew.ClickByDesc("提交");
    	ClickNew.ClickByDesc(" 立即支付 ");
    	ClickNew.ClickByDesc("确认支付");
    	}
    }
