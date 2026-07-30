package com.p000p1.mobile.putong.account.p002ui.accountnew;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.account.p002ui.account.SignInBaseActMVP;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.data.SignInData;
import com.p1.mobile.putong.data.VerifyReason;
import com.p1.mobile.putong.data.tenum.TEnum;
import java.io.Serializable;
import java.util.List;
import p006l.br60;
import p006l.iq60;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class PhoneNumberInputAct extends SignInBaseActMVP<iq60, br60> {

    /* JADX INFO: renamed from: c */
    public br60 f424c;

    /* JADX INFO: renamed from: d */
    public iq60 f425d;

    /* JADX INFO: renamed from: Y1 */
    public static Intent m386Y1(Context context, VerifyReason verifyReason) {
        Intent intent = new Intent(context, (Class<?>) PhoneNumberInputAct.class);
        intent.putExtra("reason", (Serializable) verifyReason);
        intent.putExtra("signData", (Serializable) null);
        return intent;
    }

    /* JADX INFO: renamed from: Z1 */
    public static Intent m387Z1(Act act, VerifyReason verifyReason, SignInData signInData) {
        Intent intent = new Intent((Context) act, (Class<?>) PhoneNumberInputAct.class);
        intent.putExtra("reason", (Serializable) verifyReason);
        intent.putExtra("signData", (Serializable) signInData);
        return intent;
    }

    @Override // com.p000p1.mobile.putong.account.p002ui.account.SignInBaseActMVP
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public iq60 generateSignInPresenter() {
        return this.f425d;
    }

    @Override // com.p000p1.mobile.putong.account.p002ui.account.SignInBaseActMVP
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public br60 generateSignInViewModel() {
        return this.f424c;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f424c.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p000p1.mobile.putong.account.p002ui.account.SignInBaseActMVP, com.p000p1.mobile.putong.account.AccountBaseAct, com.p000p1.mobile.putong.app.PutongAct
    public void initDataOnCreate() {
        this.f424c = new br60(this);
        iq60 iq60Var = new iq60(this);
        this.f425d = iq60Var;
        iq60Var.C(this.f424c);
        super.initDataOnCreate();
    }

    @Override // com.p000p1.mobile.putong.account.p002ui.account.SignInBaseActMVP, com.p000p1.mobile.putong.app.PutongAct
    public void initSubscription() {
        super.initSubscription();
        this.f425d.mo12401a0();
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.f425d.m16852R1(i, i2, intent);
    }

    public void onBackPressed() {
        this.f425d.m16853S1();
        hideInput();
        super/*androidx.activity.ComponentActivity*/.onBackPressed();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean onCreateOptionsMenu(Menu menu) {
        if (this.f425d.m16854T1(menu)) {
            return true;
        }
        return super/*android.app.Activity*/.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (!checkOptionsItemSelectSpeedOk()) {
            return false;
        }
        if (this.f425d.m16855U1(menuItem)) {
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public void onStartLifecycle() {
        this.f425d.m16856V1(this, this.pageHelper);
        super.onStartLifecycle();
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public String pageId() {
        return this.f425d.pageId();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p000p1.mobile.putong.account.p002ui.account.SignInBaseActMVP, com.p000p1.mobile.putong.app.PutongAct
    public void preCreateView(Bundle bundle) {
        VerifyReason serializableExtra = getIntent().getSerializableExtra("reason");
        this.f425d.m16872p1(serializableExtra, getIntent().getSerializableExtra("signData"), getIntent().getStringExtra("from"));
        super.preCreateView(bundle);
        this.pageHelper.q(pageId());
        if (TEnum.equals(serializableExtra, "ban-appeal")) {
            setSwipeBackEnable(false);
        }
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public List<Object> trackedArgs() {
        return this.f425d.m16865e2();
    }
}
