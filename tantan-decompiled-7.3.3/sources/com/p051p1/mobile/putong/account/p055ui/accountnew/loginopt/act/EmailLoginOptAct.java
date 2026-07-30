package com.p051p1.mobile.putong.account.p055ui.accountnew.loginopt.act;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.account.p055ui.account.SignInBaseActMVP;
import com.p051p1.mobile.putong.core.data.Reason;
import com.p051p1.mobile.putong.data.VerifyReason;
import com.tantanapp.common.utils.NullChecker;
import p153l.ike;
import p153l.mwe;
import p153l.plm;
import p153l.sve;
import p153l.uqb0;

/* JADX INFO: loaded from: classes9.dex */
public class EmailLoginOptAct extends SignInBaseActMVP<sve, mwe> {

    /* JADX INFO: renamed from: c */
    public mwe f17318c;

    /* JADX INFO: renamed from: d */
    public sve f17319d;

    /* JADX INFO: renamed from: Z1 */
    public static Intent m29661Z1(Context context, VerifyReason verifyReason, String str) {
        Intent intent = new Intent(context, (Class<?>) EmailLoginOptAct.class);
        intent.putExtra(Reason.TYPE, verifyReason);
        intent.putExtra("from", str);
        return intent;
    }

    /* JADX INFO: renamed from: a2 */
    public static Intent m29662a2(Context context, VerifyReason verifyReason, boolean z, String str, String str2) {
        Intent intentM29661Z1 = m29661Z1(context, verifyReason, str);
        intentM29661Z1.putExtra("showGoogleBtn", z);
        intentM29661Z1.putExtra("currentBindEmail", str2);
        return intentM29661Z1;
    }

    @Override // com.p051p1.mobile.putong.account.p055ui.account.SignInBaseActMVP
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public sve generateSignInPresenter() {
        sve sveVar = new sve(this);
        this.f17319d = sveVar;
        return sveVar;
    }

    @Override // com.p051p1.mobile.putong.account.p055ui.account.SignInBaseActMVP
    /* JADX INFO: renamed from: c2, reason: merged with bridge method [inline-methods] */
    public mwe generateSignInViewModel() {
        mwe mweVar = new mwe(this);
        this.f17318c = mweVar;
        return mweVar;
    }

    /* JADX INFO: renamed from: d2 */
    public String m29665d2() {
        return getIntent().getStringExtra("currentBindEmail");
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, p153l.e6m
    public boolean disableAutoPV() {
        return true;
    }

    @Override // com.p051p1.mobile.putong.account.p055ui.account.SignInBaseActMVP, com.p051p1.mobile.putong.app.PutongAct, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f17318c.m160524Y()) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX INFO: renamed from: e2 */
    public boolean m29666e2() {
        return getIntent().getBooleanExtra("showGoogleBtn", false);
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f17318c.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.account.p055ui.account.SignInBaseActMVP, com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f17319d.mo40473a0();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) throws Throwable {
        super.onActivityResult(i, i2, intent);
        this.f17319d.m188188s2(i, i2, intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.f17318c.m160524Y()) {
            return;
        }
        hideInput();
        super.onBackPressed();
        if (this.f17319d.m188162R1()) {
            ike.m140276h().m140286m();
            uqb0.m197259Z0(false, false);
        }
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        VerifyReason verifyReason = (VerifyReason) getIntent().getSerializableExtra(Reason.TYPE);
        if (VerifyReason.get(VerifyReason.bind_email).equals(verifyReason)) {
            return "p_account_add_email";
        }
        if (VerifyReason.get(VerifyReason.change_email).equals(verifyReason)) {
            return "p_account_replace_email";
        }
        return NullChecker.m82486a(this.f17318c) ? this.f17318c.m160545u0() : "";
    }

    @Override // com.p051p1.mobile.putong.account.p055ui.account.SignInBaseActMVP, com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        plm.m172838a(this);
        this.f17319d.m188158N1((VerifyReason) getIntent().getSerializableExtra(Reason.TYPE), getIntent().getStringExtra("from"), m29666e2(), getIntent().getBooleanExtra("canSkip", true));
        super.preCreateView(bundle);
        this.pageHelper.m152782q(pageId());
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
