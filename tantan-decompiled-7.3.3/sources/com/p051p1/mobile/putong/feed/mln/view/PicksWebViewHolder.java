package com.p051p1.mobile.putong.feed.mln.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.hellogroup.p036mk.business.base.p037ui.MKWebView;

/* JADX INFO: loaded from: classes13.dex */
public class PicksWebViewHolder extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public MKWebView f40104a;

    public PicksWebViewHolder(@NonNull Context context) {
        super(context);
        m62115a();
    }

    /* JADX INFO: renamed from: a */
    public final void m62115a() {
        MKWebView mKWebView = new MKWebView(getContext());
        this.f40104a = mKWebView;
        addView(mKWebView, new ViewGroup.LayoutParams(-1, -1));
        setDrawingCacheEnabled(true);
    }

    public PicksWebViewHolder(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m62115a();
    }
}
