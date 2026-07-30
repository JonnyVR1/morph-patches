package com.p000p1.mobile.putong.account.p002ui.accountai.new2021.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.appcompat.widget.AppCompatSeekBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class StepSeekBar extends AppCompatSeekBar {

    /* JADX INFO: renamed from: b */
    public boolean f417b;

    public StepSeekBar(Context context) {
        super(context);
        this.f417b = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f417b) {
            return super/*android.view.View*/.onTouchEvent(motionEvent);
        }
        return false;
    }

    public void setTouchEnable(boolean z) {
        this.f417b = z;
    }

    public StepSeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f417b = false;
    }

    public StepSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f417b = false;
    }
}
