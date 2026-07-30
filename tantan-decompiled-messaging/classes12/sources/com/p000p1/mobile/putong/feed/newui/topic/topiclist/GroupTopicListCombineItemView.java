package com.p000p1.mobile.putong.feed.newui.topic.topiclist;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.feed.data.TopicMoment;
import l.t100;
import l.xdl0;
import p007l.e1c0;
import p007l.f3c0;
import p007l.hnk;
import p007l.s7i;
import v.VImage;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class GroupTopicListCombineItemView extends VLinear {

    /* JADX INFO: renamed from: c */
    public TextView f4659c;

    /* JADX INFO: renamed from: d */
    public TextView f4660d;

    /* JADX INFO: renamed from: e */
    public VImage f4661e;

    public GroupTopicListCombineItemView(@NonNull Context context) {
        super(context);
        m7241Q(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Q */
    private void m7241Q(Context context) {
        addView(m7242P(LayoutInflater.from(context), this));
    }

    /* JADX INFO: renamed from: P */
    public View m7242P(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return hnk.m10681b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: R */
    public void m7243R(TopicMoment topicMoment) {
        xdl0.M(this.f4660d, topicMoment.isTopicAnonymousType());
        this.f4659c.setText(s7i.m14045k(topicMoment.getTopicNameWithPrefix(), 15));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: S */
    public void m7244S() {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(0).getLayoutParams();
        layoutParams.rightMargin = t100.d(10.0f);
        layoutParams.topMargin = t100.d(12.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: T */
    public void m7245T() {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(0).getLayoutParams();
        layoutParams.rightMargin = t100.d(8.0f);
        layoutParams.topMargin = t100.d(8.0f);
        getChildAt(0).setPadding(t100.d(16.0f), t100.d(13.0f), t100.d(16.0f), t100.d(13.0f));
        getChildAt(0).setBackgroundResource(f3c0.f7904s4);
        this.f4659c.setTextColor(getResources().getColor(e1c0.f7136e));
        this.f4661e.setImageResource(f3c0.f7703S3);
        xdl0.M(this.f4661e, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setViewSelected(boolean z) {
        setSelected(z);
        xdl0.M(this.f4661e, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setViewSelectedNoDelete(boolean z) {
        setSelected(z);
        xdl0.M(this.f4661e, false);
    }

    public GroupTopicListCombineItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m7241Q(context);
    }

    public GroupTopicListCombineItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m7241Q(context);
    }
}
