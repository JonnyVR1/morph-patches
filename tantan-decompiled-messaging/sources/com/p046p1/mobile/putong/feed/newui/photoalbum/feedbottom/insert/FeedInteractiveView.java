package com.p046p1.mobile.putong.feed.newui.photoalbum.feedbottom.insert;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.feed.data.Interactive;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.data.TopicMoment;
import com.p046p1.mobile.putong.feed.newui.topic.qatopic.QATopicAggregationActivity;
import java.util.ArrayList;
import java.util.List;
import p147v.VLinear;
import p149l.j760;
import p149l.nkg;
import p149l.t100;
import p149l.v8h;
import p149l.vwb;
import p149l.zvf0;

/* JADX INFO: loaded from: classes12.dex */
public class FeedInteractiveView extends VLinear {

    /* JADX INFO: renamed from: c */
    public String f41787c;

    /* JADX INFO: renamed from: d */
    public String f41788d;

    /* JADX INFO: renamed from: e */
    public List<Interactive> f41789e;

    public FeedInteractiveView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: P */
    public View m64570P(Act act, Moment moment, String str, String str2, boolean z, int i) {
        this.f41787c = str2;
        if (!nkg.m159914x()) {
            return null;
        }
        removeAllViews();
        List<Interactive> listM159880g = nkg.m159880g();
        List<TopicMoment> topicList = moment.getTopicList();
        if (vwb.m200296J(listM159880g) || vwb.m200296J(topicList)) {
            return null;
        }
        this.f41789e = new ArrayList();
        loop0: for (TopicMoment topicMoment : topicList) {
            for (Interactive interactive : listM159880g) {
                if (TextUtils.equals(interactive.topic, topicMoment.f39247id)) {
                    this.f41788d = interactive.topic;
                    this.f41789e.add(interactive);
                    break loop0;
                }
            }
        }
        if (vwb.m200296J(this.f41789e)) {
            return null;
        }
        v8h v8hVar = new v8h();
        v8hVar.m197451i(act).m197454l(this.f41789e).m197457o(str2).m197453k(str).m197452j(Boolean.valueOf(z)).m197456n(i);
        return m64571Q(v8hVar);
    }

    /* JADX INFO: renamed from: Q */
    public View m64571Q(v8h v8hVar) {
        if (vwb.m200296J(v8hVar.m197445c()) || (v8hVar.m197443a() instanceof QATopicAggregationActivity)) {
            return null;
        }
        FeedInteractiveFlowView feedInteractiveFlowView = new FeedInteractiveFlowView(v8hVar.m197443a());
        feedInteractiveFlowView.setOnViewRender(v8hVar.m197448f());
        v8hVar.m197455m(t100.m186890d(2.0f));
        feedInteractiveFlowView.m64569u(v8hVar);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(v8hVar.m197447e(), 0, t100.m186890d(16.0f), 0);
        feedInteractiveFlowView.setLayoutParams(layoutParams);
        addView(feedInteractiveFlowView);
        return feedInteractiveFlowView;
    }

    /* JADX INFO: renamed from: R */
    public void m64572R() {
        if (vwb.m200296J(this.f41789e)) {
            return;
        }
        zvf0.m220368A("e_topic_activity_entry", this.f41787c, j760.m140076a("topic_id", this.f41788d));
    }

    public FeedInteractiveView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedInteractiveView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
