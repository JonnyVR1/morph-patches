package p149l;

import android.net.Uri;
import android.util.Pair;
import com.google.android.gms.internal.ads.zzcc;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class ilr0 implements j5r0 {

    /* JADX INFO: renamed from: h */
    public static final c6r0 f113866h = new c6r0() { // from class: l.elr0
        @Override // p149l.c6r0
        /* JADX INFO: renamed from: a */
        public final /* synthetic */ j5r0[] mo95449a(Uri uri, Map map) {
            int i = b6r0.f73876a;
            return new j5r0[]{new ilr0()};
        }
    };

    /* JADX INFO: renamed from: a */
    public m5r0 f113867a;

    /* JADX INFO: renamed from: b */
    public m7r0 f113868b;

    /* JADX INFO: renamed from: e */
    public glr0 f113871e;

    /* JADX INFO: renamed from: c */
    public int f113869c = 0;

    /* JADX INFO: renamed from: d */
    public long f113870d = -1;

    /* JADX INFO: renamed from: f */
    public int f113872f = -1;

    /* JADX INFO: renamed from: g */
    public long f113873g = -1;

    @Override // p149l.j5r0
    /* JADX INFO: renamed from: c */
    public final void mo100820c(long j, long j2) {
        this.f113869c = j == 0 ? 0 : 4;
        glr0 glr0Var = this.f113871e;
        if (glr0Var != null) {
            glr0Var.mo122084a(j2);
        }
    }

    @Override // p149l.j5r0
    /* JADX INFO: renamed from: d */
    public final boolean mo100821d(k5r0 k5r0Var) throws IOException {
        return llr0.m150549c(k5r0Var);
    }

    @Override // p149l.j5r0
    /* JADX INFO: renamed from: e */
    public final void mo100822e(m5r0 m5r0Var) {
        this.f113867a = m5r0Var;
        this.f113868b = m5r0Var.mo129454i(0, 1);
        m5r0Var.mo129453c();
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00f0  */
    @Override // p149l.j5r0
    /* JADX INFO: renamed from: f */
    public final int mo100823f(k5r0 k5r0Var, s6r0 s6r0Var) throws IOException {
        int i;
        f5v0.m119531b(this.f113868b);
        int i2 = ggw0.f102568a;
        int i3 = this.f113869c;
        int iM126084z = 4;
        if (i3 == 0) {
            f5v0.m119535f(k5r0Var.zzf() == 0);
            int i4 = this.f113872f;
            if (i4 != -1) {
                ((z4r0) k5r0Var).m217119k(i4, false);
                this.f113869c = 4;
            } else {
                if (!llr0.m150549c(k5r0Var)) {
                    throw zzcc.zza("Unsupported or unrecognized wav file type.", null);
                }
                ((z4r0) k5r0Var).m217119k((int) (k5r0Var.zze() - k5r0Var.zzf()), false);
                this.f113869c = 1;
            }
            return 0;
        }
        long jM197243G = -1;
        if (i3 == 1) {
            v6w0 v6w0Var = new v6w0(8);
            klr0 klr0VarM146437a = klr0.m146437a(k5r0Var, v6w0Var);
            if (klr0VarM146437a.f123690a != 1685272116) {
                k5r0Var.zzj();
            } else {
                z4r0 z4r0Var = (z4r0) k5r0Var;
                z4r0Var.m217118j(8, false);
                v6w0Var.m197262k(0);
                z4r0Var.mo140051c(v6w0Var.m197264m(), 0, 8, false);
                jM197243G = v6w0Var.m197243G();
                z4r0Var.m217119k(((int) klr0VarM146437a.f123691b) + 8, false);
            }
            this.f113870d = jM197243G;
            this.f113869c = 2;
            return 0;
        }
        if (i3 == 2) {
            jlr0 jlr0VarM150548b = llr0.m150548b(k5r0Var);
            int i5 = jlr0VarM150548b.f118559a;
            if (i5 == 17) {
                this.f113871e = new flr0(this.f113867a, this.f113868b, jlr0VarM150548b);
            } else if (i5 == 6) {
                this.f113871e = new hlr0(this.f113867a, this.f113868b, jlr0VarM150548b, "audio/g711-alaw", -1);
            } else if (i5 == 7) {
                this.f113871e = new hlr0(this.f113867a, this.f113868b, jlr0VarM150548b, "audio/g711-mlaw", -1);
            } else {
                int i6 = jlr0VarM150548b.f118563e;
                if (i5 == 1) {
                    iM126084z = ggw0.m126084z(i6);
                    i = iM126084z;
                } else {
                    if (i5 != 3) {
                        if (i5 == 65534) {
                            iM126084z = ggw0.m126084z(i6);
                            i = iM126084z;
                        }
                    } else if (i6 == 32) {
                        i = iM126084z;
                    }
                    i = 0;
                }
                if (i == 0) {
                    throw zzcc.zzc("Unsupported WAV format type: " + i5);
                }
                this.f113871e = new hlr0(this.f113867a, this.f113868b, jlr0VarM150548b, "audio/raw", i);
            }
            this.f113869c = 3;
            return 0;
        }
        if (i3 != 3) {
            f5v0.m119535f(this.f113873g != -1);
            long jZzf = this.f113873g - k5r0Var.zzf();
            glr0 glr0Var = this.f113871e;
            glr0Var.getClass();
            return glr0Var.mo122086c(k5r0Var, jZzf) ? -1 : 0;
        }
        Pair pairM150547a = llr0.m150547a(k5r0Var);
        this.f113872f = ((Long) pairM150547a.first).intValue();
        long jLongValue = ((Long) pairM150547a.second).longValue();
        long j = this.f113870d;
        if (j != -1 && jLongValue == 4294967295L) {
            jLongValue = j;
        }
        long j2 = ((long) this.f113872f) + jLongValue;
        this.f113873g = j2;
        long jZzd = k5r0Var.zzd();
        if (jZzd != -1 && j2 > jZzd) {
            svv0.m186111f("WavExtractor", "Data exceeds input length: " + j2 + ", " + jZzd);
            this.f113873g = jZzd;
            j2 = jZzd;
        }
        glr0 glr0Var2 = this.f113871e;
        glr0Var2.getClass();
        glr0Var2.mo122085b(this.f113872f, j2);
        this.f113869c = 4;
        return 0;
    }
}
