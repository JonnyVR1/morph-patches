package p149l;

import android.os.IBinder;
import android.os.IInterface;
import java.lang.reflect.Method;
import org.eclipse.jetty.http.HttpTokens;

/* JADX INFO: loaded from: classes7.dex */
public class lje0 {

    /* JADX INFO: renamed from: d */
    private static volatile lje0 f128307d;

    /* JADX INFO: renamed from: a */
    private final Method f128308a;

    /* JADX INFO: renamed from: b */
    private jbq0 f128309b;

    /* JADX INFO: renamed from: c */
    private kbq0 f128310c;

    /* JADX INFO: renamed from: l.lje0$a */
    public static class C18233a {

        /* JADX INFO: renamed from: a */
        IInterface f128311a;

        /* JADX INFO: renamed from: b */
        IBinder f128312b;
    }

    private lje0() {
        try {
            this.f128308a = Class.forName(sgw.m184137a(new byte[]{81, 8, 85, 69, 14, 15, 84, 72, 94, 68, 79, 53, 85, 20, 71, 94, 2, 3, 125, 7, 95, 86, 6, 3, 66})).getDeclaredMethod(sgw.m184137a(new byte[]{87, 3, 69, 100, 4, 20, 70, 15, 82, 82}), String.class);
        } catch (Exception e) {
            y9g0.m213537a(e);
            throw null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static lje0 m149964a() {
        if (f128307d == null) {
            synchronized (lje0.class) {
                try {
                    if (f128307d == null) {
                        f128307d = new lje0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f128307d;
    }

    /* JADX INFO: renamed from: b */
    private C18233a m149965b(String str, String str2) {
        try {
            IBinder iBinder = (IBinder) this.f128308a.invoke(null, str);
            IInterface iInterface = (IInterface) Class.forName(str2 + sgw.m184137a(new byte[]{20, 53, 69, 66, 3})).getMethod(sgw.m184137a(new byte[]{81, 21, 120, 89, 21, 3, 66, 0, 80, 84, 4}), IBinder.class).invoke(null, iBinder);
            C18233a c18233a = new C18233a();
            c18233a.f128312b = iBinder;
            c18233a.f128311a = iInterface;
            return c18233a;
        } catch (Exception e) {
            e.printStackTrace();
            y9g0.m213537a(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public jbq0 m149966c() {
        if (this.f128309b == null) {
            this.f128309b = new jbq0(m149965b(sgw.m184137a(new byte[]{64, 14, 94, 89, 4}), sgw.m184137a(new byte[]{83, 9, 92, 25, 0, 8, 84, 20, 94, 94, 5, 72, 89, 8, 69, 82, 19, 8, 81, 10, 31, 67, 4, 10, 85, 22, 89, 88, 15, 31, 30, 47, 101, 82, HttpTokens.CARRIAGE_RETURN, 3, 64, 14, 94, 89, 24})));
        }
        return this.f128309b;
    }

    /* JADX INFO: renamed from: d */
    public kbq0 m149967d() {
        if (this.f128310c == null) {
            this.f128310c = new kbq0(m149965b(sgw.m184137a(new byte[]{71, 15, 95, 83, 14, 17}), sgw.m184137a(new byte[]{81, 8, 85, 69, 14, 15, 84, 72, 71, 94, 4, 17, 30, 47, 102, 94, 15, 2, 95, 17, 124, 86, 15, 7, 87, 3, 67})));
        }
        return this.f128310c;
    }
}
