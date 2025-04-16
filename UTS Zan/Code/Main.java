public class Main {
    public static void main(String[] args) {
        WorkshopSystem system = new WorkshopSystem();

        Workshop techWorkshop = new TechWorkshop("Java Fundamentals", "10-APR-2025", "Budi Santoso", 2);
        Workshop designWorkshop = new DesignWorkshop("UI/UX Design", "15-APR-2025", "Siti Aminah", 3);
        Workshop marketingWorkshop = new MarketingWorkshop("Digital Marketing", "20-APR-2025", "Rina Wijaya", 1);
        Workshop mobileWorkshop = new TechWorkshop("Android Development", "25-APR-2025", "Dimas Arief", 4);

        system.addWorkshop(techWorkshop);
        system.addWorkshop(designWorkshop);
        system.addWorkshop(marketingWorkshop);
        system.addWorkshop(mobileWorkshop);

        system.displayAvailableWorkshops();
        System.out.println("-----------------------------------------------------------------------------------------");

        Participant ali = new Participant("Ali", "ali@gmail.com");
        Participant bella = new Participant("Bella", "bella@gmail.com");
        Participant chika = new Participant("Chika", "chika@gmail.com");
        Participant dino = new Participant("Dino", "dino@gmail.com");

        system.register(ali, techWorkshop);
        system.register(bella, techWorkshop);
        system.register(dino, marketingWorkshop);
        system.register(chika, techWorkshop); // seharusnya gagal karena kapasitas penuh
        system.register(chika, marketingWorkshop); // seharusnya gagal karena kapasitas penuh
        system.register(chika, marketingWorkshop); // seharusnya gagal karena sudah pernah daftar

        System.out.println("-----------------------------------------------------------------------------------------");
        system.displayAvailableWorkshops();
        System.out.println("-----------------------------------------------------------------------------------------");

        system.cancelRegistration("ali@gmail.com", techWorkshop);
        system.cancelRegistration("bella@gmail.com", techWorkshop);
        system.cancelRegistration("chika@gmail.com", techWorkshop); // seharusnya gagal karena tidak terdaftar

        System.out.println("-----------------------------------------------------------------------------------------");
        system.displayAvailableWorkshops();
        System.out.println("-----------------------------------------------------------------------------------------");
    }
}
//        // OPSIONAL
//        System.out.println("\nOUTPUT OPSIONAL");
//        system.getRegistrationsByEmail("ali@gmail.com");
//        system.getRegistrationsByEmail("bella@gmail.com");
//        system.getRegistrationsByEmail("chika@gmail.com");
//        system.getRegistrationsByEmail("dino@gmail.com");
//
//        System.out.println("-----------------------------------------------------------------------------------------");
//        system.getAvailableWorkshopsByDate("10-APR-2025");
//        system.getAvailableWorkshopsByDate("30-APR-2025");
//    }
//}
