package SessionTask;

import java.util.*;
public class MapInterface  {
    public static void main(String[] args) {

    	
    	Map<String,employee1> firstMap=new HashMap<String,employee1>();
    	firstMap.put("N00", new employee1("N00","Chaitra",14000));
    	firstMap.put("N01", new employee1("N01","Vignesh",500000));
    	firstMap.put("N02", new employee1("N02","radha",700000));
    	firstMap.put("N03",new employee1( "N03","keerti",13000));
    	firstMap.put("N07",new employee1( "N07","deepa",300000));
    	firstMap.put("N04",new employee1( "N04","bhavana",400000));
    	firstMap.put("N09",new employee1("N09","deepika",600000));
    	firstMap.put("N05",new employee1( "N05","pari",12000));
    	firstMap.put("N06",new employee1( "N06","Sam",50000));
    	firstMap.put("N08",new employee1( "N08","dheeraj",90000));
    	
    	
    	
    	TreeMap<String,employee1> sorted=new TreeMap<String,employee1>(firstMap);
    	
    	Iterator<String> it=sorted.keySet().iterator();
    	System.out.println("Sorted value of map");
    	while(it.hasNext()) {
    		String key=(String)it.next();
    		System.out.println(key+" "+firstMap.get(key));
    		}
    			
   
    	Iterator<String> itr=firstMap.keySet().iterator();
    	
    	while(itr.hasNext()) {
    		String key=(String)itr.next();
    		
    		employee1 sal=firstMap.get(key);
    	
    		
    			
					if (sal.esal<15000.0) {
						itr.remove();
						
					}
    	}
    	
    	Map<String,employee1> finalMap=new HashMap<String,employee1>();
    	for(Map.Entry<String, employee1> entry:firstMap.entrySet()) {
    		finalMap.put(entry.getKey(), entry.getValue());
    	}
    	
    	System.out.println("================");
    	System.out.println("Value of new Map after removing the employees having salary less than 15000");
    	Iterator<String> itr1=finalMap.keySet().iterator();
    	while(itr1.hasNext()) {
    		String key=(String)itr1.next();
    		System.out.println(key+" "+firstMap.get(key));
    		}
    	firstMap.clear();
    	sorted.clear();
    	finalMap.clear();
    }
	
	
}

class employee1 {
	String eid;
	String ename;
	double esal;
	public employee1(String eid, String ename, double esal) {
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
	}
	@Override
	public String toString() {
		return "eid=" + eid + ", ename=" + ename + ", esal=" + esal;
	}
	 
	
}