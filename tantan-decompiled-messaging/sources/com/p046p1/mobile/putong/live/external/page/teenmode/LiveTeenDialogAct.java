package com.p046p1.mobile.putong.live.external.page.teenmode;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.external.module.arch.LiveBaseAct;
import p133rx.subjects.C22393b;
import p149l.bbu;
import p149l.s9s;
import p149l.uau;

/* JADX INFO: loaded from: classes13.dex */
public class LiveTeenDialogAct extends LiveBaseAct {

    /* JADX INFO: renamed from: g */
    public static C22393b<Boolean> f46216g = C22393b.m221521b();

    /* JADX INFO: renamed from: c */
    public String f46217c = "";

    /* JADX INFO: renamed from: d */
    public int f46218d;

    /* JADX INFO: renamed from: e */
    public uau f46219e;

    /* JADX INFO: renamed from: f */
    public bbu f46220f;

    /* JADX INFO: renamed from: V1 */
    public static void m70803V1(String str) {
        Intent intent = new Intent(s9s.f163227a, (Class<?>) LiveTeenDialogAct.class);
        intent.putExtra("page_type", 1);
        intent.putExtra("page_content", str);
        intent.addFlags(268435456);
        s9s.f163227a.startActivity(intent);
    }

    /* JADX INFO: renamed from: X1 */
    public static void m70804X1(String str) {
        Intent intent = new Intent(s9s.f163227a, (Class<?>) LiveTeenDialogAct.class);
        intent.putExtra("page_type", 4);
        intent.putExtra("page_content", str);
        intent.addFlags(268435456);
        s9s.f163227a.startActivity(intent);
    }

    @Override // com.p046p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void m66873d2() {
        super.m66873d2();
        overridePendingTransition(0, 0);
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        setTransparentStatusBar();
        return this.f46220f.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f46217c = getIntent().getStringExtra("page_content");
        int intExtra = getIntent().getIntExtra("page_type", 0);
        this.f46218d = intExtra;
        this.f46219e = new uau(this, this.f46217c, intExtra);
        bbu bbuVar = new bbu(this);
        this.f46220f = bbuVar;
        this.f46219e.mo51532C(bbuVar);
    }

    @Override // com.p046p1.mobile.putong.live.external.module.arch.LiveBaseAct, com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f46219e.mo39470a0();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.f46219e.m192802f0()) {
            super.onBackPressed();
        }
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void onDestroyLifecycle() {
        super.onDestroyLifecycle();
        f46216g.onNext(Boolean.TRUE);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_live_youth_model";
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        setSwipeBackEnable(false);
        this.f46217c = getIntent().getStringExtra("page_content");
        this.f46218d = getIntent().getIntExtra("page_type", 0);
    }
}
