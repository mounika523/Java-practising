class Cat{
  private String name;
  private int age;
  private String breed;
  private float weight;
  
  public Cat(){
    this.name = "Unknown";
    this.age = 0;
    
  }
  public String getName(){
    return this.name;
  }
  public void setAge(int age){
    this.age = age;
  }
  public int getAge(){
    return this.age;
  }
  public void setBreed(String breed){
    this.breed = breed;
  }
  public String getBreed(){
    return this.breed;
  }
  
  public String ageDetermine(int age){
    if(age < 2){
      return "Cat is kitten";
    }
    return "cat is not kitten";
  }
  public float getWeight(){
    return weight;
  }
  public void setWeight(float weight){
    this.weight = weight;
  }
  public static void compareAges(Cat cat , Cat cat1 ){
    if(cat1.age<cat.age){
      System.out.println("cat is greater");
    }
  }
  
  public static void main(String [] args){
    Cat cat = new Cat();
    System.out.println(cat.getName());
    cat.setAge(1);
    System.out.println(cat.getAge());
    cat.setBreed("mauvi");
    System.out.println(cat.getBreed());
    System.out.println(cat.ageDetermine(cat.getAge()));
    cat.setWeight(3);
    System.out.println(cat.getWeight()+"kgs");
    Cat cat1 = new Cat();
    cat1.setAge(3);
    System.out.println(compareAges(cat1, cat));
    
  }
}
