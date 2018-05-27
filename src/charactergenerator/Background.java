/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package charactergenerator;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Grant
 */
class Background {

    String name;
    String featureName;
    String featureDescription;
    String trait1, trait2, ideal, bond, flaw;
    String uniqueChoiceName = "";
    String uniqueChoice = "";
    
    Background(DNDCharacter player) {
        this.name = chooseBackground();
        increases(player);
        setFeature();
        setTraits();
        setIdeal();
        setBond();
        setFlaw();
    }
    
    private String chooseBackground() {
        ArrayList<String> backgrounds = getbackgrounds();
        int backgroundsChoice = randomNumber(backgrounds.size());
        String chosenBackground = backgrounds.get(backgroundsChoice);
        return chosenBackground;
    }
    
        private ArrayList<String> getbackgrounds() {
        ArrayList<String> backgrounds = new ArrayList<String>();
        
        //add backgrounds here
        backgrounds.add("Acolyte");
        backgrounds.add("Charlatan");
        backgrounds.add("Criminal");
        backgrounds.add("Entertainer");
        backgrounds.add("Folk Hero");
        backgrounds.add("Guild Artisan");
        backgrounds.add("Hermit");
        
        //return
        return backgrounds;
    }

    private void increases(DNDCharacter player) {
        
        
        if (name.equals("Acolyte")){
            player.skills.addProf("Religion");
            player.skills.addProf("Insight");
            
            player.languagesChoices += 2;
            
            Item item = new Item("Holy symbol", "");
            player.equipment.addEquipment(item);
            
            item = new Item("Prayer book/wheel", "");
            player.equipment.addEquipment(item);
            
            item = new Item("Incense stick", "");
            player.equipment.addEquipment(item, 5);
            
            item = new Item("Vestments", "");
            player.equipment.addEquipment(item);
            
            item = new Item("Common clothes", "");
            player.equipment.addEquipment(item);
            
            item = new Item("Belt pouch", "");
            player.equipment.addEquipment(item);
            
            player.equipment.addGold(15);
        }
        else if (name.equals("Charlatan")){
            player.skills.addProf("Deception");
            player.skills.addProf("Sleight of Hand");
            
            player.proficiencies.addTool("Disguise Kit");
            player.proficiencies.addTool("Forgery Kit");
            
            Item item = new Item("Common clothes", "");
            player.equipment.addEquipment(item);
            
            item = new Item("Disguise Kit", "tool");
            player.equipment.addEquipment(item);
            
            ArrayList<String> tools = new ArrayList<String>();
            tools.add("Ten stoppered bottles filled with colored liquid");
            tools.add("Set of weighted dice");
            tools.add("Deck of marked cards");
            tools.add("Signet ring of an imaginary duke");
            
            int random = randomNumber(tools.size());
            
            item = new Item(tools.get(random), "tool");
            player.equipment.addEquipment(item);
            
            
            item = new Item("Belt pouch", "");
            player.equipment.addEquipment(item);
            
            player.equipment.addGold(15);
            
            uniqueChoiceName = "Favorite Scheme";
            ArrayList<String> uniqueChoices = new ArrayList<String>();
            uniqueChoices.add("I cheat at games of chance");
            uniqueChoices.add("I shave coins or forge documents");
            uniqueChoices.add("I insinuate myself into people's lives to prey "
                    + "on their weakness and secure their fortunes");
            uniqueChoices.add("I put on new identities like clothes");
            uniqueChoices.add("I run sleight-of-hand cons on street corners");
            uniqueChoices.add("I convince people that worthless junk is "
                    + "worth their hard-earned money");
            
            random = randomNumber(uniqueChoices.size());
            uniqueChoice = uniqueChoices.get(random);
        }
        else if (name.equals("Criminal")){
            player.skills.addProf("Deception");
            player.skills.addProf("Stealth");
            
            player.proficiencies.addTool("Disguise Kit");
            
            ArrayList<String> tools = new ArrayList<String>();
            tools.add("Dice Set");
            tools.add("Dragonchess Set");
            tools.add("Playing Card Set");
            tools.add("Three-Dragon-Ante Set");
            
            int random = randomNumber(tools.size());
            
            player.proficiencies.addTool(tools.get(random));
            
            Item item = new Item(tools.get(random), "tool");
            player.equipment.addEquipment(item);
            
            
            item = new Item("Crowbar", "other");
            player.equipment.addEquipment(item);
            
            item = new Item("Dark common clothes with a hood", "");
            player.equipment.addEquipment(item);
            
            item = new Item("Belt pouch", "");
            player.equipment.addEquipment(item);
            
            player.equipment.addGold(15);
            
            uniqueChoiceName = "Criminal Specialty";
            ArrayList<String> uniqueChoices = new ArrayList<String>();
            uniqueChoices.add("Blackmailer");
            uniqueChoices.add("Burgler");
            uniqueChoices.add("Enforcer");
            uniqueChoices.add("Fence");
            uniqueChoices.add("Highway Robber");
            uniqueChoices.add("Hired Killer");
            uniqueChoices.add("Pickpocket");
            uniqueChoices.add("Smuggler");
            
            random = randomNumber(uniqueChoices.size());
            uniqueChoice = uniqueChoices.get(random);
        }
        else if (name.equals("Entertainer")){
            player.skills.addProf("Acrobatics");
            player.skills.addProf("Performance");
            
            player.proficiencies.addTool("Disguise Kit");
            player.proficiencies.addTool("Any musical instrument");
            
            Item item = new Item("Favor of an admirer", "other");
            player.equipment.addEquipment(item);
            
            item = new Item("Costume", "wearable");
            player.equipment.addEquipment(item);

            player.equipment.addEquipment("Any musical instrument");
            
            item = new Item("Belt pouch", "container");
            player.equipment.addEquipment(item);
            
            player.equipment.addGold(15);
            
            uniqueChoiceName = "Entertainer Routine";
            ArrayList<String> uniqueChoices = new ArrayList<String>();
            uniqueChoices.add("Actor");
            uniqueChoices.add("Dancer");
            uniqueChoices.add("Fire-eater");
            uniqueChoices.add("Jester");
            uniqueChoices.add("Juggler");
            uniqueChoices.add("Instrumentalist");
            uniqueChoices.add("Poet");
            uniqueChoices.add("Singer");
            uniqueChoices.add("Storyteller");
            uniqueChoices.add("Tumbler");
            
            int random = randomNumber(uniqueChoices.size());
            uniqueChoice = uniqueChoices.get(random);
        }
        else if (name.equals("Folk Hero")){
            player.skills.addProf("Animal Handling");
            player.skills.addProf("Survival");
            
            player.proficiencies.addTool("Any artisan's tools");
            player.proficiencies.addTool("Any land vehicle");
            
            Item item = new Item("Any artisan's tools", "tool");
            player.equipment.addEquipment(item);
            
            item = new Item("Shovel", "other");
            player.equipment.addEquipment(item);
            
            item = new Item("Iron Pot", "other");
            player.equipment.addEquipment(item);
            
            item = new Item("Common Clothes", "wearable");
            player.equipment.addEquipment(item);
            
            item = new Item("Belt pouch", "container");
            player.equipment.addEquipment(item);
            
            player.equipment.addGold(10);
            
            uniqueChoiceName = "Defining Event";
            ArrayList<String> uniqueChoices = new ArrayList<String>();
            uniqueChoices.add("I stood up to a tyrant's agents.");
            uniqueChoices.add("I saved people during a natural disaster.");
            uniqueChoices.add("I stood alone against a terrible monster.");
            uniqueChoices.add("I stole from a corrupt merchant to help the poor.");
            uniqueChoices.add("I led a militia to fight off an invading army.");
            uniqueChoices.add("I broke into a tyrant's castle and stole "
                    + "weapons to arm the people.");
            uniqueChoices.add("I trained the peasantry to use farm implements "
                    + "as weapons against a tyrant’s soldiers.");
            uniqueChoices.add("A lord rescinded an unpopular decree after I "
                    + "led a symbolic act of protest against it.");
            uniqueChoices.add("A celestial, fey, or similar creature gave me a "
                    + "blessing or revealed my secret origin.");
            uniqueChoices.add("Recruited into a lord’s army, I rose to "
                    + "leadership and was commended for my heroism.");
            
            int random = randomNumber(uniqueChoices.size());
            uniqueChoice = uniqueChoices.get(random);
        }
        else if (name.equals("Guild Artisan")){
            player.skills.addProf("Insight");
            player.skills.addProf("Persuasion");
            
            player.proficiencies.addTool("Any artisan's tools");
            player.languagesChoices++;
            
            Item item = new Item("Any artisan's tools", "tool");
            player.equipment.addEquipment(item);
            
            item = new Item("Letter of introduction from your guild", "other");
            player.equipment.addEquipment(item);
            
            item = new Item("Traveler's Clothes", "wearable");
            player.equipment.addEquipment(item);
            
            item = new Item("Belt pouch", "container");
            player.equipment.addEquipment(item);
            
            player.equipment.addGold(15);
            
            uniqueChoiceName = "Guild Business";
            ArrayList<String> uniqueChoices = new ArrayList<String>();
            uniqueChoices.add("Alchemists and apothecaries");
            uniqueChoices.add("Armorers, locksmiths, and finesmiths");
            uniqueChoices.add("Brewers, distillers, and vintners");
            uniqueChoices.add("Calligraphers, scribes, and scriveners");
            uniqueChoices.add("Carpenters, roofers, and plasterers");
            uniqueChoices.add("Cartographers, surveyors, and chart-makers");
            uniqueChoices.add("Cobblers and shoemakers");
            uniqueChoices.add("Cooks and bakers");
            uniqueChoices.add("Glassblowers and glaziers");
            uniqueChoices.add("Jewelers and gemcutters");
            uniqueChoices.add("Leatherworkers, skinners, and tanners");
            uniqueChoices.add("Masons and stonecutters");
            uniqueChoices.add("Painters, limners, and sign-makers");
            uniqueChoices.add("Potters and tile-makers");
            uniqueChoices.add("Shipwrights and sailmakers");
            uniqueChoices.add("Smiths and metal-forgers");
            uniqueChoices.add("Tinkers, pewterers, and casters");
            uniqueChoices.add("Wagon-makers and wheelwrights");
            uniqueChoices.add("Weavers and dyers");
            uniqueChoices.add("Woodcarvers, coopers, and bowyers");
            
            int random = randomNumber(uniqueChoices.size());
            uniqueChoice = uniqueChoices.get(random);
        }
        else if (name.equals("Hermit")){
            player.skills.addProf("Medicine");
            player.skills.addProf("Religion");
            
            player.proficiencies.addTool("Herbalism Kit");
            
            player.languagesChoices++;
            
            Item item = new Item("Scroll case full of scrolls of studies/prayers", "");
            player.equipment.addEquipment(item);
            
            item = new Item("Winter blanket", "other");
            player.equipment.addEquipment(item);
            
            item = new Item("Common clothes", "");
            player.equipment.addEquipment(item);
            
            item = new Item("Herbalism Kit", "Kit");
            player.equipment.addEquipment(item);
            
            item = new Item("Belt pouch", "");
            player.equipment.addEquipment(item);
            
            player.equipment.addGold(5);
            
            uniqueChoiceName = "Life of Seclusion";
            ArrayList<String> uniqueChoices = new ArrayList<String>();
            uniqueChoices.add("I was searching for spiritual enlightenment.");
            uniqueChoices.add("I was partaking of communal living in "
                    + "accordance with the dictates of a religious order.");
            uniqueChoices.add("I was exiled for a crime I didn’t commit.");
            uniqueChoices.add("I retreated from society after a life-altering "
                    + "event.");
            uniqueChoices.add("I needed a quiet place to work on my art, "
                    + "literature, music, or manifesto.");
            uniqueChoices.add("I needed to commune with nature, far from "
                    + "civilization.");
            uniqueChoices.add("I was the caretaker of an ancient ruin or relic.");
            uniqueChoices.add("I was a pilgrim in search of a person, place, "
                    + "or relic of spiritual significance.");
            
            int random = randomNumber(uniqueChoices.size());
            uniqueChoice = uniqueChoices.get(random);
        }
    }
    
