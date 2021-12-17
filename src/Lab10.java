import java.util.Scanner;
import java.util.ArrayList;

interface action
{
    boolean sweem(double s);
    boolean jump(double s);
    boolean run(double s);
}
abstract class Animal implements action
{
    protected String name;
    public void setName(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return name;
    }
    @Override
    public boolean sweem(double s)
    {
        return true;
    }
    @Override
    public boolean jump(double s)
    {
        return true;
    }
    @Override
    public boolean run(double s)
    {
        return true;
    }

}
class Cat extends Animal
{
    public Cat(String name)
    {
        this.name=name;
    }
    @Override
    public boolean sweem(double s)
    {
        System.out.println("sweem");
        return false;
    }
    @Override
    public boolean jump(double s)
    {
        System.out.println("jump");
        if(s<=2)
            return true;
        else return false;
    }
    @Override
    public boolean run(double s)
    {
        System.out.println("run");
        if(s<=200)
            return true;
        else return false;
    }
}
class Dog extends Animal
{
    public Dog(String name)
    {
        this.name=name;
    }
    @Override
    public boolean sweem(double s)
    {
        System.out.println("sweem");
        if(s<=10)
            return true;
        else return false;
    }
    @Override
    public boolean jump(double s)
    {
        System.out.println("jump");
        if(s<=0.5)
            return true;
        else return false;
    }
    @Override
    public boolean run(double s)
    {
        System.out.println("run");
        if(s<=500)
            return true;
        else return false;
    }
}
public class Lab10
{

    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Введите количество животных");
        int n=s.nextInt();
        ArrayList<Animal> mas=new ArrayList<Animal>();
        for(int i=0;i<n;i++)
        {
            System.out.println("Кого добавляем? Собака -1 Кот -0");
            int type=s.nextInt();
            System.out.println("Введите кличку");
            String name=s.next();
            if(type==1)
            {
                Dog d=new Dog(name);
                mas.add(d);
            }
            else
            {
                Cat c=new Cat(name);
                mas.add(c);
            }
        }
        System.out.println("Введите расстояние для прыжка");
        double jumpS=s.nextDouble();
        System.out.println("Введите расстояние для плавания");
        double sweemS=s.nextDouble();
        System.out.println("Введите расстояние для бега");
        double runS=s.nextDouble();
        for(Animal a:mas)
        {
            System.out.println(a.getName());
            System.out.println(a.run(runS));
            System.out.println(a.jump(jumpS));
            System.out.println(a.sweem(sweemS));
        }
    }

}
