package loginBean;

/**
 * Created by 98162 on 2016/10/11.
 * 需求：登录页面对应的业务逻辑组件JavaBean，LoginAction处理器的帮衬Bean！
 */
public class LoginBean {
    private String userName;
    private String passWord;
    public String getUserName(){
        return userName;
    }
    public void setUserName(String userName){
        this.userName = userName;
    }
    public String getPassWord(){
        return passWord;
    }
    public void setPassWord(String passWord){
        this.passWord = passWord;
    }
    public boolean login(String userName,String passWord){
        boolean b = false;
        if (userName.equals("Wechat")&&passWord.equals("123456")){
            b = true;
            return b;
        }
        else {
            b = false;
            return b;
        }
    }
}
