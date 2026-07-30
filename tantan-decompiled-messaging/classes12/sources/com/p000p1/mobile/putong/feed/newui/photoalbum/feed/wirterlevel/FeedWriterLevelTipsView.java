package com.p000p1.mobile.putong.feed.newui.photoalbum.feed.wirterlevel;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p007l.rai;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedWriterLevelTipsView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public LinearLayout f3227a;

    /* JADX INFO: renamed from: b */
    public TextView f3228b;

    /* JADX INFO: renamed from: c */
    public ImageView f3229c;

    public FeedWriterLevelTipsView(@NonNull Context context) {
        super(context);
        m5632b(context);
    }

    /* JADX INFO: renamed from: a */
    public View m5631a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return rai.m13891b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: b */
    public final void m5632b(Context context) {
        addView(m5631a(LayoutInflater.from(context), this));
    }

    public FeedWriterLevelTipsView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m5632b(context);
    }

    public FeedWriterLevelTipsView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m5632b(context);
    }
}
