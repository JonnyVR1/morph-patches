package com.p051p1.mobile.putong.feed.newui.kankan.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p153l.gwg;

/* JADX INFO: loaded from: classes13.dex */
public class FeedComicFaceCategoryView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public View f41043a;

    /* JADX INFO: renamed from: b */
    public ImageView f41044b;

    /* JADX INFO: renamed from: c */
    public View f41045c;

    public FeedComicFaceCategoryView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m63299b();
    }

    /* JADX INFO: renamed from: a */
    public View m63298a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return gwg.m132682b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: b */
    public final void m63299b() {
        addView(m63298a(LayoutInflater.from(getContext()), this));
    }

    public FeedComicFaceCategoryView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FeedComicFaceCategoryView(@NonNull Context context) {
        this(context, null);
    }
}
