package p149l;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: classes6.dex */
public final class i8y0 implements View.OnTouchListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ rly0 f112083a;

    public i8y0(rly0 rly0Var) {
        this.f112083a = rly0Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        rly0 rly0Var = this.f112083a;
        if (rly0Var.f160046h == null) {
            return false;
        }
        rly0Var.f160046h.m171379d(motionEvent);
        return false;
    }
}
