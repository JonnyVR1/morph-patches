package com.p046p1.mobile.putong.feed.newui.photoalbum.feed.personfeedinprofile;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.feed.data.TopicMoment;
import p147v.VLinear;
import p149l.b0j0;
import p149l.e1c0;
import p149l.f3c0;
import p149l.s7i;
import p149l.xdl0;

/* JADX INFO: loaded from: classes12.dex */
public class TopicListItemView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VLinear f41747a;

    /* JADX INFO: renamed from: b */
    public TextView f41748b;

    /* JADX INFO: renamed from: c */
    public TextView f41749c;

    public TopicListItemView(Context context) {
        super(context);
        m64494b(context);
    }

    /* JADX INFO: renamed from: a */
    public View m64493a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return b0j0.m99781b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: b */
    public final void m64494b(Context context) {
        addView(m64493a(LayoutInflater.from(context), this));
    }

    /* JADX INFO: renamed from: c */
    public void m64495c(TopicMoment topicMoment, boolean z) {
        xdl0.m208344M(this.f41749c, topicMoment.isTopicAnonymousType());
        this.f41748b.setText(s7i.m182497k(topicMoment.getTopicNameWithPrefix(), 15));
        VLinear vLinear = this.f41747a;
        if (z) {
            vLinear.setBackgroundResource(f3c0.f94654w5);
            this.f41748b.setTextColor(getContext().getResources().getColor(e1c0.f88798n));
            this.f41748b.getPaint().setFakeBoldText(true);
        } else {
            vLinear.setBackgroundResource(f3c0.f94646v5);
            this.f41748b.setTextColor(getContext().getResources().getColor(e1c0.f88782f));
            this.f41748b.getPaint().setFakeBoldText(false);
        }
    }

    public TopicListItemView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m64494b(context);
    }

    public TopicListItemView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m64494b(context);
    }
}
