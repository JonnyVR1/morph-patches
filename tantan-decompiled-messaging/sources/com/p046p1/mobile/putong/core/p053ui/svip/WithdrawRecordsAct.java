package com.p046p1.mobile.putong.core.p053ui.svip;

import android.content.Context;
import android.content.Intent;
import com.p046p1.mobile.putong.app.PutongMvpAct;
import p149l.i8q0;
import p149l.j8q0;

/* JADX INFO: loaded from: classes9.dex */
public class WithdrawRecordsAct extends PutongMvpAct<i8q0, j8q0> {
    /* JADX INFO: renamed from: Y1 */
    public static Intent m55837Y1(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) WithdrawRecordsAct.class);
        intent.putExtra("param_account_id", str);
        return intent;
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: Z1, reason: merged with bridge method [inline-methods] */
    public i8q0 mo28672V1() {
        return new i8q0(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public j8q0 mo28673X1() {
        return new j8q0(this);
    }
}
