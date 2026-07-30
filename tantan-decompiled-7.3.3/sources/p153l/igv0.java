package p153l;

import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.C2291v3;
import com.google.android.gms.internal.ads.zzead;
import com.google.android.gms.internal.ads.zzeml;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes6.dex */
public final class igv0 {

    /* JADX INFO: renamed from: a */
    public final Executor f114815a;

    /* JADX INFO: renamed from: b */
    public final ScheduledExecutorService f114816b;

    /* JADX INFO: renamed from: c */
    public final nzt0 f114817c;

    /* JADX INFO: renamed from: d */
    public final ehv0 f114818d;

    /* JADX INFO: renamed from: e */
    public final uew0 f114819e;

    /* JADX INFO: renamed from: f */
    public final C2291v3 f114820f = C2291v3.m13433C();

    /* JADX INFO: renamed from: g */
    public final AtomicBoolean f114821g = new AtomicBoolean();

    /* JADX INFO: renamed from: h */
    public jgv0 f114822h;

    /* JADX INFO: renamed from: i */
    public b7w0 f114823i;

    public igv0(Executor executor, ScheduledExecutorService scheduledExecutorService, nzt0 nzt0Var, ehv0 ehv0Var, uew0 uew0Var) {
        this.f114815a = executor;
        this.f114816b = scheduledExecutorService;
        this.f114817c = nzt0Var;
        this.f114818d = ehv0Var;
        this.f114819e = uew0Var;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized hpr m139960b(b7w0 b7w0Var) {
        try {
            if (!this.f114821g.getAndSet(true)) {
                if (b7w0Var.f75343b.f68853a.isEmpty()) {
                    this.f114820f.mo13076f(new zzeml(3, khv0.m149828b(b7w0Var)));
                } else {
                    this.f114823i = b7w0Var;
                    this.f114822h = new jgv0(b7w0Var, this.f114818d, this.f114820f);
                    this.f114818d.m120868k(b7w0Var.f75343b.f68853a);
                    while (this.f114822h.m144800e()) {
                        m139962e(this.f114822h.m144796a());
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f114820f;
    }

    /* JADX INFO: renamed from: d */
    public final synchronized hpr m139961d(q6w0 q6w0Var) {
        Iterator it = q6w0Var.f155873a.iterator();
        while (it.hasNext()) {
            pcv0 pcv0VarMo145142d = this.f114817c.mo145142d(q6w0Var.f155875b, (String) it.next());
            if (pcv0VarMo145142d != null && pcv0VarMo145142d.mo98488a(this.f114823i, q6w0Var)) {
                return pvw0.m173988o(pcv0VarMo145142d.mo98489b(this.f114823i, q6w0Var), q6w0Var.f155865S, TimeUnit.MILLISECONDS, this.f114816b);
            }
        }
        return pvw0.m173980g(new zzead(3));
    }

    /* JADX INFO: renamed from: e */
    public final void m139962e(@Nullable q6w0 q6w0Var) {
        if (q6w0Var == null) {
            return;
        }
        hpr hprVarM139961d = m139961d(q6w0Var);
        this.f114818d.m120864f(this.f114823i, q6w0Var, hprVarM139961d, this.f114819e);
        pvw0.m173991r(hprVarM139961d, new hgv0(this, q6w0Var), this.f114815a);
    }
}
