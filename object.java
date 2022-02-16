public class Dog
{
    string name;
    string breed;
    int age;
    string color;

    public Dog(string name, string breed,int age, string color)
    {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.color = color;
    }

    public string getName()
    {
        return name;
    }

    public string getbreed()
    {
        return breed;
    }

    public int getage()
    {
        return age;
    }

    public string getcolor()
    {
        return color;
    }
    @override
    public string tostring()
    {
        return("Hello my name is chaser" + this.getname() +".\nMy breed,age and color are"
     + this .getbreed() + "," + this.getage() + "," + this.getcolor());

    }
    puclic static void main(string args[])
    {
        Dog Bull_dog = new Dog("Bull_dog","papillon", 5, "white");
        system.out.print(Bull_dog.tostrin());
    }
    
}