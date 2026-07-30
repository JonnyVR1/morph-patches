package com.p000p1.mobile.putong.core.p001ui.profile.loop.input;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.base.ProfileEditLoopBaseFrag;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p002l.rma0;
import p002l.uma0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ProfileLoopTextInputFrag extends ProfileEditLoopBaseFrag {

    /* JADX INFO: renamed from: I */
    public rma0 f1354I;

    /* JADX INFO: renamed from: J */
    public uma0 f1355J;

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.loop.base.ProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: N4 */
    public boolean mo2074N4() {
        return this.f1355J.m23545f(this.f1277z);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.loop.base.ProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: P4 */
    public void mo2076P4(User user) {
        this.f1355J.m23548j(user);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.loop.base.ProfileEditLoopBaseFrag, p002l.xha0
    /* JADX INFO: renamed from: X */
    public boolean mo2084X() {
        return (m2082V4() || m2083W4()) ? this.f1355J.m23544e() : super.mo2084X();
    }

    /* JADX INFO: renamed from: d4 */
    public void m2203d4() {
        super.d4();
        this.f1354I = new rma0(this);
        uma0 uma0Var = new uma0(act(), this);
        this.f1355J = uma0Var;
        this.f1354I.C(uma0Var);
        this.f1354I.m22077Z();
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.loop.base.ProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: e5 */
    public void mo2092e5() {
        this.f1355J.m23553q();
    }

    /* JADX INFO: renamed from: f4 */
    public void m2204f4() {
        super.f4();
        this.f1354I.m22078a0();
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        uma0 uma0Var = this.f1355J;
        uma0Var.f20717h = this.f1274F;
        return uma0Var.inflateView(layoutInflater, viewGroup);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super/*com.p1.mobile.android.app.Frag*/.onActivityResult(i, i2, intent);
        if (i2 == -1 && NullChecker.a(intent) && NullChecker.a(this.f1354I)) {
            this.f1354I.m22080h0(i, i2, intent);
        }
    }
}
