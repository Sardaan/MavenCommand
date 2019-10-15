package commands;


import collection.Human;
import java.io.Serializable;

public class Command implements Serializable {

    private static final long serialVersionUID = 1L;
    private String commandName;
    private Human human;
    private String login;
    private String password;
    private String mail;

    public void setLogin(String login) {
        this.login = login;
    }
    public String getLogin() {
        return login;
    }


    public void setPassword(String password) {
        this.password = password;
    }
    public String getPassword() {
        return password;
    }


    public void setMail(String mail) {
        this.mail = mail;
    }
    public String getMail() {
        return mail;
    }


    public void setCommandName(String commandName) {
        this.commandName = commandName;
    }
    public String getCommandName(){
        return this.commandName;
    }


    public void setHuman(Human human) {
        this.human = human;
    }
    public Human getHuman(){
        return human;
    }

}
