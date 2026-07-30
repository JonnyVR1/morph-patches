package p153l;

import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zziz;

/* JADX INFO: loaded from: classes6.dex */
public final class wxx0 implements kay0 {

    /* JADX INFO: renamed from: a */
    public final ofy0 f191537a;

    /* JADX INFO: renamed from: b */
    public final rxx0 f191538b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public vey0 f191539c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public kay0 f191540d;

    /* JADX INFO: renamed from: e */
    public boolean f191541e = true;

    /* JADX INFO: renamed from: f */
    public boolean f191542f;

    public wxx0(rxx0 rxx0Var, mfv0 mfv0Var) {
        this.f191538b = rxx0Var;
        this.f191537a = new ofy0(mfv0Var);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005b  */
    /* JADX INFO: renamed from: a */
    public final long m208454a(boolean z) {
        iet0 iet0VarZzc;
        vey0 vey0Var = this.f191539c;
        if (vey0Var == null || vey0Var.zzV() || (!this.f191539c.mo134399r() && (z || this.f191539c.mo178555h()))) {
            this.f191541e = true;
            if (this.f191542f) {
                this.f191537a.m167519b();
            }
        } else {
            kay0 kay0Var = this.f191540d;
            kay0Var.getClass();
            long jZza = kay0Var.zza();
            if (!this.f191541e) {
                this.f191537a.m167518a(jZza);
                iet0VarZzc = kay0Var.zzc();
                if (!iet0VarZzc.equals(this.f191537a.zzc())) {
                    this.f191537a.mo148998g(iet0VarZzc);
                    this.f191538b.mo12630a(iet0VarZzc);
                }
            } else if (jZza < this.f191537a.zza()) {
                this.f191537a.m167520c();
            } else {
                this.f191541e = false;
                if (this.f191542f) {
                    this.f191537a.m167519b();
                }
                this.f191537a.m167518a(jZza);
                iet0VarZzc = kay0Var.zzc();
                if (!iet0VarZzc.equals(this.f191537a.zzc())) {
                    this.f191537a.mo148998g(iet0VarZzc);
                    this.f191538b.mo12630a(iet0VarZzc);
                }
            }
        }
        if (this.f191541e) {
            return this.f191537a.zza();
        }
        kay0 kay0Var2 = this.f191540d;
        kay0Var2.getClass();
        return kay0Var2.zza();
    }

    /* JADX INFO: renamed from: b */
    public final void m208455b(vey0 vey0Var) {
        if (vey0Var == this.f191539c) {
            this.f191540d = null;
            this.f191539c = null;
            this.f191541e = true;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m208456c(vey0 vey0Var) throws zziz {
        kay0 kay0Var;
        kay0 kay0VarZzk = vey0Var.zzk();
        if (kay0VarZzk == null || kay0VarZzk == (kay0Var = this.f191540d)) {
            return;
        }
        if (kay0Var != null) {
            throw zziz.zzd(new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
        this.f191540d = kay0VarZzk;
        this.f191539c = vey0Var;
        kay0VarZzk.mo148998g(this.f191537a.zzc());
    }

    /* JADX INFO: renamed from: d */
    public final void m208457d(long j) {
        this.f191537a.m167518a(j);
    }

    /* JADX INFO: renamed from: e */
    public final void m208458e() {
        this.f191542f = true;
        this.f191537a.m167519b();
    }

    /* JADX INFO: renamed from: f */
    public final void m208459f() {
        this.f191542f = false;
        this.f191537a.m167520c();
    }

    @Override // p153l.kay0
    /* JADX INFO: renamed from: g */
    public final void mo148998g(iet0 iet0Var) {
        kay0 kay0Var = this.f191540d;
        if (kay0Var != null) {
            kay0Var.mo148998g(iet0Var);
            iet0Var = this.f191540d.zzc();
        }
        this.f191537a.mo148998g(iet0Var);
    }

    @Override // p153l.kay0
    public final long zza() {
        throw null;
    }

    @Override // p153l.kay0
    public final iet0 zzc() {
        kay0 kay0Var = this.f191540d;
        return kay0Var != null ? kay0Var.zzc() : this.f191537a.zzc();
    }

    @Override // p153l.kay0
    public final boolean zzj() {
        if (this.f191541e) {
            return false;
        }
        kay0 kay0Var = this.f191540d;
        kay0Var.getClass();
        return kay0Var.zzj();
    }
}
