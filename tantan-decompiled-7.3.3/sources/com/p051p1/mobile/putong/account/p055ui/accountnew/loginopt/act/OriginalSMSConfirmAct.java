package com.p051p1.mobile.putong.account.p055ui.accountnew.loginopt.act;

import android.content.Context;
import android.content.Intent;
import com.p051p1.mobile.putong.app.PutongMvpAct;
import p153l.l660;
import p153l.p660;

/* JADX INFO: loaded from: classes9.dex */
public class OriginalSMSConfirmAct extends PutongMvpAct<l660, p660> {
    /* JADX INFO: renamed from: Z1 */
    public static Intent m29675Z1(Context context, String str, String str2, int i, String str3, String str4) {
        Intent intent = new Intent(context, (Class<?>) OriginalSMSConfirmAct.class);
        intent.putExtra("extra_number", str);
        intent.putExtra("extra_code", str2);
        intent.putExtra("extra_country_code", i);
        intent.putExtra("extra_mobile_number", str3);
        intent.putExtra("extra_action", str4);
        return intent;
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public l660 mo29671X1() {
        return new l660(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public p660 mo29672Y1() {
        return new p660(this);
    }
}