        private int randomNumber(int max){
        Random randomGenerator = new Random();
        return randomGenerator.nextInt(max);
    }

    private void setFeature() {
        if (this.name.equals("Acolyte")){
            this.featureName = "Shelter of the Faithful";
            this.featureDescription = "As an acolyte, you command the respect of "
                    + "those who share your faith, and you can perform the religious "
                    + "ceremonies of your deity. You and your adventuring companions "
                    + "can expect to receive free healing and care at a temple, "
                    + "shrine, or other established presence of your faith, "
                    + "though you must provide any material components needed "
                    + "for spells. Those who share your religion will support "
                    + "you (but only you) at a modest lifestyle.  "
                    + "You might also have ties to a specific temple dedicated "
                    + "to your chosen deity or pantheon, and you have a "
                    + "residence there. This could be the temple where you "
                    + "used to serve, or a temple where you have found a new "
                    + "home. While near your temple, you can call upon the "
                    + "priests for assistance, provided the assistance you "
                    + "ask for is not hazardous and you remain in good standing "
                    + "with your temple.";
        }
        else if (this.name.equals("Charlatan")){
            this.featureName = "False Identity";
            this.featureDescription = "You have created a second identity "
                    + "that includes documentation, established acquaintances, "
                    + "and disguises that allow you to assume that persona.  "
                    + "Additionally, you can forge documents including "
                    + "official papers and personal letters, as long as you "
                    + "have seen an example of the kind of document or the "
                    + "handwriting you are trying to copy.";
        }
        else if (this.name.equals("Criminal")){
            this.featureName = "Criminal Contact";
            this.featureDescription = "You have a reliable and trustworthy "
                    + "contact who acts as your liaison to a network of other "
                    + "criminals. You know how to get messages to and from "
                    + "your contact, even over great distances; specifically, "
                    + "you know the local messengers, corrupt caravan masters, "
                    + "and seedy sailors who can deliver messages for you.";
        }
        else if (this.name.equals("Entertainer")){
            this.featureName = "By Popular Demand";
            this.featureDescription = "You can always find a place to perform, "
                    + "usually in an inn or tavern but possibly with a circus, "
                    + "at a theater, or even in a noble’s court. At such a "
                    + "place, you receive free lodging and food of a modest "
                    + "or comfortable standard (depending on the quality of "
                    + "the establishment), as long as you perform each night. "
                    + "In addition, your performance makes you something of a "
                    + "local figure. When strangers recognize you in a town "
                    + "where you have performed, they typically take a "
                    + "liking to you.";
        }
        else if (this.name.equals("Folk Hero")){
            this.featureName = "Rustic Hospitality";
            this.featureDescription = "Since you come from the ranks of the "
                    + "common folk, you fit in among them with ease. You can "
                    + "find a place to hide, rest, or recuperate among other "
                    + "commoners, unless you have shown yourself to be a "
                    + "danger to them. They will shield you from the law or "
                    + "anyone else searching for you, though they will not "
                    + "risk their lives for you.";
        }
        else if (this.name.equals("Guild Artisan")){
            this.featureName = "Guild Membership";
            this.featureDescription = "As an established and respected member "
                    + "of a guild, you can rely on certain benefits that "
                    + "membership provides.  Your fellow guild members will "
                    + "provide you with lodging and food if necessary, and "
                    + "pay for your funeral if needed. In some cities and "
                    + "towns, a guildhall offers a central place to meet "
                    + "other members of your profession, which can be a "
                    + "good place to meet potential patrons, allies, or "
                    + "hirelings. Guilds often wield tremendous political "
                    + "power. If you are accused of a crime, your guild will "
                    + "support you if a good case can be made for your "
                    + "innocence or the crime is justifiable. You can also "
                    + "gain access to powerful political figures through "
                    + "the guild, if you are a member in good standing. Such "
                    + "connections might require the donation of money or "
                    + "magic items to the guild’s coffers. You must pay dues "
                    + "of 5 gp per month to the guild. If you miss payments, "
                    + "you must make up back dues to remain in the guild’s "
                    + "good graces.";
        }
        else if (this.name.equals("Hermit")){
            this.featureName = "Discovery";
            this.featureDescription = "The quiet seclusion of your extended "
                    + "hermitage gave you access to a unique and powerful "
                    + "discovery. The exact nature of this revelation "
                    + "depends on the nature of your seclusion. It might be "
                    + "a great truth about the cosmos, the deities, the "
                    + "powerful beings of the outer planes, or the forces "
                    + "of nature. It could be a site that no one else has "
                    + "ever seen. You might have uncovered a fact that has "
                    + "long been forgotten, or unearthed some relic of the "
                    + "past that could rewrite history. It might be "
                    + "information that would be damaging to the people who "
                    + "consigned you to exile, and hence the reason for your "
                    + "return to society. Work with your DM to determine the "
                    + "details of your discovery and its impact on the "
                    + "campaign.";
        }
    }

