package p149l;

import com.clevertap.android.sdk.Constants;
import com.google.android.gms.internal.ads.C2236r3;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ilw0 extends C2236r3 implements Runnable {

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ int f113880j = 0;

    /* JADX INFO: renamed from: h */
    public gnr f113881h;

    /* JADX INFO: renamed from: i */
    public Object f113882i;

    public ilw0(gnr gnrVar, Object obj) {
        gnrVar.getClass();
        this.f113881h = gnrVar;
        this.f113882i = obj;
    }

    /* JADX INFO: renamed from: D */
    public abstract Object mo126924D(Object obj, Object obj2) throws Exception;

    /* JADX INFO: renamed from: E */
    public abstract void mo126925E(Object obj);

    @Override // com.google.android.gms.internal.ads.AbstractC2204n3
    /* JADX INFO: renamed from: c */
    public final String mo13019c() {
        String str;
        gnr gnrVar = this.f113881h;
        Object obj = this.f113882i;
        String strMo13019c = super.mo13019c();
        if (gnrVar != null) {
            str = "inputFuture=[" + gnrVar.toString() + "], ";
        } else {
            str = "";
        }
        if (obj == null) {
            if (strMo13019c != null) {
                return str.concat(strMo13019c);
            }
            return null;
        }
        return str + "function=[" + obj.toString() + Constants.AES_SUFFIX;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2204n3
    /* JADX INFO: renamed from: d */
    public final void mo13020d() {
        m13024t(this.f113881h);
        this.f113881h = null;
        this.f113882i = null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        gnr gnrVar = this.f113881h;
        Object obj = this.f113882i;
        if ((isCancelled() | (gnrVar == null)) || (obj == null)) {
            return;
        }
        this.f113881h = null;
        if (gnrVar.isCancelled()) {
            m13025u(gnrVar);
            return;
        }
        try {
            try {
                Object objMo126924D = mo126924D(obj, jmw0.m142243p(gnrVar));
                this.f113882i = null;
                mo126925E(objMo126924D);
            } catch (Throwable th) {
                try {
                    ymw0.m215378a(th);
                    mo13022f(th);
                } finally {
                    this.f113882i = null;
                }
            }
        } catch (Error e) {
            mo13022f(e);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (ExecutionException e2) {
            mo13022f(e2.getCause());
        } catch (Exception e3) {
            mo13022f(e3);
        }
    }
}
