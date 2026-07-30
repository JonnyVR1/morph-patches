package com.p051p1.mobile.putong.live.external.page.teenmode;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.external.module.arch.LiveBaseAct;
import io.requery.android.database.sqlite.SQLiteDatabase;
import p137rx.subjects.C22508b;
import p153l.cdu;
import p153l.tbs;
import p153l.vcu;

/* JADX INFO: loaded from: classes9.dex */
public class LiveTeenDialogAct extends LiveBaseAct {

    /* JADX INFO: renamed from: g */
    public static C22508b<Boolean> f47064g = C22508b.m222767b();

    /* JADX INFO: renamed from: c */
    public String f47065c = "";

    /* JADX INFO: renamed from: d */
    public int f47066d;

    /* JADX INFO: renamed from: e */
    public vcu f47067e;

    /* JADX INFO: renamed from: f */
    public cdu f47068f;

    /* JADX INFO: renamed from: X1 */
    public static void m71986X1(String str) {
        Intent intent = new Intent(tbs.f172988a, (Class<?>) LiveTeenDialogAct.class);
        intent.putExtra("page_type", 1);
        intent.putExtra("page_content", str);
        intent.addFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
        tbs.f172988a.startActivity(intent);
    }

    /* JADX INFO: renamed from: Y1 */
    public static void m71987Y1(String str) {
        Intent intent = new Intent(tbs.f172988a, (Class<?>) LiveTeenDialogAct.class);
        intent.putExtra("page_type", 4);
        intent.putExtra("page_content", str);
        intent.addFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
        tbs.f172988a.startActivity(intent);
    }

    @Override // com.p051p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void m68056e2() {
        super.m68056e2();
        overridePendingTransition(0, 0);
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        setTransparentStatusBar();
        return this.f47068f.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f47065c = getIntent().getStringExtra("page_content");
        int intExtra = getIntent().getIntExtra("page_type", 0);
        this.f47066d = intExtra;
        this.f47067e = new vcu(this, this.f47065c, intExtra);
        cdu cduVar = new cdu(this);
        this.f47068f = cduVar;
        this.f47067e.mo52715C(cduVar);
    }

    @Override // com.p051p1.mobile.putong.live.external.module.arch.LiveBaseAct, com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f47067e.mo40473a0();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.f47067e.m200835f0()) {
            super.onBackPressed();
        }
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void onDestroyLifecycle() {
        super.onDestroyLifecycle();
        f47064g.onNext(Boolean.TRUE);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_live_youth_model";
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        setSwipeBackEnable(false);
        this.f47065c = getIntent().getStringExtra("page_content");
        this.f47066d = getIntent().getIntExtra("page_type", 0);
    }
}
