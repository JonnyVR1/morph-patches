package com.p046p1.mobile.putong.core.p053ui.marry.profile.loop.address;

import android.content.Intent;
import com.p046p1.mobile.putong.core.p053ui.marry.profile.loop.base.MarryEditProfileBaseMvpFrag;
import p149l.tzw;
import p149l.vzw;

/* JADX INFO: loaded from: classes3.dex */
public class MarryLoopHometownFrag extends MarryEditProfileBaseMvpFrag<tzw, vzw> {
    @Override // com.p046p1.mobile.putong.core.p053ui.marry.profile.loop.base.MarryEditProfileBaseMvpFrag
    /* JADX INFO: renamed from: S4, reason: merged with bridge method [inline-methods] */
    public tzw mo47491N4() {
        return new tzw(this);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.marry.profile.loop.base.MarryEditProfileBaseMvpFrag
    /* JADX INFO: renamed from: T4, reason: merged with bridge method [inline-methods] */
    public vzw mo47492O4() {
        return new vzw(act(), this);
    }

    @Override // com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        ((tzw) this.f30421z).m191224q0(i, i2, intent);
    }
}
