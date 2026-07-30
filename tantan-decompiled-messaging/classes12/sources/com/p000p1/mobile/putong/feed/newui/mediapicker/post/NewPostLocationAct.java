package com.p000p1.mobile.putong.feed.newui.mediapicker.post;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.app.PutongAct;
import com.tantanapp.common.utils.NullChecker;
import p007l.g340;
import p007l.uzb0;
import p007l.x240;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class NewPostLocationAct extends PutongAct {

    /* JADX INFO: renamed from: e */
    public static String f2106e = "from";

    /* JADX INFO: renamed from: f */
    public static String f2107f = "extra_location";

    /* JADX INFO: renamed from: c */
    public g340 f2108c;

    /* JADX INFO: renamed from: d */
    public x240 f2109d;

    /* JADX INFO: renamed from: V1 */
    public static Intent m3708V1(Context context, String str) {
        return m3709X1(context, str, null);
    }

    /* JADX INFO: renamed from: X1 */
    public static Intent m3709X1(Context context, String str, double[] dArr) {
        Intent intent = new Intent(context, (Class<?>) NewPostLocationAct.class);
        if (!TextUtils.isEmpty(str)) {
            intent.putExtra(f2106e, str);
        }
        if (NullChecker.a(dArr) && dArr.length == 2) {
            intent.putExtra(f2107f, dArr);
        }
        return intent;
    }

    public void finish() {
        super/*com.p1.mobile.android.app.Act*/.finish();
        overridePendingTransition(uzb0.f13991e, uzb0.f13996j);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f2108c.inflateView(layoutInflater, viewGroup);
    }

    public void initDataOnCreate() {
        this.f2108c = new g340(this);
        x240 x240Var = new x240(this);
        this.f2109d = x240Var;
        x240Var.C(this.f2108c);
        super.initDataOnCreate();
    }

    public void initSubscription() {
        super.initSubscription();
        this.f2109d.a0();
    }

    public void onStopLifecycle() {
        this.f2108c.m10401x();
        super.onStopLifecycle();
    }

    public String pageId() {
        return "p_poi_list_pop";
    }

    public void preCreateView(Bundle bundle) {
        this.f2109d.m15992m0();
        super.preCreateView(bundle);
    }

    public boolean shouldSwitchToTransparentStatus() {
        return true;
    }
}
