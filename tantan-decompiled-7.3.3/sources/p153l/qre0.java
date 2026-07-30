package p153l;

import android.os.IBinder;
import android.os.IInterface;
import java.lang.reflect.Method;
import org.eclipse.jetty.http.HttpTokens;

/* JADX INFO: loaded from: classes7.dex */
public class qre0 {

    /* JADX INFO: renamed from: d */
    private static volatile qre0 f159105d;

    /* JADX INFO: renamed from: a */
    private final Method f159106a;

    /* JADX INFO: renamed from: b */
    private okq0 f159107b;

    /* JADX INFO: renamed from: c */
    private pkq0 f159108c;

    /* JADX INFO: renamed from: l.qre0$a */
    public static class C19632a {

        /* JADX INFO: renamed from: a */
        IInterface f159109a;

        /* JADX INFO: renamed from: b */
        IBinder f159110b;
    }

    private qre0() {
        try {
            this.f159106a = Class.forName(riw.m181611a(new byte[]{81, 8, 85, 69, 14, 15, 84, 72, 94, 68, 79, 53, 85, 20, 71, 94, 2, 3, 125, 7, 95, 86, 6, 3, 66})).getDeclaredMethod(riw.m181611a(new byte[]{87, 3, 69, 100, 4, 20, 70, 15, 82, 82}), String.class);
        } catch (Exception e) {
            gig0.m130323a(e);
            throw null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static qre0 m177538a() {
        if (f159105d == null) {
            synchronized (qre0.class) {
                try {
                    if (f159105d == null) {
                        f159105d = new qre0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f159105d;
    }

    /* JADX INFO: renamed from: b */
    private C19632a m177539b(String str, String str2) {
        try {
            IBinder iBinder = (IBinder) this.f159106a.invoke(null, str);
            IInterface iInterface = (IInterface) Class.forName(str2 + riw.m181611a(new byte[]{20, 53, 69, 66, 3})).getMethod(riw.m181611a(new byte[]{81, 21, 120, 89, 21, 3, 66, 0, 80, 84, 4}), IBinder.class).invoke(null, iBinder);
            C19632a c19632a = new C19632a();
            c19632a.f159110b = iBinder;
            c19632a.f159109a = iInterface;
            return c19632a;
        } catch (Exception e) {
            e.printStackTrace();
            gig0.m130323a(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public okq0 m177540c() {
        if (this.f159107b == null) {
            this.f159107b = new okq0(m177539b(riw.m181611a(new byte[]{64, 14, 94, 89, 4}), riw.m181611a(new byte[]{83, 9, 92, 25, 0, 8, 84, 20, 94, 94, 5, 72, 89, 8, 69, 82, 19, 8, 81, 10, 31, 67, 4, 10, 85, 22, 89, 88, 15, 31, 30, 47, 101, 82, HttpTokens.CARRIAGE_RETURN, 3, 64, 14, 94, 89, 24})));
        }
        return this.f159107b;
    }

    /* JADX INFO: renamed from: d */
    public pkq0 m177541d() {
        if (this.f159108c == null) {
            this.f159108c = new pkq0(m177539b(riw.m181611a(new byte[]{71, 15, 95, 83, 14, 17}), riw.m181611a(new byte[]{81, 8, 85, 69, 14, 15, 84, 72, 71, 94, 4, 17, 30, 47, 102, 94, 15, 2, 95, 17, 124, 86, 15, 7, 87, 3, 67})));
        }
        return this.f159108c;
    }
}
