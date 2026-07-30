package com.p000p1.mobile.putong.feed.mln.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import immomo.com.mklibrary.core.base.ui.MKWebView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class PicksWebViewHolder extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public MKWebView f717a;

    public PicksWebViewHolder(@NonNull Context context) {
        super(context);
        m1857a();
    }

    /* JADX INFO: renamed from: a */
    public final void m1857a() {
        MKWebView mKWebView = new MKWebView(getContext());
        this.f717a = mKWebView;
        addView((View) mKWebView, new ViewGroup.LayoutParams(-1, -1));
        setDrawingCacheEnabled(true);
    }

    public PicksWebViewHolder(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m1857a();
    }
}
