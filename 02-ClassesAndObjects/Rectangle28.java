public class Rectangle28 {
   public double length;
   public double width;

   public Rectangle28(double length,double width){
    this.length = length;
    this.width = width;
   }
  public double calculatePer(){
    return 2 *(length+width);
  }
  public double calculateSurfaceArea(){
    return width*length;
  }
  public void displayInfo(){
    System.out.println("Dimensions: "+length+"x"+width);
    System.out.println("Perimeters:" +calculatePer());
    System.out.println("Surface areas:" + calculateSurfaceArea());

  }
}
