package p149l;

import android.net.Uri;
import com.google.android.gms.internal.ads.zzcc;
import java.io.IOException;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* JADX INFO: loaded from: classes6.dex */
public final class ler0 implements j5r0 {

    /* JADX INFO: renamed from: d */
    public static final c6r0 f127746d = new c6r0() { // from class: l.ker0
        @Override // p149l.c6r0
        /* JADX INFO: renamed from: a */
        public final /* synthetic */ j5r0[] mo95449a(Uri uri, Map map) {
            int i = b6r0.f73876a;
            return new j5r0[]{new ler0()};
        }
    };

    /* JADX INFO: renamed from: a */
    public m5r0 f127747a;

    /* JADX INFO: renamed from: b */
    public ffr0 f127748b;

    /* JADX INFO: renamed from: c */
    public boolean f127749c;

    @EnsuresNonNullIf(expression = {"streamReader"}, result = true)
    /* JADX INFO: renamed from: a */
    public final boolean m149594a(k5r0 k5r0Var) throws IOException {
        ner0 ner0Var = new ner0();
        if (ner0Var.m159122b(k5r0Var, true) && (ner0Var.f138645a & 2) == 2) {
            int iMin = Math.min(ner0Var.f138649e, 8);
            v6w0 v6w0Var = new v6w0(iMin);
            ((z4r0) k5r0Var).mo140051c(v6w0Var.m197264m(), 0, iMin, false);
            v6w0Var.m197262k(0);
            if (v6w0Var.m197268q() >= 5 && v6w0Var.m197238B() == 127 && v6w0Var.m197246J() == 1179402563) {
                this.f127748b = new jer0();
            } else {
                v6w0Var.m197262k(0);
                try {
                    if (s7r0.m182517d(1, v6w0Var, true)) {
                        this.f127748b = new hfr0();
                    } else {
                        v6w0Var.m197262k(0);
                        if (bfr0.m101560j(v6w0Var)) {
                            this.f127748b = new bfr0();
                        }
                    }
                } catch (zzcc unused) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // p149l.j5r0
    /* JADX INFO: renamed from: c */
    public final void mo100820c(long j, long j2) {
        ffr0 ffr0Var = this.f127748b;
        if (ffr0Var != null) {
            ffr0Var.m121188i(j, j2);
        }
    }

    @Override // p149l.j5r0
    /* JADX INFO: renamed from: d */
    public final boolean mo100821d(k5r0 k5r0Var) throws IOException {
        try {
            return m149594a(k5r0Var);
        } catch (zzcc unused) {
            return false;
        }
    }

    @Override // p149l.j5r0
    /* JADX INFO: renamed from: e */
    public final void mo100822e(m5r0 m5r0Var) {
        this.f127747a = m5r0Var;
    }

    @Override // p149l.j5r0
    /* JADX INFO: renamed from: f */
    public final int mo100823f(k5r0 k5r0Var, s6r0 s6r0Var) throws IOException {
        f5v0.m119531b(this.f127747a);
        if (this.f127748b == null) {
            if (!m149594a(k5r0Var)) {
                throw zzcc.zza("Failed to determine bitstream type", null);
            }
            k5r0Var.zzj();
        }
        if (!this.f127749c) {
            m7r0 m7r0VarMo129454i = this.f127747a.mo129454i(0, 1);
            this.f127747a.mo129453c();
            this.f127748b.m121186g(this.f127747a, m7r0VarMo129454i);
            this.f127749c = true;
        }
        return this.f127748b.m121183d(k5r0Var, s6r0Var);
    }
}
