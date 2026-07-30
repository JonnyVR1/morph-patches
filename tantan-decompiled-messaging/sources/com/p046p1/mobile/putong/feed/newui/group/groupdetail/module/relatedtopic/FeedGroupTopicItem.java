package com.p046p1.mobile.putong.feed.newui.group.groupdetail.module.relatedtopic;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.feed.data.TopicMoment;
import p147v.VDraweeView;
import p149l.qib0;
import p149l.u6h;

/* JADX INFO: loaded from: classes12.dex */
public class FeedGroupTopicItem extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f40124a;

    /* JADX INFO: renamed from: b */
    public TextView f40125b;

    /* JADX INFO: renamed from: c */
    public TextView f40126c;

    public FeedGroupTopicItem(@NonNull Context context) {
        super(context);
        m62048b(context);
    }

    /* JADX INFO: renamed from: a */
    public View m62047a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return u6h.m191977b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: b */
    public final void m62048b(Context context) {
        addView(m62047a(LayoutInflater.from(context), this));
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
    }

    /* JADX INFO: renamed from: c */
    public void m62049c(TopicMoment topicMoment) {
        qib0.f154691G.m102331L0(this.f40124a, topicMoment.headIcon);
        this.f40125b.setText(String.format("#%s", topicMoment.name));
    }

    public FeedGroupTopicItem(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m62048b(context);
    }

    public FeedGroupTopicItem(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m62048b(context);
    }
}
