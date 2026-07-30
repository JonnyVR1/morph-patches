package com.p000p1.mobile.putong.core.p001ui.profile;

import android.os.Bundle;
import l.rol;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ProfileAct_CustomTransition extends ProfileAct implements rol {
    @Override // com.p000p1.mobile.putong.core.p001ui.profile.ProfileAct
    public boolean disableAutoPV() {
        return true;
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.ProfileAct
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        if (this.f843i) {
            setSwipeBackEnable(false);
        }
    }
}
