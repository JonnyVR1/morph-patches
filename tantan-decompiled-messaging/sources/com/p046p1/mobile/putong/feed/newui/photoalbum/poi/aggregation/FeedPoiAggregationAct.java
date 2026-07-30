package com.p046p1.mobile.putong.feed.newui.photoalbum.poi.aggregation;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.tantanapp.common.utils.NullChecker;
import p149l.qmh;
import p149l.umh;
import p149l.vwb;

/* JADX INFO: loaded from: classes12.dex */
public class FeedPoiAggregationAct extends PutongAct {

    /* JADX INFO: renamed from: e */
    public static String f42278e = "from";

    /* JADX INFO: renamed from: f */
    public static String f42279f = "moment_id";

    /* JADX INFO: renamed from: g */
    public static String f42280g = "hide_nearby_enter_view";

    /* JADX INFO: renamed from: c */
    public qmh f42281c;

    /* JADX INFO: renamed from: d */
    public umh f42282d;

    /* JADX INFO: renamed from: V1 */
    public static Intent m65010V1(Context context, String str, String str2, boolean z) {
        Intent intent = new Intent(context, (Class<?>) FeedPoiAggregationAct.class);
        if (!TextUtils.isEmpty(str)) {
            intent.putExtra(f42278e, str);
        }
        if (!TextUtils.isEmpty(str2)) {
            intent.putExtra(f42279f, str2);
        }
        intent.putExtra(f42280g, z);
        return intent;
    }

    @Override // com.p046p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void m44477e2() {
        super.m44477e2();
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f42282d.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f42282d = new umh(this);
        qmh qmhVar = new qmh(this);
        this.f42281c = qmhVar;
        qmhVar.mo51532C(this.f42282d);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 273 && i2 == -1 && NullChecker.m81304b(this.f42282d)) {
            this.f42282d.m194359k();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_poi_detail";
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        Moment momentM209572w7 = FeedModule.f38855d.m209572w7(this.f42281c.f155313b);
        if (NullChecker.m81303a(momentM209572w7) && NullChecker.m81303a(momentM209572w7.location)) {
            this.pageHelper.m109040p(vwb.m200311Y("poiname", momentM209572w7.location.name));
        }
    }
}
