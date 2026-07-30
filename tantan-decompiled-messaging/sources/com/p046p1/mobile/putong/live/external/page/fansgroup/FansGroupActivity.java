package com.p046p1.mobile.putong.live.external.page.fansgroup;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.app.PutongAct;
import p149l.cfg;

/* JADX INFO: loaded from: classes13.dex */
public class FansGroupActivity extends PutongAct {

    /* JADX INFO: renamed from: c */
    public C12569a f45922c;

    /* JADX INFO: renamed from: d */
    public cfg f45923d;

    /* JADX INFO: renamed from: V1 */
    public static Intent m70496V1(Context context) {
        return new Intent(context, (Class<?>) FansGroupActivity.class);
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f45922c.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f45922c = new C12569a(this);
        cfg cfgVar = new cfg(this);
        this.f45923d = cfgVar;
        cfgVar.mo51532C(this.f45922c);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f45923d.mo39470a0();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void onResumeLifecycle() {
        super.onResumeLifecycle();
        this.f45923d.m106543l0();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_live_fanbasegroup_list";
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
    }
}
