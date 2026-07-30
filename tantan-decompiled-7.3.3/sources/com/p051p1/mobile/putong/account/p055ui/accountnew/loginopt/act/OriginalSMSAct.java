package com.p051p1.mobile.putong.account.p055ui.accountnew.loginopt.act;

import android.content.Context;
import android.content.Intent;
import com.p051p1.mobile.putong.app.PutongMvpAct;
import p153l.d660;
import p153l.g660;

/* JADX INFO: loaded from: classes9.dex */
public class OriginalSMSAct extends PutongMvpAct<d660, g660> {
    /* JADX INFO: renamed from: Z1 */
    public static Intent m29670Z1(Context context, String str, String str2, int i, int i2, String str3, String str4) {
        Intent intent = new Intent(context, (Class<?>) OriginalSMSAct.class);
        intent.putExtra("extra_code", str);
        intent.putExtra("extra_number", str2);
        intent.putExtra("extra_expire_seconds", i);
        intent.putExtra("extra_country_code", i2);
        intent.putExtra("extra_mobile_number", str3);
        intent.putExtra("extra_action", str4);
        return intent;
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public d660 mo29671X1() {
        return new d660(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public g660 mo29672Y1() {
        return new g660(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1001 && i2 == -1) {
            String stringExtra = intent != null ? intent.getStringExtra("extra_result_action") : null;
            Intent intent2 = new Intent();
            intent2.putExtra("extra_result_action", stringExtra);
            setResult(-1, intent2);
            lambda$debugItems$19();
        }
    }
}
