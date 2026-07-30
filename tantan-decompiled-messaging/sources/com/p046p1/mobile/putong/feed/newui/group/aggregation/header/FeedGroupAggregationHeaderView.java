package com.p046p1.mobile.putong.feed.newui.group.aggregation.header;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.feed.data.TopicMoment;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VImage;
import p147v.VLinear;
import p149l.o4h;
import p149l.s7i;
import p149l.xdl0;

/* JADX INFO: loaded from: classes12.dex */
public class FeedGroupAggregationHeaderView extends VFrame {

    /* JADX INFO: renamed from: a */
    public VLinear f39969a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f39970b;

    /* JADX INFO: renamed from: c */
    public TextView f39971c;

    /* JADX INFO: renamed from: d */
    public TextView f39972d;

    /* JADX INFO: renamed from: e */
    public VImage f39973e;

    public FeedGroupAggregationHeaderView(Context context) {
        super(context);
        m61900s(context);
    }

    /* JADX INFO: renamed from: s */
    private void m61900s(Context context) {
        addView(m61901p(LayoutInflater.from(context), this));
    }

    /* JADX INFO: renamed from: p */
    public View m61901p(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return o4h.m162575b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: u */
    public void m61902u(TopicMoment topicMoment, String str) {
        xdl0.m208344M(this.f39972d, topicMoment.isTopicAnonymousType());
        if (topicMoment.isEnterGroup()) {
            this.f39971c.setText(topicMoment.name);
        } else {
            this.f39971c.setText(s7i.m182497k(topicMoment.name, 15));
        }
    }

    public FeedGroupAggregationHeaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m61900s(context);
    }

    public FeedGroupAggregationHeaderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m61900s(context);
    }
}
