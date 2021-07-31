import java.util.Scanner;


public class chatbot {


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);


        System.out.println("Hoe gaat het? Goed,Slecht of Valt wel mee");


        String userMood = scanner.nextLine();


        if (userMood.equals("goed") || userMood.equals("Goed")) {
            System.out.println("Proficiat nog een fijne dag verder!");

        }else if (userMood.equals("slecht") || userMood.equals("Slecht")) {
            System.out.println("Depressie of potje verloren ?");


            String causeOfBadMood = scanner.nextLine();


            if (causeOfBadMood.equals("depressie")) {
                System.out.println("Waardoor? liefde,familie of school");

            }else if (causeOfBadMood.equals("potje verloren")) {
                System.out.println("je moet leren tegen je verlies te kunnen");

            }else {
                System.out.println("Verkeerd geschreven");
            }

            String followUpOnCauseOfBadMood = scanner.nextLine();


            if (followUpOnCauseOfBadMood.equals("liefde")) {
                System.out.println("Ben je een jongen of meisje?");


            }else if (followUpOnCauseOfBadMood.equals("familie")) {
                System.out.println("Met wie heb je deze problemen? close gezin of bredere familie?");

            }else if (followUpOnCauseOfBadMood.equals("school")) {
                System.out.println("Wat beschrijft je school probleem het beste? slechte punten,slechte school,geen vrienden");

            }else {
                System.out.println("Verkeerd geschreven");
            }

            String evenDeeperCauseOfBadMood = scanner.nextLine();

            if (evenDeeperCauseOfBadMood.equals("jongen")) {
                System.out.println("Probeer het eens uit te praten met uw vriend of vriendin");

            }else if (evenDeeperCauseOfBadMood.equals("meisje")) {
                System.out.println("Probeer het eens uit te praten met uw vriend of vriendin");

            }else if (evenDeeperCauseOfBadMood.equals("close gezin")) {
                System.out.println("Probeer het uit te praten als dat niet lukt kan je altijd bellen naar 078/15 00 10 de kinderbeschermingslijn in belgie");

            }else if (evenDeeperCauseOfBadMood.equals("bredere familie")) {
                System.out.println("Probeer het uit te praten of een oplossing zoeken als dat niet lukt kan je altijd jullie band verbreken");

            }else if (evenDeeperCauseOfBadMood.equals("slechte punten")) {
                System.out.println("Probeer een beetje beter te studeren of hulp te vragen aan familie,vrienden of leerkrachten");

            }else if (evenDeeperCauseOfBadMood.equals("slechte school")) {
                System.out.println("Probeer een andere school te vinden of hulp te vragen bij leerlingencoordinators");

            }else if(evenDeeperCauseOfBadMood.equals("geen vrienden")) {
                System.out.println("Probeer een beetje meer sociaal te zijn");

            }else {
                System.out.println("Verkeerd geschreven");
            }

        }else if (userMood.equals("valt wel mee") || userMood.equals("Valt wel mee")) {
            System.out.println("Eerder slecht of eerder goed?");


        }else {
            System.out.println("Verkeerd geschreven");
        }






    }
}

