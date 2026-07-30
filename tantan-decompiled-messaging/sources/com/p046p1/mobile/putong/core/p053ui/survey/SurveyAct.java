package com.p046p1.mobile.putong.core.p053ui.survey;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.app.PutongAct;
import p149l.o4h0;
import p149l.r4h0;
import p149l.rol;
import p149l.rzb0;

/* JADX INFO: loaded from: classes9.dex */
public class SurveyAct extends PutongAct implements rol {

    /* JADX INFO: renamed from: c */
    public o4h0 f36461c;

    /* JADX INFO: renamed from: d */
    public r4h0 f36462d;

    /* JADX INFO: renamed from: V1 */
    public static Intent m55826V1(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) SurveyAct.class);
        intent.putExtra("surveyId", str);
        return intent;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, p149l.n3m
    public boolean disableAutoPV() {
        return true;
    }

    @Override // com.p046p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void m50458m2() {
        super.m50458m2();
        act().overridePendingTransition(0, rzb0.f161627A);
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f36462d.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f36461c = new o4h0(this);
        r4h0 r4h0Var = new r4h0(this);
        this.f36462d = r4h0Var;
        this.f36461c.mo51532C(r4h0Var);
        this.f36461c.m162589n0(getIntent().getStringExtra("surveyId"));
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f36461c.mo39470a0();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
    }
}
