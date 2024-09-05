package hyunil;

import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		
		fileOutput output = new fileOutput() ;
		for(int numCsv = 0 ; numCsv < 100 ; numCsv++) {
			ArrayList<ArrayList<String>> boxes = new ArrayList<>() ; 
			for(int i = 0 ; i < 100 ; i++) {
				boxes.add(new ArrayList<>()) ; 
				double rand = Math.random() ; 
				if(rand < 0.1557) {
					boxes.get(i).add("1") ; 
				}
				else if(rand < 0.3524) {
					boxes.get(i).add("2") ; 
				}
				else if(rand < 0.6683) {
					boxes.get(i).add("3") ;
				}
				else if(rand < 0.8894) {
					boxes.get(i).add("4") ;
				}
				else {
					boxes.get(i).add("5") ; 
				}
				ArrayList<String> rkfh = new ArrayList<>() ;
				ArrayList<String> tpfh = new ArrayList<>() ;
				ArrayList<String> shvdl = new ArrayList<>() ;
				rkfh.add("220") ;
				rkfh.add("270") ;
				rkfh.add("350") ;
				rkfh.add("410") ;
				rkfh.add("480") ;
				tpfh.add("190") ; 
				tpfh.add("180") ; 
				tpfh.add("250") ; 
				tpfh.add("310") ; 
				tpfh.add("380") ;
				shvdl.add("90") ;
				shvdl.add("150") ;
				shvdl.add("100") ;
				shvdl.add("280") ;
				shvdl.add("340") ;
				ArrayList<Double> anrp = new ArrayList<>() ; 
				anrp.add(0.0) ;
				anrp.add(1.0) ;
				anrp.add(2.5) ;
				anrp.add(6.5) ; 
				anrp.add(11.0) ;
				anrp.add(30.0) ; 
				for(int j = 0 ; j < 5 ; j++) {
					if(boxes.get(i).get(0).equals(Integer.toString(j+1))) {
						boxes.get(i).add(rkfh.get(j)) ;
						boxes.get(i).add(tpfh.get(j)) ;
						boxes.get(i).add(shvdl.get(j)) ; 
//						boxes.get(i).add(Double.toString(Math.round(100*(Math.random()*(anrp.get(j+1)-anrp.get(j)) + anrp.get(j)))/100)) ; 
						double t = Math.round(100*(Math.random()*(anrp.get(j+1)-anrp.get(j) + anrp.get(j))))/100.0 ;
						boxes.get(i).add(Double.toString(t)) ;
					}
				}
				String name = Integer.toString(i + 1) + "_" + boxes.get(i).get(0) ;
				boxes.get(i).set(0, name) ;
				
			}
			String csvName = "input" + Integer.toString(numCsv) + ".csv" ; 
			output.csvWrite("FileOutput/"+csvName, "" , false);
			for(int i = 0 ; i < boxes.size() ; i++) {
				output.csvWrite("FileOutput/"+csvName, boxes.get(i).toString().replaceAll("\\[","").replaceAll("\\]", "") + "\n ", true);
			}
		}
		
		
		
		
		

	}

}
