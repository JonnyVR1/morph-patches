package p149l;

import android.view.MotionEvent;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public class oic0 {

    /* JADX INFO: renamed from: a */
    public static WeakReference<q1m> f144104a;

    /* JADX INFO: renamed from: a */
    public static void m164504a(MotionEvent motionEvent) {
        WeakReference<q1m> weakReference = f144104a;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        f144104a.get().mo49461a(motionEvent);
    }

    /* JADX INFO: renamed from: b */
    public static void m164505b(q1m q1mVar) {
        f144104a = new WeakReference<>(q1mVar);
    }

    /* JADX INFO: renamed from: c */
    public static void m164506c() {
        f144104a = null;
    }
}
