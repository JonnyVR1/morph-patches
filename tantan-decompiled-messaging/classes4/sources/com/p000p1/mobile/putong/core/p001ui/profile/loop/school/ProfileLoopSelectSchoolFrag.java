package com.p000p1.mobile.putong.core.p001ui.profile.loop.school;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.base.ProfileEditLoopBaseFrag;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p002l.bma0;
import p002l.gma0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ProfileLoopSelectSchoolFrag extends ProfileEditLoopBaseFrag {

    /* JADX INFO: renamed from: I */
    public bma0 f1395I;

    /* JADX INFO: renamed from: J */
    public gma0 f1396J;

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.loop.base.ProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: P4 */
    public void mo2076P4(User user) {
        this.f1396J.m13918A(user);
    }

    /* JADX INFO: renamed from: d4 */
    public void m2257d4() {
        super.d4();
        this.f1395I = new bma0(this);
        gma0 gma0Var = new gma0(act(), this);
        this.f1396J = gma0Var;
        this.f1395I.C(gma0Var);
        this.f1395I.m10473Z();
    }

    /* JADX INFO: renamed from: f4 */
    public void m2258f4() {
        super.f4();
        this.f1395I.m10474a0();
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f1396J.inflateView(layoutInflater, viewGroup);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super/*com.p1.mobile.android.app.Frag*/.onActivityResult(i, i2, intent);
        if (i2 == -1 && NullChecker.a(intent) && NullChecker.a(this.f1395I)) {
            this.f1395I.m10476l0(i, i2, intent);
        }
    }
}
