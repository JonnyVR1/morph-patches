package com.p000p1.mobile.putong.core.p001ui.profile.exploop.inputitem;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.p001ui.profile.views.WheelPicker;
import java.util.List;
import l.f6c0;
import l.g30;
import l.m2k0;
import l.u4c0;
import l.vwb;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ExpProfileLoopWheelTypeFrag extends ExpProfileEditLoopBaseFrag {

    /* JADX INFO: renamed from: F */
    public WheelPicker f1189F;

    /* JADX INFO: renamed from: G */
    public WheelPicker f1190G;

    /* JADX INFO: renamed from: H */
    public WheelPicker f1191H;

    /* JADX INFO: renamed from: I */
    public ExpProfileLoopWheelTypeData f1192I;

    /* JADX INFO: renamed from: J */
    public g30<Integer, String, Integer> f1193J;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y4 */
    public /* synthetic */ void m1875Y4(WheelPicker wheelPicker, Object obj, int i) {
        m1878b5(1, obj, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z4 */
    public /* synthetic */ void m1876Z4(WheelPicker wheelPicker, Object obj, int i) {
        m1878b5(2, obj, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a5 */
    public /* synthetic */ void m1877a5(WheelPicker wheelPicker, Object obj, int i) {
        m1878b5(3, obj, i);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exploop.inputitem.ExpProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: O4 */
    public View mo1701O4(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.Q2, viewGroup, false);
        this.f1189F = (WheelPicker) viewInflate.findViewById(u4c0.xf);
        this.f1190G = (WheelPicker) viewInflate.findViewById(u4c0.yf);
        this.f1191H = (WheelPicker) viewInflate.findViewById(u4c0.zf);
        return viewInflate;
    }

    /* JADX INFO: renamed from: b5 */
    public final void m1878b5(int i, Object obj, int i2) {
        String str = (String) obj;
        this.f1192I.onItemSelected(i, str, i2);
        g30<Integer, String, Integer> g30Var = this.f1193J;
        if (g30Var != null) {
            g30Var.a(Integer.valueOf(i), str, Integer.valueOf(i2));
        }
        m1704R4(m1698M4().m1686a2().m24654p0());
    }

    /* JADX INFO: renamed from: c5 */
    public void m1879c5() {
        WheelPicker wheelPicker = this.f1190G;
        if (wheelPicker != null && this.f1192I.wheelData2 != null && !vwb.l(wheelPicker.getData(), this.f1192I.wheelData2, new m2k0())) {
            ExpProfileLoopWheelTypeData expProfileLoopWheelTypeData = this.f1192I;
            expProfileLoopWheelTypeData.selectItem2 = expProfileLoopWheelTypeData.wheelData2.get(0);
        }
        WheelPicker wheelPicker2 = this.f1191H;
        if (wheelPicker2 != null && this.f1192I.wheelData3 != null && !vwb.l(wheelPicker2.getData(), this.f1192I.wheelData3, new m2k0())) {
            ExpProfileLoopWheelTypeData expProfileLoopWheelTypeData2 = this.f1192I;
            expProfileLoopWheelTypeData2.selectItem3 = expProfileLoopWheelTypeData2.wheelData3.get(0);
        }
        WheelPicker wheelPicker3 = this.f1189F;
        ExpProfileLoopWheelTypeData expProfileLoopWheelTypeData3 = this.f1192I;
        m1880d5(wheelPicker3, expProfileLoopWheelTypeData3.wheelData1, expProfileLoopWheelTypeData3.selectItem1);
        WheelPicker wheelPicker4 = this.f1190G;
        ExpProfileLoopWheelTypeData expProfileLoopWheelTypeData4 = this.f1192I;
        m1880d5(wheelPicker4, expProfileLoopWheelTypeData4.wheelData2, expProfileLoopWheelTypeData4.selectItem2);
        WheelPicker wheelPicker5 = this.f1191H;
        ExpProfileLoopWheelTypeData expProfileLoopWheelTypeData5 = this.f1192I;
        m1880d5(wheelPicker5, expProfileLoopWheelTypeData5.wheelData3, expProfileLoopWheelTypeData5.selectItem3);
        m1704R4(m1698M4().m1686a2().m24654p0());
    }

    /* JADX INFO: renamed from: d5 */
    public void m1880d5(WheelPicker wheelPicker, List<String> list, String str) {
        if (vwb.J(list)) {
            xdl0.M(wheelPicker, false);
            return;
        }
        xdl0.M(wheelPicker, true);
        wheelPicker.setData(list);
        wheelPicker.setSelectedItemPosition(Math.max(list.indexOf(str), 0));
    }

    /* JADX INFO: renamed from: e5 */
    public void m1881e5(g30<Integer, String, Integer> g30Var) {
        this.f1193J = g30Var;
    }

    /* JADX INFO: renamed from: g4 */
    public void m1882g4(Bundle bundle) {
        super/*com.p1.mobile.android.app.Frag*/.g4(bundle);
        ExpProfileLoopWheelTypeData wheelType = this.f1101A.getData().getWheelType();
        this.f1192I = wheelType;
        m1880d5(this.f1189F, wheelType.wheelData1, wheelType.selectItem1);
        WheelPicker wheelPicker = this.f1190G;
        ExpProfileLoopWheelTypeData expProfileLoopWheelTypeData = this.f1192I;
        m1880d5(wheelPicker, expProfileLoopWheelTypeData.wheelData2, expProfileLoopWheelTypeData.selectItem2);
        WheelPicker wheelPicker2 = this.f1191H;
        ExpProfileLoopWheelTypeData expProfileLoopWheelTypeData2 = this.f1192I;
        m1880d5(wheelPicker2, expProfileLoopWheelTypeData2.wheelData3, expProfileLoopWheelTypeData2.selectItem3);
        this.f1189F.setOnItemSelectedListener(new WheelPicker.InterfaceC0174a() { // from class: l.tif
            @Override // com.p000p1.mobile.putong.core.p001ui.profile.views.WheelPicker.InterfaceC0174a
            /* JADX INFO: renamed from: a */
            public final void mo3621a(WheelPicker wheelPicker3, Object obj, int i) {
                this.f20242a.m1875Y4(wheelPicker3, obj, i);
            }
        });
        this.f1190G.setOnItemSelectedListener(new WheelPicker.InterfaceC0174a() { // from class: l.uif
            @Override // com.p000p1.mobile.putong.core.p001ui.profile.views.WheelPicker.InterfaceC0174a
            /* JADX INFO: renamed from: a */
            public final void mo3621a(WheelPicker wheelPicker3, Object obj, int i) {
                this.f20664a.m1876Z4(wheelPicker3, obj, i);
            }
        });
        this.f1191H.setOnItemSelectedListener(new WheelPicker.InterfaceC0174a() { // from class: l.vif
            @Override // com.p000p1.mobile.putong.core.p001ui.profile.views.WheelPicker.InterfaceC0174a
            /* JADX INFO: renamed from: a */
            public final void mo3621a(WheelPicker wheelPicker3, Object obj, int i) {
                this.f21169a.m1877a5(wheelPicker3, obj, i);
            }
        });
        m1704R4(m1698M4().m1686a2().m24654p0());
    }
}
