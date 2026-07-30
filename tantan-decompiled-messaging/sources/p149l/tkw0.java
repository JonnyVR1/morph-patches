package p149l;

import com.clevertap.android.sdk.Constants;
import com.google.android.gms.internal.ads.C2236r3;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes6.dex */
public abstract class tkw0 extends C2236r3 implements Runnable {

    /* JADX INFO: renamed from: h */
    public gnr f170924h;

    /* JADX INFO: renamed from: i */
    public Class f170925i;

    /* JADX INFO: renamed from: j */
    public Object f170926j;

    public tkw0(gnr gnrVar, Class cls, Object obj) {
        gnrVar.getClass();
        this.f170924h = gnrVar;
        this.f170925i = cls;
        this.f170926j = obj;
    }

    /* JADX INFO: renamed from: D */
    public abstract Object mo179771D(Object obj, Throwable th) throws Exception;

    /* JADX INFO: renamed from: E */
    public abstract void mo179772E(Object obj);

    @Override // com.google.android.gms.internal.ads.AbstractC2204n3
    /* JADX INFO: renamed from: c */
    public final String mo13019c() {
        String str;
        gnr gnrVar = this.f170924h;
        Class cls = this.f170925i;
        Object obj = this.f170926j;
        String strMo13019c = super.mo13019c();
        if (gnrVar != null) {
            str = "inputFuture=[" + gnrVar.toString() + "], ";
        } else {
            str = "";
        }
        if (cls == null || obj == null) {
            if (strMo13019c != null) {
                return str.concat(strMo13019c);
            }
            return null;
        }
        return str + "exceptionType=[" + cls.toString() + "], fallback=[" + obj.toString() + Constants.AES_SUFFIX;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2204n3
    /* JADX INFO: renamed from: d */
    public final void mo13020d() {
        m13024t(this.f170924h);
        this.f170924h = null;
        this.f170925i = null;
        this.f170926j = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Object objM142243p;
        gnr gnrVar = this.f170924h;
        Class cls = this.f170925i;
        Object obj = this.f170926j;
        if (((obj == null) || ((gnrVar == 0) | (cls == null))) || isCancelled()) {
            return;
        }
        this.f170924h = null;
        try {
            th = gnrVar instanceof bnw0 ? ((bnw0) gnrVar).mo13018a() : null;
            objM142243p = th == null ? jmw0.m142243p(gnrVar) : null;
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause == null) {
                cause = new NullPointerException("Future type " + String.valueOf(gnrVar.getClass()) + " threw " + String.valueOf(e.getClass()) + " without a cause");
            }
            th = cause;
        } catch (Throwable th) {
            th = th;
        }
        if (th == null) {
            mo13021e(objM142243p);
            return;
        }
        if (!cls.isInstance(th)) {
            m13025u(gnrVar);
            return;
        }
        try {
            Object objMo179771D = mo179771D(obj, th);
            this.f170925i = null;
            this.f170926j = null;
            mo179772E(objMo179771D);
        } catch (Throwable th2) {
            try {
                ymw0.m215378a(th2);
                mo13022f(th2);
            } finally {
                this.f170925i = null;
                this.f170926j = null;
            }
        }
    }
}
