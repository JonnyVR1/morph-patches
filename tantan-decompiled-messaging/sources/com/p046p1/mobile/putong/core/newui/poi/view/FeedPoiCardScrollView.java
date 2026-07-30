package com.p046p1.mobile.putong.core.newui.poi.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewConfiguration;
import p147v.VScroll;
import p149l.rm4;

/* JADX INFO: loaded from: classes11.dex */
public class FeedPoiCardScrollView extends VScroll implements rm4 {

    /* JADX INFO: renamed from: e */
    public int f26434e;

    public FeedPoiCardScrollView(Context context) {
        super(context);
        m43188c(context);
    }

    @Override // p149l.rm4
    /* JADX INFO: renamed from: a */
    public boolean mo29968a(float f, float f2, float f3, float f4) {
        float f5 = f4 - f2;
        float f6 = f3 - f;
        if (Math.abs(f5) <= this.f26434e || Math.abs(f5) <= Math.abs(f6)) {
            return false;
        }
        return f5 < 0.0f ? canScrollVertically(1) : canScrollVertically(-1);
    }

    /* JADX INFO: renamed from: c */
    public final void m43188c(Context context) {
        int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f26434e = scaledTouchSlop;
        if (scaledTouchSlop > 1) {
            this.f26434e = scaledTouchSlop - 1;
        }
    }

    public FeedPoiCardScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m43188c(context);
    }

    public FeedPoiCardScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m43188c(context);
    }
}
