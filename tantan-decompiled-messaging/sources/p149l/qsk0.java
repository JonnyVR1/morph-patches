package p149l;

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
public final class qsk0 {

    /* JADX INFO: renamed from: a */
    public static Map<VelocityTracker, rsk0> f156239a = Collections.synchronizedMap(new WeakHashMap());

    /* JADX INFO: renamed from: l.qsk0$a */
    @RequiresApi(34)
    public static class C19570a {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static float m176306a(VelocityTracker velocityTracker, int i) {
            return velocityTracker.getAxisVelocity(i);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m176300a(@NonNull VelocityTracker velocityTracker, @NonNull MotionEvent motionEvent) {
        velocityTracker.addMovement(motionEvent);
        if (Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 4194304) {
            if (!f156239a.containsKey(velocityTracker)) {
                f156239a.put(velocityTracker, new rsk0());
            }
            f156239a.get(velocityTracker).m180687a(motionEvent);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m176301b(@NonNull VelocityTracker velocityTracker, int i) {
        m176302c(velocityTracker, i, Float.MAX_VALUE);
    }

    /* JADX INFO: renamed from: c */
    public static void m176302c(@NonNull VelocityTracker velocityTracker, int i, float f) {
        velocityTracker.computeCurrentVelocity(i, f);
        rsk0 rsk0VarM176304e = m176304e(velocityTracker);
        if (rsk0VarM176304e != null) {
            rsk0VarM176304e.m180689c(i, f);
        }
    }

    /* JADX INFO: renamed from: d */
    public static float m176303d(@NonNull VelocityTracker velocityTracker, int i) {
        if (Build.VERSION.SDK_INT >= 34) {
            return C19570a.m176306a(velocityTracker, i);
        }
        if (i == 0) {
            return velocityTracker.getXVelocity();
        }
        if (i == 1) {
            return velocityTracker.getYVelocity();
        }
        rsk0 rsk0VarM176304e = m176304e(velocityTracker);
        if (rsk0VarM176304e != null) {
            return rsk0VarM176304e.m180690d(i);
        }
        return 0.0f;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public static rsk0 m176304e(VelocityTracker velocityTracker) {
        return f156239a.get(velocityTracker);
    }

    @Deprecated
    /* JADX INFO: renamed from: f */
    public static float m176305f(VelocityTracker velocityTracker, int i) {
        return velocityTracker.getYVelocity(i);
    }
}