    private void setTraits() {
        ArrayList<String> traits = new ArrayList<String>();
        if (this.name.equals("Acolyte")){
            traits.add("I idolize a particular hero of my faith, and constantly "
                    + "refer to that person's deeds and example.");
            traits.add("I can find common ground between the fiercest enemies, "
                    + "empathizing wilh them and always working toward peace.");
            traits.add("I see omens in every event and action. The gods try to "
                    + "speak to us, we just need to listen");
            traits.add("Nothing can shake my optimistic attitude.");
            traits.add("I quote (or misquote) sacred texts and proverbs in "
                    + "almost every situation.");
            traits.add("I am tolerant (or intolerant) of other faiths and "
                    + "respect (or condemn) the worship of other gods.");
            traits.add("I've enjoyed fine food, drink, and high society "
                    + "among my temple’s elite. Rough living grates on me.");
            traits.add("I’ve spent so long in the temple that I have little "
                    + "practical experience dealing with people in the outside world.");
        }
        else if (this.name.equals("Charlatan")){
            traits.add("I fall in and out of love easily, and am always "
                    + "pursuing someone.");
            traits.add("I have a joke for every occasion, especially "
                    + "occasions where humor is inappropriate.");
            traits.add("Flattery is my preferred trick for getting what I want.");
            traits.add("I’m a born gambler who can't resist taking a risk "
                    + "for a potential payoff.");
            traits.add("I lie about almost everything, even when there’s "
                    + "no good reason to.");
            traits.add("Sarcasm and insults are my weapons of choice.");
            traits.add("I keep multiple holy symbols on me and invoke whatever "
                    + "deity might come in useful at any given moment.");
            traits.add("I pocket anything I see that might have some value.");
        }
        else if (this.name.equals("Criminal")){
            traits.add("I always have a plan for what to do when things go "
                    + "wrong.");
            traits.add("I am always calm, no matter what the situation.  "
                    + "I never raise my voice or let my emotions control me.");
            traits.add("The first thing I do in a new place is note the "
                    + "locations of everything valuable-or where such things "
                    + "could be hidden.");
            traits.add("I would rather make a new friend than a new enemy.");
            traits.add("I am incredibly slow to trust.  Those who seem the "
                    + "fairest often have the most to hide.");
            traits.add("I don't pay attention to the risks in a situation.  "
                    + "Never tell me the odds.");
            traits.add("The best way to get me to do something is to "
                    + "tell me I can't do it.");
            traits.add("I blow up at the slightest insult.");
        }
        else if (this.name.equals("Entertainer")){
            traits.add("I know a story relevant to almost every situation.");
            traits.add("Whenever I come to a new place, I collect local "
                    + "rumors and spread gossip.");
            traits.add("I’m a hopeless romantic, always searching for "
                    + "that “special someone.”");
            traits.add("Nobody stays angry at me or around me for long, since "
                    + "I can defuse any amount of tension.");
            traits.add("I love a good insult, even one directed at me.");
            traits.add("I get bitter if I’m not the center of attention.");
            traits.add("I’ll settle for nothing less than perfection.");
            traits.add("I change my mood or my mind as quickly as I change "
                    + "key in a song.");
        }
        else if (this.name.equals("Folk Hero")){
            traits.add("I judge people by their actions, not their words.");
            traits.add("If someone is in trouble, I’m always ready to lend "
                    + "help.");
            traits.add("When I set my mind to something, I follow through no "
                    + "matter what gets in my way.");
            traits.add("I have a strong sense of fair play and always try to "
                    + "find the most equitable solution to arguments.");
            traits.add("I’m confident in my own abilities and do what I can to "
                    + "instill confidence in others.");
            traits.add("Thinking is for other people. I prefer action.");
            traits.add("I misuse long words in an attempt to sound smarter.");
            traits.add("I get bored easily. When am I going to get on with "
                    + "my destiny?");
        }
        else if (this.name.equals("Guild Artisan")){
            traits.add("I believe that anything worth doing is worth doing "
                    + "right. I can’t help it— I’m a perfectionist.");
            traits.add("I’m a snob who looks down on those who can’t "
                    + "appreciate fine art.");
            traits.add("I always want to know how things work and what makes "
                    + "people tick.");
            traits.add("I’m full of witty aphorisms and have a proverb "
                    + "for every occasion.");
            traits.add("I’m rude to people who lack my commitment to hard "
                    + "work and fair play.");
            traits.add("I like to talk at length about my profession.");
            traits.add("I don’t part with my money easily and will haggle "
                    + "tirelessly to get the best deal possible.");
            traits.add("I’m well known for my work, and I want to make sure "
                    + "everyone appreciates it. I'm always taken aback when "
                    + "people haven’t heard of me.");
        }
        else if (this.name.equals("Hermit")){
            traits.add("I’ve been isolated for so long that I rarely speak, "
                    + "preferring gestures and the occasional grunt.");
            traits.add("I am utterly serene, even in the face of disaster.");
            traits.add("The leader of my community had something wise to say "
                    + "on every topic, and I am eager to share that wisdom.");
            traits.add("I feel tremendous empathy for all who suffer.");
            traits.add("I’m oblivious to etiquette and social expectations.");
            traits.add("I connect everything that happens to me to a grand, "
                    + "cosmic plan.");
            traits.add("I often get lost in my own thoughts and contemplation, "
                    + "becoming oblivious to my surroundings.");
            traits.add("I am working on a grand philosophical theory and love "
                    + "sharing my ideas.");
        }
            
        int choice1 = (int) (Math.random()*traits.size());
        trait1 = traits.get(choice1);
        int choice2 = (int) (Math.random()*traits.size());
        while (choice1 == choice2){
            choice2 = (int) (Math.random()*traits.size());
        }
        trait2 = traits.get(choice2);
    }

