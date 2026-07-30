package com.p051p1.mobile.putong.core.p058ui.svip;

import android.content.Context;
import android.content.Intent;
import com.p051p1.mobile.putong.app.PutongMvpAct;
import p153l.nhq0;
import p153l.ohq0;

/* JADX INFO: loaded from: classes12.dex */
public class WithdrawRecordsAct extends PutongMvpAct<nhq0, ohq0> {
    /* JADX INFO: renamed from: Z1 */
    public static Intent m57020Z1(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) WithdrawRecordsAct.class);
        intent.putExtra("param_account_id", str);
        return intent;
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public nhq0 mo29671X1() {
        return new nhq0(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public ohq0 mo29672Y1() {
        return new ohq0(this);
    }
}
