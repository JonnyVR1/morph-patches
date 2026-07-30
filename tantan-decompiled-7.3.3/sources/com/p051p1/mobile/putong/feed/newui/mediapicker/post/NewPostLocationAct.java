package com.p051p1.mobile.putong.feed.newui.mediapicker.post;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.app.PutongAct;
import com.tantanapp.common.utils.NullChecker;
import p153l.a8c0;
import p153l.lb40;
import p153l.ub40;

/* JADX INFO: loaded from: classes13.dex */
public class NewPostLocationAct extends PutongAct {

    /* JADX INFO: renamed from: e */
    public static String f41493e = "from";

    /* JADX INFO: renamed from: f */
    public static String f41494f = "extra_location";

    /* JADX INFO: renamed from: c */
    public ub40 f41495c;

    /* JADX INFO: renamed from: d */
    public lb40 f41496d;

    /* JADX INFO: renamed from: X1 */
    public static Intent m63886X1(Context context, String str) {
        return m63887Y1(context, str, null);
    }

    /* JADX INFO: renamed from: Y1 */
    public static Intent m63887Y1(Context context, String str, double[] dArr) {
        Intent intent = new Intent(context, (Class<?>) NewPostLocationAct.class);
        if (!TextUtils.isEmpty(str)) {
            intent.putExtra(f41493e, str);
        }
        if (NullChecker.m82486a(dArr) && dArr.length == 2) {
            intent.putExtra(f41494f, dArr);
        }
        return intent;
    }

    @Override // com.p051p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void m68056e2() {
        super.m68056e2();
        overridePendingTransition(a8c0.f68905e, a8c0.f68910j);
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f41495c.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        this.f41495c = new ub40(this);
        lb40 lb40Var = new lb40(this);
        this.f41496d = lb40Var;
        lb40Var.mo52715C(this.f41495c);
        super.initDataOnCreate();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f41496d.mo40473a0();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void onStopLifecycle() {
        this.f41495c.m195243x();
        super.onStopLifecycle();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_poi_list_pop";
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        this.f41496d.m153567m0();
        super.preCreateView(bundle);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public boolean shouldSwitchToTransparentStatus() {
        return true;
    }
}
