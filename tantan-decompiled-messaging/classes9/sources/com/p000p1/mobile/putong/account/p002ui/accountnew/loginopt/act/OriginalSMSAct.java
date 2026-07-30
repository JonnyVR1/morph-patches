package com.p000p1.mobile.putong.account.p002ui.accountnew.loginopt.act;

import android.content.Context;
import android.content.Intent;
import com.p000p1.mobile.putong.app.PutongMvpAct;
import p006l.by50;
import p006l.yx50;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class OriginalSMSAct extends PutongMvpAct<yx50, by50> {
    /* JADX INFO: renamed from: Y1 */
    public static Intent m570Y1(Context context, String str, String str2, int i, int i2, String str3, String str4) {
        Intent intent = new Intent(context, (Class<?>) OriginalSMSAct.class);
        intent.putExtra("extra_code", str);
        intent.putExtra("extra_number", str2);
        intent.putExtra("extra_expire_seconds", i);
        intent.putExtra("extra_country_code", i2);
        intent.putExtra("extra_mobile_number", str3);
        intent.putExtra("extra_action", str4);
        return intent;
    }

    @Override // com.p000p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: Z1, reason: merged with bridge method [inline-methods] */
    public yx50 mo571V1() {
        return new yx50(this);
    }

    @Override // com.p000p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public by50 mo572X1() {
        return new by50(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p000p1.mobile.putong.app.PutongAct
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1001 && i2 == -1) {
            String stringExtra = intent != null ? intent.getStringExtra("extra_result_action") : null;
            Intent intent2 = new Intent();
            intent2.putExtra("extra_result_action", stringExtra);
            setResult(-1, intent2);
            finish();
        }
    }
}
