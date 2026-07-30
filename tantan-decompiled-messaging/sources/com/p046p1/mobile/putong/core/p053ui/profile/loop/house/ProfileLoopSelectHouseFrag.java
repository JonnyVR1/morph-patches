package com.p046p1.mobile.putong.core.p053ui.profile.loop.house;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.base.ProfileEditLoopBaseFrag;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.User;
import java.util.List;
import p149l.oka0;
import p149l.rka0;

/* JADX INFO: loaded from: classes4.dex */
public class ProfileLoopSelectHouseFrag extends ProfileEditLoopBaseFrag {

    /* JADX INFO: renamed from: I */
    public oka0 f33460I;

    /* JADX INFO: renamed from: J */
    public rka0 f33461J;

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.loop.base.ProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: P4 */
    public void mo51590P4(User user) {
        this.f33461J.m179698q(user);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.loop.base.ProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: Y4 */
    public void mo51600Y4(List<Media> list, int i) {
        this.f33461J.m179692A(list, i);
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo20583d4() {
        super.mo20583d4();
        this.f33460I = new oka0(this);
        rka0 rka0Var = new rka0(act(), this);
        this.f33461J = rka0Var;
        this.f33460I.mo51532C(rka0Var);
        this.f33460I.mo39469Z();
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo20585f4() {
        super.mo20585f4();
        this.f33460I.mo39470a0();
    }

    @Override // com.p046p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f33461J.inflateView(layoutInflater, viewGroup);
    }
}
