package com.p051p1.mobile.putong.core.p058ui.campus;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.app.PutongAct;
import io.requery.android.database.sqlite.SQLiteDatabase;
import p153l.bme0;
import p153l.crl;
import p153l.vle0;

/* JADX INFO: loaded from: classes9.dex */
public class SelectSchoolAct extends PutongAct implements crl {

    /* JADX INFO: renamed from: c */
    public bme0 f29505c;

    /* JADX INFO: renamed from: d */
    public vle0 f29506d;

    /* JADX INFO: renamed from: X1 */
    public static Intent m45652X1(Context context, boolean z, String str, boolean z2) {
        Intent intent = new Intent(context, (Class<?>) SelectSchoolAct.class);
        if (z2) {
            intent.addFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
            intent.addFlags(524288);
        }
        intent.putExtra("needHighConfidenceJudge", z);
        intent.putExtra("preSelectedSchoolId", str);
        return intent;
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f29505c.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f29505c = new bme0(this);
        vle0 vle0Var = new vle0(this);
        this.f29506d = vle0Var;
        vle0Var.mo52715C(this.f29505c);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f29506d.m201606l0();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.f29505c.m105051v()) {
            return;
        }
        lambda$debugItems$19();
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        this.f29505c.m105045l(menu);
        return true;
    }
}
