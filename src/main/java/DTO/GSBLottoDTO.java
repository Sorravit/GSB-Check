package DTO;

import lombok.Data;

/**
 * Created by Sorravit on 12/11/2559.
 * For selenium
 */
@Data
public class GSBLottoDTO {
    private int type;
    private String fterm;
    private String group;
    private String numFrom;
    private String numTo;
    private String owner;

    public GSBLottoDTO() {
    }

    public GSBLottoDTO(int type, String fterm, String group, String numFrom, String numTo, String owner) {
        this.type = type;
        this.fterm = fterm;
        this.group = group;
        this.numFrom = numFrom;
        this.numTo = numTo;
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "GSBLottoDTO{" +
                "แบบ" + type +" ปี " +
                "งวดที่ " + fterm +
                "หมวดอักษร " + group +
                "เลขสลากฯ เริ่มต้น " + numFrom +
                "เลขสลากฯ สุดท้าย " + numTo +
                "ของ " + owner;
    }
}
