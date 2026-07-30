package com.p051p1.mobile.putong.feed.newui.photoalbum.feedbottom.insert;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.feed.data.Interactive;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.data.TopicMoment;
import com.p051p1.mobile.putong.feed.newui.topic.qatopic.QATopicAggregationActivity;
import java.util.ArrayList;
import java.util.List;
import p151v.VLinear;
import p153l.cmg;
import p153l.i4g0;
import p153l.jyb;
import p153l.kah;
import p153l.pf60;
import p153l.qa00;

/* JADX INFO: loaded from: classes13.dex */
public class FeedInteractiveView extends VLinear {

    /* JADX INFO: renamed from: c */
    public String f42635c;

    /* JADX INFO: renamed from: d */
    public String f42636d;

    /* JADX INFO: renamed from: e */
    public List<Interactive> f42637e;

    public FeedInteractiveView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: P */
    public View m65753P(Act act, Moment moment, String str, String str2, boolean z, int i) {
        this.f42635c = str2;
        if (!cmg.m111243x()) {
            return null;
        }
        removeAllViews();
        List<Interactive> listM111209g = cmg.m111209g();
        List<TopicMoment> topicList = moment.getTopicList();
        if (jyb.m147479J(listM111209g) || jyb.m147479J(topicList)) {
            return null;
        }
        this.f42637e = new ArrayList();
        loop0: for (TopicMoment topicMoment : topicList) {
            for (Interactive interactive : listM111209g) {
                if (TextUtils.equals(interactive.topic, topicMoment.f40095id)) {
                    this.f42636d = interactive.topic;
                    this.f42637e.add(interactive);
                    break loop0;
                }
            }
        }
        if (jyb.m147479J(this.f42637e)) {
            return null;
        }
        kah kahVar = new kah();
        kahVar.m148980i(act).m148983l(this.f42637e).m148986o(str2).m148982k(str).m148981j(Boolean.valueOf(z)).m148985n(i);
        return m65754Q(kahVar);
    }

    /* JADX INFO: renamed from: Q */
    public View m65754Q(kah kahVar) {
        if (jyb.m147479J(kahVar.m148974c()) || (kahVar.m148972a() instanceof QATopicAggregationActivity)) {
            return null;
        }
        FeedInteractiveFlowView feedInteractiveFlowView = new FeedInteractiveFlowView(kahVar.m148972a());
        feedInteractiveFlowView.setOnViewRender(kahVar.m148977f());
        kahVar.m148984m(qa00.m175859d(2.0f));
        feedInteractiveFlowView.m65752u(kahVar);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(kahVar.m148976e(), 0, qa00.m175859d(16.0f), 0);
        feedInteractiveFlowView.setLayoutParams(layoutParams);
        addView(feedInteractiveFlowView);
        return feedInteractiveFlowView;
    }

    /* JADX INFO: renamed from: R */
    public void m65755R() {
        if (jyb.m147479J(this.f42637e)) {
            return;
        }
        i4g0.m138492A("e_topic_activity_entry", this.f42635c, pf60.m172085a("topic_id", this.f42636d));
    }

    public FeedInteractiveView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedInteractiveView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
