package com.p051p1.mobile.putong.core.p058ui.account;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.data.VerifyData;
import p153l.ii60;
import p153l.li60;

/* JADX INFO: loaded from: classes9.dex */
public class PasswordResetAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public ii60 f29103c;

    /* JADX INFO: renamed from: d */
    public li60 f29104d;

    /* JADX INFO: renamed from: X1 */
    public static Intent m45378X1(Act act, VerifyData verifyData) {
        Intent intent = new Intent(act, (Class<?>) PasswordResetAct.class);
        intent.putExtra("verify_data", verifyData);
        return intent;
    }

    @Override // com.p051p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void lambda$debugItems$19() {
        super.lambda$debugItems$19();
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f29104d.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f29103c = new ii60(this);
        li60 li60Var = new li60(this);
        this.f29104d = li60Var;
        this.f29103c.mo52715C(li60Var);
        this.f29103c.m140056j0((VerifyData) getIntent().getSerializableExtra("verify_data"));
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f29103c.mo40473a0();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
    }
}
