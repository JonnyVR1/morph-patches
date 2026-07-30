package com.p051p1.mobile.putong.core.p058ui.account;

import android.content.Context;
import android.content.Intent;
import com.p051p1.mobile.putong.app.PutongMvpAct;
import p153l.ar2;
import p153l.avd;
import p153l.bvd;
import p153l.i4g0;
import p153l.iam;
import p153l.jyb;

/* JADX INFO: loaded from: classes9.dex */
public class DeleteAccountInactiveAct extends PutongMvpAct {
    /* JADX INFO: renamed from: Z1 */
    public static Intent m45295Z1(Context context, String str, String str2, String str3) {
        Intent intent = new Intent(context, (Class<?>) DeleteAccountInactiveAct.class);
        intent.putExtra("deleteContent", str);
        intent.putExtra("inactivateCategoryKey", str2);
        intent.putExtra("inactivateReasonKey", str3);
        return intent;
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: X1 */
    public ar2 mo29671X1() {
        return new avd(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: Y1 */
    public iam mo29672Y1() {
        return new bvd(this);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        i4g0.m138523u("e_apply_delete_account_withdraw", pageId(), jyb.m147494Y("back_cancel", "back"));
        super.onBackPressed();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_delete_account_success";
    }
}
