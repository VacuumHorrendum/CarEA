package com.example.car;

class Cars {
   private String name; // название
   private String description;  // описание
   private int carResource; // ресурс машины
   private String numberOfCars;

   public Cars(String name, String description, int car){

      this.name=name;
      this.description=description;
      this.numberOfCars = "0";
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

   public String getNumberOfCars() {
      return numberOfCars;
   }

   public void setNumberOfCars(String numberOfCars) {
      this.numberOfCars = numberOfCars;
   }

   public String plus(String numberOfCars){
      int value = Integer.parseInt(numberOfCars);
      value++;
      return String.valueOf(value);
   }

   public String minus(String numberOfCars){
      int value = Integer.parseInt(numberOfCars);
      if(value > 0 ){
         value--;
      }
      else{
         value = 0;
      }
      return String.valueOf(value);
   }
}