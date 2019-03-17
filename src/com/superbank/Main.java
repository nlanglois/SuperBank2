package com.superbank;

public class Main {

    public static void main(String[] args) {


        ClientCollection clientCollection = new ClientCollection();

        Client sarah = new Client("Sarah", "South MPLS");
        Client nik = new Client("Nik", "Golden Valley");
        Client lillie = new Client("Lillie", "Penn");

        clientCollection.addClient(sarah);
        clientCollection.addClient(nik);
        clientCollection.addClient(lillie);
        clientCollection.addClient(new Client("Peter", "Alaska"));


        AccountCollection accountCollection = new AccountCollection();

        Account checking = new Checking();
        checking.credit(500.00);
        checking.credit(250.00);
        checking.debit(50.00);
        nik.addAccount(checking);
        accountCollection.add(checking);

        Account saving = new Saving();
        saving.credit(50.00);
        saving.debit(25.00);
        saving.credit(40.00);
        nik.addAccount(saving);




        System.out.println("Clients:");
        for (int c = 0; c < clientCollection.getClients().size(); c++) {
            Client client = clientCollection.getClient(c);
            System.out.println(client.getInfo());

            if (client.hasAccounts()) {
                for (int a = 0; a < client.getAccounts().size(); a++) {
                    Account account = client.getAccountById(a);
                    System.out.println(account.getInfo());
                }
            } else {
                System.out.println("\tThis client has no accounts");
            }

            System.out.println();
        }

//        System.out.println("Another way to list all the clients:");
//        for (Client thing : clientCollection.getClients()) {
//            System.out.println(thing.getInfo());
//        }



//        System.out.println("\nAccounts:");
//        for (int key = 0; key < accountCollection.allAccounts().size(); key++) {
//            System.out.println(accountCollection.getAccount(key).getInfo());
//        }

    }
}