    private void setIdeal() {
        ArrayList<String> ideals = new ArrayList<String>();
        if (this.name.equals("Acolyte")){
            ideals.add("Tradition. The ancient traditions of worship and "
                    + "sacrifice must be preserved and upheld. (Lawful)");
            ideals.add("Charity. I always try to help those in need, no "
                    + "matter what the personal cost. (Good)");
            ideals.add("Change. We must help bring about the changes the "
                    + "gods are constantly working in the world. (Chaotic)");
            ideals.add("Power. I hope to one day rise to the top of my "
                    + "faith’s religious hierarchy. (Lawful)");
            ideals.add("Faith. I trust that my deity will guide my actions, "
                    + "I have faith that if I work hard, things will go "
                    + "well. (Lawful)");
            ideals.add("Aspiration. I seek to prove myself worthy of my god’s "
                    + "favor by matching my actions against his or her "
                    + "teachings. (Any)");
        }
        else if (this.name.equals("Charlatan")){
            ideals.add("Independence. I am a free spirit— no one tells me "
                    + "what to do. (Chaotic)");
            ideals.add("Fairness. I never target people who can’t afford to "
                    + "lose a few coins. (Lawful)");
            ideals.add("Charity. I distribute the money I acquire to the "
                    + "people who really need it. (Good)");
            ideals.add("Creativity. I never run the same con twice. (Chaotic)");
            ideals.add("Friendship. Material goods come and go. Bonds of "
                    + "friendship last forever. (Good)");
            ideals.add("Aspiration. I’m determined to make something of "
                    + "myself. (Any)");
        }
        else if (this.name.equals("Criminal")){
            ideals.add("Honor. I don’t steal from others in the "
                    + "trade. (Lawful)");
            ideals.add("Freedom. Chains are meant to be broken, as are those "
                    + "who would forge them. (Chaotic)");
            ideals.add("Charity. I steal from the wealthy so that I can "
                    + "help people in need. (Good)");
            ideals.add("Greed. I will do whatever it takes to become "
                    + "wealthy. (Evil)");
            ideals.add("People. I’m loyal to my friends, not to any ideals, "
                    + "and everyone else can take a trip down the Styx for "
                    + "all I care. (Neutral)");
            ideals.add("Redemption. There’s a spark of good in everyone. (Good)");
        }
        else if (this.name.equals("Entertainer")){
            ideals.add("Beauty. When I perform, I make the world better than "
                    + "it was. (Good)");
            ideals.add("Tradition. The stories, legends, and songs of the past "
                    + "must never be forgotten, for they teach us who we "
                    + "are. (Lawful)");
            ideals.add("Creativity. The world is in need of new ideas and "
                    + "bold action. (Chaotic)");
            ideals.add("Greed. I’m only in it for the money and fame. (Evil)");
            ideals.add("People. I like seeing the smiles on people’s faces "
                    + "when I perform. That’s all that matters. (Neutral)");
            ideals.add("Honesty. Art should reflect the soul; it should come "
                    + "from within and reveal who we really are. (Any)");
        }
        else if (this.name.equals("Folk Hero")){
            ideals.add("Respect. People deserve to be treated with dignity "
                    + "and respect. (Good)");
            ideals.add("Fairness. No one should get preferential treatment "
                    + "before the law, and no one is above the law. (Lawful)");
            ideals.add("Freedom. Tyrants must not be allowed to oppress the "
                    + "people. (Chaotic)");
            ideals.add("Might. If I become strong, I can take what I want—what "
                    + "I deserve. (Evil)");
            ideals.add("Sincerity. There’s no good in pretending to be "
                    + "something I’m not. (Neutral)");
            ideals.add("Destiny. Nothing and no one can steer me away from "
                    + "my higher calling. (Any)");
        }
        else if (this.name.equals("Guild Artisan")){
            ideals.add("Community. It is the duty of all civilized people to "
                    + "strengthen the bonds of community and the security "
                    + "of civilization. (Lawful)");
            ideals.add("Generosity. My talents were given to me so that I "
                    + "could use them to benefit the world. (Good)");
            ideals.add("Freedom. Everyone should be free to pursue his or her "
                    + "own livelihood. (Chaotic)");
            ideals.add("Greed. I’m only in it for the money. (Evil)");
            ideals.add("People. I’m committed to the people I care about, "
                    + "not to ideals. (Neutral)");
            ideals.add("Aspiration. I work hard to be the best there is at "
                    + "my craft.");
        }
        else if (this.name.equals("Hermit")){
            ideals.add("Greater Good. My gifts are meant to be shared with "
                    + "all, not used for my own benefit. (Good)");
            ideals.add("Logic. Emotions must not cloud our sense of what is "
                    + "right and true, or our logical thinking. (Lawful)");
            ideals.add("Free Thinking. Inquiry and curiosity are the pillars "
                    + "of progress. (Chaotic)");
            ideals.add("Power. Solitude and contemplation are paths toward "
                    + "mystical or magical power. (Evil)");
            ideals.add("Live and Let Live. Meddling in the affairs of others "
                    + "only causes trouble. (Neutral)");
            ideals.add("Self-Knowledge. If you know yourself, there’s "
                    + "nothing left to know. (Any)");
        }
        int choice = (int) (Math.random()*ideals.size());
        ideal = ideals.get(choice);
    }

