package com.p051p1.mobile.putong.core.p058ui.marry.profile.loop.address;

import android.content.Intent;
import com.p051p1.mobile.putong.core.p058ui.marry.profile.loop.base.MarryEditProfileBaseMvpFrag;
import p153l.s2x;
import p153l.u2x;

/* JADX INFO: loaded from: classes3.dex */
public class MarryLoopHometownFrag extends MarryEditProfileBaseMvpFrag<s2x, u2x> {
    @Override // com.p051p1.mobile.putong.core.p058ui.marry.profile.loop.base.MarryEditProfileBaseMvpFrag
    /* JADX INFO: renamed from: S4, reason: merged with bridge method [inline-methods] */
    public s2x mo48674N4() {
        return new s2x(this);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.marry.profile.loop.base.MarryEditProfileBaseMvpFrag
    /* JADX INFO: renamed from: T4, reason: merged with bridge method [inline-methods] */
    public u2x mo48675O4() {
        return new u2x(act(), this);
    }

    @Override // com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        ((s2x) this.f31269z).m184151q0(i, i2, intent);
    }
}
