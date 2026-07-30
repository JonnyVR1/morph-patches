package p153l;

import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzahe;
import com.google.android.gms.internal.ads.zzbx;
import com.google.android.gms.internal.ads.zzby;
import java.io.IOException;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;

/* JADX INFO: loaded from: classes6.dex */
public final class nir0 implements per0 {

    /* JADX INFO: renamed from: b */
    public ser0 f142155b;

    /* JADX INFO: renamed from: c */
    public int f142156c;

    /* JADX INFO: renamed from: d */
    public int f142157d;

    /* JADX INFO: renamed from: e */
    public int f142158e;

    /* JADX INFO: renamed from: g */
    @Nullable
    public zzahe f142160g;

    /* JADX INFO: renamed from: h */
    public qer0 f142161h;

    /* JADX INFO: renamed from: i */
    public qir0 f142162i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public cnr0 f142163j;

    /* JADX INFO: renamed from: a */
    public final bgw0 f142154a = new bgw0(6);

    /* JADX INFO: renamed from: f */
    public long f142159f = -1;

    /* JADX INFO: renamed from: a */
    private final int m163305a(qer0 qer0Var) throws IOException {
        this.f142154a.m104266h(2);
        ((fer0) qer0Var).mo125313c(this.f142154a.m104271m(), 0, 2, false);
        return this.f142154a.m104249F();
    }

    /* JADX INFO: renamed from: b */
    private final void m163306b() {
        m163307g(new zzbx[0]);
        ser0 ser0Var = this.f142155b;
        ser0Var.getClass();
        ser0Var.mo101544c();
        this.f142155b.mo101551j(new agr0(-9223372036854775807L, 0L));
        this.f142156c = 6;
    }

    @Override // p153l.per0
    /* JADX INFO: renamed from: c */
    public final void mo97906c(long j, long j2) {
        if (j == 0) {
            this.f142156c = 0;
            this.f142163j = null;
        } else if (this.f142156c == 5) {
            cnr0 cnr0Var = this.f142163j;
            cnr0Var.getClass();
            cnr0Var.mo97906c(j, j2);
        }
    }

    @Override // p153l.per0
    /* JADX INFO: renamed from: d */
    public final boolean mo97907d(qer0 qer0Var) throws IOException {
        if (m163305a(qer0Var) != 65496) {
            return false;
        }
        int iM163305a = m163305a(qer0Var);
        this.f142157d = iM163305a;
        if (iM163305a == 65504) {
            this.f142154a.m104266h(2);
            fer0 fer0Var = (fer0) qer0Var;
            fer0Var.mo125313c(this.f142154a.m104271m(), 0, 2, false);
            fer0Var.m125318j(this.f142154a.m104249F() - 2, false);
            iM163305a = m163305a(qer0Var);
            this.f142157d = iM163305a;
        }
        if (iM163305a == 65505) {
            fer0 fer0Var2 = (fer0) qer0Var;
            fer0Var2.m125318j(2, false);
            this.f142154a.m104266h(6);
            fer0Var2.mo125313c(this.f142154a.m104271m(), 0, 6, false);
            if (this.f142154a.m104253J() == 1165519206 && this.f142154a.m104249F() == 0) {
                return true;
            }
        }
        return false;
    }

