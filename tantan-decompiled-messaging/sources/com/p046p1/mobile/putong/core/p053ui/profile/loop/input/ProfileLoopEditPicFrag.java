package com.p046p1.mobile.putong.core.p053ui.profile.loop.input;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.base.ProfileEditLoopBaseFrag;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.User;
import java.util.List;
import p149l.lga0;
import p149l.oga0;

/* JADX INFO: loaded from: classes4.dex */
public class ProfileLoopEditPicFrag extends ProfileEditLoopBaseFrag {

    /* JADX INFO: renamed from: I */
    public lga0 f33510I;

    /* JADX INFO: renamed from: J */
    public oga0 f33511J;

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.loop.base.ProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: P4 */
    public void mo51590P4(User user) {
        this.f33511J.m164186i(user);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.loop.base.ProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: T4 */
    public boolean mo51594T4(boolean z) {
        return this.f33510I.m149760i0(z);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.loop.base.ProfileEditLoopBaseFrag, p149l.xha0
    /* JADX INFO: renamed from: X */
    public boolean mo51598X() {
        if (this.f33511J.m164185f() <= 0) {
            return true;
        }
        this.f33511J.m164194u();
        return false;
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.loop.base.ProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: Y4 */
    public void mo51600Y4(List<Media> list, int i) {
        if (i != -1) {
            this.f33511J.m164192p(list, i);
        }
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo20583d4() {
        super.mo20583d4();
        this.f33510I = new lga0(this);
        oga0 oga0Var = new oga0(act(), this);
        this.f33511J = oga0Var;
        this.f33510I.mo51532C(oga0Var);
        this.f33510I.mo39469Z();
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.loop.base.ProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: e5 */
    public void mo51606e5() {
        this.f33511J.m164196w();
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo20585f4() {
        super.mo20585f4();
        this.f33510I.mo39470a0();
    }

    @Override // com.p046p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f33511J.inflateView(layoutInflater, viewGroup);
    }
}
