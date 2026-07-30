package com.p046p1.mobile.putong.core.p053ui.campus;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.app.PutongAct;
import p149l.qde0;
import p149l.rol;
import p149l.wde0;

/* JADX INFO: loaded from: classes10.dex */
public class SelectSchoolAct extends PutongAct implements rol {

    /* JADX INFO: renamed from: c */
    public wde0 f28657c;

    /* JADX INFO: renamed from: d */
    public qde0 f28658d;

    /* JADX INFO: renamed from: V1 */
    public static Intent m44469V1(Context context, boolean z, String str, boolean z2) {
        Intent intent = new Intent(context, (Class<?>) SelectSchoolAct.class);
        if (z2) {
            intent.addFlags(268435456);
            intent.addFlags(524288);
        }
        intent.putExtra("needHighConfidenceJudge", z);
        intent.putExtra("preSelectedSchoolId", str);
        return intent;
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f28657c.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f28657c = new wde0(this);
        qde0 qde0Var = new qde0(this);
        this.f28658d = qde0Var;
        qde0Var.mo51532C(this.f28657c);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f28658d.m174021l0();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.f28657c.m202733v()) {
            return;
        }
        lambda$debugItems$19();
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        this.f28657c.m202727l(menu);
        return true;
    }
}
