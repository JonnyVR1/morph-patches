package com.p051p1.mobile.putong.feed.newui.photoalbum.feed.personfeedinprofile;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.feed.data.TopicMoment;
import p151v.VLinear;
import p153l.bnl0;
import p153l.f9j0;
import p153l.h9i;
import p153l.k9c0;
import p153l.lbc0;

/* JADX INFO: loaded from: classes13.dex */
public class TopicListItemView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VLinear f42595a;

    /* JADX INFO: renamed from: b */
    public TextView f42596b;

    /* JADX INFO: renamed from: c */
    public TextView f42597c;

    public TopicListItemView(Context context) {
        super(context);
        m65677b(context);
    }

    /* JADX INFO: renamed from: a */
    public View m65676a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return f9j0.m124667b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: b */
    public final void m65677b(Context context) {
        addView(m65676a(LayoutInflater.from(context), this));
    }

    /* JADX INFO: renamed from: c */
    public void m65678c(TopicMoment topicMoment, boolean z) {
        bnl0.m105524M(this.f42597c, topicMoment.isTopicAnonymousType());
        this.f42596b.setText(h9i.m134070k(topicMoment.getTopicNameWithPrefix(), 15));
        VLinear vLinear = this.f42595a;
        if (z) {
            vLinear.setBackgroundResource(lbc0.f131172w5);
            this.f42596b.setTextColor(getContext().getResources().getColor(k9c0.f124521n));
            this.f42596b.getPaint().setFakeBoldText(true);
        } else {
            vLinear.setBackgroundResource(lbc0.f131164v5);
            this.f42596b.setTextColor(getContext().getResources().getColor(k9c0.f124505f));
            this.f42596b.getPaint().setFakeBoldText(false);
        }
    }

    public TopicListItemView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m65677b(context);
    }

    public TopicListItemView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m65677b(context);
    }
}
