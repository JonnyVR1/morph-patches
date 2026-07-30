package p149l;

import android.os.Trace;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class j5j0 {
    /* JADX INFO: renamed from: a */
    public static void m139865a(String str) {
        if (vck0.f180948a >= 18) {
            m139866b(str);
        }
    }

    @RequiresApi(18)
    /* JADX INFO: renamed from: b */
    public static void m139866b(String str) {
        Trace.beginSection(str);
    }

    /* JADX INFO: renamed from: c */
    public static void m139867c() {
        if (vck0.f180948a >= 18) {
            m139868d();
        }
    }

    @RequiresApi(18)
    /* JADX INFO: renamed from: d */
    public static void m139868d() {
        Trace.endSection();
    }
}
