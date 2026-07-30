package p153l;

import android.view.MotionEvent;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class u610 {
    @Deprecated
    /* JADX INFO: renamed from: a */
    public static int m194641a(MotionEvent motionEvent, int i) {
        return motionEvent.findPointerIndex(i);
    }

    @Deprecated
    /* JADX INFO: renamed from: b */
    public static int m194642b(MotionEvent motionEvent) {
        return motionEvent.getActionIndex();
    }

    @Deprecated
    /* JADX INFO: renamed from: c */
    public static int m194643c(MotionEvent motionEvent) {
        return motionEvent.getActionMasked();
    }

    @Deprecated
    /* JADX INFO: renamed from: d */
    public static int m194644d(MotionEvent motionEvent, int i) {
        return motionEvent.getPointerId(i);
    }

    @Deprecated
    /* JADX INFO: renamed from: e */
    public static float m194645e(MotionEvent motionEvent, int i) {
        return motionEvent.getX(i);
    }

    @Deprecated
    /* JADX INFO: renamed from: f */
    public static float m194646f(MotionEvent motionEvent, int i) {
        return motionEvent.getY(i);
    }

    /* JADX INFO: renamed from: g */
    public static boolean m194647g(@NonNull MotionEvent motionEvent, int i) {
        return (motionEvent.getSource() & i) == i;
    }
}
