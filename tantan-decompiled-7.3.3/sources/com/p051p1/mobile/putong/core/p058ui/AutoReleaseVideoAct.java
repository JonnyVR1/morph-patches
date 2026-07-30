package com.p051p1.mobile.putong.core.p058ui;

import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.CoreModule;
import p153l.hkl0;

/* JADX INFO: loaded from: classes.dex */
public class AutoReleaseVideoAct extends PutongAct {
    /* JADX INFO: renamed from: X1 */
    private boolean m45076X1() {
        return CoreModule.f18276o.m132214d().mo34848hi(this.act);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void onDestroyLifecycle() {
        super.onDestroyLifecycle();
        if (m45076X1()) {
            hkl0.m135638a(this.act.getWindow().getDecorView(), true);
        }
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void onPauseLifecycle() {
        super.onPauseLifecycle();
        if (m45076X1()) {
            hkl0.m135638a(this.act.getWindow().getDecorView(), false);
        }
    }
}
