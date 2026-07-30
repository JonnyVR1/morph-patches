package com.p000p1.mobile.putong.feed.newui.mediapicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import v.VEditText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class EditTextInScrollView extends VEditText {

    /* JADX INFO: renamed from: d */
    public boolean f1738d;

    public EditTextInScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1738d = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private int getOffsetHeight() {
        int height = getLayout().getHeight();
        int totalPaddingTop = getTotalPaddingTop();
        return ((height + totalPaddingTop) + getTotalPaddingBottom()) - getHeight();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f1738d = false;
        }
        return super/*android.view.View*/.dispatchTouchEvent(motionEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super/*android.view.View*/.onScrollChanged(i, i2, i3, i4);
        if (i2 == getOffsetHeight() || i2 == 0) {
            getParent().requestDisallowInterceptTouchEvent(false);
            this.f1738d = true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        if (!this.f1738d) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return zOnTouchEvent;
    }

    public EditTextInScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1738d = false;
    }

    public EditTextInScrollView(Context context) {
        super(context);
        this.f1738d = false;
    }
}
