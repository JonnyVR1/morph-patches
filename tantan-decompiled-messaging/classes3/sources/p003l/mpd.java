package p003l;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.tantanapp.common.utils.CrashHelper;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class mpd implements GestureDetector.OnDoubleTapListener {

    /* JADX INFO: renamed from: a */
    public m31 f5698a;

    public mpd(m31 m31Var) {
        m6417a(m31Var);
    }

    /* JADX INFO: renamed from: a */
    public void m6417a(m31 m31Var) {
        this.f5698a = m31Var;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(MotionEvent motionEvent) {
        m31 m31Var = this.f5698a;
        if (m31Var == null) {
            return false;
        }
        try {
            float fM6230G = m31Var.m6230G();
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            float fM6264v = this.f5698a.m6264v();
            m31 m31Var2 = this.f5698a;
            if (fM6230G < fM6264v) {
                m31Var2.m6252b0(m31Var2.m6264v(), x, y, true);
            } else {
                m31Var2.m6252b0(m31Var2.m6226C(), x, y, true);
            }
        } catch (Exception e) {
            CrashHelper.c(e);
        }
        return true;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        View viewM6266x;
        m31 m31Var = this.f5698a;
        if (m31Var == null || (viewM6266x = m31Var.m6266x()) == null) {
            return false;
        }
        this.f5698a.m6228E();
        if (this.f5698a.m6229F() == null) {
            return false;
        }
        this.f5698a.m6229F().mo8583a(viewM6266x, motionEvent.getX(), motionEvent.getY());
        return true;
    }
}
