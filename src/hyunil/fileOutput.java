package hyunil;

import java.io.BufferedWriter;
import java.io.FileWriter;


public class fileOutput {

	
	
	
	public void csvWrite(String fileName, String txt, boolean accumulate) {
		try{
			BufferedWriter fw = new BufferedWriter(new FileWriter(fileName, accumulate));
			fw.write(txt);
			fw.flush();
			fw.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	

}
