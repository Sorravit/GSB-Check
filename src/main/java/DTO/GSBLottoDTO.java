package DTO;

/**
 * Created by Sorravit on 12/11/2559.
 */
public class GSBLottoDTO {
    private String fterm;
    private String fgroup;
    private String fnumFrom;
    private String fnumto;
    private String fmonthFrom;
    private String fyearFrom;
    private String fmonthto;
    private String fyearto;
    private String x;
    private String y;

    public GSBLottoDTO() {
    }

    public GSBLottoDTO(String fterm, String fgroup, String fnumFrom, String fnumto, String fmonthFrom, String fyearFrom, String fmonthto, String fyearto, String x, String y) {
        this.fterm = fterm;
        this.fgroup = fgroup;
        this.fnumFrom = fnumFrom;
        this.fnumto = fnumto;
        this.fmonthFrom = fmonthFrom;
        this.fyearFrom = fyearFrom;
        this.fmonthto = fmonthto;
        this.fyearto = fyearto;
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "GSBLottoDTO{" +
                "fterm='" + fterm + '\'' +
                ", fgroup='" + fgroup + '\'' +
                ", fnumFrom='" + fnumFrom + '\'' +
                ", fnumto='" + fnumto + '\'' +
                ", fmonthFrom='" + fmonthFrom + '\'' +
                ", fyearFrom='" + fyearFrom + '\'' +
                ", fmonthto='" + fmonthto + '\'' +
                ", fyearto='" + fyearto + '\'' +
                ", x='" + x + '\'' +
                ", y='" + y + '\'' +
                '}';
    }

    public String getFterm() {
        return fterm;
    }

    public void setFterm(String fterm) {
        this.fterm = fterm;
    }

    public String getFgroup() {
        return fgroup;
    }

    public void setFgroup(String fgroup) {
        this.fgroup = fgroup;
    }

    public String getFnumFrom() {
        return fnumFrom;
    }

    public void setFnumFrom(String fnumFrom) {
        this.fnumFrom = fnumFrom;
    }

    public String getFnumto() {
        return fnumto;
    }

    public void setFnumto(String fnumto) {
        this.fnumto = fnumto;
    }

    public String getFmonthFrom() {
        return fmonthFrom;
    }

    public void setFmonthFrom(String fmonthFrom) {
        this.fmonthFrom = fmonthFrom;
    }

    public String getFyearFrom() {
        return fyearFrom;
    }

    public void setFyearFrom(String fyearFrom) {
        this.fyearFrom = fyearFrom;
    }

    public String getFmonthto() {
        return fmonthto;
    }

    public void setFmonthto(String fmonthto) {
        this.fmonthto = fmonthto;
    }

    public String getFyearto() {
        return fyearto;
    }

    public void setFyearto(String fyearto) {
        this.fyearto = fyearto;
    }

    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x;
    }

    public String getY() {
        return y;
    }

    public void setY(String y) {
        this.y = y;
    }
}
