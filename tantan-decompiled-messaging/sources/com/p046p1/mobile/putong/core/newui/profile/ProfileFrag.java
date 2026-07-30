package com.p046p1.mobile.putong.core.newui.profile;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.CoreAssetsSettings;
import com.p046p1.mobile.putong.core.newui.main.NewMainContextFrag;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.util.launch.LaunchStep;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collection;
import p149l.d30;
import p149l.eg30;
import p149l.gd70;
import p149l.j760;
import p149l.jh30;
import p149l.qta0;
import p149l.rta0;
import p149l.v2a;
import p149l.x020;
import p149l.yni;

/* JADX INFO: loaded from: classes11.dex */
public class ProfileFrag extends NewMainContextFrag {

    /* JADX INFO: renamed from: B */
    public qta0 f26467B = new eg30(this);

    /* JADX INFO: renamed from: C */
    public rta0 f26468C = new jh30(this);

    @Override // com.p046p1.mobile.putong.app.PutongFrag
    /* JADX INFO: renamed from: B4 */
    public boolean mo29632B4() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag
    /* JADX INFO: renamed from: C4 */
    public Collection<? extends j760<String, d30>> mo29633C4() {
        ArrayList arrayList = new ArrayList();
        rta0 rta0Var = this.f26468C;
        if (rta0Var instanceof x020) {
            arrayList.addAll(((x020) rta0Var).m206545B());
        }
        return arrayList;
    }

    @Override // com.p046p1.mobile.putong.core.newui.main.NewMainContextFrag
    /* JADX INFO: renamed from: S4 */
    public void mo39936S4() {
        super.mo39936S4();
        CoreModule.f17545c.f19639e0.m169454W9(CoreModule.m29931H().userId());
        CoreAssetsSettings coreAssetsSettingsM95177g = CoreModule.f17546d.m95177g();
        if (NullChecker.m81303a(coreAssetsSettingsM95177g)) {
            if (TEnum.equals(coreAssetsSettingsM95177g.userBanAppealSwitch, "online") || (TEnum.equals(coreAssetsSettingsM95177g.userBanAppealSwitch, "grey") && v2a.m196755d())) {
                CoreModule.f17545c.f19639e0.m169466Z9();
            }
        }
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo20583d4() {
        super.mo20583d4();
        this.f26467B.mo51532C(this.f26468C);
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo20585f4() {
        super.mo20585f4();
        this.f26467B.mo39470a0();
        gd70.m125540b().m125542d(act());
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo20586g4(Bundle bundle) {
        super.mo20586g4(bundle);
        this.f26468C.mo133501r();
    }

    @Override // com.p046p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        LaunchStep launchStep = LaunchStep.MyTabInflate;
        yni.m215417f(launchStep);
        View viewInflateView = this.f26468C.inflateView(layoutInflater, viewGroup);
        yni.m215415d(launchStep);
        return viewInflateView;
    }

    /* JADX INFO: renamed from: o */
    public boolean m43206o() {
        return this.f26468C.mo133498o();
    }

    @Override // com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        qta0 qta0Var = this.f26467B;
        if (qta0Var != null) {
            qta0Var.mo152466e0(i, i2, intent);
        }
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        if (z) {
            this.f26468C.mo166607x1();
        } else {
            m39938U4();
            this.f26468C.mo133487D1();
        }
        this.f26467B.mo116222g0(z);
    }

    @Override // com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.f26468C.mo133503x2();
        this.f26467B.m176410f0();
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag, p149l.n3m
    public String pageId() {
        return NullChecker.m81303a(this.f26467B) ? this.f26467B.pageId() : OMSDialogPositon.p_navigation_view;
    }
}
