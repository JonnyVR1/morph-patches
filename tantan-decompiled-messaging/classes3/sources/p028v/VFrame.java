package p028v;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.tantanapp.common.utils.CrashHelper;
import p003l.ud50;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class VFrame extends FrameLayout {
    private boolean interceptTouchEvent;
    private ud50 onDispatchTouchEventListener;

    public VFrame(Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        try {
            if (getOnDispatchTouchEventListener() != null && getOnDispatchTouchEventListener().dispatchTouchEvent(motionEvent)) {
                return true;
            }
        } catch (IllegalArgumentException e) {
            CrashHelper.c(e);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public ud50 getOnDispatchTouchEventListener() {
        return this.onDispatchTouchEventListener;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.interceptTouchEvent;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.interceptTouchEvent = onClickListener != null;
        super.setOnClickListener(onClickListener);
    }

    public void setOnDispatchTouchEventListener(ud50 ud50Var) {
        this.onDispatchTouchEventListener = ud50Var;
    }

    @Override // android.view.View
    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.interceptTouchEvent = onTouchListener != null;
        super.setOnTouchListener(onTouchListener);
    }

    public VFrame(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VFrame(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
