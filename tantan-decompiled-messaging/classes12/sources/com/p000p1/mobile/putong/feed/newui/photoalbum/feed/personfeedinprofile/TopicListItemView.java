package com.p000p1.mobile.putong.feed.newui.photoalbum.feed.personfeedinprofile;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.feed.data.TopicMoment;
import l.xdl0;
import p007l.b0j0;
import p007l.e1c0;
import p007l.f3c0;
import p007l.s7i;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class TopicListItemView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VLinear f3208a;

    /* JADX INFO: renamed from: b */
    public TextView f3209b;

    /* JADX INFO: renamed from: c */
    public TextView f3210c;

    public TopicListItemView(Context context) {
        super(context);
        m5585b(context);
    }

    /* JADX INFO: renamed from: a */
    public View m5584a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return b0j0.m8628b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: b */
    public final void m5585b(Context context) {
        addView(m5584a(LayoutInflater.from(context), this));
    }

    /* JADX INFO: renamed from: c */
    public void m5586c(TopicMoment topicMoment, boolean z) {
        xdl0.M(this.f3210c, topicMoment.isTopicAnonymousType());
        this.f3209b.setText(s7i.m14045k(topicMoment.getTopicNameWithPrefix(), 15));
        VLinear vLinear = this.f3208a;
        if (z) {
            vLinear.setBackgroundResource(f3c0.f7937w5);
            this.f3209b.setTextColor(getContext().getResources().getColor(e1c0.f7154n));
            this.f3209b.getPaint().setFakeBoldText(true);
        } else {
            vLinear.setBackgroundResource(f3c0.f7929v5);
            this.f3209b.setTextColor(getContext().getResources().getColor(e1c0.f7138f));
            this.f3209b.getPaint().setFakeBoldText(false);
        }
    }

    public TopicListItemView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m5585b(context);
    }

    public TopicListItemView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m5585b(context);
    }
}
