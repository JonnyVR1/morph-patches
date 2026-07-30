package com.p000p1.mobile.putong.core.p001ui.profile.loop.height;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.base.ProfileEditLoopBaseFrag;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.User;
import java.util.List;
import p002l.jka0;
import p002l.mka0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ProfileLoopSelectHeightFrag extends ProfileEditLoopBaseFrag {

    /* JADX INFO: renamed from: I */
    public jka0 f1280I;

    /* JADX INFO: renamed from: J */
    public mka0 f1281J;

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.loop.base.ProfileEditLoopBaseFrag, p002l.xha0
    /* JADX INFO: renamed from: H */
    public void mo2072H() {
        super.mo2072H();
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.loop.base.ProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: P4 */
    public void mo2076P4(User user) {
        this.f1281J.m17988m(user);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.loop.base.ProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: Y4 */
    public void mo2086Y4(List<Media> list, int i) {
        this.f1281J.m17992u(list, i);
    }

    /* JADX INFO: renamed from: d4 */
    public void m2097d4() {
        super.d4();
        this.f1280I = new jka0(this);
        mka0 mka0Var = new mka0(act(), this);
        this.f1281J = mka0Var;
        this.f1280I.C(mka0Var);
        this.f1280I.Z();
    }

    /* JADX INFO: renamed from: f4 */
    public void m2098f4() {
        super.f4();
        this.f1280I.m15978a0();
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f1281J.inflateView(layoutInflater, viewGroup);
    }
}
