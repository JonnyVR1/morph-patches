package p007l;

import android.content.Context;
import l.ig3;
import l.qkq0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class hgw {

    /* JADX INFO: renamed from: a */
    public static volatile Context f2843a;

    /* JADX INFO: renamed from: a */
    public static Context m9333a() {
        if (f2843a != null) {
            return f2843a;
        }
        qkq0.a(ijw.m9418a(new byte[]{107, 43, 124, 98, 40, 34, 109, 70, 124, 116, 14, 8, 68, 3, 73, 67, 65, 8, 95, 18, 17, 94, 15, 15, 68, 15, 80, 91, 8, 28, 85, 2, 31, 23, 34, 7, 92, 10, 17, 94, 15, 15, 68, 78, 24, 23, 7, 15, 66, 21, 69, 25}));
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static void m9334b(Context context) {
        if (context == null) {
            ig3.a(ijw.m9418a(new byte[]{107, 43, 124, 98, 40, 34, 109, 70, 114, 88, 15, 18, 85, 30, 69, 23, 2, 7, 94, 8, 94, 67, 65, 4, 85, 70, 95, 66, 13, 10}));
            return;
        }
        if (f2843a != null) {
            return;
        }
        synchronized (hgw.class) {
            try {
                if (f2843a == null) {
                    f2843a = context.getApplicationContext();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
