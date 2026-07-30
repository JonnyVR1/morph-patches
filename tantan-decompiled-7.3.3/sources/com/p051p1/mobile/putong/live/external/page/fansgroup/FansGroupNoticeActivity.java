package com.p051p1.mobile.putong.live.external.page.fansgroup;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.app.PutongAct;
import p153l.hgg;
import p153l.igg;

/* JADX INFO: loaded from: classes9.dex */
public class FansGroupNoticeActivity extends PutongAct {

    /* JADX INFO: renamed from: c */
    public igg f46772c;

    /* JADX INFO: renamed from: d */
    public hgg f46773d;

    /* JADX INFO: renamed from: X1 */
    public static Intent m71680X1(Context context) {
        return new Intent(context, (Class<?>) FansGroupNoticeActivity.class);
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f46772c.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f46772c = new igg(this);
        hgg hggVar = new hgg(this);
        this.f46773d = hggVar;
        hggVar.mo52715C(this.f46772c);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f46773d.mo40473a0();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_live_fanbasegroup_notice";
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
    }
}
