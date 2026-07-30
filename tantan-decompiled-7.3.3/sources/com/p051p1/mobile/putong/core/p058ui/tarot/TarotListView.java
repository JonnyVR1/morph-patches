package com.p051p1.mobile.putong.core.p058ui.tarot;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes12.dex */
public class TarotListView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VelocityTracker f37415a;

    /* JADX INFO: renamed from: b */
    public float f37416b;

    /* JADX INFO: renamed from: c */
    public InterfaceC9079a f37417c;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.tarot.TarotListView$a */
    public interface InterfaceC9079a {
        /* JADX INFO: renamed from: a */
        void mo46017a(float f);

        /* JADX INFO: renamed from: b */
        void mo46018b(float f);
    }

    public TarotListView(@NonNull Context context) {
        super(context);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) {
            return false;
        }
        if (!NullChecker.m82486a(this.f37415a)) {
            this.f37415a = VelocityTracker.obtain();
        }
        this.f37415a.addMovement(motionEvent);
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f37416b = motionEvent.getX();
        } else if (action == 1) {
            this.f37415a.computeCurrentVelocity(200);
            if (NullChecker.m82486a(this.f37417c)) {
                this.f37417c.mo46018b(this.f37415a.getXVelocity());
            }
        } else if (action == 2) {
            float x = motionEvent.getX() - this.f37416b;
            this.f37416b = motionEvent.getX();
            if (NullChecker.m82486a(this.f37417c)) {
                this.f37417c.mo46017a(x);
            }
        }
        return true;
    }

    public void setOnScrollListener(InterfaceC9079a interfaceC9079a) {
        this.f37417c = interfaceC9079a;
    }

    public TarotListView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TarotListView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
