package com.p046p1.mobile.putong.feed.newui.kankan.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p149l.rug;

/* JADX INFO: loaded from: classes12.dex */
public class FeedComicFaceCategoryView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public View f40195a;

    /* JADX INFO: renamed from: b */
    public ImageView f40196b;

    /* JADX INFO: renamed from: c */
    public View f40197c;

    public FeedComicFaceCategoryView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m62116b();
    }

    /* JADX INFO: renamed from: a */
    public View m62115a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return rug.m180870b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: b */
    public final void m62116b() {
        addView(m62115a(LayoutInflater.from(getContext()), this));
    }

    public FeedComicFaceCategoryView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FeedComicFaceCategoryView(@NonNull Context context) {
        this(context, null);
    }
}
