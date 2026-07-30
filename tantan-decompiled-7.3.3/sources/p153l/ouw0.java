package p153l;

import com.clevertap.android.sdk.Constants;
import com.google.android.gms.internal.ads.C2259r3;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ouw0 extends C2259r3 implements Runnable {

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ int f149216j = 0;

    /* JADX INFO: renamed from: h */
    public hpr f149217h;

    /* JADX INFO: renamed from: i */
    public Object f149218i;

    public ouw0(hpr hprVar, Object obj) {
        hprVar.getClass();
        this.f149217h = hprVar;
        this.f149218i = obj;
    }

    /* JADX INFO: renamed from: D */
    public abstract Object mo160251D(Object obj, Object obj2) throws Exception;

    /* JADX INFO: renamed from: E */
    public abstract void mo160252E(Object obj);

    @Override // com.google.android.gms.internal.ads.AbstractC2227n3
    /* JADX INFO: renamed from: c */
    public final String mo13073c() {
        String str;
        hpr hprVar = this.f149217h;
        Object obj = this.f149218i;
        String strMo13073c = super.mo13073c();
        if (hprVar != null) {
            str = "inputFuture=[" + hprVar.toString() + "], ";
        } else {
            str = "";
        }
        if (obj == null) {
            if (strMo13073c != null) {
                return str.concat(strMo13073c);
            }
            return null;
        }
        return str + "function=[" + obj.toString() + Constants.AES_SUFFIX;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2227n3
    /* JADX INFO: renamed from: d */
    public final void mo13074d() {
        m13078t(this.f149217h);
        this.f149217h = null;
        this.f149218i = null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        hpr hprVar = this.f149217h;
        Object obj = this.f149218i;
        if ((isCancelled() | (hprVar == null)) || (obj == null)) {
            return;
        }
        this.f149217h = null;
        if (hprVar.isCancelled()) {
            m13079u(hprVar);
            return;
        }
        try {
            try {
                Object objMo160251D = mo160251D(obj, pvw0.m173989p(hprVar));
                this.f149218i = null;
                mo160252E(objMo160251D);
            } catch (Throwable th) {
                try {
                    eww0.m122993a(th);
                    mo13076f(th);
                } finally {
                    this.f149218i = null;
                }
            }
        } catch (Error e) {
            mo13076f(e);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (ExecutionException e2) {
            mo13076f(e2.getCause());
        } catch (Exception e3) {
            mo13076f(e3);
        }
    }
}
