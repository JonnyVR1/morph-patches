package com.p046p1.mobile.putong.core.p053ui.profile.loop.height;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.base.ProfileEditLoopBaseFrag;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.User;
import java.util.List;
import p149l.jka0;
import p149l.mka0;

/* JADX INFO: loaded from: classes4.dex */
public class ProfileLoopSelectHeightFrag extends ProfileEditLoopBaseFrag {

    /* JADX INFO: renamed from: I */
    public jka0 f33458I;

    /* JADX INFO: renamed from: J */
    public mka0 f33459J;

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.loop.base.ProfileEditLoopBaseFrag, p149l.xha0
    /* JADX INFO: renamed from: H */
    public void mo51586H() {
        super.mo51586H();
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.loop.base.ProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: P4 */
    public void mo51590P4(User user) {
        this.f33459J.m154938m(user);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.loop.base.ProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: Y4 */
    public void mo51600Y4(List<Media> list, int i) {
        this.f33459J.m154942u(list, i);
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo20583d4() {
        super.mo20583d4();
        this.f33458I = new jka0(this);
        mka0 mka0Var = new mka0(act(), this);
        this.f33459J = mka0Var;
        this.f33458I.mo51532C(mka0Var);
        this.f33458I.mo39469Z();
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo20585f4() {
        super.mo20585f4();
        this.f33458I.mo39470a0();
    }

    @Override // com.p046p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f33459J.inflateView(layoutInflater, viewGroup);
    }
}
