package com.p046p1.mobile.putong.core.p053ui;

import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.CoreModule;
import p149l.dbl0;

/* JADX INFO: loaded from: classes.dex */
public class AutoReleaseVideoAct extends PutongAct {
    /* JADX INFO: renamed from: V1 */
    private boolean m43890V1() {
        return CoreModule.f17557o.m195057d().mo33845hi(this.act);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void onDestroyLifecycle() {
        super.onDestroyLifecycle();
        if (m43890V1()) {
            dbl0.m110646a(this.act.getWindow().getDecorView(), true);
        }
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void onPauseLifecycle() {
        super.onPauseLifecycle();
        if (m43890V1()) {
            dbl0.m110646a(this.act.getWindow().getDecorView(), false);
        }
    }
}
