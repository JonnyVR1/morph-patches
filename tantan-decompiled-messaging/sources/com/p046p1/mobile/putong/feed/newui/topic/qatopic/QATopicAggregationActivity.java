package com.p046p1.mobile.putong.feed.newui.topic.qatopic;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.android.app.Frag;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.data.NavigationIntent;
import com.p046p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumPictureView;
import io.agora.rtc2.internal.AudioRoutingController;
import org.json.JSONObject;
import p149l.bmb0;
import p149l.kjb0;
import p149l.lmb0;
import p149l.p6j0;
import p149l.w4i;

/* JADX INFO: loaded from: classes12.dex */
public class QATopicAggregationActivity extends PutongAct {

    /* JADX INFO: renamed from: c */
    public bmb0 f43085c;

    /* JADX INFO: renamed from: d */
    public lmb0 f43086d;

    /* JADX INFO: renamed from: e */
    public JSONObject f43087e;

    /* JADX INFO: renamed from: V1 */
    public static Intent m65975V1(Context context, String str, String str2) {
        Intent intent = new Intent(context, (Class<?>) QATopicAggregationActivity.class);
        intent.putExtra("topic_id", str);
        intent.putExtra("from", str2);
        intent.addFlags(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
        return intent;
    }

    /* JADX INFO: renamed from: X1 */
    public static Intent m65976X1(Context context, String str, String str2, String str3) {
        Intent intentM65975V1 = m65975V1(context, str, str2);
        intentM65975V1.putExtra("single_topic_moment", str3);
        return intentM65975V1;
    }

    /* JADX INFO: renamed from: Y1 */
    public JSONObject m65977Y1() {
        return this.f43087e;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, p149l.n3m
    public boolean disableAutoPV() {
        return true;
    }

    @Override // com.p046p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void lambda$debugItems$19() {
        if (!w4i.m201511c()) {
            startActivity(kjb0.m146196g(this, NavigationIntent.get("moment")));
        }
        super.lambda$debugItems$19();
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f43086d.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        this.f43086d = new lmb0(this);
        bmb0 bmb0Var = new bmb0(this);
        this.f43085c = bmb0Var;
        bmb0Var.mo51532C(this.f43086d);
        super.initDataOnCreate();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f43085c.mo39470a0();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        Frag frag = (Frag) fragmentManager().m2554h0(R.id.content);
        if (frag instanceof QATopicPhotoAlbumFeedFrag) {
            ((QATopicPhotoAlbumFeedFrag) frag).mo65907o();
        } else {
            super.onBackPressed();
        }
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
        JSONObject jSONObjectM167667a = p6j0.m167667a(p6j0.C19147a.m167678g("topic_detail_source", this.f43085c.m102620g0()), p6j0.C19147a.m167678g("topic_type", "qa"), p6j0.C19147a.m167678g("topic_id", this.f43085c.f76258b));
        this.f43087e = jSONObjectM167667a;
        this.pageHelper.m109039o(jSONObjectM167667a);
    }
}
