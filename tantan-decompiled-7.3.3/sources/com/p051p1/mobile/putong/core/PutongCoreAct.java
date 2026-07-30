package com.p051p1.mobile.putong.core;

import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.app.PutongAct;
import org.jetbrains.annotations.NotNull;
import p153l.qa00;
import p153l.ux0;

/* JADX INFO: loaded from: classes9.dex */
public class PutongCoreAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public ux0 f18282c;

    /* JADX INFO: renamed from: X1 */
    public boolean m30948X1() {
        return true;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public int getActionBarHeight() {
        return m30948X1() ? qa00.m175859d(44.0f) : super.getActionBarHeight();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    @NonNull
    @NotNull
    public ux0 getAppTheme() {
        if (this.f18282c == null) {
            this.f18282c = CoreModule.m30933P().m143405a().mo34614vl(this);
        }
        return this.f18282c;
    }
}
