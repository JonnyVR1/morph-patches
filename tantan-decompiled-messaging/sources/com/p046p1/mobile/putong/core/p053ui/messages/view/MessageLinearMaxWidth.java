package com.p046p1.mobile.putong.core.p053ui.messages.view;

import android.content.Context;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.exoplayer2.PlaybackException;
import com.tantanapp.common.utils.NullChecker;
import p149l.i9c0;

/* JADX INFO: loaded from: classes4.dex */
public class MessageLinearMaxWidth extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public int f32427a;

    public MessageLinearMaxWidth(Context context) {
        super(context);
        this.f32427a = PlaybackException.CUSTOM_ERROR_CODE_BASE;
        m49934a(null);
    }

    /* JADX INFO: renamed from: a */
    public final void m49934a(AttributeSet attributeSet) {
        new Paint().setAntiAlias(true);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(0);
        setWillNotDraw(false);
        if (NullChecker.m81303a(attributeSet)) {
            getContext().obtainStyledAttributes(attributeSet, i9c0.f112202w).recycle();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), this.f32427a), View.MeasureSpec.getMode(i)), i2);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        super.requestLayout();
    }

    public void setMaxWidth(int i) {
        this.f32427a = i;
    }

    public MessageLinearMaxWidth(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f32427a = PlaybackException.CUSTOM_ERROR_CODE_BASE;
        m49934a(attributeSet);
    }

    public MessageLinearMaxWidth(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f32427a = PlaybackException.CUSTOM_ERROR_CODE_BASE;
        m49934a(attributeSet);
    }
}
