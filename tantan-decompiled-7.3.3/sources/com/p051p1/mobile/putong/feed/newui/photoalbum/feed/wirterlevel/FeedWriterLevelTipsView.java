package com.p051p1.mobile.putong.feed.newui.photoalbum.feed.wirterlevel;

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
import p153l.gci;

/* JADX INFO: loaded from: classes13.dex */
public class FeedWriterLevelTipsView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public LinearLayout f42614a;

    /* JADX INFO: renamed from: b */
    public TextView f42615b;

    /* JADX INFO: renamed from: c */
    public ImageView f42616c;

    public FeedWriterLevelTipsView(@NonNull Context context) {
        super(context);
        m65721b(context);
    }

    /* JADX INFO: renamed from: a */
    public View m65720a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return gci.m129889b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: b */
    public final void m65721b(Context context) {
        addView(m65720a(LayoutInflater.from(context), this));
    }

    public FeedWriterLevelTipsView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m65721b(context);
    }

    public FeedWriterLevelTipsView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m65721b(context);
    }
}
