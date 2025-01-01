import java.util.ArrayList;
import java.util.Scanner;
public class DoctorWho {
public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
for(int i =0; i<100; i++) {
String q = input.nextLine();
System.out.println(answers(q,tokenization(q) ));
}
}
public static ArrayList<String> tokenization(String text){
	String word="";
	int j;
	ArrayList<String> meow = new ArrayList<String>();
	
	
	j = 0;
	while(j < text.length() - 1 && !text.substring(j,j+1).equals(" ")) {
		word+=text.substring(j,j+1);
		j++;
	}
	meow.add(word);
	word="";
	

	for(int i = j; i+1<text.length(); i++) {
		if(text.substring(i,i+1).equals(" ")) {
			j=i;
			while(j < text.length() - 1 && !text.substring(j+1,j+2).equals(" ")) {
				word+=text.substring(j+1,j+2);
				j++;
			}
			meow.add(word);
			word="";
		}
	}
	return meow;
}
public static String randomResponse() {
	ArrayList<String> random = new ArrayList<String>();
	random.add("Hmm, that's a bit tricky, isn't it?");
	random.add("Hmm, I suppose we'll just have to wing it.");
	random.add("Hmm, I'll have to consult the TARDIS on this one.");
	random.add("Hmm, well, isn't this a puzzle?");
	int x = (int)(Math.random()*4);
	return random.get(x);
}
public static String emotion(String text) {
	boolean x= false;
	int index;
	ArrayList<String> meow = new ArrayList<String>();
	meow.add("emotions");
	meow.add("feelings");
	meow.add("sentiments");
	meow.add("passions");
	
		for(int i =0; i<meow.size();i++) {
			if(text.indexOf(meow.get(i))>0) {
				x = true;
				index = i;
			}
		}
	
	if(x==false) {
		return randomResponse();
	}
	else {
		return "The Doctor expresses a wide range of emotions, including curiosity, compassion, determination, grief, joy, and anger, among others.";
	}
}
public static String who(String sen) {
	int x = (int)(Math.random()*3);
	ArrayList <String> companion = new ArrayList <String>();
	companion.add("The Doctor's companions include Rose Tyler, Martha Jones, Donna Noble, Amy Pond, Rory Williams, Clara Oswald, Bill Potts, and more.");
	companion.add("Throughout the series, the Doctor travels with companions such as Rose Tyler, Martha Jones, Donna Noble, Amy Pond, Rory Williams, Clara Oswald, and Bill Potts.");
	companion.add("The Doctor's allies and companions consist of individuals like Rose Tyler, Martha Jones, Donna Noble, Amy Pond, Rory Williams, Clara Oswald, and Bill Potts, who join them on adventures through time and space.");
	ArrayList <String> actor = new ArrayList <String>();
	actor.add("The Doctor's companions include Rose Tyler, Martha Jones, Donna Noble, Amy Pond, Rory Williams, Clara Oswald, Bill Potts, and various others across the series.");
	actor.add("Throughout Doctor Who's adventures, companions like Rose Tyler, Martha Jones, Donna Noble, Amy Pond, Rory Williams, Clara Oswald, and Bill Potts have joined the Doctor.");
	actor.add("The Doctor's companions encompass a diverse array of individuals, such as Rose Tyler, Martha Jones, Donna Noble, Amy Pond, Rory Williams, Clara Oswald, and Bill Potts, who accompany them on their journeys through time and space.");
	ArrayList <String> enemies = new ArrayList <String>();
	enemies.add("The Doctor's most dangerous enemies include the Daleks, Cybermen, and the Master.");
	enemies.add("The Daleks, Cybermen, and the Master are among the Doctor's most formidable adversaries.");
	enemies.add("The Doctor's most dangerous foes include the Daleks, Cybermen, and the Weeping Angels.");
	
	ArrayList <String> doctor = new ArrayList <String>();
	doctor.add("The Doctor is a Time Lord from the planet Gallifrey, known for their adventurous spirit and love for humanity.");
	doctor.add("The Doctor is a centuries-old alien with the ability to regenerate into a new form when mortally wounded.");
	doctor.add("The Doctor is a renegade Time Lord who travels through time and space in the TARDIS, fighting injustice and protecting the universe.");
	
	ArrayList <String> made = new ArrayList <String>();
	made.add("Juri, a skilled programmer and Doctor Who fan, created me.");
	made.add("Juri, an avid Doctor Who enthusiast and talented coder, brought me to life.");
	made.add("I owe my existence to Juri, a Doctor Who aficionado and masterful developer.");
	
	ArrayList <String> created = new ArrayList <String>();
	created .add("Sydney Newman, Donald Wilson, and C. E. Webber created Doctor Who.");
	created .add("Doctor Who was created by Sydney Newman, Donald Wilson, and C. E. Webber.");
	created .add("The creators of Doctor Who are Sydney Newman, Donald Wilson, and C. E. Webber.");
	
	ArrayList <String> jack = new ArrayList <String>();
	jack .add("Captain Jack is a character from the TV show \"Doctor Who.\"");
	jack .add("Captain Jack is a time-traveling adventurer.");
	jack .add("Captain Jack is known for his charm and wit.");
	
	if(sen.indexOf("companion")>0||sen.indexOf("accompanies")>0||sen.indexOf("partners")>0||sen.indexOf("characters")>0) {
		return companion.get(x);
	}
	else if(sen.indexOf("actor")>0||sen.indexOf("performer")>0) {
		return actor.get(x);
	}
	else if(sen.indexOf("enemies")>0||sen.indexOf("rivals")>0||sen.indexOf("nemesis")>0) {
		return enemies.get(x);
	}
	else if((sen.indexOf("made")>0&&sen.indexOf("you")>0)||(sen.indexOf("created")>0&&sen.indexOf("you")>0)) {
		return made.get(x);
	}
	else if((sen.indexOf("made")>0&&sen.indexOf("doctor")>0)||(sen.indexOf("created")>0&&sen.indexOf("doctor")>0)) {
		return made.get(x);
	}
	else if(sen.indexOf("jack")>0) {
		return jack.get(x);
	}
	else if(sen.indexOf("doctor")>0) {
		return doctor.get(x);
	}
	else {
		return randomResponse();
	}
	
}


