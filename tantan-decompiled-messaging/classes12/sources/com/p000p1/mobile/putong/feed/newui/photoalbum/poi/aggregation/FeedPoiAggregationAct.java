package com.p000p1.mobile.putong.feed.newui.photoalbum.poi.aggregation;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p1.mobile.putong.app.PutongAct;
import com.tantanapp.common.utils.NullChecker;
import l.j760;
import l.vwb;
import p007l.qmh;
import p007l.umh;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedPoiAggregationAct extends PutongAct {

    /* JADX INFO: renamed from: e */
    public static String f3739e = "from";

    /* JADX INFO: renamed from: f */
    public static String f3740f = "moment_id";

    /* JADX INFO: renamed from: g */
    public static String f3741g = "hide_nearby_enter_view";

    /* JADX INFO: renamed from: c */
    public qmh f3742c;

    /* JADX INFO: renamed from: d */
    public umh f3743d;

    /* JADX INFO: renamed from: V1 */
    public static Intent m6111V1(Context context, String str, String str2, boolean z) {
        Intent intent = new Intent(context, (Class<?>) FeedPoiAggregationAct.class);
        if (!TextUtils.isEmpty(str)) {
            intent.putExtra(f3739e, str);
        }
        if (!TextUtils.isEmpty(str2)) {
            intent.putExtra(f3740f, str2);
        }
        intent.putExtra(f3741g, z);
        return intent;
    }

    public void finish() {
        super/*com.p1.mobile.android.app.Act*/.finish();
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f3743d.inflateView(layoutInflater, viewGroup);
    }

    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f3743d = new umh(this);
        qmh qmhVar = new qmh(this);
        this.f3742c = qmhVar;
        qmhVar.C(this.f3743d);
    }

    public void initSubscription() {
        super.initSubscription();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 273 && i2 == -1 && NullChecker.b(this.f3743d)) {
            this.f3743d.m15105k();
        }
    }

    public void onBackPressed() {
        super/*androidx.activity.ComponentActivity*/.onBackPressed();
    }

    public String pageId() {
        return "p_poi_detail";
    }

    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        Moment momentM16753w7 = FeedModule.f316d.m16753w7(this.f3742c.f12277b);
        if (NullChecker.a(momentM16753w7) && NullChecker.a(momentM16753w7.location)) {
            ((PutongAct) this).pageHelper.p(new j760[]{vwb.Y("poiname", momentM16753w7.location.name)});
        }
    }
}
