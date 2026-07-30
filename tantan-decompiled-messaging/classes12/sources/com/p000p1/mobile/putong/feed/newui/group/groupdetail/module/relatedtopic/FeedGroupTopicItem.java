package com.p000p1.mobile.putong.feed.newui.group.groupdetail.module.relatedtopic;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.feed.data.TopicMoment;
import l.qib0;
import p007l.u6h;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedGroupTopicItem extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f1585a;

    /* JADX INFO: renamed from: b */
    public TextView f1586b;

    /* JADX INFO: renamed from: c */
    public TextView f1587c;

    public FeedGroupTopicItem(@NonNull Context context) {
        super(context);
        m3029b(context);
    }

    /* JADX INFO: renamed from: a */
    public View m3028a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return u6h.m14774b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: b */
    public final void m3029b(Context context) {
        addView(m3028a(LayoutInflater.from(context), this));
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
    }

    /* JADX INFO: renamed from: c */
    public void m3030c(TopicMoment topicMoment) {
        qib0.G.L0(this.f1585a, topicMoment.headIcon);
        this.f1586b.setText(String.format("#%s", topicMoment.name));
    }

    public FeedGroupTopicItem(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m3029b(context);
    }

    public FeedGroupTopicItem(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m3029b(context);
    }
}
