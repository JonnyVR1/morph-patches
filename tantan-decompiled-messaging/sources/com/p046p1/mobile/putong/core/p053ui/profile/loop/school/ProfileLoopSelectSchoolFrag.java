package com.p046p1.mobile.putong.core.p053ui.profile.loop.school;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.base.ProfileEditLoopBaseFrag;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p149l.bma0;
import p149l.gma0;

/* JADX INFO: loaded from: classes4.dex */
public class ProfileLoopSelectSchoolFrag extends ProfileEditLoopBaseFrag {

    /* JADX INFO: renamed from: I */
    public bma0 f33573I;

    /* JADX INFO: renamed from: J */
    public gma0 f33574J;

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.loop.base.ProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: P4 */
    public void mo51590P4(User user) {
        this.f33574J.m126953A(user);
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo20583d4() {
        super.mo20583d4();
        this.f33573I = new bma0(this);
        gma0 gma0Var = new gma0(act(), this);
        this.f33574J = gma0Var;
        this.f33573I.mo51532C(gma0Var);
        this.f33573I.mo39469Z();
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo20585f4() {
        super.mo20585f4();
        this.f33573I.mo39470a0();
    }

    @Override // com.p046p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f33574J.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && NullChecker.m81303a(intent) && NullChecker.m81303a(this.f33573I)) {
            this.f33573I.m102614l0(i, i2, intent);
        }
    }
}
