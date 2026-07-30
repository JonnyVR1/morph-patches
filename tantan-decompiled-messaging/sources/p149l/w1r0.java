package p149l;

import android.content.Context;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzabn;
import com.google.android.gms.internal.ads.zzdl;
import com.google.android.gms.internal.ads.zzgaa;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final class w1r0 implements t3r0, hcu0, q2r0 {

    /* JADX INFO: renamed from: n */
    public static final Executor f184038n = new Executor() { // from class: l.byy0
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
        }
    };

    /* JADX INFO: renamed from: a */
    public final Context f184039a;

    /* JADX INFO: renamed from: b */
    public final ogt0 f184040b;

    /* JADX INFO: renamed from: c */
    public final h2r0 f184041c;

    /* JADX INFO: renamed from: d */
    public final r2r0 f184042d;

    /* JADX INFO: renamed from: e */
    public g6v0 f184043e;

    /* JADX INFO: renamed from: f */
    public e2r0 f184044f;

    /* JADX INFO: renamed from: g */
    public ojv0 f184045g;

    /* JADX INFO: renamed from: h */
    public jyy0 f184046h;

    /* JADX INFO: renamed from: i */
    public List f184047i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public Pair f184048j;

    /* JADX INFO: renamed from: k */
    public final r3r0 f184049k;

    /* JADX INFO: renamed from: l */
    public final Executor f184050l;

    /* JADX INFO: renamed from: m */
    public int f184051m;

    public /* synthetic */ w1r0(cyy0 cyy0Var, v1r0 v1r0Var) {
        this.f184039a = cyy0Var.f83045a;
        ogt0 ogt0Var = cyy0Var.f83047c;
        f5v0.m119531b(ogt0Var);
        this.f184040b = ogt0Var;
        h2r0 h2r0Var = cyy0Var.f83048d;
        f5v0.m119531b(h2r0Var);
        this.f184041c = h2r0Var;
        this.f184042d = new r2r0(this, h2r0Var);
        this.f184043e = g6v0.f101315a;
        this.f184049k = r3r0.f157609a;
        this.f184050l = f184038n;
        this.f184051m = 0;
    }

    @Override // p149l.t3r0
    /* JADX INFO: renamed from: b */
    public final void mo187117b(mhr0 mhr0Var) throws zzabn {
        qny0 qny0VarM209761g;
        int i;
        f5v0.m119535f(this.f184051m == 0);
        f5v0.m119531b(this.f184047i);
        g6v0 g6v0Var = this.f184043e;
        Looper looperMyLooper = Looper.myLooper();
        f5v0.m119531b(looperMyLooper);
        this.f184045g = g6v0Var.mo100826a(looperMyLooper, null);
        qny0 qny0Var = mhr0Var.f133904x;
        if (qny0Var == null || ((i = qny0Var.f155510c) != 7 && i != 6)) {
            qny0Var = qny0.f155499h;
        }
        qny0 qny0Var2 = qny0Var;
        if (qny0Var2.f155510c == 7) {
            xjy0 xjy0VarM175712c = qny0Var2.m175712c();
            xjy0VarM175712c.m209758d(6);
            qny0VarM209761g = xjy0VarM175712c.m209761g();
        } else {
            qny0VarM209761g = qny0Var2;
        }
        try {
            ogt0 ogt0Var = this.f184040b;
            Context context = this.f184039a;
            msy0 msy0Var = msy0.f135543a;
            final ojv0 ojv0Var = this.f184045g;
            Objects.requireNonNull(ojv0Var);
            ogt0Var.mo139023a(context, qny0Var2, qny0VarM209761g, msy0Var, this, new Executor() { // from class: l.ayy0
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    ojv0Var.mo164792g(runnable);
                }
            }, zzgaa.zzl(), 0L);
            Pair pair = this.f184048j;
            if (pair != null) {
                w7w0 w7w0Var = (w7w0) pair.second;
                w7w0Var.m202083b();
                w7w0Var.m202082a();
            }
            this.f184046h = new jyy0(this.f184039a, this, null);
            Pair pair2 = this.f184048j;
            if (pair2 == null) {
                this.f184047i.getClass();
                throw null;
            }
            w7w0 w7w0Var2 = (w7w0) pair2.second;
            f5v0.m119531b(null);
            w7w0Var2.m202083b();
            w7w0Var2.m202082a();
            throw null;
        } catch (zzdl e) {
            throw new zzabn(e, mhr0Var);
        }
    }

    @Override // p149l.t3r0
    /* JADX INFO: renamed from: c */
    public final void mo187118c(List list) {
        this.f184047i = list;
        if (zzk()) {
            f5v0.m119531b(this.f184046h);
            throw null;
        }
    }

    @Override // p149l.t3r0
    /* JADX INFO: renamed from: d */
    public final void mo187119d(long j) {
        f5v0.m119531b(this.f184046h);
        throw null;
    }

    @Override // p149l.t3r0
    /* JADX INFO: renamed from: e */
    public final void mo187120e(g6v0 g6v0Var) {
        f5v0.m119535f(!zzk());
        this.f184043e = g6v0Var;
    }

    @Override // p149l.t3r0
    /* JADX INFO: renamed from: f */
    public final void mo187121f(e2r0 e2r0Var) {
        this.f184044f = e2r0Var;
    }

    @Override // p149l.t3r0
    /* JADX INFO: renamed from: g */
    public final void mo187122g(Surface surface, w7w0 w7w0Var) {
        Pair pair = this.f184048j;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((w7w0) this.f184048j.second).equals(w7w0Var)) {
            return;
        }
        this.f184048j = Pair.create(surface, w7w0Var);
        w7w0Var.m202083b();
        w7w0Var.m202082a();
    }

    @Override // p149l.t3r0
    public final h2r0 zza() {
        return this.f184041c;
    }

    @Override // p149l.t3r0
    public final s3r0 zzb() {
        jyy0 jyy0Var = this.f184046h;
        f5v0.m119531b(jyy0Var);
        return jyy0Var;
    }

    @Override // p149l.t3r0
    public final void zzc() {
        w7w0 w7w0Var = w7w0.f185113c;
        w7w0Var.m202083b();
        w7w0Var.m202082a();
        this.f184048j = null;
    }

    @Override // p149l.t3r0
    public final void zze() {
        if (this.f184051m == 2) {
            return;
        }
        ojv0 ojv0Var = this.f184045g;
        if (ojv0Var != null) {
            ojv0Var.mo164787b(null);
        }
        this.f184048j = null;
        this.f184051m = 2;
    }

    @Override // p149l.t3r0
    public final boolean zzk() {
        return this.f184051m == 1;
    }
}
