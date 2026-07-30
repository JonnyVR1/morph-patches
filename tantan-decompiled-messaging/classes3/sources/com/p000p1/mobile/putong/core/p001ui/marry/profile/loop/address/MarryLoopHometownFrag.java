package com.p000p1.mobile.putong.core.p001ui.marry.profile.loop.address;

import android.content.Intent;
import com.p000p1.mobile.putong.core.p001ui.marry.profile.loop.base.MarryEditProfileBaseMvpFrag;
import p003l.tzw;
import p003l.vzw;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class MarryLoopHometownFrag extends MarryEditProfileBaseMvpFrag<tzw, vzw> {
    @Override // com.p000p1.mobile.putong.core.p001ui.marry.profile.loop.base.MarryEditProfileBaseMvpFrag
    /* JADX INFO: renamed from: S4, reason: merged with bridge method [inline-methods] */
    public tzw mo539N4() {
        return new tzw(this);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.marry.profile.loop.base.MarryEditProfileBaseMvpFrag
    /* JADX INFO: renamed from: T4, reason: merged with bridge method [inline-methods] */
    public vzw mo540O4() {
        return new vzw(act(), this);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super/*com.p1.mobile.android.app.Frag*/.onActivityResult(i, i2, intent);
        ((tzw) this.f312z).m8061q0(i, i2, intent);
    }
}
