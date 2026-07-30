package com.p051p1.mobile.putong.live.livingroom.increment.recharge;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes4.dex */
public class CustomClickConstraintLayout extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public InterfaceC13028a f51713d;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.recharge.CustomClickConstraintLayout$a */
    public interface InterfaceC13028a {
        /* JADX INFO: renamed from: a */
        void mo76302a();
    }

    public CustomClickConstraintLayout(Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        InterfaceC13028a interfaceC13028a = this.f51713d;
        if (interfaceC13028a != null) {
            interfaceC13028a.mo76302a();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void setDispatchListener(InterfaceC13028a interfaceC13028a) {
        this.f51713d = interfaceC13028a;
    }

    public CustomClickConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CustomClickConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
