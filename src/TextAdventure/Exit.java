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
public class Exit
{
    private String name;
    private String description;
    private String transition;
    private Room destination;
    private Item requiredItem;
    private boolean creatureBlocks;

    public Exit()
    {
       name = "";
       description = "";
       transition = "";
       destination = null;
       requiredItem = null;
       creatureBlocks = false;
    }
    public Exit(String name, String description, String transition, Room destination, Item requireditem, boolean creatureBlocks)
    {
        this.name = name;
        this.description = description;
        this.transition = transition;
        this.destination = destination;
        this.requiredItem = requireditem;
        this.creatureBlocks = creatureBlocks;
    }
    public String getName()
    {
        return name;
    }

    public String getDescription()
    {
        return description;
    }

    public String getTransition()
    {
        return transition;
    }
    public Room getDestination()
    {
        return destination;
    }

    public Item getRequiredItem()
    {
        return requiredItem;
    }

    public boolean getCreatureBlocks()
    {
        return creatureBlocks;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public void setTransition(String transition)
    {
        this.transition = transition;
    }
    public void setDestination(Room destination)
    {
        this.destination = destination;
    }
    public void setRequiredItem(Item requiredItem)
    {
        this.requiredItem = requiredItem;
    }
    public void setCreatureBlocks(boolean creatureBlocks)
    {
        this.creatureBlocks = creatureBlocks;
    }
    public void setExit(String name, String description, String transition, Room destination, Item requiredItem, boolean creatureBlocks)
    {
        this.name = name;
        this.description = description;
        this.transition = transition;
        this.destination = destination;
        this.requiredItem = requiredItem;
        this.creatureBlocks = creatureBlocks;
    }
}
