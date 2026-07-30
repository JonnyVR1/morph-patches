package com.p046p1.mobile.putong.live.base.webview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.p046p1.mobile.putong.app.web.WebViewX;

/* JADX INFO: loaded from: classes13.dex */
public class SelfTouchWebView extends WebViewX {
    public SelfTouchWebView(Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        super.onInterceptTouchEvent(motionEvent);
        getParent().requestDisallowInterceptTouchEvent(true);
        return true;
    }

    public SelfTouchWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public SelfTouchWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
