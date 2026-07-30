package p003l;

import android.view.MotionEvent;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class oic0 {

    /* JADX INFO: renamed from: a */
    public static WeakReference<q1m> f6165a;

    /* JADX INFO: renamed from: a */
    public static void m6710a(MotionEvent motionEvent) {
        WeakReference<q1m> weakReference = f6165a;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        f6165a.get().mo2608a(motionEvent);
    }

    /* JADX INFO: renamed from: b */
    public static void m6711b(q1m q1mVar) {
        f6165a = new WeakReference<>(q1mVar);
    }

    /* JADX INFO: renamed from: c */
    public static void m6712c() {
        f6165a = null;
    }
}