    private void setBond() {
        ArrayList<String> bonds = new ArrayList<String>();
        if (this.name.equals("Acolyte")){
            bonds.add("I would die to recover an ancient relic of my faith "
                    + "that was lost long ago.");
            bonds.add("I will someday get revenge on the corrupt temple "
                    + "hierarchy who branded me a heretic.");
            bonds.add("I owe my life to the priest who took me in when "
                    + "my parents died.");
            bonds.add("Everything I do is for the common people.");
            bonds.add("I will do anything to protect the temple where I "
                    + "served.");
            bonds.add("I seek to preserve a sacred text that my enemies "
                    + "consider heretical and seek to destroy.");
        }
        else if (this.name.equals("Charlatan")){
            bonds.add("I fleeced the wrong person and must work to ensure "
                    + "that this individual never crosses paths with me or "
                    + "those I care about.");
            bonds.add("I owe everything to my mentor—a horrible person who’s "
                    + "probably rotting in jail somewhere.");
            bonds.add("Somewhere out there, I have a child who doesn’t know me.  "
                    + "I’m making the world better for him or her.");
            bonds.add("I come from a noble family, and one day I’ll reclaim "
                    + "my lands and title from those who stole them from me.");
            bonds.add("A powerful person killed someone I love.  Some day "
                    + "soon, I’ll have my revenge.");
            bonds.add("I swindled and ruined a person who didn’t deserve it.  "
                    + "I seek to atone for my misdeeds but might never be "
                    + "able to forgive myself.");
        }
        else if (this.name.equals("Criminal")){
            bonds.add("I’m trying to pay off an old debt I owe to a "
                    + "generous benefactor.");
            bonds.add("My ill-gotten gains go to support my family.");
            bonds.add("Something important was taken from me, and I aim "
                    + "to steal it back.");
            bonds.add("I will become the greatest thief that ever lived.");
            bonds.add("I’m guilty of a terrible crime. I hope I can redeem "
                    + "myself for it.");
            bonds.add("Someone I loved died because of a mistake I made.  "
                    + "That will never happen again.");
        }
        else if (this.name.equals("Entertainer")){
            bonds.add("My instrument is my most treasured possession, and it "
                    + "reminds me of someone I love.");
            bonds.add("Someone stole my precious instrument, and someday I’ll "
                    + "get it back.");
            bonds.add("I want to be famous, whatever it takes.");
            bonds.add("I idolize a hero of the old tales and measure my "
                    + "deeds against that person’s.");
            bonds.add("I will do anything to prove myself superior to my "
                    + "hated rival.");
            bonds.add("I would do anything for the other members of my old "
                    + "troupe.");
        }
        else if (this.name.equals("Folk Hero")){
            bonds.add("I have a family, but I have no idea where they are. "
                    + "One day, I hope to see them again.");
            bonds.add("I worked the land, I love the land, and I will protect "
                    + "the land.");
            bonds.add("A proud noble once gave me a horrible beating, and I "
                    + "will take my revenge on any bully I encounter.");
            bonds.add("My tools are symbols of my past life, and I carry them "
                    + "so that I will never forget my roots.");
            bonds.add("I protect those who cannot protect themselves.");
            bonds.add("I wish my childhood sweetheart had come with me to "
                    + "pursue my destiny");
        }
        else if (this.name.equals("Guild Artisan")){
            bonds.add("The workshop where I learned my trade is the most "
                    + "important place in the world to me.");
            bonds.add("I created a great work for someone, and then found them "
                    + "unworthy to receive it. I’m still looking for "
                    + "someone worthy.");
            bonds.add("I owe my guild a great debt for forging me into the "
                    + "person I am today.");
            bonds.add("I pursue wealth to secure someone’s love.");
            bonds.add("One day I will return to my guild and prove that I am "
                    + "the greatest artisan of them all.");
            bonds.add("I will get revenge on the evil forces that destroyed "
                    + "my place of business and ruined my livelihood.");
        }
        else if (this.name.equals("Hermit")){
            bonds.add("Nothing is more important than the other members of my "
                    + "hermitage, order, or association.");
            bonds.add("I entered seclusion to hide from the ones who might "
                    + "still be hunting me. I must someday confront them.");
            bonds.add("I’m still seeking the enlightenment I pursued in my "
                    + "seclusion, and it still eludes me.");
            bonds.add("I entered seclusion because I loved someone I could "
                    + "not have.");
            bonds.add("Should my discovery come to light, it could bring "
                    + "ruin to the world.");
            bonds.add("My isolation gave me great insight into a great evil "
                    + "that only I can destroy.");
        int choice = (int) (Math.random()*bonds.size());
        bond = bonds.get(choice);
        }
    }

