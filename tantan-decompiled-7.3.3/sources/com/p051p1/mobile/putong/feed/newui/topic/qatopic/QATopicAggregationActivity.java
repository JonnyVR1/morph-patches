package com.p051p1.mobile.putong.feed.newui.topic.qatopic;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.android.app.Frag;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.data.NavigationIntent;
import com.p051p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumPictureView;
import io.agora.rtc2.internal.AudioRoutingController;
import org.json.JSONObject;
import p153l.fub0;
import p153l.l6i;
import p153l.orb0;
import p153l.pub0;
import p153l.tfj0;

/* JADX INFO: loaded from: classes13.dex */
public class QATopicAggregationActivity extends PutongAct {

    /* JADX INFO: renamed from: c */
    public fub0 f43933c;

    /* JADX INFO: renamed from: d */
    public pub0 f43934d;

    /* JADX INFO: renamed from: e */
    public JSONObject f43935e;

    /* JADX INFO: renamed from: X1 */
    public static Intent m67158X1(Context context, String str, String str2) {
        Intent intent = new Intent(context, (Class<?>) QATopicAggregationActivity.class);
        intent.putExtra("topic_id", str);
        intent.putExtra("from", str2);
        intent.addFlags(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
        return intent;
    }

    /* JADX INFO: renamed from: Y1 */
    public static Intent m67159Y1(Context context, String str, String str2, String str3) {
        Intent intentM67158X1 = m67158X1(context, str, str2);
        intentM67158X1.putExtra("single_topic_moment", str3);
        return intentM67158X1;
    }

    /* JADX INFO: renamed from: Z1 */
    public JSONObject m67160Z1() {
        return this.f43935e;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, p153l.e6m
    public boolean disableAutoPV() {
        return true;
    }

    @Override // com.p051p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void lambda$debugItems$19() {
        if (!l6i.m153062c()) {
            startActivity(orb0.m168890g(this, NavigationIntent.get("moment")));
        }
        super.lambda$debugItems$19();
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f43934d.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        this.f43934d = new pub0(this);
        fub0 fub0Var = new fub0(this);
        this.f43933c = fub0Var;
        fub0Var.mo52715C(this.f43934d);
        super.initDataOnCreate();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f43933c.mo40473a0();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        Frag frag = (Frag) fragmentManager().m2555h0(R.id.content);
        if (frag instanceof QATopicPhotoAlbumFeedFrag) {
            ((QATopicPhotoAlbumFeedFrag) frag).mo67090o();
        } else {
            super.onBackPressed();
        }
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
        JSONObject jSONObjectM190938a = tfj0.m190938a(tfj0.C20302a.m190949g("topic_detail_source", this.f43933c.m127453g0()), tfj0.C20302a.m190949g("topic_type", "qa"), tfj0.C20302a.m190949g("topic_id", this.f43933c.f100897b));
        this.f43935e = jSONObjectM190938a;
        this.pageHelper.m152780o(jSONObjectM190938a);
    }
}
