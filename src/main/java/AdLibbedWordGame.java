public class AdLibbedWordGame {
    /*
      An Ad Libbed Word Game
      A short story, with blank spaces, asking for different types of words (name, place, number, noun, verb adjective etc).
      Words that a player can fill in.
    */
    public static void main(String[] args){
        String name1 = "Neo";
        String name2 = "Morpheus";
        String adjective1 = "Happy";
        String adjective2 = "Great";
        String adjective3 = "uneasy";
        String verb1 = "glitch";
        String noun1 = "projection";
        String noun2 = "blue pill";
        String noun3 = "ringing public telephone";
        String noun4 = "Sentinel";
        String noun5 = "reality";
        String noun6 = "AI Overlords";
        String place1 = "Nebuchadnezzar II";
        int number = 1999;


        //  Story Template
        String story = "This morning "+name1+" woke up feeling "+adjective1+". 'It is going to be a "+adjective2+" day!' Outside, a bunch of "+noun1+"s were protesting to keep "+noun2+" in stores. They began to "+verb1+" to the rhythm of the "+noun3+", which made all the "+noun4+"s very "+adjective3+". Concerned, "+name1+" texted "+name2+", who flew "+name1+" to "+place1+" and dropped "+name1+" in a puddle of frozen "+noun5+". "+name1+" woke up in the year "+number+", in a world where "+noun6+"s ruled the world.";

        System.out.println(story);
    }
}
