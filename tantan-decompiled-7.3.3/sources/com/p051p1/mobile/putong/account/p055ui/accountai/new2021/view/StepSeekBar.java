package com.p051p1.mobile.putong.account.p055ui.accountai.new2021.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.appcompat.widget.AppCompatSeekBar;

/* JADX INFO: loaded from: classes9.dex */
public class StepSeekBar extends AppCompatSeekBar {

    /* JADX INFO: renamed from: b */
    public boolean f17147b;

    public StepSeekBar(Context context) {
        super(context);
        this.f17147b = false;
    }

    @Override // android.widget.AbsSeekBar, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f17147b) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public void setTouchEnable(boolean z) {
        this.f17147b = z;
    }

    public StepSeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f17147b = false;
    }

    public StepSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f17147b = false;
    }
}
