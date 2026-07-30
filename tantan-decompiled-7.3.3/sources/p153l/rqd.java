package p153l;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.facebook.drawee.view.DraweeView;
import com.tantanapp.common.utils.CrashHelper;

/* JADX INFO: loaded from: classes3.dex */
public class rqd implements GestureDetector.OnDoubleTapListener {

    /* JADX INFO: renamed from: a */
    public t31 f164470a;

    public rqd(t31 t31Var) {
        m182620a(t31Var);
    }

    /* JADX INFO: renamed from: a */
    public void m182620a(t31 t31Var) {
        this.f164470a = t31Var;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(MotionEvent motionEvent) {
        t31 t31Var = this.f164470a;
        if (t31Var == null) {
            return false;
        }
        try {
            float fM189027G = t31Var.m189027G();
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            float fM189061v = this.f164470a.m189061v();
            t31 t31Var2 = this.f164470a;
            if (fM189027G < fM189061v) {
                t31Var2.m189049b0(t31Var2.m189061v(), x, y, true);
            } else {
                t31Var2.m189049b0(t31Var2.m189023C(), x, y, true);
            }
        } catch (Exception e) {
            CrashHelper.m82479c(e);
        }
        return true;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        DraweeView<wlj> draweeViewM189063x;
        t31 t31Var = this.f164470a;
        if (t31Var == null || (draweeViewM189063x = t31Var.m189063x()) == null) {
            return false;
        }
        this.f164470a.m189025E();
        if (this.f164470a.m189026F() == null) {
            return false;
        }
        this.f164470a.m189026F().mo99079a(draweeViewM189063x, motionEvent.getX(), motionEvent.getY());
        return true;
    }
}
