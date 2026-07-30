package p149l;

import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzahe;
import com.google.android.gms.internal.ads.zzbx;
import com.google.android.gms.internal.ads.zzby;
import java.io.IOException;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;

/* JADX INFO: loaded from: classes6.dex */
public final class h9r0 implements j5r0 {

    /* JADX INFO: renamed from: b */
    public m5r0 f106624b;

    /* JADX INFO: renamed from: c */
    public int f106625c;

    /* JADX INFO: renamed from: d */
    public int f106626d;

    /* JADX INFO: renamed from: e */
    public int f106627e;

    /* JADX INFO: renamed from: g */
    @Nullable
    public zzahe f106629g;

    /* JADX INFO: renamed from: h */
    public k5r0 f106630h;

    /* JADX INFO: renamed from: i */
    public k9r0 f106631i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public wdr0 f106632j;

    /* JADX INFO: renamed from: a */
    public final v6w0 f106623a = new v6w0(6);

    /* JADX INFO: renamed from: f */
    public long f106628f = -1;

    /* JADX INFO: renamed from: a */
    private final int m130030a(k5r0 k5r0Var) throws IOException {
        this.f106623a.m197259h(2);
        ((z4r0) k5r0Var).mo140051c(this.f106623a.m197264m(), 0, 2, false);
        return this.f106623a.m197242F();
    }

    /* JADX INFO: renamed from: b */
    private final void m130031b() {
        m130032g(new zzbx[0]);
        m5r0 m5r0Var = this.f106624b;
        m5r0Var.getClass();
        m5r0Var.mo129453c();
        this.f106624b.mo129455j(new u6r0(-9223372036854775807L, 0L));
        this.f106625c = 6;
    }

    @Override // p149l.j5r0
    /* JADX INFO: renamed from: c */
    public final void mo100820c(long j, long j2) {
        if (j == 0) {
            this.f106625c = 0;
            this.f106632j = null;
        } else if (this.f106625c == 5) {
            wdr0 wdr0Var = this.f106632j;
            wdr0Var.getClass();
            wdr0Var.mo100820c(j, j2);
        }
    }

    @Override // p149l.j5r0
    /* JADX INFO: renamed from: d */
    public final boolean mo100821d(k5r0 k5r0Var) throws IOException {
        if (m130030a(k5r0Var) != 65496) {
            return false;
        }
        int iM130030a = m130030a(k5r0Var);
        this.f106626d = iM130030a;
        if (iM130030a == 65504) {
            this.f106623a.m197259h(2);
            z4r0 z4r0Var = (z4r0) k5r0Var;
            z4r0Var.mo140051c(this.f106623a.m197264m(), 0, 2, false);
            z4r0Var.m217118j(this.f106623a.m197242F() - 2, false);
            iM130030a = m130030a(k5r0Var);
            this.f106626d = iM130030a;
        }
        if (iM130030a == 65505) {
            z4r0 z4r0Var2 = (z4r0) k5r0Var;
            z4r0Var2.m217118j(2, false);
            this.f106623a.m197259h(6);
            z4r0Var2.mo140051c(this.f106623a.m197264m(), 0, 6, false);
            if (this.f106623a.m197246J() == 1165519206 && this.f106623a.m197242F() == 0) {
                return true;
            }
        }
        return false;
    }

