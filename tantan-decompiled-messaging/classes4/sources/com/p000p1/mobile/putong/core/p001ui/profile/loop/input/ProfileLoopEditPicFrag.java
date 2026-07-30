package com.p000p1.mobile.putong.core.p001ui.profile.loop.input;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.base.ProfileEditLoopBaseFrag;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.User;
import java.util.List;
import p002l.lga0;
import p002l.oga0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ProfileLoopEditPicFrag extends ProfileEditLoopBaseFrag {

    /* JADX INFO: renamed from: I */
    public lga0 f1332I;

    /* JADX INFO: renamed from: J */
    public oga0 f1333J;

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.loop.base.ProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: P4 */
    public void mo2076P4(User user) {
        this.f1333J.m19458i(user);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.loop.base.ProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: T4 */
    public boolean mo2080T4(boolean z) {
        return this.f1332I.m17214i0(z);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.loop.base.ProfileEditLoopBaseFrag, p002l.xha0
    /* JADX INFO: renamed from: X */
    public boolean mo2084X() {
        if (this.f1333J.m19457f() <= 0) {
            return true;
        }
        this.f1333J.m19467u();
        return false;
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.loop.base.ProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: Y4 */
    public void mo2086Y4(List<Media> list, int i) {
        if (i != -1) {
            this.f1333J.m19465p(list, i);
        }
    }

    /* JADX INFO: renamed from: d4 */
    public void m2144d4() {
        super.d4();
        this.f1332I = new lga0(this);
        oga0 oga0Var = new oga0(act(), this);
        this.f1333J = oga0Var;
        this.f1332I.C(oga0Var);
        this.f1332I.m17212Z();
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.loop.base.ProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: e5 */
    public void mo2092e5() {
        this.f1333J.m19469w();
    }

    /* JADX INFO: renamed from: f4 */
    public void m2145f4() {
        super.f4();
        this.f1332I.m17213a0();
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f1333J.inflateView(layoutInflater, viewGroup);
    }
}
