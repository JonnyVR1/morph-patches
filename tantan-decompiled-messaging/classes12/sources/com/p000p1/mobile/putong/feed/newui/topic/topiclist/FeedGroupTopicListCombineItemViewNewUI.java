package com.p000p1.mobile.putong.feed.newui.topic.topiclist;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p007l.v6h;
import v.VImage;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedGroupTopicListCombineItemViewNewUI extends VLinear {

    /* JADX INFO: renamed from: c */
    public VImage f4656c;

    /* JADX INFO: renamed from: d */
    public TextView f4657d;

    /* JADX INFO: renamed from: e */
    public TextView f4658e;

    public FeedGroupTopicListCombineItemViewNewUI(@NonNull Context context) {
        super(context);
        m7239Q(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Q */
    private void m7239Q(Context context) {
        addView(m7240P(LayoutInflater.from(context), this));
    }

    /* JADX INFO: renamed from: P */
    public View m7240P(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return v6h.m15344b(this, layoutInflater, viewGroup);
    }

    public FeedGroupTopicListCombineItemViewNewUI(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m7239Q(context);
    }

    public FeedGroupTopicListCombineItemViewNewUI(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m7239Q(context);
    }
}
