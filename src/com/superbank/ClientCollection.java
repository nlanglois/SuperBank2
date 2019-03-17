package com.superbank;

import java.util.ArrayList;
import java.util.List;


public class ClientCollection {

    private List<Client> clients = new ArrayList<>();


    public void addClient (Client client) {
        this.clients.add(client);
    }

    public void removeClient(Client client) {
        this.clients.remove(client);
    }

    public Client getClient (int clientId) {
        return this.clients.get(clientId);
    }

    public List getClients () {
        return this.clients;
    }


}
