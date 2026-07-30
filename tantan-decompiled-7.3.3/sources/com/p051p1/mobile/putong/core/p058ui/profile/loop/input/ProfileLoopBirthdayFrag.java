package com.p051p1.mobile.putong.core.p058ui.profile.loop.input;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.base.ProfileEditLoopBaseFrag;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p153l.zma0;

/* JADX INFO: loaded from: classes4.dex */
public class ProfileLoopBirthdayFrag extends ProfileEditLoopBaseFrag {

    /* JADX INFO: renamed from: I */
    public zma0 f34349I;

    /* JADX INFO: renamed from: J */
    public C8846b f34350J;

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.loop.base.ProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: N4 */
    public boolean mo52771N4() {
        return this.f34350J.m52905k();
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.loop.base.ProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: P4 */
    public void mo52773P4(User user) {
        this.f34350J.m52906l(user);
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo21582d4() {
        super.mo21582d4();
        this.f34349I = new zma0(this);
        C8846b c8846b = new C8846b(act(), this);
        this.f34350J = c8846b;
        this.f34349I.mo52715C(c8846b);
        this.f34349I.mo40472Z();
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo21584f4() {
        super.mo21584f4();
        this.f34349I.mo40473a0();
    }

    @Override // com.p051p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f34350J.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && NullChecker.m82486a(intent) && NullChecker.m82486a(this.f34349I)) {
            this.f34349I.m220380o0(i, i2, intent);
        }
    }
}
