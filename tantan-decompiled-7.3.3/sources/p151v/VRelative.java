package p151v;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import p153l.bm50;
import p153l.zo50;

/* JADX INFO: loaded from: classes3.dex */
public class VRelative extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public boolean f210245a;

    /* JADX INFO: renamed from: b */
    public bm50 f210246b;

    /* JADX INFO: renamed from: c */
    public zo50 f210247c;

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
            CrashHelper.m82479c(new IllegalArgumentException("VRelative exception" + e.getMessage(), e));
        }
        if (!zDispatchTouchEvent) {
            zDispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        }
        if (NullChecker.m82486a(this.f210247c)) {
            this.f210247c.mo97574a(zDispatchTouchEvent);
        }
        return zDispatchTouchEvent;
    }

    public bm50 getOnDispatchTouchEventListener() {
        return this.f210246b;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f210245a;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f210245a = onClickListener != null;
        super.setOnClickListener(onClickListener);
    }

    public void setOnDispatchTouchEventListener(bm50 bm50Var) {
        this.f210246b = bm50Var;
    }

    public void setOnTouchEventHandleListener(zo50 zo50Var) {
        this.f210247c = zo50Var;
    }

    @Override // android.view.View
    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.f210245a = onTouchListener != null;
        super.setOnTouchListener(onTouchListener);
    }

    public VRelative(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VRelative(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
