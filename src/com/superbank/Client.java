package com.superbank;

import java.util.ArrayList;
import java.util.List;

public class Client {

    private int clientId;
    private static int counter = 0;

    private String name;
    private String address;

    private List<Account> accounts = new ArrayList<>();
    private boolean hasAccounts = false;


    Client (String name, String address) {
        counter++;
        this.clientId = counter;
        this.name = name;
        this.address = address;
    }


    public int getClientId () {
        return clientId;
    }

    public String getName () {
        return this.name;
    }

    public String getAddress () {
        return this.address;
    }

    public String getInfo () {
        return getClientId() + ": " + getName() + " (" + getAddress() + ")";
    }




    public void addAccount (Account account) {
        this.accounts.add(account);
    }
    public void removeAccount (Account account) {
        this.accounts.remove(account);
    }
    public Account getAccountById (int accountId) {
        return this.accounts.get(accountId);
    }
    public Account getAccount (Account account) {
        return this.accounts.get(account.getNumber());
    }
    public List getAccounts () {
        return this.accounts;
    }
    public Boolean hasAccounts () {
        if (!this.getAccounts().isEmpty()) {
            this.hasAccounts = true;
        }
        return this.hasAccounts;
    }


}
