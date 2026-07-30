package com.p051p1.mobile.putong.feed.newui.topic.qatopic;

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
import p151v.VText;
import p153l.wxh;

/* JADX INFO: loaded from: classes13.dex */
public class FeedQaTopicItem extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public RelativeLayout f43917a;

    /* JADX INFO: renamed from: b */
    public QATopicVoteBgView f43918b;

    /* JADX INFO: renamed from: c */
    public TextView f43919c;

    /* JADX INFO: renamed from: d */
    public VText f43920d;

    /* JADX INFO: renamed from: e */
    public List<FeedQaTopicItem> f43921e;

    public FeedQaTopicItem(@NonNull Context context) {
        super(context);
        this.f43921e = new ArrayList();
        m67137b(context);
    }

    /* JADX INFO: renamed from: a */
    public View m67136a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return wxh.m208413b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: b */
    public final void m67137b(Context context) {
        addView(m67136a(LayoutInflater.from(context), this));
    }

    public FeedQaTopicItem(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f43921e = new ArrayList();
        m67137b(context);
    }

    public FeedQaTopicItem(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f43921e = new ArrayList();
        m67137b(context);
    }

    public FeedQaTopicItem(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f43921e = new ArrayList();
        m67137b(context);
    }
}
