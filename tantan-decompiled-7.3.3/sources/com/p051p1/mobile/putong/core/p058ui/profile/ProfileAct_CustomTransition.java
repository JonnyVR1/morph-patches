package com.p051p1.mobile.putong.core.p058ui.profile;

import android.os.Bundle;
import p153l.crl;

/* JADX INFO: loaded from: classes4.dex */
public class ProfileAct_CustomTransition extends ProfileAct implements crl {
    @Override // com.p051p1.mobile.putong.core.p058ui.profile.ProfileAct, com.p051p1.mobile.putong.app.PutongAct, p153l.e6m
    public boolean disableAutoPV() {
        return true;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.ProfileAct, com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        if (this.f33869i) {
            setSwipeBackEnable(false);
        }
    }
}
