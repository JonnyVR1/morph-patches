package com.p051p1.mobile.putong.account.p055ui.accountnew.loginopt.act;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.IntRange;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.account.p055ui.account.SignInBaseActMVP;
import com.p051p1.mobile.putong.core.data.Reason;
import com.p051p1.mobile.putong.data.VerifyReason;
import org.slf4j.Marker;
import p153l.gxe;
import p153l.jyb;
import p153l.plm;
import p153l.uxe;

/* JADX INFO: loaded from: classes9.dex */
public class EmailVerifyCodeAct extends SignInBaseActMVP<gxe, uxe> {

    /* JADX INFO: renamed from: c */
    public uxe f17320c;

    /* JADX INFO: renamed from: d */
    public gxe f17321d;

    /* JADX INFO: renamed from: Z1 */
    public static Intent m29667Z1(Act act, String str, @IntRange(from = 1, to = 2) int i, VerifyReason verifyReason, String str2) {
        Intent intent = new Intent(act, (Class<?>) EmailVerifyCodeAct.class);
        intent.putExtra("email", str);
        intent.putExtra("verify_type", i);
        intent.putExtra(Reason.TYPE, verifyReason);
        intent.putExtra("from", str2);
        return intent;
    }

    @Override // com.p051p1.mobile.putong.account.p055ui.account.SignInBaseActMVP
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public gxe generateSignInPresenter() {
        gxe gxeVar = new gxe(this);
        this.f17321d = gxeVar;
        return gxeVar;
    }

    @Override // com.p051p1.mobile.putong.account.p055ui.account.SignInBaseActMVP
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public uxe generateSignInViewModel() {
        uxe uxeVar = new uxe(this);
        this.f17320c = uxeVar;
        return uxeVar;
    }

    @Override // com.p051p1.mobile.putong.account.p055ui.account.SignInBaseActMVP, com.p051p1.mobile.putong.app.PutongAct, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f17320c.m198441C()) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f17320c.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.account.p055ui.account.SignInBaseActMVP, com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f17321d.mo40473a0();
        this.pageHelper.m152782q(pageId());
        this.pageHelper.m152781p(jyb.m147494Y("email_number", Marker.ANY_NON_NULL_MARKER + this.f17321d.f106934f), jyb.m147494Y("login_scene", "android_email"));
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.f17320c.m198441C()) {
            return;
        }
        hideInput();
        super.onBackPressed();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        VerifyReason verifyReason = (VerifyReason) getIntent().getSerializableExtra(Reason.TYPE);
        if (VerifyReason.get(VerifyReason.bind_email).equals(verifyReason)) {
            return "p_account_add_email_input_code";
        }
        return VerifyReason.get(VerifyReason.change_email).equals(verifyReason) ? "p_account_replace_email_input_code" : "p_intl_sign_in_email_verification_code_view";
    }

    @Override // com.p051p1.mobile.putong.account.p055ui.account.SignInBaseActMVP, com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        plm.m172838a(this);
        this.f17321d.m132847g1((VerifyReason) getIntent().getSerializableExtra(Reason.TYPE), getIntent().getStringExtra("from"));
        super.preCreateView(bundle);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public boolean shouldShowGradientActionBar() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public boolean shouldShowGradientStatusBar() {
        return false;
    }
}
