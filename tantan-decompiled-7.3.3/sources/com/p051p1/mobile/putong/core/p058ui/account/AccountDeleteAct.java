package com.p051p1.mobile.putong.core.p058ui.account;

import android.content.Intent;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.app.PutongMvpAct;
import p153l.C18405lk;
import p153l.C19858rk;
import p153l.ar2;
import p153l.iam;

/* JADX INFO: loaded from: classes6.dex */
public class AccountDeleteAct extends PutongMvpAct {
    /* JADX INFO: renamed from: Z1 */
    public static Intent m45283Z1(Act act) {
        return new Intent(act, (Class<?>) AccountDeleteAct.class);
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: X1 */
    public ar2 mo29671X1() {
        return new C18405lk(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: Y1 */
    public iam mo29672Y1() {
        return new C19858rk(this);
    }
}
