package com.p003p1.mobile.putong.core.p006ui.account;

import android.content.Context;
import android.content.Intent;
import com.p1.mobile.putong.app.PutongMvpAct;
import l.j760;
import l.vwb;
import l.zvf0;
import p007l.jq2;
import p007l.mtd;
import p007l.ntd;
import p007l.s7m;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class DeleteAccountInactiveAct extends PutongMvpAct {
    /* JADX INFO: renamed from: Y1 */
    public static Intent m8460Y1(Context context, String str, String str2, String str3) {
        Intent intent = new Intent(context, (Class<?>) DeleteAccountInactiveAct.class);
        intent.putExtra("deleteContent", str);
        intent.putExtra("inactivateCategoryKey", str2);
        intent.putExtra("inactivateReasonKey", str3);
        return intent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: V1 */
    public jq2 m8461V1() {
        return new mtd(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: X1 */
    public s7m m8462X1() {
        return new ntd(this);
    }

    public void onBackPressed() {
        zvf0.u("e_apply_delete_account_withdraw", pageId(), new j760[]{vwb.Y("back_cancel", "back")});
        super/*androidx.activity.ComponentActivity*/.onBackPressed();
    }

    public String pageId() {
        return "p_delete_account_success";
    }
}
