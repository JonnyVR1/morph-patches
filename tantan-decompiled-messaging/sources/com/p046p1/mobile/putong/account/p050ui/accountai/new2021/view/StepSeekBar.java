package com.p046p1.mobile.putong.account.p050ui.accountai.new2021.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.appcompat.widget.AppCompatSeekBar;

/* JADX INFO: loaded from: classes9.dex */
public class StepSeekBar extends AppCompatSeekBar {

    /* JADX INFO: renamed from: b */
    public boolean f16428b;

    public StepSeekBar(Context context) {
        super(context);
        this.f16428b = false;
    }

    @Override // android.widget.AbsSeekBar, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f16428b) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public void setTouchEnable(boolean z) {
        this.f16428b = z;
    }

    public StepSeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f16428b = false;
    }

    public StepSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f16428b = false;
    }
}
