package com.p051p1.mobile.putong.feed.newui.topic.vote;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.data.LinkIntent;
import com.p051p1.mobile.putong.data.NavigationIntent;
import io.agora.rtc2.internal.AudioRoutingController;
import p153l.fgc0;
import p153l.l6i;
import p153l.odj0;
import p153l.orb0;
import p153l.pdj0;
import p153l.tfj0;

/* JADX INFO: loaded from: classes13.dex */
public class TopicVoteAggregationAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public odj0 f44113c;

    /* JADX INFO: renamed from: d */
    public pdj0 f44114d;

    /* JADX INFO: renamed from: X1 */
    public static Intent m67354X1(Context context, String str, String str2, String str3) {
        Intent intent = new Intent(context, (Class<?>) TopicVoteAggregationAct.class);
        intent.putExtra("topic_id", str);
        intent.putExtra("topic_owner", str2);
        intent.putExtra("moment_id", str3);
        intent.addFlags(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
        return intent;
    }

    /* JADX INFO: renamed from: Y1 */
    public static Intent m67355Y1(Context context, String str, String str2, String str3, int i) {
        Intent intent = new Intent(context, (Class<?>) TopicVoteAggregationAct.class);
        intent.putExtra("topic_id", str);
        intent.putExtra("topic_owner", str2);
        intent.putExtra("moment_id", str3);
        intent.putExtra("vote_index", i);
        intent.addFlags(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
        return intent;
    }

    /* JADX INFO: renamed from: Z1 */
    public static Intent m67356Z1(Context context, String str, String str2, String str3, String str4) {
        Intent intentM67354X1 = m67354X1(context, str, str2, str3);
        intentM67354X1.putExtra("from", str4);
        return intentM67354X1;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        this.f44114d.m171882b(motionEvent);
        return super.dispatchTouchEvent(motionEvent);
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
        return this.f44114d.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        this.f44114d = new pdj0(this);
        odj0 odj0Var = new odj0(this);
        this.f44113c = odj0Var;
        odj0Var.mo52715C(this.f44114d);
        super.initDataOnCreate();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f44113c.mo40473a0();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_topic_detail";
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        this.pageHelper.m152780o(tfj0.m190938a(tfj0.C20302a.m190949g("topic_type", LinkIntent.vote), tfj0.C20302a.m190949g("topic_detail_source", this.f44113c.m167318e0()), tfj0.C20302a.m190949g("topic_id", this.f44113c.f146914b)));
    }
}
