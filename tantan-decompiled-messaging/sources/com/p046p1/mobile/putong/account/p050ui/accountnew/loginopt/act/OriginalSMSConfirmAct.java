package com.p046p1.mobile.putong.account.p050ui.accountnew.loginopt.act;

import android.content.Context;
import android.content.Intent;
import com.p046p1.mobile.putong.app.PutongMvpAct;
import p149l.gy50;
import p149l.ky50;

/* JADX INFO: loaded from: classes9.dex */
public class OriginalSMSConfirmAct extends PutongMvpAct<gy50, ky50> {
    /* JADX INFO: renamed from: Y1 */
    public static Intent m28676Y1(Context context, String str, String str2, int i, String str3, String str4) {
        Intent intent = new Intent(context, (Class<?>) OriginalSMSConfirmAct.class);
        intent.putExtra("extra_number", str);
        intent.putExtra("extra_code", str2);
        intent.putExtra("extra_country_code", i);
        intent.putExtra("extra_mobile_number", str3);
        intent.putExtra("extra_action", str4);
        return intent;
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: Z1, reason: merged with bridge method [inline-methods] */
    public gy50 mo28672V1() {
        return new gy50(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public ky50 mo28673X1() {
        return new ky50(this);
    }
}
