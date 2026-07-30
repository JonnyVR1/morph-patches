package com.p051p1.mobile.putong.core.p058ui.profile.loop.school;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.base.ProfileEditLoopBaseFrag;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p153l.fua0;
import p153l.kua0;

/* JADX INFO: loaded from: classes4.dex */
public class ProfileLoopSelectSchoolFrag extends ProfileEditLoopBaseFrag {

    /* JADX INFO: renamed from: I */
    public fua0 f34421I;

    /* JADX INFO: renamed from: J */
    public kua0 f34422J;

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.loop.base.ProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: P4 */
    public void mo52773P4(User user) {
        this.f34422J.m151485A(user);
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo21582d4() {
        super.mo21582d4();
        this.f34421I = new fua0(this);
        kua0 kua0Var = new kua0(act(), this);
        this.f34422J = kua0Var;
        this.f34421I.mo52715C(kua0Var);
        this.f34421I.mo40472Z();
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo21584f4() {
        super.mo21584f4();
        this.f34421I.mo40473a0();
    }

    @Override // com.p051p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f34422J.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && NullChecker.m82486a(intent) && NullChecker.m82486a(this.f34421I)) {
            this.f34421I.m127447l0(i, i2, intent);
        }
    }
}
