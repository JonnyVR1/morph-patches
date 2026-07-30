package com.p000p1.mobile.putong.core.p001ui.profile.loop.input;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.ProfileInfoLoopEditAct;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.base.ProfileEditLoopBaseFrag;
import com.p1.mobile.putong.data.User;
import p002l.hja0;
import p002l.pja0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ProfileLoopMyQuestionInputFrag extends ProfileEditLoopBaseFrag {

    /* JADX INFO: renamed from: I */
    public hja0 f1341I;

    /* JADX INFO: renamed from: J */
    public pja0 f1342J;

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.loop.base.ProfileEditLoopBaseFrag, p002l.xha0
    /* JADX INFO: renamed from: H */
    public void mo2072H() {
        super.mo2072H();
        this.f1342J.m20375z();
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.loop.base.ProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: M4 */
    public void mo2073M4() {
        this.f1342J.m20363k();
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.loop.base.ProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: P4 */
    public void mo2076P4(User user) {
        this.f1342J.m20366n(user);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.loop.base.ProfileEditLoopBaseFrag, p002l.xha0
    /* JADX INFO: renamed from: X */
    public boolean mo2084X() {
        return this.f1342J.m20365m();
    }

    /* JADX INFO: renamed from: d4 */
    public void m2167d4() {
        super.d4();
        this.f1341I = new hja0(this);
        pja0 pja0Var = new pja0(this);
        this.f1342J = pja0Var;
        this.f1341I.C(pja0Var);
        this.f1341I.Z();
    }

    /* JADX INFO: renamed from: f4 */
    public void m2168f4() {
        super.f4();
        this.f1341I.m14411a0();
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f1342J.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.loop.base.ProfileEditLoopBaseFrag, p002l.xha0
    public boolean isLast() {
        if (act() instanceof ProfileInfoLoopEditAct) {
            return super.isLast();
        }
        return true;
    }
}
