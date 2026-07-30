package p153l;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.api.Api;

/* JADX INFO: loaded from: classes.dex */
public class q2e {

    /* JADX INFO: renamed from: a */
    public final Context f155320a;

    /* JADX INFO: renamed from: b */
    public final r2e f155321b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC19508b f155322c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC19507a f155323d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public VelocityTracker f155324e;

    /* JADX INFO: renamed from: f */
    public float f155325f;

    /* JADX INFO: renamed from: g */
    public int f155326g;

    /* JADX INFO: renamed from: h */
    public int f155327h;

    /* JADX INFO: renamed from: i */
    public int f155328i;

    /* JADX INFO: renamed from: j */
    public final int[] f155329j;

    /* JADX INFO: renamed from: l.q2e$a */
    @VisibleForTesting
    public interface InterfaceC19507a {
        /* JADX INFO: renamed from: a */
        float mo170346a(VelocityTracker velocityTracker, MotionEvent motionEvent, int i);
    }

    /* JADX INFO: renamed from: l.q2e$b */
    @VisibleForTesting
    public interface InterfaceC19508b {
        /* JADX INFO: renamed from: a */
        void mo165719a(Context context, int[] iArr, MotionEvent motionEvent, int i);
    }

    @VisibleForTesting
    public q2e(Context context, r2e r2eVar, InterfaceC19508b interfaceC19508b, InterfaceC19507a interfaceC19507a) {
        this.f155326g = -1;
        this.f155327h = -1;
        this.f155328i = -1;
        this.f155329j = new int[]{Api.BaseClientBuilder.API_PRIORITY_OTHER, 0};
        this.f155320a = context;
        this.f155321b = r2eVar;
        this.f155322c = interfaceC19508b;
        this.f155323d = interfaceC19507a;
    }

    /* JADX INFO: renamed from: c */
    public static void m175019c(Context context, int[] iArr, MotionEvent motionEvent, int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        iArr[0] = nkl0.m163647i(context, viewConfiguration, motionEvent.getDeviceId(), i, motionEvent.getSource());
        iArr[1] = nkl0.m163646h(context, viewConfiguration, motionEvent.getDeviceId(), i, motionEvent.getSource());
    }

    /* JADX INFO: renamed from: f */
    public static float m175020f(VelocityTracker velocityTracker, MotionEvent motionEvent, int i) {
        w1l0.m204444a(velocityTracker, motionEvent);
        w1l0.m204445b(velocityTracker, 1000);
        return w1l0.m204447d(velocityTracker, i);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m175021d(MotionEvent motionEvent, int i) {
        int source = motionEvent.getSource();
        int deviceId = motionEvent.getDeviceId();
        if (this.f155327h == source && this.f155328i == deviceId && this.f155326g == i) {
            return false;
        }
        this.f155322c.mo165719a(this.f155320a, this.f155329j, motionEvent, i);
        this.f155327h = source;
        this.f155328i = deviceId;
        this.f155326g = i;
        return true;
    }

    /* JADX INFO: renamed from: e */
    public final float m175022e(MotionEvent motionEvent, int i) {
        if (this.f155324e == null) {
            this.f155324e = VelocityTracker.obtain();
        }
        return this.f155323d.mo170346a(this.f155324e, motionEvent, i);
    }

    /* JADX INFO: renamed from: g */
    public void m175023g(@NonNull MotionEvent motionEvent, int i) {
        boolean zM175021d = m175021d(motionEvent, i);
        if (this.f155329j[0] == Integer.MAX_VALUE) {
            VelocityTracker velocityTracker = this.f155324e;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f155324e = null;
                return;
            }
            return;
        }
        float fM175022e = m175022e(motionEvent, i) * this.f155321b.mo1386a();
        float fSignum = Math.signum(fM175022e);
        if (zM175021d || (fSignum != Math.signum(this.f155325f) && fSignum != 0.0f)) {
            this.f155321b.mo1388c();
        }
        float fAbs = Math.abs(fM175022e);
        int[] iArr = this.f155329j;
        if (fAbs < iArr[0]) {
            return;
        }
        int i2 = iArr[1];
        float fMax = Math.max(-i2, Math.min(fM175022e, i2));
        this.f155325f = this.f155321b.mo1387b(fMax) ? fMax : 0.0f;
    }

    public q2e(@NonNull Context context, @NonNull r2e r2eVar) {
        this(context, r2eVar, new InterfaceC19508b() { // from class: l.o2e
            @Override // p153l.q2e.InterfaceC19508b
            /* JADX INFO: renamed from: a */
            public final void mo165719a(Context context2, int[] iArr, MotionEvent motionEvent, int i) {
                q2e.m175019c(context2, iArr, motionEvent, i);
            }
        }, new InterfaceC19507a() { // from class: l.p2e
            @Override // p153l.q2e.InterfaceC19507a
            /* JADX INFO: renamed from: a */
            public final float mo170346a(VelocityTracker velocityTracker, MotionEvent motionEvent, int i) {
                return q2e.m175020f(velocityTracker, motionEvent, i);
            }
        });
    }
}
