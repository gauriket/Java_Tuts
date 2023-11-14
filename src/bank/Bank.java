package bank;

class Account {
    public String name;
    protected String email;
    private String pass;

    public String getPass(){
        return this.pass;
    }

    public void setPass(String p){
        pass=p;
    }
}

public class Bank {
    public static void main(String[] args) {
        Account account1=new Account();
        account1.name="abc";
        account1.email="abc@gmail.com";
        account1.setPass("abc123");
        System.out.println(account1.getPass());
    }
}
