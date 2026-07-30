package com.p046p1.mobile.putong.feed.newui.topic.qatopic;

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
import p149l.jwh;

/* JADX INFO: loaded from: classes12.dex */
public class FeedQaTwoOptionTopicItem extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public ImageView f43076a;

    /* JADX INFO: renamed from: b */
    public TextView f43077b;

    /* JADX INFO: renamed from: c */
    public TextView f43078c;

    /* JADX INFO: renamed from: d */
    public List<FeedQaTwoOptionTopicItem> f43079d;

    public FeedQaTwoOptionTopicItem(@NonNull Context context) {
        super(context);
        this.f43079d = new ArrayList();
        m65972b(context);
    }

    /* JADX INFO: renamed from: a */
    public View m65971a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return jwh.m143660b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: b */
    public final void m65972b(Context context) {
        addView(m65971a(LayoutInflater.from(context), this));
    }

    public FeedQaTwoOptionTopicItem(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f43079d = new ArrayList();
        m65972b(context);
    }

    public FeedQaTwoOptionTopicItem(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f43079d = new ArrayList();
        m65972b(context);
    }

    public FeedQaTwoOptionTopicItem(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f43079d = new ArrayList();
        m65972b(context);
    }
}
