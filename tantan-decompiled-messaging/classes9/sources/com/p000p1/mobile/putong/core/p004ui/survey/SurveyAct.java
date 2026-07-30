package com.p000p1.mobile.putong.core.p004ui.survey;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.app.PutongAct;
import p006l.o4h0;
import p006l.r4h0;
import p006l.rol;
import p006l.rzb0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class SurveyAct extends PutongAct implements rol {

    /* JADX INFO: renamed from: c */
    public o4h0 f6242c;

    /* JADX INFO: renamed from: d */
    public r4h0 f6243d;

    /* JADX INFO: renamed from: V1 */
    public static Intent m9224V1(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) SurveyAct.class);
        intent.putExtra("surveyId", str);
        return intent;
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public boolean disableAutoPV() {
        return true;
    }

    public void finish() {
        super.finish();
        act().overridePendingTransition(0, rzb0.f20927A);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f6243d.inflateView(layoutInflater, viewGroup);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p000p1.mobile.putong.app.PutongAct
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f6242c = new o4h0(this);
        r4h0 r4h0Var = new r4h0(this);
        this.f6243d = r4h0Var;
        this.f6242c.C(r4h0Var);
        this.f6242c.m20320n0(getIntent().getStringExtra("surveyId"));
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public void initSubscription() {
        super.initSubscription();
        this.f6242c.m20318a0();
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
    }
}
