package p149l;

import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zziz;

/* JADX INFO: loaded from: classes6.dex */
public final class qox0 implements e1y0 {

    /* JADX INFO: renamed from: a */
    public final i6y0 f155641a;

    /* JADX INFO: renamed from: b */
    public final lox0 f155642b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public p5y0 f155643c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public e1y0 f155644d;

    /* JADX INFO: renamed from: e */
    public boolean f155645e = true;

    /* JADX INFO: renamed from: f */
    public boolean f155646f;

    public qox0(lox0 lox0Var, g6v0 g6v0Var) {
        this.f155642b = lox0Var;
        this.f155641a = new i6y0(g6v0Var);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005b  */
    /* JADX INFO: renamed from: a */
    public final long m175781a(boolean z) {
        c5t0 c5t0VarZzc;
        p5y0 p5y0Var = this.f155643c;
        if (p5y0Var == null || p5y0Var.zzV() || (!this.f155643c.mo100010r() && (z || this.f155643c.mo146609h()))) {
            this.f155645e = true;
            if (this.f155646f) {
                this.f155641a.m134672b();
            }
        } else {
            e1y0 e1y0Var = this.f155644d;
            e1y0Var.getClass();
            long jZza = e1y0Var.zza();
            if (!this.f155645e) {
                this.f155641a.m134671a(jZza);
                c5t0VarZzc = e1y0Var.zzc();
                if (!c5t0VarZzc.equals(this.f155641a.zzc())) {
                    this.f155641a.mo114455g(c5t0VarZzc);
                    this.f155642b.mo12576a(c5t0VarZzc);
                }
            } else if (jZza < this.f155641a.zza()) {
                this.f155641a.m134673c();
            } else {
                this.f155645e = false;
                if (this.f155646f) {
                    this.f155641a.m134672b();
                }
                this.f155641a.m134671a(jZza);
                c5t0VarZzc = e1y0Var.zzc();
                if (!c5t0VarZzc.equals(this.f155641a.zzc())) {
                    this.f155641a.mo114455g(c5t0VarZzc);
                    this.f155642b.mo12576a(c5t0VarZzc);
                }
            }
        }
        if (this.f155645e) {
            return this.f155641a.zza();
        }
        e1y0 e1y0Var2 = this.f155644d;
        e1y0Var2.getClass();
        return e1y0Var2.zza();
    }

    /* JADX INFO: renamed from: b */
    public final void m175782b(p5y0 p5y0Var) {
        if (p5y0Var == this.f155643c) {
            this.f155644d = null;
            this.f155643c = null;
            this.f155645e = true;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m175783c(p5y0 p5y0Var) throws zziz {
        e1y0 e1y0Var;
        e1y0 e1y0VarZzk = p5y0Var.zzk();
        if (e1y0VarZzk == null || e1y0VarZzk == (e1y0Var = this.f155644d)) {
            return;
        }
        if (e1y0Var != null) {
            throw zziz.zzd(new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
        this.f155644d = e1y0VarZzk;
        this.f155643c = p5y0Var;
        e1y0VarZzk.mo114455g(this.f155641a.zzc());
    }

    /* JADX INFO: renamed from: d */
    public final void m175784d(long j) {
        this.f155641a.m134671a(j);
    }

    /* JADX INFO: renamed from: e */
    public final void m175785e() {
        this.f155646f = true;
        this.f155641a.m134672b();
    }

    /* JADX INFO: renamed from: f */
    public final void m175786f() {
        this.f155646f = false;
        this.f155641a.m134673c();
    }

    @Override // p149l.e1y0
    /* JADX INFO: renamed from: g */
    public final void mo114455g(c5t0 c5t0Var) {
        e1y0 e1y0Var = this.f155644d;
        if (e1y0Var != null) {
            e1y0Var.mo114455g(c5t0Var);
            c5t0Var = this.f155644d.zzc();
        }
        this.f155641a.mo114455g(c5t0Var);
    }

    @Override // p149l.e1y0
    public final long zza() {
        throw null;
    }

    @Override // p149l.e1y0
    public final c5t0 zzc() {
        e1y0 e1y0Var = this.f155644d;
        return e1y0Var != null ? e1y0Var.zzc() : this.f155641a.zzc();
    }

    @Override // p149l.e1y0
    public final boolean zzj() {
        if (this.f155645e) {
            return false;
        }
        e1y0 e1y0Var = this.f155644d;
        e1y0Var.getClass();
        return e1y0Var.zzj();
    }
}
