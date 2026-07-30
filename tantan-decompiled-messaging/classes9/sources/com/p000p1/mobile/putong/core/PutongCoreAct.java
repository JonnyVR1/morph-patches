package com.p000p1.mobile.putong.core;

import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.app.PutongAct;
import l.nx0;
import l.t100;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class PutongCoreAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public nx0 f1552c;

    /* JADX INFO: renamed from: V1 */
    public boolean m1878V1() {
        return true;
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public int getActionBarHeight() {
        return m1878V1() ? t100.d(44.0f) : super.getActionBarHeight();
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    @NonNull
    @NotNull
    public nx0 getAppTheme() {
        if (this.f1552c == null) {
            this.f1552c = CoreModule.m1854P().m11706a().m5548vl(this);
        }
        return this.f1552c;
    }
}
