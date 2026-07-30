package p149l;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.facebook.drawee.view.DraweeView;
import com.tantanapp.common.utils.CrashHelper;

/* JADX INFO: loaded from: classes3.dex */
public class mpd implements GestureDetector.OnDoubleTapListener {

    /* JADX INFO: renamed from: a */
    public m31 f135034a;

    public mpd(m31 m31Var) {
        m155797a(m31Var);
    }

    /* JADX INFO: renamed from: a */
    public void m155797a(m31 m31Var) {
        this.f135034a = m31Var;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(MotionEvent motionEvent) {
        m31 m31Var = this.f135034a;
        if (m31Var == null) {
            return false;
        }
        try {
            float fM152764G = m31Var.m152764G();
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            float fM152798v = this.f135034a.m152798v();
            m31 m31Var2 = this.f135034a;
            if (fM152764G < fM152798v) {
                m31Var2.m152786b0(m31Var2.m152798v(), x, y, true);
            } else {
                m31Var2.m152786b0(m31Var2.m152760C(), x, y, true);
            }
        } catch (Exception e) {
            CrashHelper.m81296c(e);
        }
        return true;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        DraweeView<djj> draweeViewM152800x;
        m31 m31Var = this.f135034a;
        if (m31Var == null || (draweeViewM152800x = m31Var.m152800x()) == null) {
            return false;
        }
        this.f135034a.m152762E();
        if (this.f135034a.m152763F() == null) {
            return false;
        }
        this.f135034a.m152763F().mo105925a(draweeViewM152800x, motionEvent.getX(), motionEvent.getY());
        return true;
    }
}
