import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class Setuid_Dir implements DataImple{
	private static ObjectOutputStream out_obj;
	
	public static void Save_args(String dir) {
		try {
			out_obj = new ObjectOutputStream(new FileOutputStream(Uid_Dir));
			out_obj.writeObject(dir);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

