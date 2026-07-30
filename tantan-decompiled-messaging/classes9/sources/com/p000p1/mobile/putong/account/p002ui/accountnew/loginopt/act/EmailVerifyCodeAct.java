package com.p000p1.mobile.putong.account.p002ui.accountnew.loginopt.act;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.IntRange;
import com.p000p1.mobile.putong.account.p002ui.account.SignInBaseActMVP;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.data.VerifyReason;
import java.io.Serializable;
import l.j760;
import l.vwb;
import p006l.cwe;
import p006l.njm;
import p006l.qwe;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class EmailVerifyCodeAct extends SignInBaseActMVP<cwe, qwe> {

    /* JADX INFO: renamed from: c */
    public qwe f590c;

    /* JADX INFO: renamed from: d */
    public cwe f591d;

    /* JADX INFO: renamed from: Y1 */
    public static Intent m567Y1(Act act, String str, @IntRange(from = 1, to = 2) int i, VerifyReason verifyReason, String str2) {
        Intent intent = new Intent((Context) act, (Class<?>) EmailVerifyCodeAct.class);
        intent.putExtra("email", str);
        intent.putExtra("verify_type", i);
        intent.putExtra("reason", (Serializable) verifyReason);
        intent.putExtra("from", str2);
        return intent;
    }

    @Override // com.p000p1.mobile.putong.account.p002ui.account.SignInBaseActMVP
    /* JADX INFO: renamed from: Z1, reason: merged with bridge method [inline-methods] */
    public cwe generateSignInPresenter() {
        cwe cweVar = new cwe(this);
        this.f591d = cweVar;
        return cweVar;
    }

    @Override // com.p000p1.mobile.putong.account.p002ui.account.SignInBaseActMVP
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public qwe generateSignInViewModel() {
        qwe qweVar = new qwe(this);
        this.f590c = qweVar;
        return qweVar;
    }

    @Override // com.p000p1.mobile.putong.account.p002ui.account.SignInBaseActMVP, com.p000p1.mobile.putong.app.PutongAct
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f590c.m22448C()) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f590c.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p000p1.mobile.putong.account.p002ui.account.SignInBaseActMVP, com.p000p1.mobile.putong.app.PutongAct
    public void initSubscription() {
        super.initSubscription();
        this.f591d.mo12401a0();
        this.pageHelper.q(pageId());
        this.pageHelper.p(new j760[]{vwb.Y("email_number", "+" + this.f591d.f9887f), vwb.Y("login_scene", "android_email")});
    }

    public void onBackPressed() {
        if (this.f590c.m22448C()) {
            return;
        }
        hideInput();
        super/*androidx.activity.ComponentActivity*/.onBackPressed();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p000p1.mobile.putong.app.PutongAct
    public String pageId() {
        VerifyReason serializableExtra = getIntent().getSerializableExtra("reason");
        if (VerifyReason.get("bind-email").equals(serializableExtra)) {
            return "p_account_add_email_input_code";
        }
        return VerifyReason.get("change-email").equals(serializableExtra) ? "p_account_replace_email_input_code" : "p_intl_sign_in_email_verification_code_view";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p000p1.mobile.putong.account.p002ui.account.SignInBaseActMVP, com.p000p1.mobile.putong.app.PutongAct
    public void preCreateView(Bundle bundle) {
        njm.m20153a(this);
        this.f591d.m13666g1(getIntent().getSerializableExtra("reason"), getIntent().getStringExtra("from"));
        super.preCreateView(bundle);
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public boolean shouldShowGradientActionBar() {
        return false;
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public boolean shouldShowGradientStatusBar() {
        return false;
    }
}
