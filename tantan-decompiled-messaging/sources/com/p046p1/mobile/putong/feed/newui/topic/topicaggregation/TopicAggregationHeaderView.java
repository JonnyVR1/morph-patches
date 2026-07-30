package com.p046p1.mobile.putong.feed.newui.topic.topicaggregation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import p147v.VDraweeView;
import p147v.VText;
import p149l.myi0;
import p149l.t100;
import p149l.xdl0;

/* JADX INFO: loaded from: classes12.dex */
public class TopicAggregationHeaderView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f43191a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f43192b;

    /* JADX INFO: renamed from: c */
    public VText f43193c;

    /* JADX INFO: renamed from: d */
    public VText f43194d;

    public TopicAggregationHeaderView(Context context) {
        super(context);
        m66086b(context);
    }

    /* JADX INFO: renamed from: a */
    public View m66085a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return myi0.m157088b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: b */
    public final void m66086b(Context context) {
        addView(m66085a(LayoutInflater.from(context), this));
        setVisibility(4);
        int iM208412y0 = (int) (((double) (xdl0.m208412y0() - (t100.m186890d(12.0f) * 2))) / 2.4d);
        ViewGroup.LayoutParams layoutParams = this.f43191a.getLayoutParams();
        layoutParams.height = iM208412y0;
        this.f43191a.setLayoutParams(layoutParams);
    }

    public TopicAggregationHeaderView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m66086b(context);
    }

    public TopicAggregationHeaderView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m66086b(context);
    }
}