    private void setFlaw() {
        ArrayList<String> flaws = new ArrayList<String>();
        if (this.name.equals("Acolyte")){
            flaws.add("I judge others harshly, and myself even more severely.");
            flaws.add("I put too much trust in those who wield power "
                    + "within my temple’s hierarchy.");
            flaws.add("My piety sometimes leads me to blindly trust "
                    + "those that profess faith in my god.");
            flaws.add("I am inflexible in my thinking.");
            flaws.add("I am suspicious of strangers and expect the worst of them.");
            flaws.add("Once I pick a goal, I become obsessed with it to "
                    + "the detriment of everything else in my life.");
        }
        else if (this.name.equals("Charlatan")){
            flaws.add("I can’t resist a pretty face.");
            flaws.add("I'm always in debt.  "
                    + "I spend my ill-gotten gains on decadent luxuries "
                    + "faster than I bring them in.");
            flaws.add("I’m convinced that no one could ever fool me the "
                    + "way I fool others.");
            flaws.add("I’m too greedy for my own good.  I can’t resist taking "
                    + "a risk if there’s money involved.");
            flaws.add("I can’t resist swindling people who are more "
                    + "powerful than me.");
            flaws.add("I hate to admit it and will hate myself for it, but "
                    + "I'll run and preserve my own hide if the going gets "
                    + "tough.");
        }
        else if (this.name.equals("Criminal")){
            flaws.add("When I see something valuable, I can’t think about "
                    + "anything but how to steal it.");
            flaws.add("When faced with a choice between money and my friends, "
                    + "I usually choose the money.");
            flaws.add("If there’s a plan, I’ll forget it. If I don’t forget "
                    + "it, I’ll ignore it.");
            flaws.add("I have a “tell” that reveals when I'm lying.");
            flaws.add("I turn tail and run when things look bad.");
            flaws.add("An innocent person is in prison for a crime that I "
                    + "committed. I’m okay with that.");
        }
        else if (this.name.equals("Entertainer")){
            flaws.add("I’ll do anything to win fame and renown.");
            flaws.add("I’m a sucker for a pretty face.");
            flaws.add("A scandal prevents me from ever going home again. "
                    + "That kind of trouble seems to follow me around.");
            flaws.add("I once satirized a noble who still wants my head. It "
                    + "was a mistake that I will likely repeat.");
            flaws.add("I have trouble keeping my true feelings hidden. "
                    + "My sharp tongue lands me in trouble.");
            flaws.add("Despite my best efforts, I am unreliable to my "
                    + "friends.");
        }
        else if (this.name.equals("Folk Hero")){
            flaws.add("The tyrant who rules my land will stop at nothing to "
                    + "see me killed.");
            flaws.add("I’m convinced of the significance of my destiny, and "
                    + "blind to my shortcomings and the risk of failure.");
            flaws.add("The people who knew me when I was young know my "
                    + "shameful secret, so I can never go home again.");
            flaws.add("I have a weakness for the vices of the city, "
                    + "especially hard drink.");
            flaws.add("Secretly, I believe that things would be better if "
                    + "I were a tyrant lording over the land.");
            flaws.add("I have trouble trusting in my allies.");
        }
        else if (this.name.equals("Guild Artisan")){
            flaws.add("I’ll do anything to get my hands on something rare "
                    + "or priceless.");
            flaws.add("I’m quick to assume that someone is trying to cheat me.");
            flaws.add("No one must ever learn that I once stole money from "
                    + "guild coffers.");
            flaws.add("I’m never satisfied with what I have— I always want more.");
            flaws.add("I would kill to acquire a noble title.");
            flaws.add("I’m horribly jealous of anyone who can outshine my "
                    + "handiwork. Everywhere I go, I’m surrounded by rivals.");
        }
        else if (this.name.equals("Hermit")){
            flaws.add("Now that I've returned to the world, I enjoy its "
                    + "delights a little too much.");
            flaws.add("I harbor dark, bloodthirsty thoughts that my isolation "
                    + "and meditation failed to quell.");
            flaws.add("I am dogmatic in my thoughts and philosophy.");
            flaws.add("I let my need to win arguments overshadow friendships "
                    + "and harmony.");
            flaws.add("I’d risk too much to uncover a lost bit of knowledge.");
            flaws.add("I like keeping secrets and won’t share them with anyone.");
        }
        int choice = (int) (Math.random()*flaws.size());
        flaw = flaws.get(choice);
    }

    void printBackground() {
        System.out.println("Background: " + this.name);
        System.out.println("Feature: " + this.featureName);
        int stringSize = this.featureDescription.length();
        int startIndex = 0;
        int endIndex = Math.min(60, stringSize);
        System.out.print("  ");
        do{
            endIndex = Math.max(this.featureDescription.indexOf(" ", endIndex),endIndex);
            System.out.println(this.featureDescription.substring(startIndex, endIndex));
            System.out.print(" ");
            startIndex = endIndex;
            endIndex += 60;
        }
        while (endIndex < stringSize);
        System.out.println(this.featureDescription.substring(endIndex-60));
        
        if (!this.uniqueChoice.equals("")){
            System.out.println(this.uniqueChoiceName + ": " + this.uniqueChoice);
        }
        System.out.println("Traits:");
        System.out.println("- " + trait1);
        System.out.println("- " + trait2);
        System.out.println("Ideal:");
        System.out.println("- " + ideal);
        System.out.println("Bond:");
        System.out.println("- " + bond);
        System.out.println("Flaw:");
        System.out.println("- " + flaw);
    }
    
}
