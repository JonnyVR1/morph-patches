package p149l;

import com.google.android.gms.internal.ads.zzavn;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public final class qwr0 {

    /* JADX INFO: renamed from: a */
    public final vur0 f156759a;

    /* JADX INFO: renamed from: b */
    public final String f156760b;

    /* JADX INFO: renamed from: c */
    public final String f156761c;

    /* JADX INFO: renamed from: e */
    public final Class[] f156763e;

    /* JADX INFO: renamed from: d */
    public volatile Method f156762d = null;

    /* JADX INFO: renamed from: f */
    public final CountDownLatch f156764f = new CountDownLatch(1);

    public qwr0(vur0 vur0Var, String str, String str2, Class... clsArr) {
        this.f156759a = vur0Var;
        this.f156760b = str;
        this.f156761c = str2;
        this.f156763e = clsArr;
        vur0Var.m200109k().submit(new pwr0(this));
    }

    /* JADX INFO: renamed from: b */
    public static /* bridge */ /* synthetic */ void m176896b(qwr0 qwr0Var) {
        try {
            vur0 vur0Var = qwr0Var.f156759a;
            Class<?> clsLoadClass = vur0Var.m200107i().loadClass(qwr0Var.m176898c(vur0Var.m200117u(), qwr0Var.f156760b));
            if (clsLoadClass != null) {
                qwr0Var.f156762d = clsLoadClass.getMethod(qwr0Var.m176898c(qwr0Var.f156759a.m200117u(), qwr0Var.f156761c), qwr0Var.f156763e);
            }
        } catch (zzavn | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException unused) {
        } finally {
            qwr0Var.f156764f.countDown();
        }
    }

    /* JADX INFO: renamed from: a */
    public final Method m176897a() {
        if (this.f156762d != null) {
            return this.f156762d;
        }
        try {
            if (this.f156764f.await(2L, TimeUnit.SECONDS)) {
                return this.f156762d;
            }
            return null;
        } catch (InterruptedException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public final String m176898c(byte[] bArr, String str) throws zzavn, UnsupportedEncodingException {
        return new String(this.f156759a.m200104e().m190623b(bArr, str), "UTF-8");
    }
}
