package com.p046p1.mobile.putong.feed.newui.topic.topiclist;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.feed.data.TopicMoment;
import p147v.VImage;
import p147v.VLinear;
import p149l.n440;
import p149l.o440;
import p149l.s7i;
import p149l.u2h;
import p149l.xdl0;

/* JADX INFO: loaded from: classes12.dex */
public class NewPostSelectedTopicItemView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VLinear f43201c;

    /* JADX INFO: renamed from: d */
    public TextView f43202d;

    /* JADX INFO: renamed from: e */
    public TextView f43203e;

    /* JADX INFO: renamed from: f */
    public VImage f43204f;

    /* JADX INFO: renamed from: g */
    public VLinear f43205g;

    /* JADX INFO: renamed from: h */
    public VImage f43206h;

    /* JADX INFO: renamed from: i */
    public TextView f43207i;

    /* JADX INFO: renamed from: j */
    public TextView f43208j;

    /* JADX INFO: renamed from: k */
    public VImage f43209k;

    public NewPostSelectedTopicItemView(@NonNull Context context) {
        super(context);
        m66094R(context);
    }

    /* JADX INFO: renamed from: R */
    private void m66094R(Context context) {
        if (u2h.m191499h()) {
            addView(m66096Q(LayoutInflater.from(context), this));
        } else {
            addView(m66095P(LayoutInflater.from(context), this));
        }
    }

    /* JADX INFO: renamed from: P */
    public View m66095P(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return n440.m157797b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: Q */
    public View m66096Q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return o440.m162546b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: S */
    public void m66097S(TopicMoment topicMoment) {
        if (!u2h.m191499h()) {
            xdl0.m208344M(this.f43208j, topicMoment.isTopicAnonymousType());
            this.f43207i.setText(s7i.m182497k(topicMoment.name, 14));
            return;
        }
        xdl0.m208344M(this.f43203e, topicMoment.isTopicAnonymousType());
        this.f43202d.setText(s7i.m182497k("#" + topicMoment.name, 15));
    }

    public NewPostSelectedTopicItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m66094R(context);
    }

    public NewPostSelectedTopicItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m66094R(context);
    }
}
