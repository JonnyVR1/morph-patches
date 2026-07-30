package p149l;

import com.facebook.cache.common.CacheEventListener;
import com.facebook.cache.common.InterfaceC1578a;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class vme0 implements InterfaceC1578a {

    /* JADX INFO: renamed from: i */
    public static final Object f182102i = new Object();

    /* JADX INFO: renamed from: j */
    public static vme0 f182103j;

    /* JADX INFO: renamed from: k */
    public static int f182104k;

    /* JADX INFO: renamed from: a */
    public cx3 f182105a;

    /* JADX INFO: renamed from: b */
    public String f182106b;

    /* JADX INFO: renamed from: c */
    public long f182107c;

    /* JADX INFO: renamed from: d */
    public long f182108d;

    /* JADX INFO: renamed from: e */
    public long f182109e;

    /* JADX INFO: renamed from: f */
    public IOException f182110f;

    /* JADX INFO: renamed from: g */
    public CacheEventListener.EvictionReason f182111g;

    /* JADX INFO: renamed from: h */
    public vme0 f182112h;

    /* JADX INFO: renamed from: a */
    public static vme0 m198938a() {
        synchronized (f182102i) {
            try {
                vme0 vme0Var = f182103j;
                if (vme0Var == null) {
                    return new vme0();
                }
                f182103j = vme0Var.f182112h;
                vme0Var.f182112h = null;
                f182104k--;
                return vme0Var;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m198939b() {
        synchronized (f182102i) {
            try {
                if (f182104k < 5) {
                    m198940c();
                    f182104k++;
                    vme0 vme0Var = f182103j;
                    if (vme0Var != null) {
                        this.f182112h = vme0Var;
                    }
                    f182103j = this;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m198940c() {
        this.f182105a = null;
        this.f182106b = null;
        this.f182107c = 0L;
        this.f182108d = 0L;
        this.f182109e = 0L;
        this.f182110f = null;
        this.f182111g = null;
    }

    /* JADX INFO: renamed from: d */
    public vme0 m198941d(cx3 cx3Var) {
        this.f182105a = cx3Var;
        return this;
    }

    /* JADX INFO: renamed from: e */
    public vme0 m198942e(long j) {
        this.f182108d = j;
        return this;
    }

    /* JADX INFO: renamed from: f */
    public vme0 m198943f(long j) {
        this.f182109e = j;
        return this;
    }

    /* JADX INFO: renamed from: g */
    public vme0 m198944g(CacheEventListener.EvictionReason evictionReason) {
        this.f182111g = evictionReason;
        return this;
    }

    /* JADX INFO: renamed from: h */
    public vme0 m198945h(IOException iOException) {
        this.f182110f = iOException;
        return this;
    }

    /* JADX INFO: renamed from: i */
    public vme0 m198946i(long j) {
        this.f182107c = j;
        return this;
    }

    /* JADX INFO: renamed from: j */
    public vme0 m198947j(String str) {
        this.f182106b = str;
        return this;
    }
}
