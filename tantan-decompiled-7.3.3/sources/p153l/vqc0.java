package p153l;

import android.view.MotionEvent;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes4.dex */
public class vqc0 {

    /* JADX INFO: renamed from: a */
    public static WeakReference<j4m> f185345a;

    /* JADX INFO: renamed from: a */
    public static void m202372a(MotionEvent motionEvent) {
        WeakReference<j4m> weakReference = f185345a;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        f185345a.get().mo50644a(motionEvent);
    }

    /* JADX INFO: renamed from: b */
    public static void m202373b(j4m j4mVar) {
        f185345a = new WeakReference<>(j4mVar);
    }

    /* JADX INFO: renamed from: c */
    public static void m202374c() {
        f185345a = null;
    }
}
