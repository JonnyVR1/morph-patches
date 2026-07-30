package com.p000p1.mobile.putong.feed.newui.topic.topiclist;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.feed.data.TopicMoment;
import l.xdl0;
import p007l.n440;
import p007l.o440;
import p007l.s7i;
import p007l.u2h;
import v.VImage;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class NewPostSelectedTopicItemView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VLinear f4662c;

    /* JADX INFO: renamed from: d */
    public TextView f4663d;

    /* JADX INFO: renamed from: e */
    public TextView f4664e;

    /* JADX INFO: renamed from: f */
    public VImage f4665f;

    /* JADX INFO: renamed from: g */
    public VLinear f4666g;

    /* JADX INFO: renamed from: h */
    public VImage f4667h;

    /* JADX INFO: renamed from: i */
    public TextView f4668i;

    /* JADX INFO: renamed from: j */
    public TextView f4669j;

    /* JADX INFO: renamed from: k */
    public VImage f4670k;

    public NewPostSelectedTopicItemView(@NonNull Context context) {
        super(context);
        m7246R(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: R */
    private void m7246R(Context context) {
        if (u2h.m14723h()) {
            addView(m7248Q(LayoutInflater.from(context), this));
        } else {
            addView(m7247P(LayoutInflater.from(context), this));
        }
    }

    /* JADX INFO: renamed from: P */
    public View m7247P(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return n440.m12069b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: Q */
    public View m7248Q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return o440.m12442b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: S */
    public void m7249S(TopicMoment topicMoment) {
        if (!u2h.m14723h()) {
            xdl0.M(this.f4669j, topicMoment.isTopicAnonymousType());
            this.f4668i.setText(s7i.m14045k(topicMoment.name, 14));
            return;
        }
        xdl0.M(this.f4664e, topicMoment.isTopicAnonymousType());
        this.f4663d.setText(s7i.m14045k("#" + topicMoment.name, 15));
    }

    public NewPostSelectedTopicItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m7246R(context);
    }

    public NewPostSelectedTopicItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m7246R(context);
    }
}
