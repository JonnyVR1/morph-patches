package com.p000p1.mobile.putong.feed.newui.group.aggregation.header;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p000p1.mobile.putong.feed.data.TopicMoment;
import l.xdl0;
import p007l.o4h;
import p007l.s7i;
import v.VDraweeView;
import v.VFrame;
import v.VImage;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedGroupAggregationHeaderView extends VFrame {

    /* JADX INFO: renamed from: a */
    public VLinear f1430a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f1431b;

    /* JADX INFO: renamed from: c */
    public TextView f1432c;

    /* JADX INFO: renamed from: d */
    public TextView f1433d;

    /* JADX INFO: renamed from: e */
    public VImage f1434e;

    public FeedGroupAggregationHeaderView(Context context) {
        super(context);
        m2870s(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: s */
    private void m2870s(Context context) {
        addView(m2871p(LayoutInflater.from(context), this));
    }

    /* JADX INFO: renamed from: p */
    public View m2871p(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return o4h.m12444b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: u */
    public void m2872u(TopicMoment topicMoment, String str) {
        xdl0.M(this.f1433d, topicMoment.isTopicAnonymousType());
        if (topicMoment.isEnterGroup()) {
            this.f1432c.setText(topicMoment.name);
        } else {
            this.f1432c.setText(s7i.m14045k(topicMoment.name, 15));
        }
    }

    public FeedGroupAggregationHeaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m2870s(context);
    }

    public FeedGroupAggregationHeaderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m2870s(context);
    }
}
