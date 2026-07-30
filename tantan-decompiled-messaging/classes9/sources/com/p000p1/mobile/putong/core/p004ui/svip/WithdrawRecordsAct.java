package com.p000p1.mobile.putong.core.p004ui.svip;

import android.content.Context;
import android.content.Intent;
import com.p000p1.mobile.putong.app.PutongMvpAct;
import p006l.i8q0;
import p006l.j8q0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class WithdrawRecordsAct extends PutongMvpAct<i8q0, j8q0> {
    /* JADX INFO: renamed from: Y1 */
    public static Intent m9235Y1(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) WithdrawRecordsAct.class);
        intent.putExtra("param_account_id", str);
        return intent;
    }

    @Override // com.p000p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: Z1, reason: merged with bridge method [inline-methods] */
    public i8q0 mo571V1() {
        return new i8q0(this);
    }

    @Override // com.p000p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public j8q0 mo572X1() {
        return new j8q0(this);
    }
}
