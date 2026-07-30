package com.p051p1.mobile.putong.feed.newui.photoalbum.poi.aggregation;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.tantanapp.common.utils.NullChecker;
import p153l.foh;
import p153l.joh;
import p153l.jyb;

/* JADX INFO: loaded from: classes13.dex */
public class FeedPoiAggregationAct extends PutongAct {

    /* JADX INFO: renamed from: e */
    public static String f43126e = "from";

    /* JADX INFO: renamed from: f */
    public static String f43127f = "moment_id";

    /* JADX INFO: renamed from: g */
    public static String f43128g = "hide_nearby_enter_view";

    /* JADX INFO: renamed from: c */
    public foh f43129c;

    /* JADX INFO: renamed from: d */
    public joh f43130d;

    /* JADX INFO: renamed from: X1 */
    public static Intent m66193X1(Context context, String str, String str2, boolean z) {
        Intent intent = new Intent(context, (Class<?>) FeedPoiAggregationAct.class);
        if (!TextUtils.isEmpty(str)) {
            intent.putExtra(f43126e, str);
        }
        if (!TextUtils.isEmpty(str2)) {
            intent.putExtra(f43127f, str2);
        }
        intent.putExtra(f43128g, z);
        return intent;
    }

    @Override // com.p051p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void m45660g2() {
        super.m45660g2();
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f43130d.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f43130d = new joh(this);
        foh fohVar = new foh(this);
        this.f43129c = fohVar;
        fohVar.mo52715C(this.f43130d);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 273 && i2 == -1 && NullChecker.m82487b(this.f43130d)) {
            this.f43130d.m146455k();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_poi_detail";
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        Moment momentM145813w7 = FeedModule.f39703d.m145813w7(this.f43129c.f100058b);
        if (NullChecker.m82486a(momentM145813w7) && NullChecker.m82486a(momentM145813w7.location)) {
            this.pageHelper.m152781p(jyb.m147494Y("poiname", momentM145813w7.location.name));
        }
    }
}
