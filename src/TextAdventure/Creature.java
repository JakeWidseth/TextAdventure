package TextAdventure;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cocor
 */
public class Creature
{
    private String name;
    private String description;
    private String defeatedText;
    private Item itemToDestroy;
    
    public Creature()
    {
        name = "Skeleton";
        description = "A boney, undead creature that weilds a sword.";
        defeatedText = "The skeleton crumbles into a pile of bones...";
    }
    public Creature(String name, String description, String defeatMessage, Item itemToDestroy)
    {
        this.name = name;
        this.description = description;
        this.defeatedText = defeatMessage;
        this.itemToDestroy = itemToDestroy;
    }
    public String getName()
    {
        return name;
    }
    public String getDescription()
    {
        return description;
    }
    public String getDefeatedText()
    {
        return defeatedText;
    }
    public Item getItemToDestroy()
    {
        return itemToDestroy;
    }
    public void setItemToDestroy(Item itemToDestroy)
    {
        this.itemToDestroy = itemToDestroy;
    }
    
}
