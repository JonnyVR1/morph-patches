package com.p000p1.mobile.putong.core.p001ui.profile.loop.input;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.base.ProfileEditLoopBaseFrag;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p002l.ana0;
import p002l.cna0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ProfileLoopWebViewFrag extends ProfileEditLoopBaseFrag {

    /* JADX INFO: renamed from: I */
    public cna0 f1359I;

    /* JADX INFO: renamed from: J */
    public ana0 f1360J;

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.loop.base.ProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: P4 */
    public void mo2076P4(User user) {
        this.f1360J.m9917b(user);
    }

    /* JADX INFO: renamed from: d4 */
    public void m2207d4() {
        super.d4();
        this.f1359I = new cna0(this);
        ana0 ana0Var = new ana0(act(), this);
        this.f1360J = ana0Var;
        this.f1359I.C(ana0Var);
        this.f1359I.m11112Z();
    }

    /* JADX INFO: renamed from: f4 */
    public void m2208f4() {
        super.f4();
        this.f1359I.m11113a0();
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f1360J.inflateView(layoutInflater, viewGroup);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super/*com.p1.mobile.android.app.Frag*/.onActivityResult(i, i2, intent);
        if (i2 == -1 && NullChecker.a(intent) && NullChecker.a(this.f1359I)) {
            this.f1359I.m11115h0(i, i2, intent);
        }
    }
}
