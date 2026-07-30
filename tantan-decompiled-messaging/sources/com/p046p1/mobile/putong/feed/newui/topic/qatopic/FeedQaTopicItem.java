package com.p046p1.mobile.putong.feed.newui.topic.qatopic;

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
import p147v.VText;
import p149l.hwh;

/* JADX INFO: loaded from: classes12.dex */
public class FeedQaTopicItem extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public RelativeLayout f43069a;

    /* JADX INFO: renamed from: b */
    public QATopicVoteBgView f43070b;

    /* JADX INFO: renamed from: c */
    public TextView f43071c;

    /* JADX INFO: renamed from: d */
    public VText f43072d;

    /* JADX INFO: renamed from: e */
    public List<FeedQaTopicItem> f43073e;

    public FeedQaTopicItem(@NonNull Context context) {
        super(context);
        this.f43073e = new ArrayList();
        m65954b(context);
    }

    /* JADX INFO: renamed from: a */
    public View m65953a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return hwh.m133246b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: b */
    public final void m65954b(Context context) {
        addView(m65953a(LayoutInflater.from(context), this));
    }

    public FeedQaTopicItem(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f43073e = new ArrayList();
        m65954b(context);
    }

    public FeedQaTopicItem(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f43073e = new ArrayList();
        m65954b(context);
    }

    public FeedQaTopicItem(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f43073e = new ArrayList();
        m65954b(context);
    }
}
