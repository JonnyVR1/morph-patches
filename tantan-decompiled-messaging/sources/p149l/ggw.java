package p149l;

import android.content.Context;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes7.dex */
public class ggw {

    /* JADX INFO: renamed from: a */
    private static volatile Context f102566a;

    /* JADX INFO: renamed from: b */
    private static final String f102567b = rjw.m179664a(new byte[]{2, 72, 3, 25, 83});

    /* JADX INFO: renamed from: a */
    public static Context m126041a() {
        return f102566a;
    }

    /* JADX INFO: renamed from: b */
    public static String m126042b() {
        return f102567b;
    }

    /* JADX INFO: renamed from: c */
    public static void m126043c(@NonNull Context context) {
        if (f102566a == null) {
            synchronized (ggw.class) {
                try {
                    if (f102566a == null) {
                        f102566a = context.getApplicationContext();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
