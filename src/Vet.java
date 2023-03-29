import java.util.*;

public class Vet
{
    String name;
    ArrayList<Animal> clients;

    public Vet(String name)
    {
        this.name = name;
        clients =  new ArrayList<Animal>();
    }

    public void addClient(Animal a)
    {
        if (!clients.contains(a))
        {
            clients.add(a);
            System.out.println("Welcome to " + name+ "'s office, "+ a.getName()+"!");
        }
        else
        {
            System.out.println(a.getName()+" is already a client of "+ name +"!");
        }
    }
}
