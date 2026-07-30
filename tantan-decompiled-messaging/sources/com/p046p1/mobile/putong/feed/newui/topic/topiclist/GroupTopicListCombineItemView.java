package com.p046p1.mobile.putong.feed.newui.topic.topiclist;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.feed.data.TopicMoment;
import p147v.VImage;
import p147v.VLinear;
import p149l.e1c0;
import p149l.f3c0;
import p149l.hnk;
import p149l.s7i;
import p149l.t100;
import p149l.xdl0;

/* JADX INFO: loaded from: classes12.dex */
public class GroupTopicListCombineItemView extends VLinear {

    /* JADX INFO: renamed from: c */
    public TextView f43198c;

    /* JADX INFO: renamed from: d */
    public TextView f43199d;

    /* JADX INFO: renamed from: e */
    public VImage f43200e;

    public GroupTopicListCombineItemView(@NonNull Context context) {
        super(context);
        m66089Q(context);
    }

    /* JADX INFO: renamed from: Q */
    private void m66089Q(Context context) {
        addView(m66090P(LayoutInflater.from(context), this));
    }

    /* JADX INFO: renamed from: P */
    public View m66090P(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return hnk.m131943b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: R */
    public void m66091R(TopicMoment topicMoment) {
        xdl0.m208344M(this.f43199d, topicMoment.isTopicAnonymousType());
        this.f43198c.setText(s7i.m182497k(topicMoment.getTopicNameWithPrefix(), 15));
    }

    /* JADX INFO: renamed from: S */
    public void m66092S() {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(0).getLayoutParams();
        layoutParams.rightMargin = t100.m186890d(10.0f);
        layoutParams.topMargin = t100.m186890d(12.0f);
    }

    /* JADX INFO: renamed from: T */
    public void m66093T() {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(0).getLayoutParams();
        layoutParams.rightMargin = t100.m186890d(8.0f);
        layoutParams.topMargin = t100.m186890d(8.0f);
        getChildAt(0).setPadding(t100.m186890d(16.0f), t100.m186890d(13.0f), t100.m186890d(16.0f), t100.m186890d(13.0f));
        getChildAt(0).setBackgroundResource(f3c0.f94621s4);
        this.f43198c.setTextColor(getResources().getColor(e1c0.f88780e));
        this.f43200e.setImageResource(f3c0.f94420S3);
        xdl0.m208344M(this.f43200e, true);
    }

    public void setViewSelected(boolean z) {
        setSelected(z);
        xdl0.m208344M(this.f43200e, z);
    }

    public void setViewSelectedNoDelete(boolean z) {
        setSelected(z);
        xdl0.m208344M(this.f43200e, false);
    }

    public GroupTopicListCombineItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m66089Q(context);
    }

    public GroupTopicListCombineItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m66089Q(context);
    }
}
