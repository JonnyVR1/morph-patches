package com.p051p1.mobile.putong.feed.newui.topic.topicaggregation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import p151v.VDraweeView;
import p151v.VText;
import p153l.bnl0;
import p153l.q7j0;
import p153l.qa00;

/* JADX INFO: loaded from: classes13.dex */
public class TopicAggregationHeaderView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f44039a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f44040b;

    /* JADX INFO: renamed from: c */
    public VText f44041c;

    /* JADX INFO: renamed from: d */
    public VText f44042d;

    public TopicAggregationHeaderView(Context context) {
        super(context);
        m67269b(context);
    }

    /* JADX INFO: renamed from: a */
    public View m67268a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return q7j0.m175657b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: b */
    public final void m67269b(Context context) {
        addView(m67268a(LayoutInflater.from(context), this));
        setVisibility(4);
        int iM105592y0 = (int) (((double) (bnl0.m105592y0() - (qa00.m175859d(12.0f) * 2))) / 2.4d);
        ViewGroup.LayoutParams layoutParams = this.f44039a.getLayoutParams();
        layoutParams.height = iM105592y0;
        this.f44039a.setLayoutParams(layoutParams);
    }

    public TopicAggregationHeaderView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m67269b(context);
    }

    public TopicAggregationHeaderView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m67269b(context);
    }
}
