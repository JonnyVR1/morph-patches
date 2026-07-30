package com.p000p1.mobile.putong.core.p001ui.profile.loop.input;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.base.ProfileEditLoopBaseFrag;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p002l.vea0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ProfileLoopBirthdayFrag extends ProfileEditLoopBaseFrag {

    /* JADX INFO: renamed from: I */
    public vea0 f1323I;

    /* JADX INFO: renamed from: J */
    public C0108b f1324J;

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.loop.base.ProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: N4 */
    public boolean mo2074N4() {
        return this.f1324J.m2246k();
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.loop.base.ProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: P4 */
    public void mo2076P4(User user) {
        this.f1324J.m2247l(user);
    }

    /* JADX INFO: renamed from: d4 */
    public void m2125d4() {
        super.d4();
        this.f1323I = new vea0(this);
        C0108b c0108b = new C0108b(act(), this);
        this.f1324J = c0108b;
        this.f1323I.C(c0108b);
        this.f1323I.m23895Z();
    }

    /* JADX INFO: renamed from: f4 */
    public void m2126f4() {
        super.f4();
        this.f1323I.m23896a0();
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f1324J.inflateView(layoutInflater, viewGroup);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super/*com.p1.mobile.android.app.Frag*/.onActivityResult(i, i2, intent);
        if (i2 == -1 && NullChecker.a(intent) && NullChecker.a(this.f1323I)) {
            this.f1323I.m23902o0(i, i2, intent);
        }
    }
}
