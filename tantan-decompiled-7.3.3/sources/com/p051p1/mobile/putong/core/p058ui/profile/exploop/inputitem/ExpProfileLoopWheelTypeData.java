package com.p051p1.mobile.putong.core.p058ui.profile.exploop.inputitem;

import java.util.List;
import p153l.jyb;

/* JADX INFO: loaded from: classes4.dex */
public class ExpProfileLoopWheelTypeData extends ExpInputContentBaseData {
    public static final String NONE_STR = "-";
    public String selectItem1;
    public String selectItem2;
    public String selectItem3;
    public List<String> wheelData1;
    public List<String> wheelData2;
    public List<String> wheelData3;

    public void fillWithEmpty(int i, String str) {
        if (i >= 1) {
            this.selectItem1 = str;
            this.wheelData1 = jyb.m147507f0(str);
        }
        if (i >= 2) {
            this.selectItem2 = str;
            this.wheelData2 = jyb.m147507f0(str);
        }
        if (i >= 3) {
            this.selectItem3 = str;
            this.wheelData3 = jyb.m147507f0(str);
        }
    }

    public void onItemSelected(int i, String str, int i2) {
        if (i == 1) {
            this.selectItem1 = str;
        } else if (i == 2) {
            this.selectItem2 = str;
        } else if (i == 3) {
            this.selectItem3 = str;
        }
    }
}
