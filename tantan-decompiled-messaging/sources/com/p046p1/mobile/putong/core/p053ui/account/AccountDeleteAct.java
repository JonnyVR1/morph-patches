package com.p046p1.mobile.putong.core.p053ui.account;

import android.content.Intent;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.app.PutongMvpAct;
import p149l.C19526qk;
import p149l.C20883wk;
import p149l.jq2;
import p149l.s7m;

/* JADX INFO: loaded from: classes8.dex */
public class AccountDeleteAct extends PutongMvpAct {
    /* JADX INFO: renamed from: Y1 */
    public static Intent m44100Y1(Act act) {
        return new Intent(act, (Class<?>) AccountDeleteAct.class);
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: V1 */
    public jq2 mo28672V1() {
        return new C19526qk(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: X1 */
    public s7m mo28673X1() {
        return new C20883wk(this);
    }
}
