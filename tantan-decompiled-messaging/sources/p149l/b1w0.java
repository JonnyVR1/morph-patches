package p149l;

import androidx.annotation.Nullable;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes6.dex */
public final class b1w0 {

    /* JADX INFO: renamed from: a */
    public final b0w0 f72631a;

    /* JADX INFO: renamed from: b */
    public final z0w0 f72632b;

    /* JADX INFO: renamed from: c */
    public final xzv0 f72633c;

    /* JADX INFO: renamed from: e */
    public h1w0 f72635e;

    /* JADX INFO: renamed from: f */
    public int f72636f = 1;

    /* JADX INFO: renamed from: d */
    public final ArrayDeque f72634d = new ArrayDeque();

    public b1w0(b0w0 b0w0Var, xzv0 xzv0Var, z0w0 z0w0Var) {
        this.f72631a = b0w0Var;
        this.f72633c = xzv0Var;
        this.f72632b = z0w0Var;
        xzv0Var.m212021b(new w0w0(this));
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final synchronized gnr m99881a(a1w0 a1w0Var) {
        this.f72636f = 2;
        if (m99885i()) {
            return null;
        }
        return this.f72635e.m129082a(a1w0Var);
    }

    /* JADX INFO: renamed from: e */
    public final synchronized void m99882e(a1w0 a1w0Var) {
        this.f72634d.add(a1w0Var);
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m99883f() {
        synchronized (this) {
            this.f72636f = 1;
            m99884h();
        }
    }

    /* JADX INFO: renamed from: h */
    public final synchronized void m99884h() {
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132358p6)).booleanValue() && !vny0.m199079q().m212279i().zzh().m182049h()) {
            this.f72634d.clear();
            return;
        }
        if (m99885i()) {
            while (!this.f72634d.isEmpty()) {
                a1w0 a1w0Var = (a1w0) this.f72634d.pollFirst();
                if (a1w0Var == null || (a1w0Var.zza() != null && this.f72631a.mo99795c(a1w0Var.zza()))) {
                    h1w0 h1w0Var = new h1w0(this.f72631a, this.f72632b, a1w0Var);
                    this.f72635e = h1w0Var;
                    h1w0Var.m129085d(new x0w0(this, a1w0Var));
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final synchronized boolean m99885i() {
        return this.f72635e == null;
    }
}
