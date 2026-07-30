package com.p051p1.mobile.putong.core.p058ui.profile.loop.input;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.base.ProfileEditLoopBaseFrag;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p153l.eva0;
import p153l.gva0;

/* JADX INFO: loaded from: classes4.dex */
public class ProfileLoopWebViewFrag extends ProfileEditLoopBaseFrag {

    /* JADX INFO: renamed from: I */
    public gva0 f34385I;

    /* JADX INFO: renamed from: J */
    public eva0 f34386J;

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.loop.base.ProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: P4 */
    public void mo52773P4(User user) {
        this.f34386J.m122772b(user);
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo21582d4() {
        super.mo21582d4();
        this.f34385I = new gva0(this);
        eva0 eva0Var = new eva0(act(), this);
        this.f34386J = eva0Var;
        this.f34385I.mo52715C(eva0Var);
        this.f34385I.mo40472Z();
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo21584f4() {
        super.mo21584f4();
        this.f34385I.mo40473a0();
    }

    @Override // com.p051p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f34386J.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && NullChecker.m82486a(intent) && NullChecker.m82486a(this.f34385I)) {
            this.f34385I.m132525h0(i, i2, intent);
        }
    }
}
