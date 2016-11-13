package DTO;

/**
 * Created by Sorravit on 12/11/2559.
 * For selenium
 */
public class GSBLottoDTO {
    private String fterm;
    private String fgroup;
    private String fnumFrom;
    private String fnumto;

    public GSBLottoDTO() {
    }

    public GSBLottoDTO(String fterm, String fgroup, String fnumFrom, String fnumto) {
        this.fterm = fterm;
        this.fgroup = fgroup;
        this.fnumFrom = fnumFrom;
        this.fnumto = fnumto;
    }

    @Override
    public String toString() {
        return "GSBLottoDTO{" +
                "fterm='" + fterm + '\'' +
                ", fgroup='" + fgroup + '\'' +
                ", fnumFrom='" + fnumFrom + '\'' +
                ", fnumto='" + fnumto + '\'' +
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
}
