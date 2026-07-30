package com.p000p1.mobile.putong.feed.newui.photoalbum.feedbottom.insert;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.feed.data.Interactive;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.data.TopicMoment;
import com.p000p1.mobile.putong.feed.newui.topic.qatopic.QATopicAggregationActivity;
import com.p1.mobile.android.app.Act;
import java.util.ArrayList;
import java.util.List;
import l.j760;
import l.t100;
import l.vwb;
import l.zvf0;
import p007l.nkg;
import p007l.v8h;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedInteractiveView extends VLinear {

    /* JADX INFO: renamed from: c */
    public String f3248c;

    /* JADX INFO: renamed from: d */
    public String f3249d;

    /* JADX INFO: renamed from: e */
    public List<Interactive> f3250e;

    public FeedInteractiveView(Context context) {
        super(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: P */
    public View m5664P(Act act, Moment moment, String str, String str2, boolean z, int i) {
        this.f3248c = str2;
        if (!nkg.m12273x()) {
            return null;
        }
        removeAllViews();
        List<Interactive> listM12239g = nkg.m12239g();
        List<TopicMoment> topicList = moment.getTopicList();
        if (vwb.J(listM12239g) || vwb.J(topicList)) {
            return null;
        }
        this.f3250e = new ArrayList();
        loop0: for (TopicMoment topicMoment : topicList) {
            for (Interactive interactive : listM12239g) {
                if (TextUtils.equals(interactive.topic, topicMoment.f708id)) {
                    this.f3249d = interactive.topic;
                    this.f3250e.add(interactive);
                    break loop0;
                }
            }
        }
        if (vwb.J(this.f3250e)) {
            return null;
        }
        v8h v8hVar = new v8h();
        v8hVar.m15353i(act).m15356l(this.f3250e).m15359o(str2).m15355k(str).m15354j(Boolean.valueOf(z)).m15358n(i);
        return m5665Q(v8hVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.view.View, com.p1.mobile.putong.feed.newui.photoalbum.feedbottom.insert.FeedInteractiveFlowView] */
    /* JADX INFO: renamed from: Q */
    public View m5665Q(v8h v8hVar) {
        if (vwb.J(v8hVar.m15347c()) || (v8hVar.m15345a() instanceof QATopicAggregationActivity)) {
            return null;
        }
        ?? feedInteractiveFlowView = new FeedInteractiveFlowView(v8hVar.m15345a());
        feedInteractiveFlowView.setOnViewRender(v8hVar.m15350f());
        v8hVar.m15357m(t100.d(2.0f));
        feedInteractiveFlowView.m5663u(v8hVar);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(v8hVar.m15349e(), 0, t100.d(16.0f), 0);
        feedInteractiveFlowView.setLayoutParams(layoutParams);
        addView(feedInteractiveFlowView);
        return feedInteractiveFlowView;
    }

    /* JADX INFO: renamed from: R */
    public void m5666R() {
        if (vwb.J(this.f3250e)) {
            return;
        }
        zvf0.A("e_topic_activity_entry", this.f3248c, new j760[]{j760.a("topic_id", this.f3249d)});
    }

    public FeedInteractiveView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedInteractiveView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
