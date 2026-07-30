package p149l;

import android.view.MotionEvent;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class ky00 {
    @Deprecated
    /* JADX INFO: renamed from: a */
    public static int m147815a(MotionEvent motionEvent, int i) {
        return motionEvent.findPointerIndex(i);
    }

    @Deprecated
    /* JADX INFO: renamed from: b */
    public static int m147816b(MotionEvent motionEvent) {
        return motionEvent.getActionIndex();
    }

    @Deprecated
    /* JADX INFO: renamed from: c */
    public static int m147817c(MotionEvent motionEvent) {
        return motionEvent.getActionMasked();
    }

    @Deprecated
    /* JADX INFO: renamed from: d */
    public static int m147818d(MotionEvent motionEvent, int i) {
        return motionEvent.getPointerId(i);
    }

    @Deprecated
    /* JADX INFO: renamed from: e */
    public static float m147819e(MotionEvent motionEvent, int i) {
        return motionEvent.getX(i);
    }

    @Deprecated
    /* JADX INFO: renamed from: f */
    public static float m147820f(MotionEvent motionEvent, int i) {
        return motionEvent.getY(i);
    }

    /* JADX INFO: renamed from: g */
    public static boolean m147821g(@NonNull MotionEvent motionEvent, int i) {
        return (motionEvent.getSource() & i) == i;
    }
}
