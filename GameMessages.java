public class GameMessages {
	
    String[] weak = {
        "couldn't find any fresh water, and their thirst is becoming unbearable.",
        "failed to gather enough food and is starting to feel the pangs of hunger.",
        "couldn't build a proper shelter, leaving them exposed to the elements.",
		"got lost in the dense jungle, and the sun is starting to set.",
		"couldn't start a fire, and the cold night air is making it difficult to rest.",
		"couldn't find any tools or resources, leaving them ill-equipped for survival.",
		"couldn't secure their campsite, leaving them vulnerable to potential predators.",
		"couldn't identify any edible plants or berries, limiting their food options.",
    };

    
    String[] fair = {
		"found a fresh water source, quenching their thirst and giving them renewed energy.",
		"gathered some edible fruits and vegetables, providing them with sustenance for the day.",
		"built a makeshift shelter to protect themselves from the harsh weather.",
		"discovered a trail that could lead them to a resourceful location.",
		"crafted some tools and resources that could aid in their survival.",
		"secured their campsite, reducing the risk of attacks from predators.",
		"identified some edible plants and berries, expanding their food options.",
		"found a safe place to rest, allowing them to regain their strength for the next day.",
    };
    

    String[] strong = {
		"found a fresh water source and a bounty of edible plants, ensuring their survival for days.",
		"skillfully crafted a sturdy shelter from the surrounding materials, providing them with a secure base.",
		"managed to start a fire and cook a meal, replenishing their strength and boosting their morale.",
		"discovered a hidden cave that can serve as a secure base of operations, incase theres a natural disaster to come.",
		"crafter a cache of tools and resources, giving them a significant advantage in their survival efforts.",
		"secured their campsite and set traps, protecting themselves from potential predators.",
		"identified a variety of edible plants and berries, ensuring a balanced and nutritious diet.",
    };
    

    String[] poorChoice = {
		"Go into the darkness of the cave without any light source, there seems to be someone in there.",
		"Investigate the loud roar reverberating through the island.",
		"Follow the mysterious figure deeper into the foggy marsh, they might be friendly.",
		"Drink water from the stagnant pond, it's better than nothing.",
		"The branches are snapping loudly... Go in there and check what's happening.",
		"You smell the air, which reeks of decay. Set aside your concerns and proceed as you wish.",
		"Consume the strange-looking mushrooms you found in the forest, they could be a new delicacy.",
		"Follow the strange whispers deeper into the forest, they might lead you to something interesting.",
		"Cross the swaying bridge over the chasm for hidden treasure",
		"Navigate the murky swamp where eerie lights flicker, they may reveal its secrets.",
		"Scale the cliffs to find the source of haunting chants echoing through the valley.",
		"Venture into the depths of the mist-shrouded forest where strange whispers beckon you onward."
    };
    

    String[] decentChoice = {
		"Inspect the strange markings on the cave wall, they could hold clues to the island's history.",
		"Follow the sound of rushing water deeper into the island, there might be a hidden waterfall or stream.",
		"Examine the peculiar flora lining the forest path, they could possess medicinal properties.",
		"Investigate the abandoned campsite for any signs of its previous inhabitants, it may reveal valuable resources.",
		"Listen for the rustle of animals in the underbrush, they could lead you to a potential food source.",
		"Scout the coastline for any signs of wreckage or supplies washed ashore from other ships.",
		"Study the constellations overhead to navigate your way across the island, they may guide you to safety.",
		"Gather herbs and berries to concoct makeshift remedies or potions for survival.",
		"Collect rainwater for drinking; it's a safer alternative to stagnant sources.",
		"Create a map of the island's terrain to aid navigation and exploration.",
		"Observe the behavior of local wildlife to identify potential food sources and dangers.",
		"Gather rocks and build a makeshift barrier to deter predators from approaching your campsite.",
		"Craft a temporary shelter using fallen branches and leaves for temporary protection from the elements.",
		"Search for hidden caves or crevices along the cliffs, they may offer shelter or valuable resources.",
		"Explore the depths of the island's interior for hidden caves or underground passages, they may hold secrets or treasures."
    };
    

    String[] greatChoice = {
		"Set traps to catch animals for food and fur. Properly placed traps can increase your chances of survival.",
		"Create signals to attract passing ships or aircraft. Utilize smoke, mirrors, or improvised flags to increase visibility.",
		"Hunt, fish, and forage for food. Be mindful of poisonous plants and animals.",
		"Craft essential tools like knives, spears, and fire starters. These tools will aid in survival tasks and defense.",
		"Observe the behavior of the animals for insights into the island's ecosystem.",
		"Scout the coastline for any signs of wreckage or supplies washed ashore from other ships.",
		"Construct a strong shelter with branches and leaves to protect against the elements.",
		"Be vigilant for signs of predators and know how to react if encountered." 		
    };


    String gameMenu = """
            \t\t\t================================================
			\t\t\t\t|                 Main Menu                    |  
            \t\t\t|                                              |  
            \t\t\t|               [1] Play                       |
            \t\t\t|               [2] Leaderboards               |
            \t\t\t|               [3] How to play                |
            \t\t\t|               [4] Exit                       |
            \t\t\t|                                              |
            \t\t\t================================================

			Please Choose from the Following Options..
    """;


    String startText = 
 		   "\r\n"		   
 		   + "                                                                     \r\n"
 		   + "  ▒▓███████▓▒  ▒▓████████▓▒  ▒▓██████▓▒   ▒▓███████▓▒  ▒▓████████▓   \r\n"
 		   + " ▒▓█▓▒           ░▒▓█▓▒     ▒▓█▓▒  ▒▓█▓▒  ▒▓█▓▒  ▒▓█▓▒    ▒▓█▓▒      \r\n"
 		   + " ▒▓█▓▒           ░▒▓█▓▒     ▒▓█▓▒  ▒▓█▓▒  ▒▓█▓▒  ▒▓█▓▒    ▒▓█▓▒      \r\n"
 		   + "  ▒▓██████▓▒     ░▒▓█▓▒     ▒▓████████▓▒  ▒▓███████▓▒     ▒▓█▓▒      \r\n"
 		   + "        ▒▓█▓▒    ░▒▓█▓▒     ▒▓█▓▒  ▒▓█▓▒  ▒▓█▓▒  ▒▓█▓▒    ▒▓█▓▒      \r\n"
 		   + "        ▒▓█▓▒    ░▒▓█▓▒     ▒▓█▓▒  ▒▓█▓▒  ▒▓█▓▒  ▒▓█▓▒    ▒▓█▓▒      \r\n"
 		   + " ▒▓███████▓▒     ░▒▓█▓▒     ▒▓█▓▒  ▒▓█▓▒  ▒▓█▓▒  ▒▓█▓▒    ▒▓█▓▒      \r\n"
 		   + "                                                                     \r\n"		  
 		   + ""
    ; 
   
   
    String howToPlay = "Game Mechanics for IslandMan Survival:\r\n"
  		+ "\r\n"
  		+ "Objective: Survive on the island after a plane crash by making strategic choices.\r\n"
  		+ "\r\n"
  		+ "Gameplay Overview:\r\n"
  		+ "\r\n"
  		+ "1. The player will navigate through three stages, each containing three rounds of decision-making.\r\n"
  		+ "2. At the beginning of each round, the player will be presented with three choices: poor, decent, \n   and excellent, each with their associated scores.\r\n"
  		+ "3. The choices are randomized for variety and unpredictability.\r\n"
  		+ "4. The player must carefully select one choice per round, aiming to accumulate a total score of 18 \n   or higher to ensure the survival of IslandMan.\r\n\n"
  		+ "Scoring System:\r\n"
  		+ "\r\n"
  		+ "Poor Choice: 5 point\r\n"
  		+ "Decent Choice: 6 points\r\n"
  		+ "Excellent Choice: 8 points\n\n"
	; 


	String[] storyIntro = {
    		"\n\tStranded on an unfamiliar island after his plane crashes, {username} fights for\n\tsurvival. Once a routine flight, now a battle against nature's challenges, \n\tevery moment tests his strength and resourcefulness.\n"
    		+ "\n"
    		+ "\tAlone amidst wreckage and wilderness, he confronts the stark reality of his predicament. \n\tBut within the chaos lies a determination to survive on his own terms.\n"
    		+ "\n"
    		+ "\tNavigating treacherous terrain and unknown dangers, {username} refuses to surrender to despair. \n\tWith sheer willpower as his guide, he embarks on a journey to conquer \n\tthis harrowing ordeal and carve out a life amidst the island's unforgiving landscape.\n\n\n"
    	    +"\tYou, {username} needs to choose the correct choices for you to survive or else.... "
    		+""
    	};


    String[] survivedMessage = { "\t\t\tI've made it. Against all odds, I've survived.\r\n"
  		+ "\r\n"
  		+ "\tDays blurred into nights, each one a battle against nature's fury. But through sheer willpower, \n\tI conquered the island's challenges.\r\n"
  		+ "\r\n"
  		+ "\tNow, as I stand amidst the wreckage, I find solace in my resilience. The crash may have left scars, \n\tbut it also forged a spirit of determination within me.\r\n"
  		+ "\r\n"
  		+ "\tThis island, once a prison, is now my sanctuary. I've learned that survival isn't just about staying \n\talive—it's about finding purpose in adversity.\r\n"
  		+ "\r\n"
  		+ "\tSo here I am, a survivor ready to face whatever comes next with courage and conviction. \n\n"
	};
}