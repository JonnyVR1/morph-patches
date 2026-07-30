package p153l;

import android.os.Build;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class w1l0 {

    /* JADX INFO: renamed from: a */
    public static Map<VelocityTracker, x1l0> f186823a = Collections.synchronizedMap(new WeakHashMap());

    /* JADX INFO: renamed from: l.w1l0$a */
    @RequiresApi(34)
    public static class C20994a {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static float m204450a(VelocityTracker velocityTracker, int i) {
            return velocityTracker.getAxisVelocity(i);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m204444a(@NonNull VelocityTracker velocityTracker, @NonNull MotionEvent motionEvent) {
        velocityTracker.addMovement(motionEvent);
        if (Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 4194304) {
            if (!f186823a.containsKey(velocityTracker)) {
                f186823a.put(velocityTracker, new x1l0());
            }
            f186823a.get(velocityTracker).m209096a(motionEvent);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m204445b(@NonNull VelocityTracker velocityTracker, int i) {
        m204446c(velocityTracker, i, Float.MAX_VALUE);
    }

    /* JADX INFO: renamed from: c */
    public static void m204446c(@NonNull VelocityTracker velocityTracker, int i, float f) {
        velocityTracker.computeCurrentVelocity(i, f);
        x1l0 x1l0VarM204448e = m204448e(velocityTracker);
        if (x1l0VarM204448e != null) {
            x1l0VarM204448e.m209098c(i, f);
        }
    }

    /* JADX INFO: renamed from: d */
    public static float m204447d(@NonNull VelocityTracker velocityTracker, int i) {
        if (Build.VERSION.SDK_INT >= 34) {
            return C20994a.m204450a(velocityTracker, i);
        }
        if (i == 0) {
            return velocityTracker.getXVelocity();
        }
        if (i == 1) {
            return velocityTracker.getYVelocity();
        }
        x1l0 x1l0VarM204448e = m204448e(velocityTracker);
        if (x1l0VarM204448e != null) {
            return x1l0VarM204448e.m209099d(i);
        }
        return 0.0f;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public static x1l0 m204448e(VelocityTracker velocityTracker) {
        return f186823a.get(velocityTracker);
    }

    @Deprecated
    /* JADX INFO: renamed from: f */
    public static float m204449f(VelocityTracker velocityTracker, int i) {
        return velocityTracker.getYVelocity(i);
    }
}