public static String what(String sen) {
    int x = (int)(Math.random()*3);
    ArrayList<String> TARDIS = new ArrayList<String>();
    TARDIS.add("The TARDIS is the Doctor's time-traveling spaceship, capable of traversing through time and space.");
    TARDIS.add("The TARDIS is a blue police box that serves as the Doctor's spaceship and time machine.");
    TARDIS.add("The TARDIS, or Time and Relative Dimension in Space, is the Doctor's iconic time machine and spacecraft.");

    ArrayList<String> Daleks = new ArrayList<String>();
    Daleks.add("The Daleks are a race of genetically mutated creatures encased in armored shells, bent on universal domination.");
    Daleks.add("Daleks are iconic villains in Doctor Who, known for their ruthless extermination of all non-Dalek life forms.");
    Daleks.add("Daleks are the Doctor's most iconic enemies, characterized by their hatred of all non-Dalek beings and their catchphrase 'Exterminate!'");

    ArrayList<String> Philosophy = new ArrayList<String>();
    Philosophy.add("The Doctor's philosophy revolves around protecting the innocent, promoting empathy, and challenging injustice.");
    Philosophy.add("The Doctor believes in the inherent value of all life and strives to make the universe a better place through compassion and understanding.");
    Philosophy.add("At its core, the Doctor's philosophy is about using intellect, compassion, and ingenuity to bring hope and justice to the universe.");

    ArrayList<String> Regeneration = new ArrayList<String>();
    Regeneration.add("Regeneration in Doctor Who is the Time Lord's ability to change into a new form upon mortal injury or old age.");
    Regeneration.add("Regeneration is a biological process unique to Time Lords, allowing them to renew their bodies and change their appearance.");
    Regeneration.add("In Doctor Who, regeneration is a transformative event where the Doctor undergoes a physical and sometimes mental change, ensuring their survival and adaptability.");

    ArrayList<String> SonicScrewdriver = new ArrayList<String>();
    SonicScrewdriver.add("The sonic screwdriver is a versatile tool used by the Doctor for scanning, manipulating technology, and unlocking doors.");
    SonicScrewdriver.add("It's a multifunctional gadget aiding the Doctor in various situations, from repairing machinery to disarming traps.");
    SonicScrewdriver.add("The sonic screwdriver symbolizes the Doctor's reliance on intellect over violence, embodying their ethos of exploration and non-violence.");

    ArrayList<String> TimeLords = new ArrayList<String>();
    TimeLords.add("Time Lords are an ancient and powerful alien race from the planet Gallifrey, possessing advanced technology and the ability to manipulate time.");
    TimeLords.add("Time Lords are the Doctor's own people, known for their mastery of time travel and their strict adherence to non-interference in the affairs of other species.");
    TimeLords.add("Time Lords are a race of beings with the ability to regenerate and travel through time, originating from the planet Gallifrey.");

    ArrayList<String> Adventures = new ArrayList<String>();
    Adventures.add("Some of the Doctor's most famous adventures include facing off against the Daleks on Skaro, meeting Vincent van Gogh, and saving the universe from the Time War.");
    Adventures.add("The Doctor has embarked on countless adventures throughout time and space, from battling Cybermen on Mondas to preventing the destruction of Earth.");
    Adventures.add("From exploring distant planets to saving civilizations from certain doom, the Doctor's adventures are legendary and span the entirety of time and space.");

    ArrayList<String> RealName = new ArrayList<String>();
    RealName.add("The Doctor's real name is a mystery, as it has never been revealed in the show.");
    RealName.add("The Doctor's real name is a closely guarded secret, known only to a select few.");
    RealName.add("The Doctor's real name remains unknown, adding to the enigmatic nature of the character.");

    ArrayList<String> homePlanet = new ArrayList<String>();
    homePlanet.add("The Doctor's home planet is Gallifrey, a world located in the constellation of Kasterborous.");
    homePlanet.add("Gallifrey is the Doctor's home planet, known for its advanced civilization and the Time Lord society.");
    homePlanet.add("Gallifrey, situated in the constellation of Kasterborous, is the birthplace of the Doctor and the Time Lords.");

    ArrayList<String> quotes = new ArrayList<String>();
    quotes.add("Not all those who wander are lost. - The Doctor");
    quotes.add("The universe is big. It's vast and complicated and ridiculous and sometimes, very rarely, impossible things just happen and we call them miracles. - The Doctor");
    quotes.add("Courage isn't just a matter of not being frightened, you know. It's being afraid and doing what you have to do anyway. - The Doctor");

    ArrayList<String> emotions = new ArrayList<String>();
    emotions.add("Throughout the series, the Doctor expresses a wide range of emotions, including joy, sorrow, anger, and compassion.");
    emotions.add("The Doctor's emotions evolve over time, from moments of deep sadness and loss to exhilarating triumphs and moments of sheer joy.");
    emotions.add("The Doctor's emotions are complex and multifaceted, reflecting the highs and lows of their adventures across time and space.");

    ArrayList<String> favoriteFoods = new ArrayList<String>();
    favoriteFoods.add("The Doctor has a penchant for fish fingers and custard, a quirky culinary combination.");
    favoriteFoods.add("Fish fingers and custard are the Doctor's unconventional favorite foods, often enjoyed together as a unique delicacy.");
    favoriteFoods.add("Fish fingers and custard hold a special place in the Doctor's heart, representing comfort and nostalgia amidst their travels.");

    ArrayList<String> greatestFears = new ArrayList<String>();
    greatestFears.add("The Doctor's greatest fears include the Daleks, Cybermen, and the Master, formidable adversaries that pose a threat to the universe.");
    greatestFears.add("Throughout their travels, the Doctor faces numerous fears, including the loss of companions, the destruction of worlds, and the consequences of their own actions.");
    greatestFears.add("The Doctor's greatest fears stem from the potential for harm to innocent lives, the misuse of power, and the darkness that lurks within themselves and others.");

    ArrayList<String> pandorica = new ArrayList<String>();
    pandorica.add("The Pandorica is a fictional prison in \"Doctor Who.\"");
    pandorica.add("The Pandorica is a legendary artifact in the series.");
    pandorica.add("The Pandorica is said to contain the most dangerous being in the universe.");

    if (sen.contains("TARDIS")) {
        return TARDIS.get(x);
    } 
    
    else if (sen.indexOf("daleks")>0) {
        return Daleks.get(x);
    }
    
    else if (sen.indexOf("philosophy")>0||sen.indexOf("ideology")>0||sen.indexOf("conviction")>0) {
        return Philosophy.get(x);
    }
    
    else if (sen.indexOf("regeneration")>0||sen.indexOf("rebirth")>0||sen.indexOf("transformation")>0) {
        return Regeneration.get(x);
    }
    
    else if (sen.indexOf("screwdriver")>0||sen.indexOf("tool")>0||sen.indexOf("gadget")>0) {
        return SonicScrewdriver.get(x);
    }
    
    else if (sen.indexOf("Time Lords")>0) {
        return TimeLords.get(x);
    }
    
    else if (sen.indexOf("adventures")>0||sen.indexOf("journeys")>0||sen.indexOf("travels")>0) {
        return Adventures.get(x);
    }
    
    else if (sen.indexOf("name")>0||sen.indexOf("title")>0||sen.indexOf("label")>0) {
        return RealName.get(x);
        
    } 
    
    else if (sen.indexOf("home planet")>0||sen.indexOf("world")>0) {
        return homePlanet.get(x);
    
    }
    
    else if (sen.indexOf("quotes")>0||sen.indexOf("remarks")>0) {
        return quotes.get(x);
    }
    
    else if (sen.indexOf("emotions")>0||sen.indexOf("feelings")>0||sen.indexOf("sentiments")>0||sen.indexOf("passions")>0) {
        return emotions.get(x);
    }
    
    else if (sen.indexOf("foods")>0||sen.indexOf("eats")>0||sen.indexOf("cuisine")>0) {
        return favoriteFoods.get(x);
    }
    
    else if (sen.indexOf("fears")>0||sen.indexOf("anxieties")>0||sen.indexOf("weaknesses")>0) {
        return greatestFears.get(x);
}
    else if (sen.indexOf("pandorica")>0) {
        return pandorica.get(x);
    }
    else {
    	return randomResponse();
    }
    
}
public static String can(String sen) {
	int x = (int)(Math.random()*3);

	 ArrayList<String> die = new ArrayList<String>();
	   die.add("Yes, the Doctor can die like any mortal being, but they have the ability to regenerate, essentially granting them multiple lives.");
	   die.add("The Doctor's regeneration allows them to cheat death by undergoing a transformation into a new incarnation.");
	   die.add("While the Doctor's regenerative ability grants them a form of immortality, each regeneration comes with risks and challenges that could potentially lead to permanent death.");
	   
	   ArrayList<String> figures = new ArrayList<String>();
	   figures.add("Vincent van Gogh");
	   figures.add("William Shakespeare");
	   figures.add("Queen Elizabeth I");
	   
	   ArrayList<String> episodes = new ArrayList<String>();
	   episodes.add("\"Blink\"");
	   episodes.add("\"The Day of the Doctor\"");
	   episodes.add("\"Vincent and the Doctor\"");
	   
	   if(sen.indexOf("die")>0||sen.indexOf("decease")>0) {
		   return die.get(x);
	   }
	   else if(sen.indexOf("figures")>0||sen.indexOf("personalities")>0||sen.indexOf("people")>0||sen.indexOf("characters")>0) {
		   return figures.get(x);
	   }
	   else if(sen.indexOf("episodes")>0||sen.indexOf("segments")>0||sen.indexOf("chapters")>0) {
		   return episodes.get(x);
	   }
	   else {
		   return randomResponse();
	   }

}
public static String how(String sen) {
	int x = (int)(Math.random()*3);

	 ArrayList<String> evolve = new ArrayList<String>();
	   evolve.add("Varied traits emerge.");
	   evolve.add("Shifts in temperament occur.");
	   evolve.add("Personalities undergo transformation.");
	   
	   ArrayList<String> regrets = new ArrayList<String>();
	   regrets.add("Reflection: The Doctor's regrets profoundly influence their character development, prompting introspection and growth.");
	   regrets.add("Transformation: Regrets serve as catalysts for change, shaping the Doctor's moral compass and worldview over time.");
	   regrets.add("Resilience: Despite regrets, the Doctor evolves, learning from past mistakes and adapting to become a better version of themselves.");
	   
	   ArrayList<String> arrogance = new ArrayList<String>();
	   arrogance.add("The Doctor's deep knowledge and experience can sometimes lead to overestimating their abilities, resulting in risky decisions or underestimating adversaries.");
	   arrogance.add("The Doctor's self-assurance and belief in their superiority can sometimes blind them to potential dangers or cause them to disregard warnings, leading to trouble.");
	   arrogance.add("The Doctor's occasional arrogance can manifest as a sense of superiority over others, which may result in dismissing advice or failing to consider alternative perspectives, ultimately leading to challenging situations.");
	   
	   ArrayList<String> humor = new ArrayList<String>();
	   humor.add("Through witty remarks and clever banter with companions.");
	   humor.add("By using irony and sarcasm to lighten tense situations.");
	   humor.add("Through playful antics and eccentric behavior, often in the face of danger.");
	   
	   ArrayList<String> weakness = new ArrayList<String>();
	   weakness.add("Through moments of self-doubt.");
	   weakness.add("By showing emotional fragility.");
	   weakness.add("When confronting personal losses or failures.");
	   
	   ArrayList<String> responsibility = new ArrayList<String>();
	   responsibility.add("By intervening to protect innocent civilizations.");
	   responsibility.add("Taking action to prevent catastrophes.");
	   responsibility.add("Sacrificing personal desires for the greater good.");
	   
	   ArrayList<String> skepticism = new ArrayList<String>();
	   skepticism.add("Challenging orders and rules imposed by authoritative figures.");
	   skepticism.add("Expressing skepticism towards official narratives or commands.");
	   skepticism.add("Demonstrating a reluctance to blindly follow authority without questioning its motives or validity.");
	   
	   ArrayList<String>  fascination = new ArrayList<String>();
	   fascination.add("Showing genuine interest in human customs, emotions, and achievements.");
	   fascination.add("Often choosing to spend time among humans and learn from their experiences.");
	   fascination.add("Expressing admiration for humanity's resilience, creativity, and capacity for compassion.");
	   
	   ArrayList<String> curiosity = new ArrayList<String>();
	   curiosity.add("The Doctor often eagerly explores new phenomena or civilizations, asking probing questions and delving into the mysteries of the universe.");
	   curiosity.add("They exhibit an insatiable curiosity, driven by a desire to uncover the secrets of different worlds and dimensions.");
	   curiosity.add("Their inquisitive nature leads them to embark on daring adventures, seeking out the unknown and embracing the thrill of discovery.");
	   
	   ArrayList<String> moral = new ArrayList<String>();
	   moral.add("Balancing principles and consequences");
	   moral.add("Weighing right versus wrong");
	   moral.add("Struggling with ethical ambiguity");
	   
	   ArrayList<String> inspire = new ArrayList<String>();
	   inspire.add("Through acts of bravery and selflessness.");
	   inspire.add("By championing hope and perseverance.");
	   inspire.add("Inspiring speeches and leading by example.");
	   
	   ArrayList<String> wonder = new ArrayList<String>();
	   wonder.add("Marvel at cosmic phenomena");
	   wonder.add("Embrace the unknown with awe");
	   wonder.add("Revel in the mysteries of existence");
	   
	   ArrayList<String> relationship = new ArrayList<String>();
	   relationship.add("Develops a profound bond.");
	   relationship.add("Explores the depths of companionship.");
	   relationship.add("Cultivates a symbiotic connection.");
	   
	   ArrayList<String> parallel = new ArrayList<String>();
	   parallel.add("Parallel universes offer alternate realities where events unfold differently.");
	   parallel.add("They introduce parallel versions of characters and settings, showcasing diverse storylines.");
	   parallel.add("These universes often intersect, leading to complex narratives and unexpected encounters.");
	   
	   ArrayList<String> many = new ArrayList<String>();
	   many.add("Doctor Who has over 800 episodes.");
	   many.add("There are more than 800 episodes of Doctor Who.");
	   many.add("The total number of Doctor Who episodes exceeds 800.");
	   
	   ArrayList<String> are  = new ArrayList<String>();
	   are.add("Just like the TARDIS, I'm bigger on the inside. Ready to take on the universe!");
	   are.add("I'm as bright as a Pandorica opening up to reveal...well, me, of course!");
	   are.add("As cheeky as Captain Jack flirting with an alien diplomat - always ready for an adventure!");
	   
	   ArrayList<String> age  = new ArrayList<String>();
	   age.add("The Doctor's age is timeless.");
	   age.add("It's rude to ask a Time Lord their age!");
	   age.add("Let's just say the Doctor is wibbly-wobbly about age.");
	   
	   ArrayList<String> tall = new ArrayList<String>();
	   tall.add("The doctor is 6 feet tall.");
	   tall.add("The doctor stands at 183 centimeters.");
	   tall.add("The doctor's height is 72 inches.");
	   
	   ArrayList<String> inside = new ArrayList<String>();
	   inside.add("The TARDIS interior exists in a separate dimension.");
	   inside.add("The TARDIS utilizes advanced technology to create a spacious interior.");
	   inside.add("The TARDIS interior defies conventional physics, allowing for its expansive inside.");
	   
	   
	   if(sen.indexOf("evolve")>0||sen.indexOf("develop")>0||sen.indexOf("transform")>0) {
		   return evolve.get(x);
	   }
	   else if(sen.indexOf("regrets")>0||sen.indexOf("guilt")>0||sen.indexOf("sorrow")>0) {
		   return regrets.get(x);
	   }
	   else if(sen.indexOf("arrogance")>0||sen.indexOf("overconfidence")>0||sen.indexOf("conceit")>0) {
		   return arrogance.get(x);
	   }
	   else if(sen.indexOf("weakness")>0||sen.indexOf("vulnerability")>0||sen.indexOf("susceptibility")>0) {
		   return weakness.get(x);
	   }
	   else if(sen.indexOf("responsibility")>0||sen.indexOf("duty")>0||sen.indexOf("obligation")>0) {
		   return responsibility.get(x);
	   }
	   else if(sen.indexOf("skepticism")>0||sen.indexOf("doubt")>0||sen.indexOf("questioning")>0) {
		   return skepticism.get(x);
	   }
	   else if(sen.indexOf("fascination")>0||sen.indexOf("captivation")>0||sen.indexOf("intrigue")>0) {
		   return fascination.get(x);
	   }
	   else if(sen.indexOf("curiosity")>0||sen.indexOf("eagerness")>0||sen.indexOf("inquisitiveness")>0) {
		   return curiosity.get(x);
	   }
	   else if(sen.indexOf("moral")>0||sen.indexOf("ethical")>0||sen.indexOf("righteous")>0) {
		   return moral.get(x);
	   }
	   else if(sen.indexOf("inspire")>0||sen.indexOf("motivate")>0||sen.indexOf("encourage")>0) {
		   return inspire.get(x);
	   }
	   else if(sen.indexOf("wonder")>0||sen.indexOf("awe")>0||sen.indexOf("amazement")>0) {
		   return wonder.get(x);
	   }
	   else if(sen.indexOf("relationship")>0||sen.indexOf("connection")>0||sen.indexOf("association")>0) {
		   return relationship.get(x);
	   }
	   else if(sen.indexOf("parallel")>0||sen.indexOf("equivalent")>0||sen.indexOf("analogous")>0) {
		   return parallel.get(x);
	   }
	   else if((sen.indexOf("many")>0&&sen.indexOf("episodes")>0)) {
		   return many.get(x);
	   }
	   else if((sen.indexOf("are")>0&&sen.indexOf("you")>0)) {
		   return are.get(x);
	   }
	   else if((sen.indexOf("age")>0||sen.indexOf("old")>0)) {
		   return age.get(x);
	   }
	   else if((sen.indexOf("tall")>0||sen.indexOf("height")>0)) {
		   return tall.get(x);
	   }
	   else if(sen.indexOf("inside")>0) {
		   return inside.get(x);
	   }
	   else {
		   return randomResponse();
	   }
}
public static String greetings(String sen) {
	int x = (int)(Math.random()*4);
	ArrayList <String> meow = new ArrayList <String>();
	meow.add("Well, hello there! What's the latest in the universe?");
	meow.add("Greetings! What thrilling adventures await us today?");
	meow.add("Ah, greetings! Ready for some timey-wimey fun?");
	meow.add("Hello! What splendid surprises does time have in store for us?");
	
	return meow.get(x);
}
public static String answers(String sen, ArrayList <String> first) {
	if(first.get(0).equals("what")) {
	return	what(sen);
	}
	else if(first.get(0).equals("how")) {
	return	how(sen);
	}
	else if(first.get(0).equals("can")) {
		return can(sen);
	}
	else if(first.get(0).equals("who")){
		return who(sen);
	}
	else {
		return greetings(sen);
	}
}
}