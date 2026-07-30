package p151v;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.tantanapp.common.utils.CrashHelper;
import p153l.bm50;

/* JADX INFO: loaded from: classes3.dex */
public class VFrame extends FrameLayout {
    private boolean interceptTouchEvent;
    private bm50 onDispatchTouchEventListener;

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
            CrashHelper.m82479c(e);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public bm50 getOnDispatchTouchEventListener() {
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

    public void setOnDispatchTouchEventListener(bm50 bm50Var) {
        this.onDispatchTouchEventListener = bm50Var;
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
