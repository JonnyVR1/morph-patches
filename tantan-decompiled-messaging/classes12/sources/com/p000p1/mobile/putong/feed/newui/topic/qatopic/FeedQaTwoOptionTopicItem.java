package com.p000p1.mobile.putong.feed.newui.topic.qatopic;

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
import p007l.jwh;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedQaTwoOptionTopicItem extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public ImageView f4537a;

    /* JADX INFO: renamed from: b */
    public TextView f4538b;

    /* JADX INFO: renamed from: c */
    public TextView f4539c;

    /* JADX INFO: renamed from: d */
    public List<FeedQaTwoOptionTopicItem> f4540d;

    public FeedQaTwoOptionTopicItem(@NonNull Context context) {
        super(context);
        this.f4540d = new ArrayList();
        m7124b(context);
    }

    /* JADX INFO: renamed from: a */
    public View m7123a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return jwh.m11369b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: b */
    public final void m7124b(Context context) {
        addView(m7123a(LayoutInflater.from(context), this));
    }

    public FeedQaTwoOptionTopicItem(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4540d = new ArrayList();
        m7124b(context);
    }

    public FeedQaTwoOptionTopicItem(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4540d = new ArrayList();
        m7124b(context);
    }

    public FeedQaTwoOptionTopicItem(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f4540d = new ArrayList();
        m7124b(context);
    }
}
