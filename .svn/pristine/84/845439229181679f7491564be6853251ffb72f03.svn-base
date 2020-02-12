/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TextAdventure;

/**
 *
 * @author Jake.Widseth
 */
public class Main
{
    public static void main(String[] args)
    {
        Item device = new Item("Gif of a Jumpscare", "It's a gif... of a jumpscare.");
        Item candle = new Item("Candle", "A wax candle with a flickering flame.");
        Item ball = new Item("Ancient Ball of Gravity", "A heavy iron ball that makes gravity stronger.");
        Item stick = new Item("Stick", "It's a stick.");
    
        Creature skeleton = new Creature("Skeleton", "a spooky scary skeleton", "You show the skeleton the Gif of a jumpscare, the skeleton gets spooked and it crumbles into a pile of bones...", device);
        Creature shadow = new Creature("Shadow", "It is completely devoid of light...", "As you bring the candle out, the shadow begins to fade away.", candle);
        Creature demon = new Creature("Fire Demon", "It flies above the ground with it's wings, it's skin appears to be made out of fire.", "The fire demon succumbs to the Ancient Ball of Gravity, falling to the the water.", ball);
        Creature human = new Creature("Dead man", "He appears to be dead, better not wait around and end up like him.", "You poke him with a stick, he's already dead, congrats!", stick);
    
    
        Exit exit1 = new Exit("Hallway", "A stone hallway that leads to a dark room.", "You move through the damp hallway...", null, null, false);
        Exit exit2 = new Exit("Hallway", "A stone hallway that leads back to the room you came from.", "You move through the damp hallway...", null, null, false);
        Exit exit3 = new Exit("Wooden Door", "A wooden door that likely leads to another room.", "You open the door, and pass through", null, null, true);
        Exit exit4 = new Exit("Crawlspace", "A small space that is just wide enough to fit through", "You slip through the crawlspace", null, null, false);
        Exit exit5 = new Exit("Trapdoor", "A small door in the ground...", "You open the door, and head down.", null, null, false);
        Exit exit6 = new Exit("Ladder", "A ladder that leads up.", "You climb up the ladder", null, null, false);
        Exit exit7 = new Exit("Long Hallway", "A long hallway, wonder how long it is...", "You head down the long hallway, you see decorative sets of armor lining the walls.", null, null, true);
        Exit exit8 = new Exit("Steel Door","A steel door, its cold to the touch.", "You open the door, and head down some stairs", null, null, false);
        Exit exit9 = new Exit("Stairs", "The stairs lead up out of the pool", "You wade out of the water, and walk up the stairs", null, null, false);
        Exit exit10 = new Exit("Stairs","The stairs lead down, back to the room you were just in.", "You walk back down the stairs...", null, null, false);
        Exit exit11 = new Exit("Tunnel","You can see a tunnel underwater, perhaps it leads somewhere...", "You swim down, and into the tunnel...", null, null, false);
        Exit exit12 = new Exit("Tunnel","The tunnel that leads you back to hte preivous room.", "You head back through the tunnel.", null, null, false);
        Exit exit13 = new Exit("Large Door", "That's a big ass door.", "You push the door with all your might, it inches open and you sneak through.", null, null, true);
        
        Room room1 = new Room(exit1, exit3, null, skeleton, "You're in a dimly lit room. You see 2 exits, one of which is blocked by a skeleton", "Dungeon");
        Room room2 = new Room(exit2, device, null, "You enter a small little room with device that displays moving images.", "Dungeon");
        Room room3 = new Room(exit4, exit7, null, shadow, "You enter a room that is very damp, blocking the door, is a large shadow.", "Dungeon");
        Room room4 = new Room(exit5, candle, null, "You enter a small room, barely lit by a candle in the corner.", "Cell");
        Room room5 = new Room(exit6, stick, null, "You enter a very dark room, doesn't appear to be anything here, except something thats... brown and sticky...", "Secret Exit");
        Room room6 = new Room(exit8, ball, human, "You enter a small passageway with a dead body to the side.", "Passageway");
        Room room7 = new Room(exit9, exit11, null, null, "You descend down the stairs into a pool of water.", "Pools");
        Room room8 = new Room(exit10, ball, null, "As you head up the stairs, you come up to a pedistal with a ball placed on top.", "Treasure Room");
        Room room9 = new Room(exit12, exit13,null, demon, "As you swim up to the surface, you see a demon made of fire flying around, and a big ass door he seems to be guarding.", "Pools");
        Room room10 = new Room(null, null, null, "As you enter the final room, theres nothing here. Also the door closed behind you and it wont budge.", "Final Room");
        
        exit1.setDestination(room2);
        exit2.setDestination(room1);
        exit3.setDestination(room3);
        exit4.setDestination(room4);
        exit5.setDestination(room5);
        exit6.setDestination(room3);
        exit7.setDestination(room6);
        exit8.setDestination(room7);
        exit9.setDestination(room8);
        exit10.setDestination(room7);
        exit11.setDestination(room9);
        exit12.setDestination(room7);
        exit13.setDestination(room10);
        
        Player peasant = new Player("Peasant", "A mere peasant of the land.");
        World helloWorld = new World(room1, room10);
        Game newGame = new Game(helloWorld, peasant);
        newGame.setStartText("You wake up in a dark room.");
        newGame.setVictoryText("U ded.");
        newGame.start();
        
    }
}
