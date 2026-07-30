package p153l;

import android.content.Context;
import org.eclipse.jetty.http.HttpTokens;

/* JADX INFO: loaded from: classes8.dex */
public class fiw {

    /* JADX INFO: renamed from: a */
    public static volatile Context f99272a;

    /* JADX INFO: renamed from: a */
    public static Context m125761a() {
        if (f99272a != null) {
            return f99272a;
        }
        wtq0.m207906a(hmw.m136007a(new byte[]{107, 43, 124, 98, 40, 34, 109, 70, 124, 116, 14, 8, 68, 3, 73, 67, 65, 8, 95, 18, 17, 94, 15, 15, 68, 15, 80, 91, 8, 28, 85, 2, 31, 23, 34, 7, 92, 10, 17, 94, 15, 15, 68, 78, 24, 23, 7, 15, 66, 21, 69, 25}));
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static void m125762b(Context context) {
        if (context == null) {
            wg3.m206174a(hmw.m136007a(new byte[]{107, 43, 124, 98, 40, 34, 109, 70, 114, 88, 15, 18, 85, 30, 69, 23, 2, 7, 94, 8, 94, 67, 65, 4, 85, 70, 95, 66, HttpTokens.CARRIAGE_RETURN, 10}));
            return;
        }
        if (f99272a != null) {
            return;
        }
        synchronized (fiw.class) {
            try {
                if (f99272a == null) {
                    f99272a = context.getApplicationContext();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
