package com.p046p1.mobile.putong.feed.newui.mediapicker.post;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.app.PutongAct;
import com.tantanapp.common.utils.NullChecker;
import p149l.g340;
import p149l.uzb0;
import p149l.x240;

/* JADX INFO: loaded from: classes12.dex */
public class NewPostLocationAct extends PutongAct {

    /* JADX INFO: renamed from: e */
    public static String f40645e = "from";

    /* JADX INFO: renamed from: f */
    public static String f40646f = "extra_location";

    /* JADX INFO: renamed from: c */
    public g340 f40647c;

    /* JADX INFO: renamed from: d */
    public x240 f40648d;

    /* JADX INFO: renamed from: V1 */
    public static Intent m62703V1(Context context, String str) {
        return m62704X1(context, str, null);
    }

    /* JADX INFO: renamed from: X1 */
    public static Intent m62704X1(Context context, String str, double[] dArr) {
        Intent intent = new Intent(context, (Class<?>) NewPostLocationAct.class);
        if (!TextUtils.isEmpty(str)) {
            intent.putExtra(f40645e, str);
        }
        if (NullChecker.m81303a(dArr) && dArr.length == 2) {
            intent.putExtra(f40646f, dArr);
        }
        return intent;
    }

    @Override // com.p046p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void m66873d2() {
        super.m66873d2();
        overridePendingTransition(uzb0.f178980e, uzb0.f178985j);
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f40647c.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        this.f40647c = new g340(this);
        x240 x240Var = new x240(this);
        this.f40648d = x240Var;
        x240Var.mo51532C(this.f40647c);
        super.initDataOnCreate();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f40648d.mo39470a0();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void onStopLifecycle() {
        this.f40647c.m124237x();
        super.onStopLifecycle();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_poi_list_pop";
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        this.f40648d.m206832m0();
        super.preCreateView(bundle);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public boolean shouldSwitchToTransparentStatus() {
        return true;
    }
}
