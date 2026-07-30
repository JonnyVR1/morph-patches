package com.p046p1.mobile.putong.core.p053ui.account;

import android.content.Context;
import android.content.Intent;
import com.p046p1.mobile.putong.app.PutongMvpAct;
import p149l.jq2;
import p149l.mtd;
import p149l.ntd;
import p149l.s7m;
import p149l.vwb;
import p149l.zvf0;

/* JADX INFO: loaded from: classes8.dex */
public class DeleteAccountInactiveAct extends PutongMvpAct {
    /* JADX INFO: renamed from: Y1 */
    public static Intent m44112Y1(Context context, String str, String str2, String str3) {
        Intent intent = new Intent(context, (Class<?>) DeleteAccountInactiveAct.class);
        intent.putExtra("deleteContent", str);
        intent.putExtra("inactivateCategoryKey", str2);
        intent.putExtra("inactivateReasonKey", str3);
        return intent;
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: V1 */
    public jq2 mo28672V1() {
        return new mtd(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: X1 */
    public s7m mo28673X1() {
        return new ntd(this);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        zvf0.m220399u("e_apply_delete_account_withdraw", pageId(), vwb.m200311Y("back_cancel", "back"));
        super.onBackPressed();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_delete_account_success";
    }
}
