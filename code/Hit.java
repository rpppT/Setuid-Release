import java.util.*;
import java.io.*;

public class Hit{
	private final ArrayList<String> data_list = new ArrayList<>();
	private final ArrayList<String> obj_count = new ArrayList<>();
	private final HashSet<String> set  = new HashSet<>();
	
	
	private class Main_Hit{
		 
		private File log = new File(System.getProperty("user.home")+"/Setuid/beta_test3/log");
		private ObjectInputStream ois;
		
		public Main_Hit() {
			for(File t : log.listFiles()) {
				try {
					ois = new ObjectInputStream(new FileInputStream(t));
					ArrayList<String> t_list = (ArrayList<String>)ois.readObject();
					for(int k=0; k<t_list.size(); k++) {
						data_list.add(t_list.get(k));
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}//for
			for(int i=0; i<data_list.size(); i++) {
				System.out.println("Object_Data : "+data_list.get(i));
			}
			System.out.println("\nEntire Object : "+data_list.size());
		}
		
	}
	public Hit() {
		this.new Main_Hit();
		//Hit_Rate();
	}
	public static void main(String[] args) {
	    new Hit();
	}
}

