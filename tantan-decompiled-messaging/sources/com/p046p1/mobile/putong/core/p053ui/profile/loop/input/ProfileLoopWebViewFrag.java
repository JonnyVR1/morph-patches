package com.p046p1.mobile.putong.core.p053ui.profile.loop.input;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.base.ProfileEditLoopBaseFrag;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p149l.ana0;
import p149l.cna0;

/* JADX INFO: loaded from: classes4.dex */
public class ProfileLoopWebViewFrag extends ProfileEditLoopBaseFrag {

    /* JADX INFO: renamed from: I */
    public cna0 f33537I;

    /* JADX INFO: renamed from: J */
    public ana0 f33538J;

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.loop.base.ProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: P4 */
    public void mo51590P4(User user) {
        this.f33538J.m97741b(user);
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo20583d4() {
        super.mo20583d4();
        this.f33537I = new cna0(this);
        ana0 ana0Var = new ana0(act(), this);
        this.f33538J = ana0Var;
        this.f33537I.mo51532C(ana0Var);
        this.f33537I.mo39469Z();
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo20585f4() {
        super.mo20585f4();
        this.f33537I.mo39470a0();
    }

    @Override // com.p046p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f33538J.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && NullChecker.m81303a(intent) && NullChecker.m81303a(this.f33537I)) {
            this.f33537I.m107746h0(i, i2, intent);
        }
    }
}
