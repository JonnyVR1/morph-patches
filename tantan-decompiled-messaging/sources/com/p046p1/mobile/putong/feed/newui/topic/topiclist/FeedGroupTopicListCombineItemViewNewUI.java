package com.p046p1.mobile.putong.feed.newui.topic.topiclist;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p147v.VImage;
import p147v.VLinear;
import p149l.v6h;

/* JADX INFO: loaded from: classes12.dex */
public class FeedGroupTopicListCombineItemViewNewUI extends VLinear {

    /* JADX INFO: renamed from: c */
    public VImage f43195c;

    /* JADX INFO: renamed from: d */
    public TextView f43196d;

    /* JADX INFO: renamed from: e */
    public TextView f43197e;

    public FeedGroupTopicListCombineItemViewNewUI(@NonNull Context context) {
        super(context);
        m66087Q(context);
    }

    /* JADX INFO: renamed from: Q */
    private void m66087Q(Context context) {
        addView(m66088P(LayoutInflater.from(context), this));
    }

    /* JADX INFO: renamed from: P */
    public View m66088P(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return v6h.m197203b(this, layoutInflater, viewGroup);
    }

    public FeedGroupTopicListCombineItemViewNewUI(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m66087Q(context);
    }

    public FeedGroupTopicListCombineItemViewNewUI(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m66087Q(context);
    }
}
