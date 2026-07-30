package com.p000p1.mobile.putong.core.p001ui.profile.loop.input;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.ProfileInfoLoopEditAct;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.base.ProfileEditLoopBaseFrag;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p002l.xma0;
import p002l.yma0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ProfileLoopVerificationFrag extends ProfileEditLoopBaseFrag {

    /* JADX INFO: renamed from: I */
    public yma0 f1356I;

    /* JADX INFO: renamed from: J */
    public xma0 f1357J;

    /* JADX INFO: renamed from: K */
    public boolean f1358K;

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.loop.base.ProfileEditLoopBaseFrag, p002l.xha0
    /* JADX INFO: renamed from: H */
    public void mo2072H() {
        if (this.f1358K || this.f1356I.m26807c()) {
            super.mo2072H();
            if (act() instanceof ProfileInfoLoopEditAct) {
                act().m1991a2().m2031X0(false);
            }
        }
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.loop.base.ProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: P4 */
    public void mo2076P4(User user) {
    }

    /* JADX INFO: renamed from: d4 */
    public void m2205d4() {
        super.d4();
        this.f1357J = new xma0(this);
        yma0 yma0Var = new yma0(act(), this);
        this.f1356I = yma0Var;
        this.f1357J.C(yma0Var);
        this.f1357J.Z();
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.loop.base.ProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: e5 */
    public void mo2092e5() {
        super.mo2092e5();
    }

    /* JADX INFO: renamed from: f4 */
    public void m2206f4() {
        super.f4();
        this.f1357J.m26029a0();
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.loop.base.ProfileEditLoopBaseFrag, p002l.xha0
    /* JADX INFO: renamed from: h1 */
    public void mo2095h1() {
        this.f1358K = true;
        super.mo2095h1();
        this.f1358K = false;
        if (act() instanceof ProfileInfoLoopEditAct) {
            act().m1991a2().m2031X0(false);
        }
    }

    @Nullable
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f1356I.inflateView(layoutInflater, viewGroup);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super/*com.p1.mobile.android.app.Frag*/.onActivityResult(i, i2, intent);
        if (i2 == -1 && NullChecker.a(intent) && NullChecker.a(this.f1357J)) {
            this.f1357J.m26031g0(i, i2, intent);
        }
    }
}
