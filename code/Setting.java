import java.io.*;

public class Setting{
  static final  File setting = new File(System.getProperty("user.home")+"/java_code/beta_code3/class");
  
  public static void main(String [] args)
  {
    if(!setting.exists())
      setting.mkdirs();
  }
  public static File getSettingInstance()
  {
    return setting;
  }
}
