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

   public String getDescription() {
      return this.description;
   }

   public void setDescription(String description) {
      this.description = description;
   }

   public int getCarResource() {
      return this.carResource;
   }

   public void getCarResource(int carResource) {
      this.carResource = carResource;
   }



   public String plus(String description){
      int value = Integer.parseInt(description);
      value++;
      return String.valueOf(value);
   }

   public String minus(String description){
      int value = Integer.parseInt(description);
      if(value > 0 ){
         value--;
      }
      else{
         value = 0;
      }
      return String.valueOf(value);
   }
}