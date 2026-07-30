package com.p051p1.mobile.putong.feed.newui.topic.qatopic;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import p153l.yxh;

/* JADX INFO: loaded from: classes13.dex */
public class FeedQaTwoOptionTopicItem extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public ImageView f43924a;

    /* JADX INFO: renamed from: b */
    public TextView f43925b;

    /* JADX INFO: renamed from: c */
    public TextView f43926c;

    /* JADX INFO: renamed from: d */
    public List<FeedQaTwoOptionTopicItem> f43927d;

    public FeedQaTwoOptionTopicItem(@NonNull Context context) {
        super(context);
        this.f43927d = new ArrayList();
        m67155b(context);
    }

    /* JADX INFO: renamed from: a */
    public View m67154a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return yxh.m217717b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: b */
    public final void m67155b(Context context) {
        addView(m67154a(LayoutInflater.from(context), this));
    }

    public FeedQaTwoOptionTopicItem(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f43927d = new ArrayList();
        m67155b(context);
    }

    public FeedQaTwoOptionTopicItem(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f43927d = new ArrayList();
        m67155b(context);
    }

    public FeedQaTwoOptionTopicItem(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f43927d = new ArrayList();
        m67155b(context);
    }
}
