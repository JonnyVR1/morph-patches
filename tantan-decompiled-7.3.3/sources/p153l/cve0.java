package p153l;

import com.facebook.cache.common.CacheEventListener;
import com.facebook.cache.common.InterfaceC1601a;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class cve0 implements InterfaceC1601a {

    /* JADX INFO: renamed from: i */
    public static final Object f83984i = new Object();

    /* JADX INFO: renamed from: j */
    public static cve0 f83985j;

    /* JADX INFO: renamed from: k */
    public static int f83986k;

    /* JADX INFO: renamed from: a */
    public by3 f83987a;

    /* JADX INFO: renamed from: b */
    public String f83988b;

    /* JADX INFO: renamed from: c */
    public long f83989c;

    /* JADX INFO: renamed from: d */
    public long f83990d;

    /* JADX INFO: renamed from: e */
    public long f83991e;

    /* JADX INFO: renamed from: f */
    public IOException f83992f;

    /* JADX INFO: renamed from: g */
    public CacheEventListener.EvictionReason f83993g;

    /* JADX INFO: renamed from: h */
    public cve0 f83994h;

    /* JADX INFO: renamed from: a */
    public static cve0 m112796a() {
        synchronized (f83984i) {
            try {
                cve0 cve0Var = f83985j;
                if (cve0Var == null) {
                    return new cve0();
                }
                f83985j = cve0Var.f83994h;
                cve0Var.f83994h = null;
                f83986k--;
                return cve0Var;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m112797b() {
        synchronized (f83984i) {
            try {
                if (f83986k < 5) {
                    m112798c();
                    f83986k++;
                    cve0 cve0Var = f83985j;
                    if (cve0Var != null) {
                        this.f83994h = cve0Var;
                    }
                    f83985j = this;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m112798c() {
        this.f83987a = null;
        this.f83988b = null;
        this.f83989c = 0L;
        this.f83990d = 0L;
        this.f83991e = 0L;
        this.f83992f = null;
        this.f83993g = null;
    }

    /* JADX INFO: renamed from: d */
    public cve0 m112799d(by3 by3Var) {
        this.f83987a = by3Var;
        return this;
    }

    /* JADX INFO: renamed from: e */
    public cve0 m112800e(long j) {
        this.f83990d = j;
        return this;
    }

    /* JADX INFO: renamed from: f */
    public cve0 m112801f(long j) {
        this.f83991e = j;
        return this;
    }

    /* JADX INFO: renamed from: g */
    public cve0 m112802g(CacheEventListener.EvictionReason evictionReason) {
        this.f83993g = evictionReason;
        return this;
    }

    /* JADX INFO: renamed from: h */
    public cve0 m112803h(IOException iOException) {
        this.f83992f = iOException;
        return this;
    }

    /* JADX INFO: renamed from: i */
    public cve0 m112804i(long j) {
        this.f83989c = j;
        return this;
    }

    /* JADX INFO: renamed from: j */
    public cve0 m112805j(String str) {
        this.f83988b = str;
        return this;
    }
}
