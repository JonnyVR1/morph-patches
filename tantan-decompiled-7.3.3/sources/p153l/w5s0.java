package p153l;

import com.google.android.gms.internal.ads.zzavn;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public final class w5s0 {

    /* JADX INFO: renamed from: a */
    public final b4s0 f187547a;

    /* JADX INFO: renamed from: b */
    public final String f187548b;

    /* JADX INFO: renamed from: c */
    public final String f187549c;

    /* JADX INFO: renamed from: e */
    public final Class[] f187551e;

    /* JADX INFO: renamed from: d */
    public volatile Method f187550d = null;

    /* JADX INFO: renamed from: f */
    public final CountDownLatch f187552f = new CountDownLatch(1);

    public w5s0(b4s0 b4s0Var, String str, String str2, Class... clsArr) {
        this.f187547a = b4s0Var;
        this.f187548b = str;
        this.f187549c = str2;
        this.f187551e = clsArr;
        b4s0Var.m102525k().submit(new v5s0(this));
    }

    /* JADX INFO: renamed from: b */
    public static /* bridge */ /* synthetic */ void m204988b(w5s0 w5s0Var) {
        try {
            b4s0 b4s0Var = w5s0Var.f187547a;
            Class<?> clsLoadClass = b4s0Var.m102523i().loadClass(w5s0Var.m204990c(b4s0Var.m102533u(), w5s0Var.f187548b));
            if (clsLoadClass != null) {
                w5s0Var.f187550d = clsLoadClass.getMethod(w5s0Var.m204990c(w5s0Var.f187547a.m102533u(), w5s0Var.f187549c), w5s0Var.f187551e);
            }
        } catch (zzavn | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException unused) {
        } finally {
            w5s0Var.f187552f.countDown();
        }
    }

    /* JADX INFO: renamed from: a */
    public final Method m204989a() {
        if (this.f187550d != null) {
            return this.f187550d;
        }
        try {
            if (this.f187552f.await(2L, TimeUnit.SECONDS)) {
                return this.f187550d;
            }
            return null;
        } catch (InterruptedException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public final String m204990c(byte[] bArr, String str) throws zzavn, UnsupportedEncodingException {
        return new String(this.f187547a.m102520e().m218463b(bArr, str), "UTF-8");
    }
}
