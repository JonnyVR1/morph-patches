package com.p046p1.mobile.putong.core;

import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.app.PutongAct;
import org.jetbrains.annotations.NotNull;
import p149l.nx0;
import p149l.t100;

/* JADX INFO: loaded from: classes9.dex */
public class PutongCoreAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public nx0 f17563c;

    /* JADX INFO: renamed from: V1 */
    public boolean m29950V1() {
        return true;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public int getActionBarHeight() {
        return m29950V1() ? t100.m186890d(44.0f) : super.getActionBarHeight();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    @NonNull
    @NotNull
    public nx0 getAppTheme() {
        if (this.f17563c == null) {
            this.f17563c = CoreModule.m29935P().m94651a().mo33611vl(this);
        }
        return this.f17563c;
    }
}
