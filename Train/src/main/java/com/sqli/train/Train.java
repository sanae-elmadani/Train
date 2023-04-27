package com.sqli.train;

public class Train {
	public static final String HEAD_FIRST="<HHHH::";
	public static final String HEAD_END="HHHH>";

	public static final String PASSENGER="|OOOO|";
	public static final String LOADED="|^^^^|";
	public static final String Connection="::";
	public static final String Empty="|____|";
	public static final String RESTAURANT="|hThT|";
//	public static final Map<String, String> myMap = new HashMap<String, String>() {{
//		put("P", "|OOOO|");
//		put("R", "|hThT|");
//		put("C", "|____|");
//		put("HF","<HHHH");
//		put("HL","HHHH>");
//
//
//
//	}};


	String structure;
	public Train(String structure) {
		this.structure=structure;
	}



	public String print(){
		String result="";
		if(structure.charAt(0)=='H'){
			result+= HEAD_FIRST;
		}
		for (int i=0;i<structure.length();i++){

			if(structure.charAt(i)=='P' && i!=structure.length()-1){
				result+=PASSENGER+Connection;

			}
			if(structure.charAt(i)=='A' && i!=structure.length()-1){
				result+=LOADED+Connection;

			}
			if(structure.charAt(i)=='R' && i!=structure.length()-1){
				result+=RESTAURANT+Connection;

			}if(structure.charAt(i)=='C' &&i!=structure.length()-1){
				result+=Empty+Connection;

			}if(structure.charAt(i)=='H' && i==structure.length()-1){
				result+=HEAD_END;
			}
			if(structure.charAt(i)=='A' && i==structure.length()-1){
				result+=LOADED;
			}
			if(structure.charAt(i)=='P' && i==structure.length()-1){
				result+=PASSENGER;

			}
			if(structure.charAt(i)=='R' && i==structure.length()-1){
				result+=RESTAURANT;

			}if(structure.charAt(i)=='C' &&i==structure.length()-1){
				result+=Empty;

			}
		}
		return result;
	}

	public void  detachEnd(){
		structure=structure.substring(0, structure.length() - 1);
	}

	public void detachHead(){
		structure=structure.substring(1);

	}

	public boolean fill(){

      if(structure.indexOf("C")==-1){
		  return false;
	  }
	for(int i=0 ; i<structure.length();i++){
		if(structure.charAt(i)=='C'){
			structure=structure.substring(0,i) +'A'+ structure.substring(i+ 1);
			break;
		}

	}
	return true;
	}
}
