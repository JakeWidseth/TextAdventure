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
public class Item
{
    private String name;
    private String description;
    
    public Item(String name, String description)
    {
        this.name = name;
        this.description = description;
    }
    public String getName()
    {
        return name;
    }
    public String getDescription()
    {
        return description;
    }
}
