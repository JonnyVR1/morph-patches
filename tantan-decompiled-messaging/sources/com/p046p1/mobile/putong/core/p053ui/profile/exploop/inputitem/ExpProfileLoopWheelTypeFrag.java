package com.p046p1.mobile.putong.core.p053ui.profile.exploop.inputitem;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.profile.views.WheelPicker;
import java.util.List;
import p149l.f6c0;
import p149l.g30;
import p149l.m2k0;
import p149l.u4c0;
import p149l.vwb;
import p149l.xdl0;

/* JADX INFO: loaded from: classes4.dex */
public class ExpProfileLoopWheelTypeFrag extends ExpProfileEditLoopBaseFrag {

    /* JADX INFO: renamed from: F */
    public WheelPicker f33367F;

    /* JADX INFO: renamed from: G */
    public WheelPicker f33368G;

    /* JADX INFO: renamed from: H */
    public WheelPicker f33369H;

    /* JADX INFO: renamed from: I */
    public ExpProfileLoopWheelTypeData f33370I;

    /* JADX INFO: renamed from: J */
    public g30<Integer, String, Integer> f33371J;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y4 */
    public /* synthetic */ void m51394Y4(WheelPicker wheelPicker, Object obj, int i) {
        m51397b5(1, obj, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z4 */
    public /* synthetic */ void m51395Z4(WheelPicker wheelPicker, Object obj, int i) {
        m51397b5(2, obj, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a5 */
    public /* synthetic */ void m51396a5(WheelPicker wheelPicker, Object obj, int i) {
        m51397b5(3, obj, i);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exploop.inputitem.ExpProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: O4 */
    public View mo51246O4(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95525Q2, viewGroup, false);
        this.f33367F = (WheelPicker) viewInflate.findViewById(u4c0.f174557xf);
        this.f33368G = (WheelPicker) viewInflate.findViewById(u4c0.f174574yf);
        this.f33369H = (WheelPicker) viewInflate.findViewById(u4c0.f174591zf);
        return viewInflate;
    }

    /* JADX INFO: renamed from: b5 */
    public final void m51397b5(int i, Object obj, int i2) {
        String str = (String) obj;
        this.f33370I.onItemSelected(i, str, i2);
        g30<Integer, String, Integer> g30Var = this.f33371J;
        if (g30Var != null) {
            g30Var.mo36055a(Integer.valueOf(i), str, Integer.valueOf(i2));
        }
        m51249R4(m51243M4().m51231a2().m203204p0());
    }

    /* JADX INFO: renamed from: c5 */
    public void m51398c5() {
        WheelPicker wheelPicker = this.f33368G;
        if (wheelPicker != null && this.f33370I.wheelData2 != null && !vwb.m200335l(wheelPicker.getData(), this.f33370I.wheelData2, new m2k0())) {
            ExpProfileLoopWheelTypeData expProfileLoopWheelTypeData = this.f33370I;
            expProfileLoopWheelTypeData.selectItem2 = expProfileLoopWheelTypeData.wheelData2.get(0);
        }
        WheelPicker wheelPicker2 = this.f33369H;
        if (wheelPicker2 != null && this.f33370I.wheelData3 != null && !vwb.m200335l(wheelPicker2.getData(), this.f33370I.wheelData3, new m2k0())) {
            ExpProfileLoopWheelTypeData expProfileLoopWheelTypeData2 = this.f33370I;
            expProfileLoopWheelTypeData2.selectItem3 = expProfileLoopWheelTypeData2.wheelData3.get(0);
        }
        WheelPicker wheelPicker3 = this.f33367F;
        ExpProfileLoopWheelTypeData expProfileLoopWheelTypeData3 = this.f33370I;
        m51399d5(wheelPicker3, expProfileLoopWheelTypeData3.wheelData1, expProfileLoopWheelTypeData3.selectItem1);
        WheelPicker wheelPicker4 = this.f33368G;
        ExpProfileLoopWheelTypeData expProfileLoopWheelTypeData4 = this.f33370I;
        m51399d5(wheelPicker4, expProfileLoopWheelTypeData4.wheelData2, expProfileLoopWheelTypeData4.selectItem2);
        WheelPicker wheelPicker5 = this.f33369H;
        ExpProfileLoopWheelTypeData expProfileLoopWheelTypeData5 = this.f33370I;
        m51399d5(wheelPicker5, expProfileLoopWheelTypeData5.wheelData3, expProfileLoopWheelTypeData5.selectItem3);
        m51249R4(m51243M4().m51231a2().m203204p0());
    }

    /* JADX INFO: renamed from: d5 */
    public void m51399d5(WheelPicker wheelPicker, List<String> list, String str) {
        if (vwb.m200296J(list)) {
            xdl0.m208344M(wheelPicker, false);
            return;
        }
        xdl0.m208344M(wheelPicker, true);
        wheelPicker.setData(list);
        wheelPicker.setSelectedItemPosition(Math.max(list.indexOf(str), 0));
    }

    /* JADX INFO: renamed from: e5 */
    public void m51400e5(g30<Integer, String, Integer> g30Var) {
        this.f33371J = g30Var;
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo20586g4(Bundle bundle) {
        super.mo20586g4(bundle);
        ExpProfileLoopWheelTypeData wheelType = this.f33279A.getData().getWheelType();
        this.f33370I = wheelType;
        m51399d5(this.f33367F, wheelType.wheelData1, wheelType.selectItem1);
        WheelPicker wheelPicker = this.f33368G;
        ExpProfileLoopWheelTypeData expProfileLoopWheelTypeData = this.f33370I;
        m51399d5(wheelPicker, expProfileLoopWheelTypeData.wheelData2, expProfileLoopWheelTypeData.selectItem2);
        WheelPicker wheelPicker2 = this.f33369H;
        ExpProfileLoopWheelTypeData expProfileLoopWheelTypeData2 = this.f33370I;
        m51399d5(wheelPicker2, expProfileLoopWheelTypeData2.wheelData3, expProfileLoopWheelTypeData2.selectItem3);
        this.f33367F.setOnItemSelectedListener(new WheelPicker.InterfaceC8749a() { // from class: l.tif
            @Override // com.p046p1.mobile.putong.core.p053ui.profile.views.WheelPicker.InterfaceC8749a
            /* JADX INFO: renamed from: a */
            public final void mo53063a(WheelPicker wheelPicker3, Object obj, int i) {
                this.f170575a.m51394Y4(wheelPicker3, obj, i);
            }
        });
        this.f33368G.setOnItemSelectedListener(new WheelPicker.InterfaceC8749a() { // from class: l.uif
            @Override // com.p046p1.mobile.putong.core.p053ui.profile.views.WheelPicker.InterfaceC8749a
            /* JADX INFO: renamed from: a */
            public final void mo53063a(WheelPicker wheelPicker3, Object obj, int i) {
                this.f176650a.m51395Z4(wheelPicker3, obj, i);
            }
        });
        this.f33369H.setOnItemSelectedListener(new WheelPicker.InterfaceC8749a() { // from class: l.vif
            @Override // com.p046p1.mobile.putong.core.p053ui.profile.views.WheelPicker.InterfaceC8749a
            /* JADX INFO: renamed from: a */
            public final void mo53063a(WheelPicker wheelPicker3, Object obj, int i) {
                this.f181604a.m51396a5(wheelPicker3, obj, i);
            }
        });
        m51249R4(m51243M4().m51231a2().m203204p0());
    }
}
