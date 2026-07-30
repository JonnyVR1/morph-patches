package com.p000p1.mobile.putong.core.newui.poi.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewConfiguration;
import p009l.rm4;
import v.VScroll;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class FeedPoiCardScrollView extends VScroll implements rm4 {

    /* JADX INFO: renamed from: e */
    public int f5212e;

    public FeedPoiCardScrollView(Context context) {
        super(context);
        m7404c(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p009l.rm4
    /* JADX INFO: renamed from: a */
    public boolean mo7403a(float f, float f2, float f3, float f4) {
        float f5 = f4 - f2;
        float f6 = f3 - f;
        if (Math.abs(f5) <= this.f5212e || Math.abs(f5) <= Math.abs(f6)) {
            return false;
        }
        return f5 < 0.0f ? canScrollVertically(1) : canScrollVertically(-1);
    }

    /* JADX INFO: renamed from: c */
    public final void m7404c(Context context) {
        int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f5212e = scaledTouchSlop;
        if (scaledTouchSlop > 1) {
            this.f5212e = scaledTouchSlop - 1;
        }
    }

    public FeedPoiCardScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m7404c(context);
    }

    public FeedPoiCardScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m7404c(context);
    }
}
