package com.p046p1.mobile.putong.feed.newui.topic.vote;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.data.LinkIntent;
import com.p046p1.mobile.putong.data.NavigationIntent;
import io.agora.rtc2.internal.AudioRoutingController;
import p149l.a8c0;
import p149l.k4j0;
import p149l.kjb0;
import p149l.l4j0;
import p149l.p6j0;
import p149l.w4i;

/* JADX INFO: loaded from: classes12.dex */
public class TopicVoteAggregationAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public k4j0 f43265c;

    /* JADX INFO: renamed from: d */
    public l4j0 f43266d;

    /* JADX INFO: renamed from: V1 */
    public static Intent m66171V1(Context context, String str, String str2, String str3) {
        Intent intent = new Intent(context, (Class<?>) TopicVoteAggregationAct.class);
        intent.putExtra("topic_id", str);
        intent.putExtra("topic_owner", str2);
        intent.putExtra("moment_id", str3);
        intent.addFlags(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
        return intent;
    }

    /* JADX INFO: renamed from: X1 */
    public static Intent m66172X1(Context context, String str, String str2, String str3, int i) {
        Intent intent = new Intent(context, (Class<?>) TopicVoteAggregationAct.class);
        intent.putExtra("topic_id", str);
        intent.putExtra("topic_owner", str2);
        intent.putExtra("moment_id", str3);
        intent.putExtra("vote_index", i);
        intent.addFlags(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
        return intent;
    }

    /* JADX INFO: renamed from: Y1 */
    public static Intent m66173Y1(Context context, String str, String str2, String str3, String str4) {
        Intent intentM66171V1 = m66171V1(context, str, str2, str3);
        intentM66171V1.putExtra("from", str4);
        return intentM66171V1;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        this.f43266d.m148448b(motionEvent);
        return super.dispatchTouchEvent(motionEvent);
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
        return this.f43266d.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        this.f43266d = new l4j0(this);
        k4j0 k4j0Var = new k4j0(this);
        this.f43265c = k4j0Var;
        k4j0Var.mo51532C(this.f43266d);
        super.initDataOnCreate();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f43265c.mo39470a0();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_topic_detail";
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        this.pageHelper.m109039o(p6j0.m167667a(p6j0.C19147a.m167678g("topic_type", LinkIntent.vote), p6j0.C19147a.m167678g("topic_detail_source", this.f43265c.m144488e0()), p6j0.C19147a.m167678g("topic_id", this.f43265c.f121099b)));
    }
}
