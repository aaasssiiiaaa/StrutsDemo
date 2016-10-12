package struts2Test;
import com.opensymphony.xwork2.ActionSupport;
import loginBean.LoginBean;

/**
 * Created by 98162 on 2016/10/11.
 * 需求：业务控制器Action，处理经过核心控制器FilterDispacher后的视图请求
 */
public class LoginAction extends ActionSupport{
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
    public String execute() throws Exception{
        LoginBean loginBean = new LoginBean();
        if (loginBean.login(userName,passWord)){
            return SUCCESS;
        }
        else {
            return ERROR;
        }
    }
}
