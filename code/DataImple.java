
import java.util.ArrayList;
import java.io.File;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public interface DataImple extends Serializable,Color {
  public static final long serailVersionUID = 3518123450987612345L; 
	public static final ArrayList<String> data_set = new ArrayList<>();
	public static final File path = new File(System.getProperty("user.home")+"/Setuid/beta_test3/log");
	public static final File ver = new File(System.getProperty("user.home")+"/Setuid/beta_test3/temp");
  public static final File Uid_Dir = new File(System.getProperty("user.home")+"/Setuid/beta_test3/Uid_Dir/set_file");
}

