package com.example.car;

class Cars {
   private String name; // название
   private String description;  // описание
   private int carResource; // ресурс машины

   public Cars(String name, String description, int car){

      this.name=name;
      this.description=description;
      this.carResource=car;
   }

   public String getName() {
      return this.name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getCapital() {
      return this.description;
   }

   public void setCapital(String capital) {
      this.description = capital;
   }

   public int getFlagResource() {
      return this.carResource;
   }

   public void setFlagResource(int flagResource) {
      this.carResource = flagResource;
   }
}
