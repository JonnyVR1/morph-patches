package com.p051p1.mobile.putong.feed.newui.topic.topicaggregation;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.data.NavigationIntent;
import com.p051p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumPictureView;
import io.agora.rtc2.internal.AudioRoutingController;
import org.json.JSONObject;
import p153l.fgc0;
import p153l.l6i;
import p153l.orb0;
import p153l.s7j0;
import p153l.t7j0;
import p153l.tfj0;

/* JADX INFO: loaded from: classes13.dex */
public class TopicAggregationAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public s7j0 f44036c;

    /* JADX INFO: renamed from: d */
    public t7j0 f44037d;

    /* JADX INFO: renamed from: e */
    public JSONObject f44038e;

    /* JADX INFO: renamed from: X1 */
    public static Intent m67264X1(Context context, String str, String str2, boolean z, String str3) {
        Intent intent = new Intent(context, (Class<?>) TopicAggregationAct.class);
        intent.putExtra("topic_id", str);
        intent.putExtra("from", str2);
        if (z) {
            intent.addFlags(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
        }
        intent.putExtra("moment_type", str3);
        return intent;
    }

    /* JADX INFO: renamed from: Y1 */
    public static Intent m67265Y1(Context context, String str, String str2, boolean z, String str3, String str4) {
        Intent intentM67264X1 = m67264X1(context, str, str2, z, str3);
        intentM67264X1.putExtra("single_topic_moment", str4);
        return intentM67264X1;
    }

    /* JADX INFO: renamed from: Z1 */
    public JSONObject m67266Z1() {
        return this.f44038e;
    }

    /* JADX INFO: renamed from: a2 */
    public String m67267a2() {
        return this.f44036c.f166694b;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, p153l.e6m
    public boolean disableAutoPV() {
        return true;
    }

    @Override // com.p051p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void m68056e2() {
        if (!l6i.m153062c()) {
            startActivity(orb0.m168890g(this, NavigationIntent.get("moment")));
        }
        super.m68056e2();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public int getDefaultThemeResId() {
        return fgc0.f98908k;
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f44037d.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        this.f44037d = new t7j0(this);
        s7j0 s7j0Var = new s7j0(this);
        this.f44036c = s7j0Var;
        s7j0Var.mo52715C(this.f44037d);
        super.initDataOnCreate();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f44036c.mo40473a0();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void onPauseLifecycle() {
        PhotoAlbumPictureView.m65042u(getWindow().getDecorView(), false);
        super.onPauseLifecycle();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_topic_detail";
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        JSONObject jSONObjectM190938a = tfj0.m190938a(tfj0.C20302a.m190949g("topic_detail_source", this.f44036c.m185013g0()), tfj0.C20302a.m190949g("topic_type", this.f44036c.f166696d), tfj0.C20302a.m190949g("topic_id", this.f44036c.f166694b), tfj0.C20302a.m190949g("topic_page_tag", this.f44036c.m185012f0()));
        this.f44038e = jSONObjectM190938a;
        this.pageHelper.m152780o(jSONObjectM190938a);
    }
}
