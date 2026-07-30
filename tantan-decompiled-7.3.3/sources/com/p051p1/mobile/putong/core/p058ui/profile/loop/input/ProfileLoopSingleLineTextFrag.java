package com.p051p1.mobile.putong.core.p058ui.profile.loop.input;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.base.ProfileEditLoopBaseFrag;
import com.p051p1.mobile.putong.data.User;
import p153l.oua0;
import p153l.sua0;

/* JADX INFO: loaded from: classes4.dex */
public class ProfileLoopSingleLineTextFrag extends ProfileEditLoopBaseFrag {

    /* JADX INFO: renamed from: I */
    public oua0 f34378I;

    /* JADX INFO: renamed from: J */
    public sua0 f34379J;

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.loop.base.ProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: P4 */
    public void mo52773P4(User user) {
        this.f34379J.m188016i(user);
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo21582d4() {
        super.mo21582d4();
        this.f34378I = new oua0(this);
        sua0 sua0Var = new sua0(act(), this);
        this.f34379J = sua0Var;
        this.f34378I.mo52715C(sua0Var);
        this.f34378I.mo40472Z();
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo21584f4() {
        super.mo21584f4();
        this.f34378I.mo40473a0();
    }

    @Override // com.p051p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f34379J.inflateView(layoutInflater, viewGroup);
    }
}
