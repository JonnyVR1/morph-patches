package com.p000p1.mobile.putong.feed.newui.topic.qatopic;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import p007l.hwh;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedQaTopicItem extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public RelativeLayout f4530a;

    /* JADX INFO: renamed from: b */
    public QATopicVoteBgView f4531b;

    /* JADX INFO: renamed from: c */
    public TextView f4532c;

    /* JADX INFO: renamed from: d */
    public VText f4533d;

    /* JADX INFO: renamed from: e */
    public List<FeedQaTopicItem> f4534e;

    public FeedQaTopicItem(@NonNull Context context) {
        super(context);
        this.f4534e = new ArrayList();
        m7106b(context);
    }

    /* JADX INFO: renamed from: a */
    public View m7105a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return hwh.m10733b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: b */
    public final void m7106b(Context context) {
        addView(m7105a(LayoutInflater.from(context), this));
    }

    public FeedQaTopicItem(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4534e = new ArrayList();
        m7106b(context);
    }

    public FeedQaTopicItem(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4534e = new ArrayList();
        m7106b(context);
    }

    public FeedQaTopicItem(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f4534e = new ArrayList();
        m7106b(context);
    }
}
