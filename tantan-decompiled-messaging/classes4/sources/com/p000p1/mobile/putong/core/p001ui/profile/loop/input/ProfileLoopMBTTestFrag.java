package com.p000p1.mobile.putong.core.p001ui.profile.loop.input;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.base.ProfileEditLoopBaseFrag;
import com.p1.mobile.putong.data.User;
import p002l.cia0;
import p002l.eia0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ProfileLoopMBTTestFrag extends ProfileEditLoopBaseFrag {

    /* JADX INFO: renamed from: I */
    public cia0 f1336I;

    /* JADX INFO: renamed from: J */
    public eia0 f1337J;

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.loop.base.ProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: P4 */
    public void mo2076P4(User user) {
    }

    /* JADX INFO: renamed from: d4 */
    public void m2154d4() {
        super.d4();
        this.f1336I = new cia0(this);
        eia0 eia0Var = new eia0(this);
        this.f1337J = eia0Var;
        this.f1336I.C(eia0Var);
        this.f1336I.Z();
    }

    /* JADX INFO: renamed from: f4 */
    public void m2155f4() {
        super.f4();
        this.f1336I.m11058a0();
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f1337J.inflateView(layoutInflater, viewGroup);
    }
}
