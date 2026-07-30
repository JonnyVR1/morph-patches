package p153l;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: classes6.dex */
public final class ohy0 implements View.OnTouchListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ xuy0 f147500a;

    public ohy0(xuy0 xuy0Var) {
        this.f147500a = xuy0Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        xuy0 xuy0Var = this.f147500a;
        if (xuy0Var.f196341h == null) {
            return false;
        }
        xuy0Var.f196341h.m199148d(motionEvent);
        return false;
    }
}
