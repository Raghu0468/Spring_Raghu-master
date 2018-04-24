package com.xvitcoder.springmvcangularjs.response;

import java.util.List;

public class DashboardPojo {

	List<Details> details;
    String color;
    String icon;
    String number;
    String content;
    String statsuccess;

    public List<Details> getDetails() {
    	return details;
    }

    public void setDetails(List<Details> details) {
    	this.details = details;
    }
   public String getColor() {
      return color;
   }

   public void setColor(String color) {
      this.color = color;
   }
    
       public String getIcon() {
      return icon;
   }

   public void setIcon(String icon) {
      this.icon = icon;
   }
    
           public String getNumber() {
      return number;
   }

   public void setNumber(String number) {
      this.number = number;
   }
    
         public String getContent() {
      return content;
   }

   public void setContent(String content) {
      this.content = content;
   }
    
          public String getStatsuccess() {
      return statsuccess;
   }

    public void setStatsuccess(String statsuccess) {
      this.statsuccess = statsuccess;
   }

}
