package in.goindigo.webservices.springboottech;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.*;

import org.apache.camel.Exchange;
import org.apache.log4j.Logger;


public class Processing {

	private static final transient Logger LOGGER = Logger.getLogger(Processing.class);

	public void getBody(Exchange exchange){

		List<Map<String, Object>> list = exchange.getIn().getBody(List.class);
                Map<String, Object> map = new HashMap<String, Object>();
                Map<String, Object> finalMap = new HashMap<String, Object>();
		List<Map<String, Object>> finalList = new ArrayList();

		for(int i =0; i < list.size(); i++ ) {
                    map = (Map<String, Object>) list.get(i);
		    finalMap.put("Acregid",map.get("AcregId"));
		    finalMap.put("Actype",map.get("actype"));
		    finalMap.put("Airline",map.get("Airline"));
		    finalMap.put("FltNbr",map.get("FltNbr"));
		    finalMap.put("StartTime",map.get("StartTime"));
		    finalMap.put("EndTime",map.get("EndTime"));
		    finalMap.put("Dep",map.get("DEP"));
		    finalMap.put("Arr",map.get("ARR"));

		    finalList.add(finalMap);
		}
		exchange.getIn().setBody(finalList);
	}

	public void getFibonacciResult(Exchange exchange){
		long n=1000, t1=0,t2=1;
		List list = new ArrayList<>();
		for(int i = 2;i<=n;++i){
			list.add(t1);
			long sum = t1+t2;
			t1 = t2;
			t2 = sum;
		}
		exchange.getIn().setHeader("Result",list);
	}
}
