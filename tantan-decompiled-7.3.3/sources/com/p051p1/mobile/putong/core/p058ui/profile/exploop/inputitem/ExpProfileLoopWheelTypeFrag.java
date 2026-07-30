package com.p051p1.mobile.putong.core.p058ui.profile.exploop.inputitem;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.profile.views.WheelPicker;
import java.util.List;
import p153l.a30;
import p153l.adc0;
import p153l.bnl0;
import p153l.jyb;
import p153l.kec0;
import p153l.sbk0;

/* JADX INFO: loaded from: classes4.dex */
public class ExpProfileLoopWheelTypeFrag extends ExpProfileEditLoopBaseFrag {

    /* JADX INFO: renamed from: F */
    public WheelPicker f34215F;

    /* JADX INFO: renamed from: G */
    public WheelPicker f34216G;

    /* JADX INFO: renamed from: H */
    public WheelPicker f34217H;

    /* JADX INFO: renamed from: I */
    public ExpProfileLoopWheelTypeData f34218I;

    /* JADX INFO: renamed from: J */
    public a30<Integer, String, Integer> f34219J;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y4 */
    public /* synthetic */ void m52577Y4(WheelPicker wheelPicker, Object obj, int i) {
        m52580b5(1, obj, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z4 */
    public /* synthetic */ void m52578Z4(WheelPicker wheelPicker, Object obj, int i) {
        m52580b5(2, obj, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a5 */
    public /* synthetic */ void m52579a5(WheelPicker wheelPicker, Object obj, int i) {
        m52580b5(3, obj, i);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exploop.inputitem.ExpProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: O4 */
    public View mo52429O4(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125579Q2, viewGroup, false);
        this.f34215F = (WheelPicker) viewInflate.findViewById(adc0.f69820Af);
        this.f34216G = (WheelPicker) viewInflate.findViewById(adc0.f69837Bf);
        this.f34217H = (WheelPicker) viewInflate.findViewById(adc0.f69854Cf);
        return viewInflate;
    }

    /* JADX INFO: renamed from: b5 */
    public final void m52580b5(int i, Object obj, int i2) {
        String str = (String) obj;
        this.f34218I.onItemSelected(i, str, i2);
        a30<Integer, String, Integer> a30Var = this.f34219J;
        if (a30Var != null) {
            a30Var.mo37058a(Integer.valueOf(i), str, Integer.valueOf(i2));
        }
        m52432R4(m52426M4().m52414b2().m110170p0());
    }

    /* JADX INFO: renamed from: c5 */
    public void m52581c5() {
        WheelPicker wheelPicker = this.f34216G;
        if (wheelPicker != null && this.f34218I.wheelData2 != null && !jyb.m147518l(wheelPicker.getData(), this.f34218I.wheelData2, new sbk0())) {
            ExpProfileLoopWheelTypeData expProfileLoopWheelTypeData = this.f34218I;
            expProfileLoopWheelTypeData.selectItem2 = expProfileLoopWheelTypeData.wheelData2.get(0);
        }
        WheelPicker wheelPicker2 = this.f34217H;
        if (wheelPicker2 != null && this.f34218I.wheelData3 != null && !jyb.m147518l(wheelPicker2.getData(), this.f34218I.wheelData3, new sbk0())) {
            ExpProfileLoopWheelTypeData expProfileLoopWheelTypeData2 = this.f34218I;
            expProfileLoopWheelTypeData2.selectItem3 = expProfileLoopWheelTypeData2.wheelData3.get(0);
        }
        WheelPicker wheelPicker3 = this.f34215F;
        ExpProfileLoopWheelTypeData expProfileLoopWheelTypeData3 = this.f34218I;
        m52582d5(wheelPicker3, expProfileLoopWheelTypeData3.wheelData1, expProfileLoopWheelTypeData3.selectItem1);
        WheelPicker wheelPicker4 = this.f34216G;
        ExpProfileLoopWheelTypeData expProfileLoopWheelTypeData4 = this.f34218I;
        m52582d5(wheelPicker4, expProfileLoopWheelTypeData4.wheelData2, expProfileLoopWheelTypeData4.selectItem2);
        WheelPicker wheelPicker5 = this.f34217H;
        ExpProfileLoopWheelTypeData expProfileLoopWheelTypeData5 = this.f34218I;
        m52582d5(wheelPicker5, expProfileLoopWheelTypeData5.wheelData3, expProfileLoopWheelTypeData5.selectItem3);
        m52432R4(m52426M4().m52414b2().m110170p0());
    }

    /* JADX INFO: renamed from: d5 */
    public void m52582d5(WheelPicker wheelPicker, List<String> list, String str) {
        if (jyb.m147479J(list)) {
            bnl0.m105524M(wheelPicker, false);
            return;
        }
        bnl0.m105524M(wheelPicker, true);
        wheelPicker.setData(list);
        wheelPicker.setSelectedItemPosition(Math.max(list.indexOf(str), 0));
    }

    /* JADX INFO: renamed from: e5 */
    public void m52583e5(a30<Integer, String, Integer> a30Var) {
        this.f34219J = a30Var;
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo21585g4(Bundle bundle) {
        super.mo21585g4(bundle);
        ExpProfileLoopWheelTypeData wheelType = this.f34127A.getData().getWheelType();
        this.f34218I = wheelType;
        m52582d5(this.f34215F, wheelType.wheelData1, wheelType.selectItem1);
        WheelPicker wheelPicker = this.f34216G;
        ExpProfileLoopWheelTypeData expProfileLoopWheelTypeData = this.f34218I;
        m52582d5(wheelPicker, expProfileLoopWheelTypeData.wheelData2, expProfileLoopWheelTypeData.selectItem2);
        WheelPicker wheelPicker2 = this.f34217H;
        ExpProfileLoopWheelTypeData expProfileLoopWheelTypeData2 = this.f34218I;
        m52582d5(wheelPicker2, expProfileLoopWheelTypeData2.wheelData3, expProfileLoopWheelTypeData2.selectItem3);
        this.f34215F.setOnItemSelectedListener(new WheelPicker.InterfaceC8912a() { // from class: l.zjf
            @Override // com.p051p1.mobile.putong.core.p058ui.profile.views.WheelPicker.InterfaceC8912a
            /* JADX INFO: renamed from: a */
            public final void mo54246a(WheelPicker wheelPicker3, Object obj, int i) {
                this.f204665a.m52577Y4(wheelPicker3, obj, i);
            }
        });
        this.f34216G.setOnItemSelectedListener(new WheelPicker.InterfaceC8912a() { // from class: l.akf
            @Override // com.p051p1.mobile.putong.core.p058ui.profile.views.WheelPicker.InterfaceC8912a
            /* JADX INFO: renamed from: a */
            public final void mo54246a(WheelPicker wheelPicker3, Object obj, int i) {
                this.f72001a.m52578Z4(wheelPicker3, obj, i);
            }
        });
        this.f34217H.setOnItemSelectedListener(new WheelPicker.InterfaceC8912a() { // from class: l.bkf
            @Override // com.p051p1.mobile.putong.core.p058ui.profile.views.WheelPicker.InterfaceC8912a
            /* JADX INFO: renamed from: a */
            public final void mo54246a(WheelPicker wheelPicker3, Object obj, int i) {
                this.f77065a.m52579a5(wheelPicker3, obj, i);
            }
        });
        m52432R4(m52426M4().m52414b2().m110170p0());
    }
}
