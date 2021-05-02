package mypack;

/* 
  a BEAN FOR HIBERNATE MAPPING 
*/
public class Cus {
    private Integer cno;
    private String cname;
    private Double add;

    public Cus() {
    }

    public Cus(int no, String nm, double sl) {
        this.cno = no;
        this.cname = nm;
        this.add = sl;
    }

    public Integer getCno() {
        return cno;
    }

    public void setCno(Integer cno) {
        this.cno = cno;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public Double getAdd() {
        return add;
    }

    public void setAdd(Double add) {
        this.add = add;
    }
}