package p028v;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import p003l.tg50;
import p003l.ud50;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class VRelative extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public boolean f12948a;

    /* JADX INFO: renamed from: b */
    public ud50 f12949b;

    /* JADX INFO: renamed from: c */
    public tg50 f12950c;

    public VRelative(Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean zDispatchTouchEvent = false;
        try {
            if (getOnDispatchTouchEventListener() != null && getOnDispatchTouchEventListener().dispatchTouchEvent(motionEvent)) {
                zDispatchTouchEvent = true;
            }
        } catch (IllegalArgumentException e) {
            CrashHelper.c(new IllegalArgumentException("VRelative exception" + e.getMessage(), e));
        }
        if (!zDispatchTouchEvent) {
            zDispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        }
        if (NullChecker.a(this.f12950c)) {
            this.f12950c.mo3519a(zDispatchTouchEvent);
        }
        return zDispatchTouchEvent;
    }

    public ud50 getOnDispatchTouchEventListener() {
        return this.f12949b;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f12948a;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f12948a = onClickListener != null;
        super.setOnClickListener(onClickListener);
    }

    public void setOnDispatchTouchEventListener(ud50 ud50Var) {
        this.f12949b = ud50Var;
    }

    public void setOnTouchEventHandleListener(tg50 tg50Var) {
        this.f12950c = tg50Var;
    }

    @Override // android.view.View
    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.f12948a = onTouchListener != null;
        super.setOnTouchListener(onTouchListener);
    }

    public VRelative(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VRelative(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
