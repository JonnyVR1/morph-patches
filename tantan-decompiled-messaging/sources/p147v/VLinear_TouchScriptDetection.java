package p147v;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: classes3.dex */
public class VLinear_TouchScriptDetection extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public static int f209144a;

    public VLinear_TouchScriptDetection(Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (f209144a <= 10 && motionEvent.getPressure() == 0.0f && motionEvent.getXPrecision() == 0.0f && motionEvent.getYPrecision() == 0.0f) {
            f209144a++;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public VLinear_TouchScriptDetection(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VLinear_TouchScriptDetection(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
