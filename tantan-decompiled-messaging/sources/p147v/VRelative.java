package p147v;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import p149l.tg50;
import p149l.ud50;

/* JADX INFO: loaded from: classes3.dex */
public class VRelative extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public boolean f209323a;

    /* JADX INFO: renamed from: b */
    public ud50 f209324b;

    /* JADX INFO: renamed from: c */
    public tg50 f209325c;

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
            CrashHelper.m81296c(new IllegalArgumentException("VRelative exception" + e.getMessage(), e));
        }
        if (!zDispatchTouchEvent) {
            zDispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        }
        if (NullChecker.m81303a(this.f209325c)) {
            this.f209325c.mo110205a(zDispatchTouchEvent);
        }
        return zDispatchTouchEvent;
    }

    public ud50 getOnDispatchTouchEventListener() {
        return this.f209324b;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f209323a;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f209323a = onClickListener != null;
        super.setOnClickListener(onClickListener);
    }

    public void setOnDispatchTouchEventListener(ud50 ud50Var) {
        this.f209324b = ud50Var;
    }

    public void setOnTouchEventHandleListener(tg50 tg50Var) {
        this.f209325c = tg50Var;
    }

    @Override // android.view.View
    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.f209323a = onTouchListener != null;
        super.setOnTouchListener(onTouchListener);
    }

    public VRelative(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VRelative(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
