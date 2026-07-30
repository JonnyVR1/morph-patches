package com.p000p1.mobile.putong.core.p001ui.profile.loop.input;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.base.ProfileEditLoopBaseFrag;
import com.p1.mobile.putong.data.User;
import p002l.kma0;
import p002l.oma0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ProfileLoopSingleLineTextFrag extends ProfileEditLoopBaseFrag {

    /* JADX INFO: renamed from: I */
    public kma0 f1352I;

    /* JADX INFO: renamed from: J */
    public oma0 f1353J;

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.loop.base.ProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: P4 */
    public void mo2076P4(User user) {
        this.f1353J.m19631i(user);
    }

    /* JADX INFO: renamed from: d4 */
    public void m2201d4() {
        super.d4();
        this.f1352I = new kma0(this);
        oma0 oma0Var = new oma0(act(), this);
        this.f1353J = oma0Var;
        this.f1352I.C(oma0Var);
        this.f1352I.Z();
    }

    /* JADX INFO: renamed from: f4 */
    public void m2202f4() {
        super.f4();
        this.f1352I.m16697a0();
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f1353J.inflateView(layoutInflater, viewGroup);
    }
}
