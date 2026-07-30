package com.p051p1.mobile.putong.feed.newui.topic.topiclist;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p151v.VImage;
import p151v.VLinear;
import p153l.k8h;

/* JADX INFO: loaded from: classes13.dex */
public class FeedGroupTopicListCombineItemViewNewUI extends VLinear {

    /* JADX INFO: renamed from: c */
    public VImage f44043c;

    /* JADX INFO: renamed from: d */
    public TextView f44044d;

    /* JADX INFO: renamed from: e */
    public TextView f44045e;

    public FeedGroupTopicListCombineItemViewNewUI(@NonNull Context context) {
        super(context);
        m67270Q(context);
    }

    /* JADX INFO: renamed from: Q */
    private void m67270Q(Context context) {
        addView(m67271P(LayoutInflater.from(context), this));
    }

    /* JADX INFO: renamed from: P */
    public View m67271P(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return k8h.m148711b(this, layoutInflater, viewGroup);
    }

    public FeedGroupTopicListCombineItemViewNewUI(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m67270Q(context);
    }

    public FeedGroupTopicListCombineItemViewNewUI(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m67270Q(context);
    }
}
