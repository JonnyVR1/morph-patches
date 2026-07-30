package com.p051p1.mobile.putong.core.newui.profile;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.CoreAssetsSettings;
import com.p051p1.mobile.putong.core.newui.main.NewMainContextFrag;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.util.launch.LaunchStep;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collection;
import p153l.f920;
import p153l.g4a;
import p153l.hix;
import p153l.ml70;
import p153l.pf60;
import p153l.u1b0;
import p153l.uqi;
import p153l.v1b0;
import p153l.x20;

/* JADX INFO: loaded from: classes11.dex */
public class ProfileFrag extends NewMainContextFrag {

    /* JADX INFO: renamed from: B */
    public u1b0 f27209B = hix.m135185a(this);

    /* JADX INFO: renamed from: C */
    public v1b0 f27210C = hix.m135186b(this);

    @Override // com.p051p1.mobile.putong.app.PutongFrag
    /* JADX INFO: renamed from: B4 */
    public boolean mo30630B4() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag
    /* JADX INFO: renamed from: C4 */
    public Collection<? extends pf60<String, x20>> mo30631C4() {
        ArrayList arrayList = new ArrayList();
        v1b0 v1b0Var = this.f27210C;
        if (v1b0Var instanceof f920) {
            arrayList.addAll(((f920) v1b0Var).m124599B());
        }
        return arrayList;
    }

    @Override // com.p051p1.mobile.putong.core.newui.main.NewMainContextFrag
    /* JADX INFO: renamed from: S4 */
    public void mo40943S4() {
        super.mo40943S4();
        CoreModule.f18264c.f20381e0.m116527W9(CoreModule.m30929H().userId());
        CoreAssetsSettings coreAssetsSettingsM144645g = CoreModule.f18265d.m144645g();
        if (NullChecker.m82486a(coreAssetsSettingsM144645g)) {
            if (TEnum.equals(coreAssetsSettingsM144645g.userBanAppealSwitch, "online") || (TEnum.equals(coreAssetsSettingsM144645g.userBanAppealSwitch, "grey") && g4a.m128860d())) {
                CoreModule.f18264c.f20381e0.m116539Z9();
            }
        }
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo21582d4() {
        super.mo21582d4();
        this.f27209B.mo52715C(this.f27210C);
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo21584f4() {
        super.mo21584f4();
        this.f27209B.mo40473a0();
        ml70.m158856b().m158858d(act());
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo21585g4(Bundle bundle) {
        super.mo21585g4(bundle);
        this.f27210C.mo44452r();
    }

    @Override // com.p051p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        LaunchStep launchStep = LaunchStep.MyTabInflate;
        uqi.m197339f(launchStep);
        View viewInflateView = this.f27210C.inflateView(layoutInflater, viewGroup);
        uqi.m197337d(launchStep);
        return viewInflateView;
    }

    /* JADX INFO: renamed from: o */
    public boolean m44217o() {
        return this.f27210C.mo44445o();
    }

    @Override // com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        u1b0 u1b0Var = this.f27209B;
        if (u1b0Var != null) {
            u1b0Var.mo193949e0(i, i2, intent);
        }
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        if (z) {
            this.f27210C.mo124624x1();
        } else {
            m40945U4();
            this.f27210C.mo44371D1();
        }
        this.f27209B.mo121680g0(z);
    }

    @Override // com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.f27210C.mo44466x2();
        this.f27209B.m193950f0();
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag, p153l.e6m
    public String pageId() {
        return NullChecker.m82486a(this.f27209B) ? this.f27209B.pageId() : OMSDialogPositon.p_navigation_view;
    }
}
