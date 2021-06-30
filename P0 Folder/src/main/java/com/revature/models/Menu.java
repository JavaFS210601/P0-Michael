package com.revature.models;

import java.util.List;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.revature.daos.StarDao;



public class Menu {

	//All of the menu display options and control flow are contained in this method 
	
		StarDao s1 = new StarDao();
	
		public void display() {
			
			boolean displayMenu = true; //toggles whether the menu continues after user input 
			Scanner scan = new Scanner(System.in); //Scanner object to parse user input 
			final Logger log = LogManager.getLogger(Menu.class); //instantiating a logger object
			
			//greeting
			System.out.println("*================================*");
			System.out.println("Welcome to the Astronomy Database");
			System.out.println("*================================*");
			
			
			//display the menu options as long as displayMenu is true
			while(displayMenu) {
				
				System.out.println("--------------------------------");
				System.out.println("Choose an option by typing below");
				System.out.println("--------------------------------");
				
				//menu options
				System.out.println("Stars -> Show all current stars in the database");
				System.out.println("Spectrum -> Learn about stellar classifications");
				System.out.println("Protostar -> Create a new star to add in space");
				System.out.println("Evolution -> Change a star's properties");
				System.out.println("Supernova -> Delete a star from space");
				System.out.println("Exit -> Exit the Astronomy Database");
				
				
				//parse the user input after the choose a menu option
				String input = scan.nextLine().toLowerCase();
				
				//switch statement that takes the user input and does some logic depending on that input 
				switch(input) {
				
				case "stars": {
					log.info("User selected to view all stars");
					System.out.println("------------------------------------------");
					System.out.println("Gathering all stars and their properties\n");
					//List of stars that gets populated by the getStars method in our StarDao
					List<Star> stars = s1.getStars();
					for(Star ss : stars) {
						if(ss.getSpectral_id() == 1) {
							System.out.println(ss.getStar_id() + ") " + ss.getColl_name() + ", " + ss.getSci_name() + "\nStar Mass: " + ss.getStar_mass() + ", " + "Stellar Classification: O, " + " Temperature: 25,000K\n");
						}
						if(ss.getSpectral_id() == 2) {
							System.out.println(ss.getStar_id() + ") " + ss.getColl_name() + ", " + ss.getSci_name() + "\nStar Mass: " + ss.getStar_mass() + ", " + "Stellar Classification: B, " + " Temperature: 18,000K\n");
						}
						if(ss.getSpectral_id() == 3) {
							System.out.println(ss.getStar_id() + ") " + ss.getColl_name() + ", " + ss.getSci_name() + "\nStar Mass: " + ss.getStar_mass() + ", " + "Stellar Classification: A, " + " Temperature: 9,200K\n");
						}
						if(ss.getSpectral_id() == 4) {
							System.out.println(ss.getStar_id() + ") " + ss.getColl_name() + ", " + ss.getSci_name() + "\nStar Mass: " + ss.getStar_mass() + ", " + "Stellar Classification: F, " + " Temperature: 6,700K\n");
						}
						if(ss.getSpectral_id() == 5) {
							System.out.println(ss.getStar_id() + ") " + ss.getColl_name() + ", " + ss.getSci_name() + "\nStar Mass: " + ss.getStar_mass() + ", " + "Stellar Classification: G, " + " Temperature: 5,500K\n");
						}
						if(ss.getSpectral_id() == 6) {
							System.out.println(ss.getStar_id() + ") " + ss.getColl_name() + ", " + ss.getSci_name() + "\nStar Mass: " + ss.getStar_mass() + ", " + "Stellar Classification: K, " + " Temperature: 4,200K\n");
						}
						if(ss.getSpectral_id() == 7) {
							System.out.println(ss.getStar_id() + ") " + ss.getColl_name() + ", " + ss.getSci_name() + "\nStar Mass: " + ss.getStar_mass() + ", " + "Stellar Classification: M, " + " Temperature: 3,500K\n");
						}
							
					}
					break;
				}
				
				
				case "spectrum": {
					System.out.println("Which class would you like to learn about?");
					System.out.println("1)O\n2)B\n3)A\n4)F\n5)G\n6)K\n7)M");
					int choice = scan.nextInt();
					scan.nextLine();
					if(choice == 1) {
						System.out.println("O class stars are extremely hot, extremely luminous, and blue in color. They range from 25,000 to 50,000 Kelvin and can be up to 1,000,000 times more luminous than the sun.\n"
								+ "O type stars are identified through ionized helium lines in their absorption spectrum.\n"
								+ "These are the rarest types of main-sequence stars, roughly 1 in 3,000,000 (~0.00003%) main-sequence stars are type O.\n"
								+ "Due to their size and energy consumption, most O type stars live very short lives of ~10 million years.");
					}
					if(choice == 2) {
						System.out.println("B class stars are extremely hot, extremely luminous, and blue in color. They range from 11,000 to 25,000 Kelvin and can be up to 20,000 times more luminous than the sun.\n"
								+ "B type stars are identified through their neutral helium lines and prominent Balmer lines in their absorption spectrum.\n"
								+ "While B type stars aren't as rare as O type stars, only about 1 in 800 (~0.13%) main-sequence stars are type B.\n"
								+ "Due to their size and energy consumption, most B type stars live a very short life of ~100 million years.");
					}
					if(choice == 3) {
						System.out.println("A class stars are very hot, very luminous, and are blue in color. They range from 7,500 to 11,000 Kelvin and can be up to 80 times more luminous than the sun.\n"
								+ "A type stars are identified through their strong Hydrogen lines in their absorption spectrum.\n"
								+ "While A type stars aren't as rare as O and B type stars, only about 1 in 160 (~0.625%) main-sequence stars are type A.\n"
								+ "Due to their size and energy consumption, most A type stars live a short life of ~1 billion years.");
					}
					if(choice == 4) {
						System.out.println("F class stars are hot, luminous, and are blue to white in color. They range from 6,000 to 7,500 Kelvin and can be up to 6 times more luminous than the sun.\n"
								+ "F type stars are identified through their CaII lines in their absorption spectrum. Metallic lines also start to become noticeable as well.\n"
								+ "F type stars are quite common with about 1 in 33 (~3%) main-sequence stars being type F.\n"
								+ "Due to their size and energy consumption, most F type stars live a modest life of ~5 billion years.");
					}
					if(choice == 5) {
						System.out.println("G class stars are moderately cool, moderately luminous, and are white to yellow in color. They range from 5,000 to 6,000 Kelvin.\n"
								+ "G type stars are identified through their ionized calcium lines and other neutral metal lines in their absorption spectrum.\n"
								+ "G type stars are quite common with about 1 in 13 (~7.6%) main-sequence stars being type G. The Sun is a class G star\n"
								+ "Due to their size and energy consumption, most G type stars live a relatively long life of ~10 billion years.");
					}
					if(choice == 6) {
						System.out.println("K class stars are cool, faint, and are orange to red in color. They range from 3,500 to 5,000 Kelvin.\n"
								+ "K type stars are identified through their strong neutral metal lines in their absorption spectrum.\n"
								+ "K type stars are common with about 1 in 8 (~12.1%) main-sequence stars being type K.\n"
								+ "Due to their size and energy consumption, most K type stars live a long life of ~50 billion years.");
					}
					if(choice == 7) {
						System.out.println("M class stars are very cool, very faint, and are orange red in color. They range from 2,000 to 3,500 Kelvin.\n"
								+ "M type stars are identified through their strong neutral metal lines, and oxidized molecules like TiO in their absorption spectrum.\n"
								+ "M type stars are the most common with about 76% of main-sequence stars being type M.\n"
								+ "Due to their size and energy consumption, most M type stars live an extremely long life of ~100 billion years.");
					}
					break;
				}
				
				case "protostar": {
					
					//we need to prompt the user for the Star's name and their spectral type and mass
					System.out.println("Enter Star's Popular Name: ");
					String coll_name = scan.nextLine();
					
					System.out.println("Enter Star's Scientific Name: ");
					String sci_name = scan.nextLine();
					
					System.out.println("Enter the Star's Mass in terms of Solar Masses (0.1 - 150)");
					double star_mass = scan.nextDouble();
					scan.nextLine();
					
					System.out.println("Enter Spectral Type (From Hottest to Coolest): \n1)O\n2)B \n3)A \n4)F \n5)G \n6)K \n7)M");
					int spectralId = scan.nextInt(); 
					scan.nextLine();//because without any nextLine, your enter keystroke will be grabbed as the next input 
					
					//Given all this information, we'll create a new Star object to send to a DAO method
					Star newStar = new Star(coll_name, sci_name, star_mass, spectralId); 
					
					//Put the new Star into the addStar() method in the StarDao
					s1.addStar(newStar);
					break;
					
					
				}
				
				case "evolution": {
					log.info("The user decided to change the properties of a star");
					
					System.out.println("These are the current stars in the database: ");
					
					//this is using the already existing get star method
					List<Star> stars = s1.getStars();
					for(Star ss : stars) {
						if(ss.getSpectral_id() == 1) {
							System.out.println(ss.getStar_id() + ") " + ss.getColl_name() + ", " + ss.getSci_name() + "\nStar Mass: " + ss.getStar_mass() + ", " + "Stellar Classification: O, " + " Temperature: 25,000K\n");
						}
						if(ss.getSpectral_id() == 2) {
							System.out.println(ss.getStar_id() + ") " + ss.getColl_name() + ", " + ss.getSci_name() + "\nStar Mass: " + ss.getStar_mass() + ", " + "Stellar Classification: B, " + " Temperature: 18,000K\n");
						}
						if(ss.getSpectral_id() == 3) {
							System.out.println(ss.getStar_id() + ") " + ss.getColl_name() + ", " + ss.getSci_name() + "\nStar Mass: " + ss.getStar_mass() + ", " + "Stellar Classification: A, " + " Temperature: 9,200K\n");
						}
						if(ss.getSpectral_id() == 4) {
							System.out.println(ss.getStar_id() + ") " + ss.getColl_name() + ", " + ss.getSci_name() + "\nStar Mass: " + ss.getStar_mass() + ", " + "Stellar Classification: F, " + " Temperature: 6,700K\n");
						}
						if(ss.getSpectral_id() == 5) {
							System.out.println(ss.getStar_id() + ") " + ss.getColl_name() + ", " + ss.getSci_name() + "\nStar Mass: " + ss.getStar_mass() + ", " + "Stellar Classification: G, " + " Temperature: 5,500K\n");
						}
						if(ss.getSpectral_id() == 6) {
							System.out.println(ss.getStar_id() + ") " + ss.getColl_name() + ", " + ss.getSci_name() + "\nStar Mass: " + ss.getStar_mass() + ", " + "Stellar Classification: K, " + " Temperature: 4,200K\n");
						}
						if(ss.getSpectral_id() == 7) {
							System.out.println(ss.getStar_id() + ") " + ss.getColl_name() + ", " + ss.getSci_name() + "\nStar Mass: " + ss.getStar_mass() + ", " + "Stellar Classification: M, " + " Temperature: 3,500K\n");
						}
							
					}
					
					System.out.println("-----------------------------------------------------");
					
					System.out.println("Enter the ID of the star you want to change: ");
					int starId = scan.nextInt(); //the user enters the ID of the star to change the spectral type
					scan.nextLine();
					
					System.out.println("Enter the new Spectral Type (From Hottest to Coolest): \n1)O\n2)B \n3)A \n4)F \n5)G \n6)K \n7)M");
					int spectralId = scan.nextInt();
					scan.nextLine();
					
					s1.changeStar(starId, spectralId); //we're going to supply the user inputs as arguments to this DAO method 
					
					break;
					
				}
				
				case "supernova": {
					log.info("The user decided to delete a star from existence!");
					System.out.println("These are all the current stars in the database choose which you would like to delete: \n");
					
					
					List<Star> stars = s1.getStars();
					for(Star ss : stars) {
						System.out.println(ss.getStar_id() + ") " + ss.getColl_name() + ", " + ss.getSci_name() + "\n");	
					}
					
					System.out.println("------------------------------");
					
					System.out.println("Enter the Star Id of the star you want to destroy: ");
				
					int starId = scan.nextInt();
					scan.nextLine();
					
					
					
					
					s1.removeStar(starId);
					System.out.println("This star is no longer shining :(");
					break;
						
				}
					
					
				
				case "exit": {
					System.out.println("You are exiting the database!");
					displayMenu = false;
					break;
				}
				
				default: {
					System.out.println("Didn't catch that..try again"); //in case user input doesn't match any cases
					break;
				}
				
				
			}
				
		}		
				
	}
}

