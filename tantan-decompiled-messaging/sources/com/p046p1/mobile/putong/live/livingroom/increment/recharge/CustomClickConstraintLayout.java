package com.p046p1.mobile.putong.live.livingroom.increment.recharge;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes4.dex */
public class CustomClickConstraintLayout extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public InterfaceC12865a f50865d;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.recharge.CustomClickConstraintLayout$a */
    public interface InterfaceC12865a {
        /* JADX INFO: renamed from: a */
        void mo75119a();
    }

    public CustomClickConstraintLayout(Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        InterfaceC12865a interfaceC12865a = this.f50865d;
        if (interfaceC12865a != null) {
            interfaceC12865a.mo75119a();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void setDispatchListener(InterfaceC12865a interfaceC12865a) {
        this.f50865d = interfaceC12865a;
    }

    public CustomClickConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CustomClickConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
