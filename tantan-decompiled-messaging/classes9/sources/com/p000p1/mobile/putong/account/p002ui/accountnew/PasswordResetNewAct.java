package com.p000p1.mobile.putong.account.p002ui.accountnew;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.account.AccountBaseAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.data.VerifyData;
import java.io.Serializable;
import p006l.s960;
import p006l.w960;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class PasswordResetNewAct extends AccountBaseAct {

    /* JADX INFO: renamed from: c */
    public s960 f422c;

    /* JADX INFO: renamed from: d */
    public w960 f423d;

    /* JADX INFO: renamed from: V1 */
    public static Intent m385V1(Act act, VerifyData verifyData) {
        Intent intent = new Intent((Context) act, (Class<?>) PasswordResetNewAct.class);
        intent.putExtra("verify_data", (Serializable) verifyData);
        return intent;
    }

    public void finish() {
        super.finish();
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f423d.inflateView(layoutInflater, viewGroup);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p000p1.mobile.putong.account.AccountBaseAct, com.p000p1.mobile.putong.app.PutongAct
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f422c = new s960(this);
        w960 w960Var = new w960(this);
        this.f423d = w960Var;
        this.f422c.C(w960Var);
        this.f422c.m23535l0((VerifyData) getIntent().getSerializableExtra("verify_data"));
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public void initSubscription() {
        super.initSubscription();
        this.f422c.m23534a0();
    }

    public void onBackPressed() {
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public String pageId() {
        return "p_reset_password_view";
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
    }
}
