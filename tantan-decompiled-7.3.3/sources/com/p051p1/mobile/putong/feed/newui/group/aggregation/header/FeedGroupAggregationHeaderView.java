package com.p051p1.mobile.putong.feed.newui.group.aggregation.header;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.feed.data.TopicMoment;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VImage;
import p151v.VLinear;
import p153l.bnl0;
import p153l.d6h;
import p153l.h9i;

/* JADX INFO: loaded from: classes13.dex */
public class FeedGroupAggregationHeaderView extends VFrame {

    /* JADX INFO: renamed from: a */
    public VLinear f40817a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f40818b;

    /* JADX INFO: renamed from: c */
    public TextView f40819c;

    /* JADX INFO: renamed from: d */
    public TextView f40820d;

    /* JADX INFO: renamed from: e */
    public VImage f40821e;

    public FeedGroupAggregationHeaderView(Context context) {
        super(context);
        m63083s(context);
    }

    /* JADX INFO: renamed from: s */
    private void m63083s(Context context) {
        addView(m63084p(LayoutInflater.from(context), this));
    }

    /* JADX INFO: renamed from: p */
    public View m63084p(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return d6h.m114441b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: u */
    public void m63085u(TopicMoment topicMoment, String str) {
        bnl0.m105524M(this.f40820d, topicMoment.isTopicAnonymousType());
        if (topicMoment.isEnterGroup()) {
            this.f40819c.setText(topicMoment.name);
        } else {
            this.f40819c.setText(h9i.m134070k(topicMoment.name, 15));
        }
    }

    public FeedGroupAggregationHeaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m63083s(context);
    }

    public FeedGroupAggregationHeaderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m63083s(context);
    }
}
