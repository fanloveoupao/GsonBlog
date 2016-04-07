package bruse.com.gsonblog.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by bruse on 16/4/6.
 */
public class Model implements Serializable {
    private String msg;
    private String retCode;
    private List<ResultModel> results=new ArrayList<>();


    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getRetCode() {
        return retCode;
    }

    public void setRetCode(String retCode) {
        this.retCode = retCode;
    }

    public List<ResultModel> getResults() {
        return results;
    }

    public void setResults(List<ResultModel> results) {
        this.results = results;
    }
}
