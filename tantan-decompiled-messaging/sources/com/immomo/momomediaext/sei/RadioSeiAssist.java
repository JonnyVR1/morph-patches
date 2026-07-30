package com.immomo.momomediaext.sei;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class RadioSeiAssist extends BaseSei {
    private static final String TAG = "RadioSeiAssist";
    private static final String ctyp = "8";

    public RadioSeiAssist() {
        setCtyp("8");
    }

    public void clearConf() {
        List<BaseSei.SeiBean> list = this.conf;
        if (list != null) {
            list.clear();
        }
    }

    @Override // com.immomo.momomediaext.sei.BaseSei
    public List<BaseSei.SeiBean> getConf() {
        if (this.conf == null) {
            this.conf = new ArrayList();
        }
        return this.conf;
    }

    @Override // com.immomo.momomediaext.sei.BaseSei
    public BaseSei.InfoBean getInfo() {
        if (this.info == null) {
            this.info = new BaseSei.InfoBean();
        }
        return this.info;
    }

    public BaseSei.SeiBean obtainConfBean() {
        BaseSei.SeiBean seiBean = new BaseSei.SeiBean();
        getConf().add(seiBean);
        return seiBean;
    }

    public boolean removeConfBean(String str) {
        if (this.conf != null) {
            for (int i = 0; i < getConf().size(); i++) {
                BaseSei.SeiBean seiBean = getConf().get(i);
                if (seiBean.getId() == str) {
                    getConf().remove(seiBean);
                    return true;
                }
            }
        }
        return false;
    }

    public void setInfoBean_CTime(long j) {
        getInfo().setCtime(j);
    }

    public void setInfoBean_CType(int i) {
        getInfo().setCtyp(i);
    }

    public void setInfoBean_Inv(long j) {
        getInfo().setInv(j);
    }

    public void removeConfBean(BaseSei.SeiBean seiBean) {
        List<BaseSei.SeiBean> list = this.conf;
        if (list == null) {
            return;
        }
        list.remove(seiBean);
    }
}
