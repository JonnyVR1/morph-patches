package com.p051p1.mobile.putong.feed.newui.mediapicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import p151v.VEditText;

/* JADX INFO: loaded from: classes13.dex */
public class EditTextInScrollView extends VEditText {

    /* JADX INFO: renamed from: d */
    public boolean f41125d;

    public EditTextInScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f41125d = false;
    }

    private int getOffsetHeight() {
        int height = getLayout().getHeight();
        int totalPaddingTop = getTotalPaddingTop();
        return ((height + totalPaddingTop) + getTotalPaddingBottom()) - getHeight();
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f41125d = false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.widget.TextView, android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        if (i2 == getOffsetHeight() || i2 == 0) {
            getParent().requestDisallowInterceptTouchEvent(false);
            this.f41125d = true;
        }
    }

    @Override // p151v.VEditText, android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        if (!this.f41125d) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return zOnTouchEvent;
    }

    public EditTextInScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f41125d = false;
    }

    public EditTextInScrollView(Context context) {
        super(context);
        this.f41125d = false;
    }
}
