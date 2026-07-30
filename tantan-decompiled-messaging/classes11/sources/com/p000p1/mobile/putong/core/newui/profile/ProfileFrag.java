package com.p000p1.mobile.putong.core.newui.profile;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.newui.main.NewMainContextFrag;
import com.p000p1.mobile.putong.util.launch.LaunchStep;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.CoreAssetsSettings;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collection;
import l.d30;
import l.gd70;
import l.j760;
import l.v2a;
import p009l.eg30;
import p009l.jh30;
import p009l.qta0;
import p009l.rta0;
import p009l.x020;
import p009l.yni;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ProfileFrag extends NewMainContextFrag {

    /* JADX INFO: renamed from: B */
    public qta0 f5245B = new eg30(this);

    /* JADX INFO: renamed from: C */
    public rta0 f5246C = new jh30(this);

    /* JADX INFO: renamed from: B4 */
    public boolean m7422B4() {
        return false;
    }

    /* JADX INFO: renamed from: C4 */
    public Collection<? extends j760<String, d30>> m7423C4() {
        ArrayList arrayList = new ArrayList();
        rta0 rta0Var = this.f5246C;
        if (rta0Var instanceof x020) {
            arrayList.addAll(((x020) rta0Var).m24608B());
        }
        return arrayList;
    }

    @Override // com.p000p1.mobile.putong.core.newui.main.NewMainContextFrag
    /* JADX INFO: renamed from: S4 */
    public void mo4013S4() {
        super.mo4013S4();
        CoreModule.c.e0.W9(CoreModule.H().userId());
        CoreAssetsSettings coreAssetsSettings = (CoreAssetsSettings) CoreModule.d.g();
        if (NullChecker.a(coreAssetsSettings)) {
            if (TEnum.equals(coreAssetsSettings.userBanAppealSwitch, "online") || (TEnum.equals(coreAssetsSettings.userBanAppealSwitch, "grey") && v2a.d())) {
                CoreModule.c.e0.Z9();
            }
        }
    }

    /* JADX INFO: renamed from: d4 */
    public void m7424d4() {
        super/*com.p1.mobile.putong.app.PutongFrag*/.d4();
        this.f5245B.C(this.f5246C);
    }

    /* JADX INFO: renamed from: f4 */
    public void m7425f4() {
        super/*com.p1.mobile.putong.app.PutongFrag*/.f4();
        this.f5245B.a0();
        gd70.b().d(act());
    }

    /* JADX INFO: renamed from: g4 */
    public void m7426g4(Bundle bundle) {
        super/*com.p1.mobile.android.app.Frag*/.g4(bundle);
        this.f5246C.mo16029r();
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        LaunchStep launchStep = LaunchStep.MyTabInflate;
        yni.m25474f(launchStep);
        View viewInflateView = this.f5246C.inflateView(layoutInflater, viewGroup);
        yni.m25472d(launchStep);
        return viewInflateView;
    }

    /* JADX INFO: renamed from: o */
    public boolean m7427o() {
        return this.f5246C.mo16026o();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super/*com.p1.mobile.android.app.Frag*/.onActivityResult(i, i2, intent);
        qta0 qta0Var = this.f5245B;
        if (qta0Var != null) {
            qta0Var.mo18192e0(i, i2, intent);
        }
    }

    public void onHiddenChanged(boolean z) {
        super/*com.p1.mobile.putong.app.PutongFrag*/.onHiddenChanged(z);
        if (z) {
            this.f5246C.mo20047x1();
        } else {
            m4015U4();
            this.f5246C.mo16014D1();
        }
        this.f5245B.mo13933g0(z);
    }

    public void onResume() {
        super/*com.p1.mobile.android.app.Frag*/.onResume();
        this.f5246C.mo16031x2();
        this.f5245B.m21304f0();
    }

    public String pageId() {
        return NullChecker.a(this.f5245B) ? this.f5245B.pageId() : "p_navigation_view";
    }
}
