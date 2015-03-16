package Model;
// Generated Sep 30, 2014 12:09:39 PM by Hibernate Tools 3.2.1.GA


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Account generated by hbm2java
 */
public class Account  implements java.io.Serializable {


     private int accountid;
     private String username;
     private String password;
     private int accounttype;
     private Set favorites = new HashSet(0);
     private Set kweks = new HashSet(0);

    public Account() {
    }

    public Account(String username, String password, int accounttype) {
        this.username = username;
        this.password = password;
        this.accounttype = accounttype;
    }
    public Account(String username, String password, int accounttype, Set accountsForAccountfromid, Set kweks, Set accountsForAccounttoid, Set kweks_1) {
       this.username = username;
       this.password = password;
       this.accounttype = accounttype;
       this.favorites = accountsForAccountfromid;
       this.kweks = kweks;
    }
   
    public int getAccountid() {
        return this.accountid;
    }
    
    public void setAccountid(int accountid) {
        this.accountid = accountid;
    }
    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    public int getAccounttype() {
        return this.accounttype;
    }
    
    public void setAccounttype(int accounttype) {
        this.accounttype = accounttype;
    }
    public Set getAccountsForAccountfromid() {
        return this.favorites;
    }
    
    public void setAccountsForAccountfromid(Set accountsForAccountfromid) {
        this.favorites = accountsForAccountfromid;
    }
    public Set getKweks() {
        return this.kweks;
    }
    
    public void setKweks(Set kweks) {
        this.kweks = kweks;
    }
    
    public boolean favoriteCheck(Account account) {
        boolean isFavorite = favorites.contains(account);
        return isFavorite;
    }

    public Set removeFavorite(Account account) {
        favorites.remove(account);
        return favorites;
    }
    
    public Set getFavorites() {
        return favorites;
    }

    public void setFavorites(Set favorites) {
        this.favorites = favorites;
    }
    
    public List<Account> getListFromSet() {
        return new ArrayList<Account>(favorites);
    }

    @Override
    public String toString() {
        return username;
    }
    
    
    
}


