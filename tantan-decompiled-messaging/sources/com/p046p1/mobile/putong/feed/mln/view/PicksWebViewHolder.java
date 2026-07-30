package com.p046p1.mobile.putong.feed.mln.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import immomo.com.mklibrary.core.base.p115ui.MKWebView;

/* JADX INFO: loaded from: classes12.dex */
public class PicksWebViewHolder extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public MKWebView f39256a;

    public PicksWebViewHolder(@NonNull Context context) {
        super(context);
        m60931a();
    }

    /* JADX INFO: renamed from: a */
    public final void m60931a() {
        MKWebView mKWebView = new MKWebView(getContext());
        this.f39256a = mKWebView;
        addView(mKWebView, new ViewGroup.LayoutParams(-1, -1));
        setDrawingCacheEnabled(true);
    }

    public PicksWebViewHolder(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m60931a();
    }
}
