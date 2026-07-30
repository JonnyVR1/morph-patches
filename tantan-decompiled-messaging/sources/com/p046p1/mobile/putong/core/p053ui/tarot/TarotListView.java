package com.p046p1.mobile.putong.core.p053ui.tarot;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes9.dex */
public class TarotListView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VelocityTracker f36567a;

    /* JADX INFO: renamed from: b */
    public float f36568b;

    /* JADX INFO: renamed from: c */
    public InterfaceC8916a f36569c;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.tarot.TarotListView$a */
    public interface InterfaceC8916a {
        /* JADX INFO: renamed from: a */
        void mo44834a(float f);

        /* JADX INFO: renamed from: b */
        void mo44835b(float f);
    }

    public TarotListView(@NonNull Context context) {
        super(context);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) {
            return false;
        }
        if (!NullChecker.m81303a(this.f36567a)) {
            this.f36567a = VelocityTracker.obtain();
        }
        this.f36567a.addMovement(motionEvent);
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f36568b = motionEvent.getX();
        } else if (action == 1) {
            this.f36567a.computeCurrentVelocity(200);
            if (NullChecker.m81303a(this.f36569c)) {
                this.f36569c.mo44835b(this.f36567a.getXVelocity());
            }
        } else if (action == 2) {
            float x = motionEvent.getX() - this.f36568b;
            this.f36568b = motionEvent.getX();
            if (NullChecker.m81303a(this.f36569c)) {
                this.f36569c.mo44834a(x);
            }
        }
        return true;
    }

    public void setOnScrollListener(InterfaceC8916a interfaceC8916a) {
        this.f36569c = interfaceC8916a;
    }

    public TarotListView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TarotListView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
