package com.p046p1.mobile.putong.core.p053ui.profile;

import android.os.Bundle;
import p149l.rol;

/* JADX INFO: loaded from: classes4.dex */
public class ProfileAct_CustomTransition extends ProfileAct implements rol {
    @Override // com.p046p1.mobile.putong.core.p053ui.profile.ProfileAct, com.p046p1.mobile.putong.app.PutongAct, p149l.n3m
    public boolean disableAutoPV() {
        return true;
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.ProfileAct, com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        if (this.f33021i) {
            setSwipeBackEnable(false);
        }
    }
}
