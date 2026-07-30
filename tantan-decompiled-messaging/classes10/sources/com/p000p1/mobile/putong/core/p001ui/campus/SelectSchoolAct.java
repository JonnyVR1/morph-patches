package com.p000p1.mobile.putong.core.p001ui.campus;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.app.PutongAct;
import l.rol;
import p003l.qde0;
import p003l.wde0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class SelectSchoolAct extends PutongAct implements rol {

    /* JADX INFO: renamed from: c */
    public wde0 f1051c;

    /* JADX INFO: renamed from: d */
    public qde0 f1052d;

    /* JADX INFO: renamed from: V1 */
    public static Intent m1768V1(Context context, boolean z, String str, boolean z2) {
        Intent intent = new Intent(context, (Class<?>) SelectSchoolAct.class);
        if (z2) {
            intent.addFlags(268435456);
            intent.addFlags(524288);
        }
        intent.putExtra("needHighConfidenceJudge", z);
        intent.putExtra("preSelectedSchoolId", str);
        return intent;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f1051c.inflateView(layoutInflater, viewGroup);
    }

    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f1051c = new wde0(this);
        qde0 qde0Var = new qde0(this);
        this.f1052d = qde0Var;
        qde0Var.C(this.f1051c);
    }

    public void initSubscription() {
        super.initSubscription();
        this.f1052d.m8964l0();
    }

    public void onBackPressed() {
        if (this.f1051c.m10489v()) {
            return;
        }
        finish();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        this.f1051c.m10483l(menu);
        return true;
    }
}
