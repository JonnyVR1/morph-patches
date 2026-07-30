package com.p051p1.mobile.putong.live.external.page.fansgroup;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.app.PutongAct;
import p153l.qgg;

/* JADX INFO: loaded from: classes9.dex */
public class FansGroupActivity extends PutongAct {

    /* JADX INFO: renamed from: c */
    public C12732a f46770c;

    /* JADX INFO: renamed from: d */
    public qgg f46771d;

    /* JADX INFO: renamed from: X1 */
    public static Intent m71679X1(Context context) {
        return new Intent(context, (Class<?>) FansGroupActivity.class);
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f46770c.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f46770c = new C12732a(this);
        qgg qggVar = new qgg(this);
        this.f46771d = qggVar;
        qggVar.mo52715C(this.f46770c);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f46771d.mo40473a0();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void onResumeLifecycle() {
        super.onResumeLifecycle();
        this.f46771d.m176465l0();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_live_fanbasegroup_list";
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
    }
}
