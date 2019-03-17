package com.superbank;

import java.util.ArrayList;
import java.util.List;

public class AccountCollection {

    private List<Account> accounts = new ArrayList<>();


    public void add (Account account) {
        this.accounts.add(account);
    }

    public void remove (Account account) {
        this.accounts.remove(account);
    }

    public Account getAccountById (int accountNumber) {
        return this.accounts.get(accountNumber);
    }

    public Account getAccount (Account account) {
        return this.accounts.get(account.getNumber());
    }

    public List<Account> allAccounts () {
        return this.accounts;
    }
}
