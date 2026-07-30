package com.p000p1.mobile.putong.feed.newui.topic.topicaggregation;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.data.NavigationIntent;
import com.p000p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumPictureView;
import com.p1.mobile.putong.app.PutongAct;
import org.json.JSONObject;
import p007l.a8c0;
import p007l.kjb0;
import p007l.oyi0;
import p007l.p6j0;
import p007l.pyi0;
import p007l.w4i;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class TopicAggregationAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public oyi0 f4649c;

    /* JADX INFO: renamed from: d */
    public pyi0 f4650d;

    /* JADX INFO: renamed from: e */
    public JSONObject f4651e;

    /* JADX INFO: renamed from: V1 */
    public static Intent m7233V1(Context context, String str, String str2, boolean z, String str3) {
        Intent intent = new Intent(context, (Class<?>) TopicAggregationAct.class);
        intent.putExtra("topic_id", str);
        intent.putExtra("from", str2);
        if (z) {
            intent.addFlags(67108864);
        }
        intent.putExtra("moment_type", str3);
        return intent;
    }

    /* JADX INFO: renamed from: X1 */
    public static Intent m7234X1(Context context, String str, String str2, boolean z, String str3, String str4) {
        Intent intentM7233V1 = m7233V1(context, str, str2, z, str3);
        intentM7233V1.putExtra("single_topic_moment", str4);
        return intentM7233V1;
    }

    /* JADX INFO: renamed from: Y1 */
    public JSONObject m7235Y1() {
        return this.f4651e;
    }

    /* JADX INFO: renamed from: Z1 */
    public String m7236Z1() {
        return this.f4649c.f11646b;
    }

    public boolean disableAutoPV() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void finish() {
        if (!w4i.m15692c()) {
            startActivity(kjb0.m11455g(this, NavigationIntent.get("moment")));
        }
        super/*com.p1.mobile.android.app.Act*/.finish();
    }

    public int getDefaultThemeResId() {
        return a8c0.f5642k;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f4650d.inflateView(layoutInflater, viewGroup);
    }

    public void initDataOnCreate() {
        this.f4650d = new pyi0(this);
        oyi0 oyi0Var = new oyi0(this);
        this.f4649c = oyi0Var;
        oyi0Var.C(this.f4650d);
        super.initDataOnCreate();
    }

    public void initSubscription() {
        super.initSubscription();
        this.f4649c.m12872a0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onPauseLifecycle() {
        PhotoAlbumPictureView.m4886u(getWindow().getDecorView(), false);
        super.onPauseLifecycle();
    }

    public String pageId() {
        return "p_topic_detail";
    }

    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        JSONObject jSONObjectM12911a = p6j0.m12911a(p6j0.C2456a.m12922g("topic_detail_source", this.f4649c.m12874g0()), p6j0.C2456a.m12922g("topic_type", this.f4649c.f11648d), p6j0.C2456a.m12922g("topic_id", this.f4649c.f11646b), p6j0.C2456a.m12922g("topic_page_tag", this.f4649c.m12873f0()));
        this.f4651e = jSONObjectM12911a;
        ((PutongAct) this).pageHelper.o(jSONObjectM12911a);
    }
}
