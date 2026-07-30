package p153l;

import com.clevertap.android.sdk.Constants;
import com.google.android.gms.internal.ads.C2259r3;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ztw0 extends C2259r3 implements Runnable {

    /* JADX INFO: renamed from: h */
    public hpr f206064h;

    /* JADX INFO: renamed from: i */
    public Class f206065i;

    /* JADX INFO: renamed from: j */
    public Object f206066j;

    public ztw0(hpr hprVar, Class cls, Object obj) {
        hprVar.getClass();
        this.f206064h = hprVar;
        this.f206065i = cls;
        this.f206066j = obj;
    }

    /* JADX INFO: renamed from: D */
    public abstract Object mo213110D(Object obj, Throwable th) throws Exception;

    /* JADX INFO: renamed from: E */
    public abstract void mo213111E(Object obj);

    @Override // com.google.android.gms.internal.ads.AbstractC2227n3
    /* JADX INFO: renamed from: c */
    public final String mo13073c() {
        String str;
        hpr hprVar = this.f206064h;
        Class cls = this.f206065i;
        Object obj = this.f206066j;
        String strMo13073c = super.mo13073c();
        if (hprVar != null) {
            str = "inputFuture=[" + hprVar.toString() + "], ";
        } else {
            str = "";
        }
        if (cls == null || obj == null) {
            if (strMo13073c != null) {
                return str.concat(strMo13073c);
            }
            return null;
        }
        return str + "exceptionType=[" + cls.toString() + "], fallback=[" + obj.toString() + Constants.AES_SUFFIX;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2227n3
    /* JADX INFO: renamed from: d */
    public final void mo13074d() {
        m13078t(this.f206064h);
        this.f206064h = null;
        this.f206065i = null;
        this.f206066j = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Object objM173989p;
        hpr hprVar = this.f206064h;
        Class cls = this.f206065i;
        Object obj = this.f206066j;
        if (((obj == null) || ((hprVar == 0) | (cls == null))) || isCancelled()) {
            return;
        }
        this.f206064h = null;
        try {
            th = hprVar instanceof hww0 ? ((hww0) hprVar).mo13072a() : null;
            objM173989p = th == null ? pvw0.m173989p(hprVar) : null;
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause == null) {
                cause = new NullPointerException("Future type " + String.valueOf(hprVar.getClass()) + " threw " + String.valueOf(e.getClass()) + " without a cause");
            }
            th = cause;
        } catch (Throwable th) {
            th = th;
        }
        if (th == null) {
            mo13075e(objM173989p);
            return;
        }
        if (!cls.isInstance(th)) {
            m13079u(hprVar);
            return;
        }
        try {
            Object objMo213110D = mo213110D(obj, th);
            this.f206065i = null;
            this.f206066j = null;
            mo213111E(objMo213110D);
        } catch (Throwable th2) {
            try {
                eww0.m122993a(th2);
                mo13076f(th2);
            } finally {
                this.f206065i = null;
                this.f206066j = null;
            }
        }
    }
}
