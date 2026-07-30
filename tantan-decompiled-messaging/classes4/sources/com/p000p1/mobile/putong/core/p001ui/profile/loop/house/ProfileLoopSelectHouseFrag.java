package com.p000p1.mobile.putong.core.p001ui.profile.loop.house;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.base.ProfileEditLoopBaseFrag;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.User;
import java.util.List;
import p002l.oka0;
import p002l.rka0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ProfileLoopSelectHouseFrag extends ProfileEditLoopBaseFrag {

    /* JADX INFO: renamed from: I */
    public oka0 f1282I;

    /* JADX INFO: renamed from: J */
    public rka0 f1283J;

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.loop.base.ProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: P4 */
    public void mo2076P4(User user) {
        this.f1283J.m22066q(user);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.loop.base.ProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: Y4 */
    public void mo2086Y4(List<Media> list, int i) {
        this.f1283J.m22058A(list, i);
    }

    /* JADX INFO: renamed from: d4 */
    public void m2099d4() {
        super.d4();
        this.f1282I = new oka0(this);
        rka0 rka0Var = new rka0(act(), this);
        this.f1283J = rka0Var;
        this.f1282I.C(rka0Var);
        this.f1282I.Z();
    }

    /* JADX INFO: renamed from: f4 */
    public void m2100f4() {
        super.f4();
        this.f1282I.m19600a0();
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f1283J.inflateView(layoutInflater, viewGroup);
    }
}