    @Override // p153l.per0
    /* JADX INFO: renamed from: e */
    public final void mo97908e(ser0 ser0Var) {
        this.f142155b = ser0Var;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00e6  */
    @Override // p153l.per0
    /* JADX INFO: renamed from: f */
    public final int mo97909f(qer0 qer0Var, yfr0 yfr0Var) throws IOException {
        String strM104256M;
        pir0 pir0VarM191349a;
        zzahe zzaheVar;
        long j;
        int i = this.f142156c;
        long j2 = -1;
        if (i == 0) {
            this.f142154a.m104266h(2);
            ((fer0) qer0Var).mo125312b(this.f142154a.m104271m(), 0, 2, false);
            int iM104249F = this.f142154a.m104249F();
            this.f142157d = iM104249F;
            if (iM104249F == 65498) {
                if (this.f142159f != -1) {
                    this.f142156c = 4;
                } else {
                    m163306b();
                }
            } else if ((iM104249F < 65488 || iM104249F > 65497) && iM104249F != 65281) {
                this.f142156c = 1;
            }
            return 0;
        }
        if (i == 1) {
            this.f142154a.m104266h(2);
            ((fer0) qer0Var).mo125312b(this.f142154a.m104271m(), 0, 2, false);
            this.f142158e = this.f142154a.m104249F() - 2;
            this.f142156c = 2;
            return 0;
        }
        if (i != 2) {
            if (i != 4) {
                if (i != 5) {
                    if (i == 6) {
                        return -1;
                    }
                    wpg0.m207458a();
                    return 0;
                }
                if (this.f142162i == null || qer0Var != this.f142161h) {
                    this.f142161h = qer0Var;
                    this.f142162i = new qir0(qer0Var, this.f142159f);
                }
                cnr0 cnr0Var = this.f142163j;
                cnr0Var.getClass();
                int iMo97909f = cnr0Var.mo97909f(this.f142162i, yfr0Var);
                if (iMo97909f == 1) {
                    yfr0Var.f199649a += this.f142159f;
                }
                return iMo97909f;
            }
            long jZzf = qer0Var.zzf();
            long j3 = this.f142159f;
            if (jZzf != j3) {
                yfr0Var.f199649a = j3;
                return 1;
            }
            if (qer0Var.mo125313c(this.f142154a.m104271m(), 0, 1, true)) {
                qer0Var.zzj();
                if (this.f142163j == null) {
                    this.f142163j = new cnr0(vor0.f185158a, 8);
                }
                qir0 qir0Var = new qir0(qer0Var, this.f142159f);
                this.f142162i = qir0Var;
                if (this.f142163j.mo97907d(qir0Var)) {
                    cnr0 cnr0Var2 = this.f142163j;
                    long j4 = this.f142159f;
                    ser0 ser0Var = this.f142155b;
                    ser0Var.getClass();
                    cnr0Var2.mo97908e(new sir0(j4, ser0Var));
                    zzahe zzaheVar2 = this.f142160g;
                    zzaheVar2.getClass();
                    m163307g(zzaheVar2);
                    this.f142156c = 5;
                } else {
                    m163306b();
                }
            } else {
                m163306b();
            }
            return 0;
        }
        if (this.f142157d == 65505) {
            bgw0 bgw0Var = new bgw0(this.f142158e);
            ((fer0) qer0Var).mo125312b(bgw0Var.m104271m(), 0, this.f142158e, false);
            if (this.f142160g == null && "http://ns.adobe.com/xap/1.0/".equals(bgw0Var.m104256M((char) 0)) && (strM104256M = bgw0Var.m104256M((char) 0)) != null) {
                long jZzd = qer0Var.zzd();
                if (jZzd == -1 || (pir0VarM191349a = tir0.m191349a(strM104256M)) == null || pir0VarM191349a.f152603b.size() < 2) {
                    zzaheVar = null;
                } else {
                    int size = pir0VarM191349a.f152603b.size() - 1;
                    long j5 = -1;
                    long j6 = -1;
                    long j7 = -1;
                    long j8 = -1;
                    boolean z = false;
                    while (size >= 0) {
                        oir0 oir0Var = (oir0) pir0VarM191349a.f152603b.get(size);
                        boolean zEquals = DLNAProfiles.DLNAMimeTypes.MIME_VIDEO_MPEG_4.equals(oir0Var.f147574a) | z;
                        if (size == 0) {
                            jZzd -= oir0Var.f147577d;
                            j = 0;
                        } else {
                            j = jZzd - oir0Var.f147576c;
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
                        zzaheVar = new zzahe(j5, j6, pir0VarM191349a.f152602a, j7, j8);
                    }
                }
                this.f142160g = zzaheVar;
                if (zzaheVar != null) {
                    this.f142159f = zzaheVar.zzd;
                }
            }
        } else {
            ((fer0) qer0Var).m125319k(this.f142158e, false);
        }
        this.f142156c = 0;
        return 0;
    }

    /* JADX INFO: renamed from: g */
    public final void m163307g(zzbx... zzbxVarArr) {
        ser0 ser0Var = this.f142155b;
        ser0Var.getClass();
        sgr0 sgr0VarMo101550i = ser0Var.mo101550i(1024, 4);
        znr0 znr0Var = new znr0();
        znr0Var.m220647b(DLNAProfiles.DLNAMimeTypes.MIME_IMAGE_JPEG);
        znr0Var.m220665p(new zzby(-9223372036854775807L, zzbxVarArr));
        sgr0VarMo101550i.mo99373d(znr0Var.m220645D());
    }
}
