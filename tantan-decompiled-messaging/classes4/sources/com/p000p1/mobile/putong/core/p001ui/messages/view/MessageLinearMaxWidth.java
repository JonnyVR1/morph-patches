package com.p000p1.mobile.putong.core.p001ui.messages.view;

import android.content.Context;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.tantanapp.common.utils.NullChecker;
import l.i9c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class MessageLinearMaxWidth extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public int f249a;

    public MessageLinearMaxWidth(Context context) {
        super(context);
        this.f249a = 1000000;
        m356a(null);
    }

    /* JADX INFO: renamed from: a */
    public final void m356a(AttributeSet attributeSet) {
        new Paint().setAntiAlias(true);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(0);
        setWillNotDraw(false);
        if (NullChecker.a(attributeSet)) {
            getContext().obtainStyledAttributes(attributeSet, i9c0.w).recycle();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), this.f249a), View.MeasureSpec.getMode(i)), i2);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        super.requestLayout();
    }

    public void setMaxWidth(int i) {
        this.f249a = i;
    }

    public MessageLinearMaxWidth(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f249a = 1000000;
        m356a(attributeSet);
    }

    public MessageLinearMaxWidth(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f249a = 1000000;
        m356a(attributeSet);
    }
}
