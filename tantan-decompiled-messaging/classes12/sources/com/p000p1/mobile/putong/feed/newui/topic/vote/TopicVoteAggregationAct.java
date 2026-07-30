package com.p000p1.mobile.putong.feed.newui.topic.vote;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.data.LinkIntent;
import com.p000p1.mobile.putong.data.NavigationIntent;
import com.p1.mobile.putong.app.PutongAct;
import p007l.a8c0;
import p007l.k4j0;
import p007l.kjb0;
import p007l.l4j0;
import p007l.p6j0;
import p007l.w4i;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class TopicVoteAggregationAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public k4j0 f4726c;

    /* JADX INFO: renamed from: d */
    public l4j0 f4727d;

    /* JADX INFO: renamed from: V1 */
    public static Intent m7327V1(Context context, String str, String str2, String str3) {
        Intent intent = new Intent(context, (Class<?>) TopicVoteAggregationAct.class);
        intent.putExtra("topic_id", str);
        intent.putExtra("topic_owner", str2);
        intent.putExtra("moment_id", str3);
        intent.addFlags(67108864);
        return intent;
    }

    /* JADX INFO: renamed from: X1 */
    public static Intent m7328X1(Context context, String str, String str2, String str3, int i) {
        Intent intent = new Intent(context, (Class<?>) TopicVoteAggregationAct.class);
        intent.putExtra("topic_id", str);
        intent.putExtra("topic_owner", str2);
        intent.putExtra("moment_id", str3);
        intent.putExtra("vote_index", i);
        intent.addFlags(67108864);
        return intent;
    }

    /* JADX INFO: renamed from: Y1 */
    public static Intent m7329Y1(Context context, String str, String str2, String str3, String str4) {
        Intent intentM7327V1 = m7327V1(context, str, str2, str3);
        intentM7327V1.putExtra("from", str4);
        return intentM7327V1;
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        this.f4727d.m11553b(motionEvent);
        return super.dispatchTouchEvent(motionEvent);
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
        return this.f4727d.inflateView(layoutInflater, viewGroup);
    }

    public void initDataOnCreate() {
        this.f4727d = new l4j0(this);
        k4j0 k4j0Var = new k4j0(this);
        this.f4726c = k4j0Var;
        k4j0Var.C(this.f4727d);
        super.initDataOnCreate();
    }

    public void initSubscription() {
        super.initSubscription();
        this.f4726c.m11389a0();
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
    }

    public String pageId() {
        return "p_topic_detail";
    }

    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        ((PutongAct) this).pageHelper.o(p6j0.m12911a(p6j0.C2456a.m12922g("topic_type", LinkIntent.vote), p6j0.C2456a.m12922g("topic_detail_source", this.f4726c.m11390e0()), p6j0.C2456a.m12922g("topic_id", this.f4726c.f9605b)));
    }
}
