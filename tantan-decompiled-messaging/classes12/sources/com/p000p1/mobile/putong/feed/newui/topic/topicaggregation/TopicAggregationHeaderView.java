package com.p000p1.mobile.putong.feed.newui.topic.topicaggregation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import l.t100;
import l.xdl0;
import p007l.myi0;
import v.VDraweeView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class TopicAggregationHeaderView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f4652a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f4653b;

    /* JADX INFO: renamed from: c */
    public VText f4654c;

    /* JADX INFO: renamed from: d */
    public VText f4655d;

    public TopicAggregationHeaderView(Context context) {
        super(context);
        m7238b(context);
    }

    /* JADX INFO: renamed from: a */
    public View m7237a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return myi0.m12063b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: b */
    public final void m7238b(Context context) {
        addView(m7237a(LayoutInflater.from(context), this));
        setVisibility(4);
        int iY0 = (int) (((double) (xdl0.y0() - (t100.d(12.0f) * 2))) / 2.4d);
        ViewGroup.LayoutParams layoutParams = this.f4652a.getLayoutParams();
        layoutParams.height = iY0;
        this.f4652a.setLayoutParams(layoutParams);
    }

    public TopicAggregationHeaderView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m7238b(context);
    }

    public TopicAggregationHeaderView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m7238b(context);
    }
}
