package com.p000p1.mobile.putong.live.livingroom.increment.recharge;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class CustomClickConstraintLayout extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public InterfaceC0454a f6907d;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.recharge.CustomClickConstraintLayout$a */
    public interface InterfaceC0454a {
        /* JADX INFO: renamed from: a */
        void mo8735a();
    }

    public CustomClickConstraintLayout(Context context) {
        super(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        InterfaceC0454a interfaceC0454a = this.f6907d;
        if (interfaceC0454a != null) {
            interfaceC0454a.mo8735a();
        }
        return super/*android.view.View*/.dispatchTouchEvent(motionEvent);
    }

    public void setDispatchListener(InterfaceC0454a interfaceC0454a) {
        this.f6907d = interfaceC0454a;
    }

    public CustomClickConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CustomClickConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
