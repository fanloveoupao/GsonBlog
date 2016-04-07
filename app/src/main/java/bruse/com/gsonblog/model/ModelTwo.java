package bruse.com.gsonblog.model;

import java.util.List;

/**
 * Created by bruse on 16/4/6.
 */
public class ModelTwo {

    /**
     * msg : success
     * retCode : 200
     * result : [{"cur":1747.74,"days":5,"name":"叶问3","sum":53467.76},{"cur":1842.6,"days":5,"name":"疯狂动物城","sum":20840.64},{"cur":430.67,"days":30,"name":"美人鱼","sum":330737.57},{"cur":113.02,"days":5,"name":"谍影特工","sum":1898.9},{"cur":98.43,"days":5,"name":"地心营救","sum":1666.29},{"cur":348.05,"days":1,"name":"爱情麻辣烫之情定终身","sum":519.44},{"cur":54.61,"days":90,"name":"天降","sum":54.71},{"cur":40.85,"days":30,"name":"西游记之孙悟空三打白骨精","sum":119377.43},{"cur":60.62,"days":29,"name":"澳门风云3","sum":111471.88},{"cur":19.92,"days":40,"name":"功夫熊猫3","sum":98634.44},{"cur":39.37,"days":18,"name":"卧虎藏龙：青冥宝剑","sum":25543},{"cur":18.62,"days":24,"name":"高跟鞋先生","sum":12857.26},{"cur":25.48,"days":-2,"name":"我不是王毛","sum":35.29}]
     */

    private String msg;
    private String retCode;
    /**
     * cur : 1747.74
     * days : 5
     * name : 叶问3
     * sum : 53467.76
     */

    private List<ResultEntity> result;

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setRetCode(String retCode) {
        this.retCode = retCode;
    }

    public void setResult(List<ResultEntity> result) {
        this.result = result;
    }

    public String getMsg() {
        return msg;
    }

    public String getRetCode() {
        return retCode;
    }

    public List<ResultEntity> getResult() {
        return result;
    }

    public static class ResultEntity {
        private double cur;
        private int days;
        private String name;
        private double sum;

        public void setCur(double cur) {
            this.cur = cur;
        }

        public void setDays(int days) {
            this.days = days;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setSum(double sum) {
            this.sum = sum;
        }

        public double getCur() {
            return cur;
        }

        public int getDays() {
            return days;
        }

        public String getName() {
            return name;
        }

        public double getSum() {
            return sum;
        }
    }
}
