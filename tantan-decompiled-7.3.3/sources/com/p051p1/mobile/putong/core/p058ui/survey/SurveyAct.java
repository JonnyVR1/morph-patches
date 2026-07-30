package com.p051p1.mobile.putong.core.p058ui.survey;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.app.PutongAct;
import p153l.crl;
import p153l.wch0;
import p153l.x7c0;
import p153l.zch0;

/* JADX INFO: loaded from: classes12.dex */
public class SurveyAct extends PutongAct implements crl {

    /* JADX INFO: renamed from: c */
    public wch0 f37309c;

    /* JADX INFO: renamed from: d */
    public zch0 f37310d;

    /* JADX INFO: renamed from: X1 */
    public static Intent m57009X1(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) SurveyAct.class);
        intent.putExtra("surveyId", str);
        return intent;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, p153l.e6m
    public boolean disableAutoPV() {
        return true;
    }

    @Override // com.p051p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void m51642n2() {
        super.m51642n2();
        act().overridePendingTransition(0, x7c0.f192684A);
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f37310d.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f37309c = new wch0(this);
        zch0 zch0Var = new zch0(this);
        this.f37310d = zch0Var;
        this.f37309c.mo52715C(zch0Var);
        this.f37309c.m205813n0(getIntent().getStringExtra("surveyId"));
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f37309c.mo40473a0();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
    }
}
