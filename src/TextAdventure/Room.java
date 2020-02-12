/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TextAdventure;

/**
 *
 * @author cocor
 */
public class Room
{
    private Exit exit1;
    private Exit exit2;
    private Exit exit3;
    private Exit exit4;
    private Exit secretExit;
    private Item item;
    private Creature creature;
    private String description;
    private String name;
    
    public Room()
    {
        exit1 = null;
        exit2 = null;
        exit3 = null;
        exit4 = null;
        secretExit = null;
        item = null;
        creature = null;
        description = "";
        name = "";
    }
    public Room(Exit exit1, Exit exit2, Exit exit3, Exit exit4, Exit secretExit, Item item, Creature creature, String description, String name)
    {
      this.exit1 = exit1;
      this.exit2 = exit2;
      this.exit3 = exit3;
      this.exit4 = exit4;
      this.secretExit = secretExit;
      this.item = item;
      this.creature = creature;
      this.description = description;
      this.name = name;
    }
    public Room(Exit exit1, Exit exit2, Exit exit3, Exit secretExit, Item item, Creature creature, String description, String name)
    {
      this.exit1 = exit1;
      this.exit2 = exit2;
      this.exit3 = exit3;
      this.secretExit = secretExit;
      this.item = item;
      this.creature = creature;
      this.description = description;
      this.name = name;
    }
    public Room(Exit exit1, Exit exit2, Exit secretExit, Item item, Creature creature, String description, String name)
    {
      this.exit1 = exit1;
      this.exit2 = exit2;
      this.secretExit = secretExit;
      this.item = item;
      this.creature = creature;
      this.description = description;
      this.name = name;
    }
    public Room(Exit exit1, Exit exit2, Item item, Creature creature, String description, String name)
    {
      this.exit1 = exit1;
      this.exit2 = exit2;
      this.item = item;
      this.creature = creature;
      this.description = description;
      this.name = name;
    }
    public Room(Exit exit1, Item item, Creature creature, String description, String name)
    {
      this.exit1 = exit1;
      this.item = item;
      this.creature = creature;
      this.description = description;
      this.name = name;
    }
    public Creature getCreature()
    {
        return creature;
    }
    public Exit getExit1()
    {
        return exit1;
    }
    public Exit getExit2()
    {
        return exit2;
    }
    public Exit getExit3()
    {
        return exit3;
    }
    public Exit getExit4()
    {
        return exit4;
    }
    public Exit getSecretExit()
    {
        return secretExit;
    }
    public Item getItem()
    {
        return item;
    }
    public String getDescription()
    {
        return description;
    }
    public String getName()
    {
        return name;
    }
    public void setCreature(Creature creature)
    {
        this.creature = creature;
    }
    public void setExit1(Exit exit1)
    {
        this.exit1 = exit1;
    }
    public void setExit2(Exit exit2)
    {
        this.exit2 = exit2;
    }
    public void setExit3(Exit exit3)
    {
        this.exit3 = exit3;
    }
    public void setExit4(Exit exit4)
    {
        this.exit4 = exit4;
    }
    public void setSecretExit(Exit secretExit)
    {
        this.secretExit = secretExit;
    }
    public void setItem(Item item)
    {
        this.item = item;
    }
    public void setDescription(String description)
    {
        this.description = description;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void setRoom(Exit exit1, Exit exit2, Item item, Creature creature, String description, String name)
    {
      this.exit1 = exit1;
      this.exit2 = exit2;
      this.item = item;
      this.creature = creature;
      this.description = description;
      this.name = name;
    }
    public void setRoom(Exit exit1, Item item, Creature creature, String description, String name)
    {
      this.exit1 = exit1;
      this.item = item;
      this.creature = creature;
      this.description = description;
      this.name = name;
    }
}