    @Override // p149l.j5r0
    /* JADX INFO: renamed from: e */
    public final void mo100822e(m5r0 m5r0Var) {
        this.f106624b = m5r0Var;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00e6  */
    @Override // p149l.j5r0
    /* JADX INFO: renamed from: f */
    public final int mo100823f(k5r0 k5r0Var, s6r0 s6r0Var) throws IOException {
        String strM197249M;
        j9r0 j9r0VarM158565a;
        zzahe zzaheVar;
        long j;
        int i = this.f106625c;
        long j2 = -1;
        if (i == 0) {
            this.f106623a.m197259h(2);
            ((z4r0) k5r0Var).mo140050b(this.f106623a.m197264m(), 0, 2, false);
            int iM197242F = this.f106623a.m197242F();
            this.f106626d = iM197242F;
            if (iM197242F == 65498) {
                if (this.f106628f != -1) {
                    this.f106625c = 4;
                } else {
                    m130031b();
                }
            } else if ((iM197242F < 65488 || iM197242F > 65497) && iM197242F != 65281) {
                this.f106625c = 1;
            }
            return 0;
        }
        if (i == 1) {
            this.f106623a.m197259h(2);
            ((z4r0) k5r0Var).mo140050b(this.f106623a.m197264m(), 0, 2, false);
            this.f106627e = this.f106623a.m197242F() - 2;
            this.f106625c = 2;
            return 0;
        }
        if (i != 2) {
            if (i != 4) {
                if (i != 5) {
                    if (i == 6) {
                        return -1;
                    }
                    ohg0.m164364a();
                    return 0;
                }
                if (this.f106631i == null || k5r0Var != this.f106630h) {
                    this.f106630h = k5r0Var;
                    this.f106631i = new k9r0(k5r0Var, this.f106628f);
                }
                wdr0 wdr0Var = this.f106632j;
                wdr0Var.getClass();
                int iMo100823f = wdr0Var.mo100823f(this.f106631i, s6r0Var);
                if (iMo100823f == 1) {
                    s6r0Var.f162847a += this.f106628f;
                }
                return iMo100823f;
            }
            long jZzf = k5r0Var.zzf();
            long j3 = this.f106628f;
            if (jZzf != j3) {
                s6r0Var.f162847a = j3;
                return 1;
            }
            if (k5r0Var.mo140051c(this.f106623a.m197264m(), 0, 1, true)) {
                k5r0Var.zzj();
                if (this.f106632j == null) {
                    this.f106632j = new wdr0(pfr0.f148583a, 8);
                }
                k9r0 k9r0Var = new k9r0(k5r0Var, this.f106628f);
                this.f106631i = k9r0Var;
                if (this.f106632j.mo100821d(k9r0Var)) {
                    wdr0 wdr0Var2 = this.f106632j;
                    long j4 = this.f106628f;
                    m5r0 m5r0Var = this.f106624b;
                    m5r0Var.getClass();
                    wdr0Var2.mo100822e(new m9r0(j4, m5r0Var));
                    zzahe zzaheVar2 = this.f106629g;
                    zzaheVar2.getClass();
                    m130032g(zzaheVar2);
                    this.f106625c = 5;
                } else {
                    m130031b();
                }
            } else {
                m130031b();
            }
            return 0;
        }
        if (this.f106626d == 65505) {
            v6w0 v6w0Var = new v6w0(this.f106627e);
            ((z4r0) k5r0Var).mo140050b(v6w0Var.m197264m(), 0, this.f106627e, false);
            if (this.f106629g == null && "http://ns.adobe.com/xap/1.0/".equals(v6w0Var.m197249M((char) 0)) && (strM197249M = v6w0Var.m197249M((char) 0)) != null) {
                long jZzd = k5r0Var.zzd();
                if (jZzd == -1 || (j9r0VarM158565a = n9r0.m158565a(strM197249M)) == null || j9r0VarM158565a.f116955b.size() < 2) {
                    zzaheVar = null;
                } else {
                    int size = j9r0VarM158565a.f116955b.size() - 1;
                    long j5 = -1;
                    long j6 = -1;
                    long j7 = -1;
                    long j8 = -1;
                    boolean z = false;
                    while (size >= 0) {
                        i9r0 i9r0Var = (i9r0) j9r0VarM158565a.f116955b.get(size);
                        boolean zEquals = DLNAProfiles.DLNAMimeTypes.MIME_VIDEO_MPEG_4.equals(i9r0Var.f112250a) | z;
                        if (size == 0) {
                            jZzd -= i9r0Var.f112253d;
                            j = 0;
                        } else {
                            j = jZzd - i9r0Var.f112252c;
                        }
                        long j9 = j;
                        long j10 = jZzd;
                        jZzd = j9;
                        if (!zEquals || jZzd == j10) {
                            z = zEquals;
                        } else {
                            j8 = j10 - jZzd;
                            j7 = jZzd;
                            z = false;
                        }
                        if (size == 0) {
                            j6 = j10;
                        }
                        if (size == 0) {
                            j5 = jZzd;
                        }
                        size--;
                        j2 = j2;
                    }
                    long j11 = j2;
                    if (j7 == j11 || j8 == j11 || j5 == j11 || j6 == j11) {
                        zzaheVar = null;
                    } else {
                        zzaheVar = new zzahe(j5, j6, j9r0VarM158565a.f116954a, j7, j8);
                    }
                }
                this.f106629g = zzaheVar;
                if (zzaheVar != null) {
                    this.f106628f = zzaheVar.zzd;
                }
            }
        } else {
            ((z4r0) k5r0Var).m217119k(this.f106627e, false);
        }
        this.f106625c = 0;
        return 0;
    }

    /* JADX INFO: renamed from: g */
    public final void m130032g(zzbx... zzbxVarArr) {
        m5r0 m5r0Var = this.f106624b;
        m5r0Var.getClass();
        m7r0 m7r0VarMo129454i = m5r0Var.mo129454i(1024, 4);
        ter0 ter0Var = new ter0();
        ter0Var.m188593b(DLNAProfiles.DLNAMimeTypes.MIME_IMAGE_JPEG);
        ter0Var.m188611p(new zzby(-9223372036854775807L, zzbxVarArr));
        m7r0VarMo129454i.mo134531d(ter0Var.m188591D());
    }
}
