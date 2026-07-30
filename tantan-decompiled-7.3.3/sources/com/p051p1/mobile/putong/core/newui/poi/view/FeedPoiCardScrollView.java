package com.p051p1.mobile.putong.core.newui.poi.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewConfiguration;
import p151v.VScroll;
import p153l.qn4;

/* JADX INFO: loaded from: classes11.dex */
public class FeedPoiCardScrollView extends VScroll implements qn4 {

    /* JADX INFO: renamed from: e */
    public int f27176e;

    public FeedPoiCardScrollView(Context context) {
        super(context);
        m44199c(context);
    }

    @Override // p153l.qn4
    /* JADX INFO: renamed from: a */
    public boolean mo30966a(float f, float f2, float f3, float f4) {
        float f5 = f4 - f2;
        float f6 = f3 - f;
        if (Math.abs(f5) <= this.f27176e || Math.abs(f5) <= Math.abs(f6)) {
            return false;
        }
        return f5 < 0.0f ? canScrollVertically(1) : canScrollVertically(-1);
    }

    /* JADX INFO: renamed from: c */
    public final void m44199c(Context context) {
        int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f27176e = scaledTouchSlop;
        if (scaledTouchSlop > 1) {
            this.f27176e = scaledTouchSlop - 1;
        }
    }

    public FeedPoiCardScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m44199c(context);
    }

    public FeedPoiCardScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m44199c(context);
    }
}
