package p153l;

import android.os.Trace;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class nej0 {
    /* JADX INFO: renamed from: a */
    public static void m162903a(String str) {
        if (bmk0.f77313a >= 18) {
            m162904b(str);
        }
    }

    @RequiresApi(18)
    /* JADX INFO: renamed from: b */
    public static void m162904b(String str) {
        Trace.beginSection(str);
    }

    /* JADX INFO: renamed from: c */
    public static void m162905c() {
        if (bmk0.f77313a >= 18) {
            m162906d();
        }
    }

    @RequiresApi(18)
    /* JADX INFO: renamed from: d */
    public static void m162906d() {
        Trace.endSection();
    }
}
