package p149l;

import androidx.annotation.Nullable;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class her0 implements oer0 {

    /* JADX INFO: renamed from: a */
    public final ner0 f107395a;

    /* JADX INFO: renamed from: b */
    public final long f107396b;

    /* JADX INFO: renamed from: c */
    public final long f107397c;

    /* JADX INFO: renamed from: d */
    public final ffr0 f107398d;

    /* JADX INFO: renamed from: e */
    public int f107399e;

    /* JADX INFO: renamed from: f */
    public long f107400f;

    /* JADX INFO: renamed from: g */
    public long f107401g;

    /* JADX INFO: renamed from: h */
    public long f107402h;

    /* JADX INFO: renamed from: i */
    public long f107403i;

    /* JADX INFO: renamed from: j */
    public long f107404j;

    /* JADX INFO: renamed from: k */
    public long f107405k;

    /* JADX INFO: renamed from: l */
    public long f107406l;

    public her0(ffr0 ffr0Var, long j, long j2, long j3, long j4, boolean z) {
        f5v0.m119533d(j >= 0 && j2 > j);
        this.f107398d = ffr0Var;
        this.f107396b = j;
        this.f107397c = j2;
        if (j3 == j2 - j || z) {
            this.f107400f = j4;
            this.f107399e = 4;
        } else {
            this.f107399e = 0;
        }
        this.f107395a = new ner0();
    }

    @Override // p149l.oer0
    /* JADX INFO: renamed from: a */
    public final void mo116090a(long j) {
        this.f107402h = Math.max(0L, Math.min(j, this.f107400f - 1));
        this.f107399e = 2;
        this.f107403i = this.f107396b;
        this.f107404j = this.f107397c;
        this.f107405k = 0L;
        this.f107406l = this.f107400f;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00ab A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:40:0x00ac  */
    @Override // p149l.oer0
    /* JADX INFO: renamed from: b */
    public final long mo116091b(k5r0 k5r0Var) throws IOException {
        long j;
        long j2;
        long jMax;
        int i = this.f107399e;
        if (i == 0) {
            j = 0;
            long jZzf = k5r0Var.zzf();
            this.f107401g = jZzf;
            this.f107399e = 1;
            long j3 = this.f107397c - 65307;
            if (j3 > jZzf) {
                return j3;
            }
        } else if (i != 1) {
            if (i == 2) {
                long j4 = this.f107403i;
                long j5 = this.f107404j;
                if (j4 == j5) {
                    jMax = -1;
                } else {
                    long jZzf2 = k5r0Var.zzf();
                    if (this.f107395a.m159123c(k5r0Var, j5)) {
                        this.f107395a.m159122b(k5r0Var, false);
                        k5r0Var.zzj();
                        long j6 = this.f107402h;
                        ner0 ner0Var = this.f107395a;
                        j2 = 2;
                        long j7 = ner0Var.f138646b;
                        long j8 = j6 - j7;
                        int i2 = ner0Var.f138648d + ner0Var.f138649e;
                        if (j8 < 0 || j8 >= 72000) {
                            if (j8 < 0) {
                                this.f107404j = jZzf2;
                                this.f107406l = j7;
                            } else {
                                this.f107403i = ((long) i2) + k5r0Var.zzf();
                                this.f107405k = j7;
                            }
                            long j9 = this.f107404j;
                            long j10 = this.f107403i;
                            long j11 = j9 - j10;
                            if (j11 < 100000) {
                                this.f107404j = j10;
                                jMax = j10;
                            } else {
                                jMax = Math.max(j10, Math.min((k5r0Var.zzf() - (((long) i2) * (j8 <= 0 ? 2L : 1L))) + ((j8 * j11) / (this.f107406l - this.f107405k)), j9 - 1));
                            }
                        } else {
                            jMax = -1;
                        }
                    } else {
                        jMax = this.f107403i;
                        if (jMax == jZzf2) {
                            rhg0.m179353a("No ogg page can be found.");
                            return 0L;
                        }
                    }
                    if (jMax != -1) {
                        return jMax;
                    }
                    this.f107399e = 3;
                }
                j2 = 2;
                if (jMax != -1) {
                    return jMax;
                }
                this.f107399e = 3;
            } else {
                if (i != 3) {
                    return -1L;
                }
                j2 = 2;
            }
            while (true) {
                this.f107395a.m159123c(k5r0Var, -1L);
                this.f107395a.m159122b(k5r0Var, false);
                ner0 ner0Var2 = this.f107395a;
                if (ner0Var2.f138646b > this.f107402h) {
                    k5r0Var.zzj();
                    this.f107399e = 4;
                    return -(this.f107405k + j2);
                }
                ((z4r0) k5r0Var).m217119k(ner0Var2.f138648d + ner0Var2.f138649e, false);
                this.f107403i = k5r0Var.zzf();
                this.f107405k = this.f107395a.f138646b;
            }
        } else {
            j = 0;
        }
        this.f107395a.m159121a();
        if (!this.f107395a.m159123c(k5r0Var, -1L)) {
            hg3.m130807a();
            return j;
        }
        this.f107395a.m159122b(k5r0Var, false);
        ner0 ner0Var3 = this.f107395a;
        ((z4r0) k5r0Var).m217119k(ner0Var3.f138648d + ner0Var3.f138649e, false);
        long j12 = this.f107395a.f138646b;
        while (true) {
            ner0 ner0Var4 = this.f107395a;
            if ((ner0Var4.f138645a & 4) == 4 || !ner0Var4.m159123c(k5r0Var, -1L) || k5r0Var.zzf() >= this.f107397c || !this.f107395a.m159122b(k5r0Var, true)) {
                break;
            }
            ner0 ner0Var5 = this.f107395a;
            if (!n5r0.m157999e(k5r0Var, ner0Var5.f138648d + ner0Var5.f138649e)) {
                break;
            }
            j12 = this.f107395a.f138646b;
        }
        this.f107400f = j12;
        this.f107399e = 4;
        return this.f107401g;
    }

    @Override // p149l.oer0
    @Nullable
    public final /* bridge */ /* synthetic */ v6r0 zze() {
        fer0 fer0Var = null;
        if (this.f107400f != 0) {
            return new ger0(this, fer0Var);
        }
        return null;
    }
}
