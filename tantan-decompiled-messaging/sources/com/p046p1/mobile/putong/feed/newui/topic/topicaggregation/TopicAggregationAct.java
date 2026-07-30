package com.p046p1.mobile.putong.feed.newui.topic.topicaggregation;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.data.NavigationIntent;
import com.p046p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumPictureView;
import io.agora.rtc2.internal.AudioRoutingController;
import org.json.JSONObject;
import p149l.a8c0;
import p149l.kjb0;
import p149l.oyi0;
import p149l.p6j0;
import p149l.pyi0;
import p149l.w4i;

/* JADX INFO: loaded from: classes12.dex */
public class TopicAggregationAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public oyi0 f43188c;

    /* JADX INFO: renamed from: d */
    public pyi0 f43189d;

    /* JADX INFO: renamed from: e */
    public JSONObject f43190e;

    /* JADX INFO: renamed from: V1 */
    public static Intent m66081V1(Context context, String str, String str2, boolean z, String str3) {
        Intent intent = new Intent(context, (Class<?>) TopicAggregationAct.class);
        intent.putExtra("topic_id", str);
        intent.putExtra("from", str2);
        if (z) {
            intent.addFlags(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
        }
        intent.putExtra("moment_type", str3);
        return intent;
    }

    /* JADX INFO: renamed from: X1 */
    public static Intent m66082X1(Context context, String str, String str2, boolean z, String str3, String str4) {
        Intent intentM66081V1 = m66081V1(context, str, str2, z, str3);
        intentM66081V1.putExtra("single_topic_moment", str4);
        return intentM66081V1;
    }

    /* JADX INFO: renamed from: Y1 */
    public JSONObject m66083Y1() {
        return this.f43190e;
    }

    /* JADX INFO: renamed from: Z1 */
    public String m66084Z1() {
        return this.f43188c.f146328b;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, p149l.n3m
    public boolean disableAutoPV() {
        return true;
    }

    @Override // com.p046p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void m66873d2() {
        if (!w4i.m201511c()) {
            startActivity(kjb0.m146196g(this, NavigationIntent.get("moment")));
        }
        super.m66873d2();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public int getDefaultThemeResId() {
        return a8c0.f68022k;
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f43189d.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        this.f43189d = new pyi0(this);
        oyi0 oyi0Var = new oyi0(this);
        this.f43188c = oyi0Var;
        oyi0Var.mo51532C(this.f43189d);
        super.initDataOnCreate();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f43188c.mo39470a0();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void onPauseLifecycle() {
        PhotoAlbumPictureView.m63859u(getWindow().getDecorView(), false);
        super.onPauseLifecycle();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_topic_detail";
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        JSONObject jSONObjectM167667a = p6j0.m167667a(p6j0.C19147a.m167678g("topic_detail_source", this.f43188c.m166669g0()), p6j0.C19147a.m167678g("topic_type", this.f43188c.f146330d), p6j0.C19147a.m167678g("topic_id", this.f43188c.f146328b), p6j0.C19147a.m167678g("topic_page_tag", this.f43188c.m166668f0()));
        this.f43190e = jSONObjectM167667a;
        this.pageHelper.m109039o(jSONObjectM167667a);
    }
}
