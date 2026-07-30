package p149l;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.api.Api;

/* JADX INFO: loaded from: classes.dex */
public class c1e {

    /* JADX INFO: renamed from: a */
    public final Context f78260a;

    /* JADX INFO: renamed from: b */
    public final d1e f78261b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC16039b f78262c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC16038a f78263d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public VelocityTracker f78264e;

    /* JADX INFO: renamed from: f */
    public float f78265f;

    /* JADX INFO: renamed from: g */
    public int f78266g;

    /* JADX INFO: renamed from: h */
    public int f78267h;

    /* JADX INFO: renamed from: i */
    public int f78268i;

    /* JADX INFO: renamed from: j */
    public final int[] f78269j;

    /* JADX INFO: renamed from: l.c1e$a */
    @VisibleForTesting
    public interface InterfaceC16038a {
        /* JADX INFO: renamed from: a */
        float mo99828a(VelocityTracker velocityTracker, MotionEvent motionEvent, int i);
    }

    /* JADX INFO: renamed from: l.c1e$b */
    @VisibleForTesting
    public interface InterfaceC16039b {
        /* JADX INFO: renamed from: a */
        void mo94561a(Context context, int[] iArr, MotionEvent motionEvent, int i);
    }

    @VisibleForTesting
    public c1e(Context context, d1e d1eVar, InterfaceC16039b interfaceC16039b, InterfaceC16038a interfaceC16038a) {
        this.f78266g = -1;
        this.f78267h = -1;
        this.f78268i = -1;
        this.f78269j = new int[]{Api.BaseClientBuilder.API_PRIORITY_OTHER, 0};
        this.f78260a = context;
        this.f78261b = d1eVar;
        this.f78262c = interfaceC16039b;
        this.f78263d = interfaceC16038a;
    }

    /* JADX INFO: renamed from: c */
    public static void m104836c(Context context, int[] iArr, MotionEvent motionEvent, int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        iArr[0] = jbl0.m140792i(context, viewConfiguration, motionEvent.getDeviceId(), i, motionEvent.getSource());
        iArr[1] = jbl0.m140791h(context, viewConfiguration, motionEvent.getDeviceId(), i, motionEvent.getSource());
    }

    /* JADX INFO: renamed from: f */
    public static float m104837f(VelocityTracker velocityTracker, MotionEvent motionEvent, int i) {
        qsk0.m176300a(velocityTracker, motionEvent);
        qsk0.m176301b(velocityTracker, 1000);
        return qsk0.m176303d(velocityTracker, i);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m104838d(MotionEvent motionEvent, int i) {
        int source = motionEvent.getSource();
        int deviceId = motionEvent.getDeviceId();
        if (this.f78267h == source && this.f78268i == deviceId && this.f78266g == i) {
            return false;
        }
        this.f78262c.mo94561a(this.f78260a, this.f78269j, motionEvent, i);
        this.f78267h = source;
        this.f78268i = deviceId;
        this.f78266g = i;
        return true;
    }

    /* JADX INFO: renamed from: e */
    public final float m104839e(MotionEvent motionEvent, int i) {
        if (this.f78264e == null) {
            this.f78264e = VelocityTracker.obtain();
        }
        return this.f78263d.mo99828a(this.f78264e, motionEvent, i);
    }

    /* JADX INFO: renamed from: g */
    public void m104840g(@NonNull MotionEvent motionEvent, int i) {
        boolean zM104838d = m104838d(motionEvent, i);
        if (this.f78269j[0] == Integer.MAX_VALUE) {
            VelocityTracker velocityTracker = this.f78264e;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f78264e = null;
                return;
            }
            return;
        }
        float fM104839e = m104839e(motionEvent, i) * this.f78261b.mo1385a();
        float fSignum = Math.signum(fM104839e);
        if (zM104838d || (fSignum != Math.signum(this.f78265f) && fSignum != 0.0f)) {
            this.f78261b.mo1387c();
        }
        float fAbs = Math.abs(fM104839e);
        int[] iArr = this.f78269j;
        if (fAbs < iArr[0]) {
            return;
        }
        int i2 = iArr[1];
        float fMax = Math.max(-i2, Math.min(fM104839e, i2));
        this.f78265f = this.f78261b.mo1386b(fMax) ? fMax : 0.0f;
    }

    public c1e(@NonNull Context context, @NonNull d1e d1eVar) {
        this(context, d1eVar, new InterfaceC16039b() { // from class: l.a1e
            @Override // p149l.c1e.InterfaceC16039b
            /* JADX INFO: renamed from: a */
            public final void mo94561a(Context context2, int[] iArr, MotionEvent motionEvent, int i) {
                c1e.m104836c(context2, iArr, motionEvent, i);
            }
        }, new InterfaceC16038a() { // from class: l.b1e
            @Override // p149l.c1e.InterfaceC16038a
            /* JADX INFO: renamed from: a */
            public final float mo99828a(VelocityTracker velocityTracker, MotionEvent motionEvent, int i) {
                return c1e.m104837f(velocityTracker, motionEvent, i);
            }
        });
    }
}
