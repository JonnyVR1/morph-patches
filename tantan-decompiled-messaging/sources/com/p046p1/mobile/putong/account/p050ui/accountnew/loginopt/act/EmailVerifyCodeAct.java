package com.p046p1.mobile.putong.account.p050ui.accountnew.loginopt.act;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.IntRange;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.account.p050ui.account.SignInBaseActMVP;
import com.p046p1.mobile.putong.core.data.Reason;
import com.p046p1.mobile.putong.data.VerifyReason;
import org.slf4j.Marker;
import p149l.cwe;
import p149l.njm;
import p149l.qwe;
import p149l.vwb;

/* JADX INFO: loaded from: classes9.dex */
public class EmailVerifyCodeAct extends SignInBaseActMVP<cwe, qwe> {

    /* JADX INFO: renamed from: c */
    public qwe f16601c;

    /* JADX INFO: renamed from: d */
    public cwe f16602d;

    /* JADX INFO: renamed from: Y1 */
    public static Intent m28668Y1(Act act, String str, @IntRange(from = 1, to = 2) int i, VerifyReason verifyReason, String str2) {
        Intent intent = new Intent(act, (Class<?>) EmailVerifyCodeAct.class);
        intent.putExtra("email", str);
        intent.putExtra("verify_type", i);
        intent.putExtra(Reason.TYPE, verifyReason);
        intent.putExtra("from", str2);
        return intent;
    }

    @Override // com.p046p1.mobile.putong.account.p050ui.account.SignInBaseActMVP
    /* JADX INFO: renamed from: Z1, reason: merged with bridge method [inline-methods] */
    public cwe generateSignInPresenter() {
        cwe cweVar = new cwe(this);
        this.f16602d = cweVar;
        return cweVar;
    }

    @Override // com.p046p1.mobile.putong.account.p050ui.account.SignInBaseActMVP
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public qwe generateSignInViewModel() {
        qwe qweVar = new qwe(this);
        this.f16601c = qweVar;
        return qweVar;
    }

    @Override // com.p046p1.mobile.putong.account.p050ui.account.SignInBaseActMVP, com.p046p1.mobile.putong.app.PutongAct, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f16601c.m176808C()) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f16601c.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.account.p050ui.account.SignInBaseActMVP, com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f16602d.mo39470a0();
        this.pageHelper.m109041q(pageId());
        this.pageHelper.m109040p(vwb.m200311Y("email_number", Marker.ANY_NON_NULL_MARKER + this.f16602d.f82778f), vwb.m200311Y("login_scene", "android_email"));
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.f16601c.m176808C()) {
            return;
        }
        hideInput();
        super.onBackPressed();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        VerifyReason verifyReason = (VerifyReason) getIntent().getSerializableExtra(Reason.TYPE);
        if (VerifyReason.get(VerifyReason.bind_email).equals(verifyReason)) {
            return "p_account_add_email_input_code";
        }
        return VerifyReason.get(VerifyReason.change_email).equals(verifyReason) ? "p_account_replace_email_input_code" : "p_intl_sign_in_email_verification_code_view";
    }

    @Override // com.p046p1.mobile.putong.account.p050ui.account.SignInBaseActMVP, com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        njm.m159745a(this);
        this.f16602d.m109009g1((VerifyReason) getIntent().getSerializableExtra(Reason.TYPE), getIntent().getStringExtra("from"));
        super.preCreateView(bundle);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public boolean shouldShowGradientActionBar() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public boolean shouldShowGradientStatusBar() {
        return false;
    }
}
