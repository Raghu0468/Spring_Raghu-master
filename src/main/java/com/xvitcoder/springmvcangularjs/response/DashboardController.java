package com.xvitcoder.springmvcangularjs.response;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: xvitcoder
 * Date: 12/21/12
 * Time: 12:22 AM
 */
@Controller
@RequestMapping("/dashboard")
public class DashboardController {

   @RequestMapping(value = "box.json", produces = "application/json")
   public @ResponseBody
   List<DashboardPojo> getDashboardList() {

      try {
         JSONParser parser = new JSONParser();
 JSONArray a = (JSONArray) parser.parse(new FileReader("C:\\Users\\CPG\\Downloads\\Spring_Raghu-master\\src\\main\\resources\\json\\dashboard.json"));

         List<DashboardPojo> l = new ArrayList<>();
         for (int i = 0; i < a.size(); i++) {

            JSONObject jobj = (JSONObject) a.get(i);
           
            DashboardPojo pojo = new DashboardPojo();
				pojo.setDetails((List) jobj.get("details"));
          
             
            l.add(pojo);

         }

         System.out.println(Arrays.toString(l.toArray()));

         return l;

      } catch (Exception e) {
         e.printStackTrace();
      }

      return null;
   }

}
