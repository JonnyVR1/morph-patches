package com.p046p1.mobile.putong.core.p053ui.profile.loop.input;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.base.ProfileEditLoopBaseFrag;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p149l.vea0;

/* JADX INFO: loaded from: classes4.dex */
public class ProfileLoopBirthdayFrag extends ProfileEditLoopBaseFrag {

    /* JADX INFO: renamed from: I */
    public vea0 f33501I;

    /* JADX INFO: renamed from: J */
    public C8683b f33502J;

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.loop.base.ProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: N4 */
    public boolean mo51588N4() {
        return this.f33502J.m51722k();
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.loop.base.ProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: P4 */
    public void mo51590P4(User user) {
        this.f33502J.m51723l(user);
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo20583d4() {
        super.mo20583d4();
        this.f33501I = new vea0(this);
        C8683b c8683b = new C8683b(act(), this);
        this.f33502J = c8683b;
        this.f33501I.mo51532C(c8683b);
        this.f33501I.mo39469Z();
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo20585f4() {
        super.mo20585f4();
        this.f33501I.mo39470a0();
    }

    @Override // com.p046p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f33502J.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && NullChecker.m81303a(intent) && NullChecker.m81303a(this.f33501I)) {
            this.f33501I.m198167o0(i, i2, intent);
        }
    }
}
