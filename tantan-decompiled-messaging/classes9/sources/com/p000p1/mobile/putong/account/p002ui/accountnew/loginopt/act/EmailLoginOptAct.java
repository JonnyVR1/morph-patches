package com.p000p1.mobile.putong.account.p002ui.accountnew.loginopt.act;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.account.p002ui.account.SignInBaseActMVP;
import com.p1.mobile.putong.data.VerifyReason;
import com.tantanapp.common.utils.NullChecker;
import java.io.Serializable;
import p006l.eje;
import p006l.ive;
import p006l.njm;
import p006l.oue;
import p006l.qib0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class EmailLoginOptAct extends SignInBaseActMVP<oue, ive> {

    /* JADX INFO: renamed from: c */
    public ive f588c;

    /* JADX INFO: renamed from: d */
    public oue f589d;

    /* JADX INFO: renamed from: Y1 */
    public static Intent m561Y1(Context context, VerifyReason verifyReason, String str) {
        Intent intent = new Intent(context, (Class<?>) EmailLoginOptAct.class);
        intent.putExtra("reason", (Serializable) verifyReason);
        intent.putExtra("from", str);
        return intent;
    }

    /* JADX INFO: renamed from: Z1 */
    public static Intent m562Z1(Context context, VerifyReason verifyReason, boolean z, String str, String str2) {
        Intent intentM561Y1 = m561Y1(context, verifyReason, str);
        intentM561Y1.putExtra("showGoogleBtn", z);
        intentM561Y1.putExtra("currentBindEmail", str2);
        return intentM561Y1;
    }

    @Override // com.p000p1.mobile.putong.account.p002ui.account.SignInBaseActMVP
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public oue generateSignInPresenter() {
        oue oueVar = new oue(this);
        this.f589d = oueVar;
        return oueVar;
    }

    @Override // com.p000p1.mobile.putong.account.p002ui.account.SignInBaseActMVP
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public ive generateSignInViewModel() {
        ive iveVar = new ive(this);
        this.f588c = iveVar;
        return iveVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c2 */
    public String m565c2() {
        return getIntent().getStringExtra("currentBindEmail");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d2 */
    public boolean m566d2() {
        return getIntent().getBooleanExtra("showGoogleBtn", false);
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public boolean disableAutoPV() {
        return true;
    }

    @Override // com.p000p1.mobile.putong.account.p002ui.account.SignInBaseActMVP, com.p000p1.mobile.putong.app.PutongAct
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f588c.m17105Y()) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f588c.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p000p1.mobile.putong.account.p002ui.account.SignInBaseActMVP, com.p000p1.mobile.putong.app.PutongAct
    public void initSubscription() {
        super.initSubscription();
        this.f589d.mo12401a0();
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.f589d.m20818s2(i, i2, intent);
    }

    public void onBackPressed() {
        if (this.f588c.m17105Y()) {
            return;
        }
        hideInput();
        super/*androidx.activity.ComponentActivity*/.onBackPressed();
        if (this.f589d.m20792R1()) {
            eje.m14574h().m14584m();
            qib0.m22149Z0(false, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p000p1.mobile.putong.app.PutongAct
    public String pageId() {
        VerifyReason serializableExtra = getIntent().getSerializableExtra("reason");
        if (VerifyReason.get("bind-email").equals(serializableExtra)) {
            return "p_account_add_email";
        }
        if (VerifyReason.get("change-email").equals(serializableExtra)) {
            return "p_account_replace_email";
        }
        return NullChecker.a(this.f588c) ? this.f588c.m17126u0() : "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p000p1.mobile.putong.account.p002ui.account.SignInBaseActMVP, com.p000p1.mobile.putong.app.PutongAct
    public void preCreateView(Bundle bundle) {
        njm.m20153a(this);
        this.f589d.m20788N1(getIntent().getSerializableExtra("reason"), getIntent().getStringExtra("from"), m566d2(), getIntent().getBooleanExtra("canSkip", true));
        super.preCreateView(bundle);
        this.pageHelper.q(pageId());
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
