public  class Student implements StInterface
{
  String name;
  String Id;
  String address;
  public void setName(String a)
  {
    name=a;
  }
  public String getName()
  {
    return name;
  }
  public void setId(String b)
  {
    Id=b;
    //address="Banani";
  }
  public String getId()
  {
    return Id;
    //return address;
  }
}  
  
