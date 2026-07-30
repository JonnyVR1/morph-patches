package com.p000p1.mobile.putong.core.p004ui.tarot;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class TarotListView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VelocityTracker f6348a;

    /* JADX INFO: renamed from: b */
    public float f6349b;

    /* JADX INFO: renamed from: c */
    public InterfaceC0352a f6350c;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.tarot.TarotListView$a */
    public interface InterfaceC0352a {
        /* JADX INFO: renamed from: a */
        void mo9278a(float f);

        /* JADX INFO: renamed from: b */
        void mo9279b(float f);
    }

    public TarotListView(@NonNull Context context) {
        super(context);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) {
            return false;
        }
        if (!NullChecker.a(this.f6348a)) {
            this.f6348a = VelocityTracker.obtain();
        }
        this.f6348a.addMovement(motionEvent);
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f6349b = motionEvent.getX();
        } else if (action == 1) {
            this.f6348a.computeCurrentVelocity(200);
            if (NullChecker.a(this.f6350c)) {
                this.f6350c.mo9279b(this.f6348a.getXVelocity());
            }
        } else if (action == 2) {
            float x = motionEvent.getX() - this.f6349b;
            this.f6349b = motionEvent.getX();
            if (NullChecker.a(this.f6350c)) {
                this.f6350c.mo9278a(x);
            }
        }
        return true;
    }

    public void setOnScrollListener(InterfaceC0352a interfaceC0352a) {
        this.f6350c = interfaceC0352a;
    }

    public TarotListView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TarotListView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
