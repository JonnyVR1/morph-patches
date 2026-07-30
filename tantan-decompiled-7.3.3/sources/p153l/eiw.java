package p153l;

import android.content.Context;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes7.dex */
public class eiw {

    /* JADX INFO: renamed from: a */
    private static volatile Context f94219a;

    /* JADX INFO: renamed from: b */
    private static final String f94220b = qmw.m177151a(new byte[]{2, 72, 3, 25, 83});

    /* JADX INFO: renamed from: a */
    public static Context m120945a() {
        return f94219a;
    }

    /* JADX INFO: renamed from: b */
    public static String m120946b() {
        return f94220b;
    }

    /* JADX INFO: renamed from: c */
    public static void m120947c(@NonNull Context context) {
        if (f94219a == null) {
            synchronized (eiw.class) {
                try {
                    if (f94219a == null) {
                        f94219a = context.getApplicationContext();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
