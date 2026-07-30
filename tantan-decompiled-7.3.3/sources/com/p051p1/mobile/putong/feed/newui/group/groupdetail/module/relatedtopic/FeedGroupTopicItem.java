package com.p051p1.mobile.putong.feed.newui.group.groupdetail.module.relatedtopic;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.feed.data.TopicMoment;
import p151v.VDraweeView;
import p153l.j8h;
import p153l.uqb0;

/* JADX INFO: loaded from: classes13.dex */
public class FeedGroupTopicItem extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f40972a;

    /* JADX INFO: renamed from: b */
    public TextView f40973b;

    /* JADX INFO: renamed from: c */
    public TextView f40974c;

    public FeedGroupTopicItem(@NonNull Context context) {
        super(context);
        m63231b(context);
    }

    /* JADX INFO: renamed from: a */
    public View m63230a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return j8h.m143835b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: b */
    public final void m63231b(Context context) {
        addView(m63230a(LayoutInflater.from(context), this));
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
    }

    /* JADX INFO: renamed from: c */
    public void m63232c(TopicMoment topicMoment) {
        uqb0.f180374G.m127115L0(this.f40972a, topicMoment.headIcon);
        this.f40973b.setText(String.format("#%s", topicMoment.name));
    }

    public FeedGroupTopicItem(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m63231b(context);
    }

    public FeedGroupTopicItem(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m63231b(context);
    }
}
