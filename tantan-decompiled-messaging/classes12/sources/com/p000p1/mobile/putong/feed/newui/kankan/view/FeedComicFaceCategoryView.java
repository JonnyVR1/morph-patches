package com.p000p1.mobile.putong.feed.newui.kankan.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p007l.rug;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedComicFaceCategoryView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public View f1656a;

    /* JADX INFO: renamed from: b */
    public ImageView f1657b;

    /* JADX INFO: renamed from: c */
    public View f1658c;

    public FeedComicFaceCategoryView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m3098b();
    }

    /* JADX INFO: renamed from: a */
    public View m3097a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return rug.m13969b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: b */
    public final void m3098b() {
        addView(m3097a(LayoutInflater.from(getContext()), this));
    }

    public FeedComicFaceCategoryView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FeedComicFaceCategoryView(@NonNull Context context) {
        this(context, null);
    }
}
