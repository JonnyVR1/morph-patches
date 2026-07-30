package p149l;

import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzs;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes6.dex */
public final class psv0 implements mxt0, pzt0, puv0, dfy0, h0u0, zxt0, a7u0 {

    /* JADX INFO: renamed from: a */
    public final xzv0 f151066a;

    /* JADX INFO: renamed from: b */
    public final AtomicReference f151067b = new AtomicReference();

    /* JADX INFO: renamed from: c */
    public final AtomicReference f151068c = new AtomicReference();

    /* JADX INFO: renamed from: d */
    public final AtomicReference f151069d = new AtomicReference();

    /* JADX INFO: renamed from: e */
    public final AtomicReference f151070e = new AtomicReference();

    /* JADX INFO: renamed from: f */
    public final AtomicReference f151071f = new AtomicReference();

    /* JADX INFO: renamed from: g */
    public final AtomicReference f151072g = new AtomicReference();

    /* JADX INFO: renamed from: h */
    public psv0 f151073h = null;

    public psv0(xzv0 xzv0Var) {
        this.f151066a = xzv0Var;
    }

    /* JADX INFO: renamed from: i */
    public static psv0 m171248i(psv0 psv0Var) {
        psv0 psv0Var2 = new psv0(psv0Var.f151066a);
        psv0Var2.f151073h = psv0Var;
        return psv0Var2;
    }

    /* JADX INFO: renamed from: A */
    public final void m171249A(dfy0 dfy0Var) {
        this.f151071f.set(dfy0Var);
    }

    /* JADX INFO: renamed from: B */
    public final void m171250B(s3u0 s3u0Var) {
        this.f151072g.set(s3u0Var);
    }

    /* JADX INFO: renamed from: D */
    public final void m171251D(q1s0 q1s0Var) {
        this.f151067b.set(q1s0Var);
    }

    /* JADX INFO: renamed from: K */
    public final void m171252K(u1s0 u1s0Var) {
        this.f151069d.set(u1s0Var);
    }

    @Override // p149l.dfy0
    /* JADX INFO: renamed from: O */
    public final void mo102679O() {
        psv0 psv0Var = this.f151073h;
        if (psv0Var != null) {
            psv0Var.mo102679O();
        } else {
            auv0.m99090a(this.f151071f, new ztv0() { // from class: l.yrv0
                @Override // p149l.ztv0
                public final void zza(Object obj) {
                    ((dfy0) obj).mo102679O();
                }
            });
        }
    }

    @Override // p149l.dfy0
    /* JADX INFO: renamed from: P2 */
    public final void mo102681P2() {
        psv0 psv0Var = this.f151073h;
        if (psv0Var != null) {
            psv0Var.mo102681P2();
            return;
        }
        auv0.m99090a(this.f151071f, new ztv0() { // from class: l.osv0
            @Override // p149l.ztv0
            public final void zza(Object obj) {
                ((dfy0) obj).mo102681P2();
            }
        });
        auv0.m99090a(this.f151069d, new ztv0() { // from class: l.wrv0
            @Override // p149l.ztv0
            public final void zza(Object obj) throws RemoteException {
                ((u1s0) obj).zzf();
            }
        });
        auv0.m99090a(this.f151069d, new ztv0() { // from class: l.xrv0
            @Override // p149l.ztv0
            public final void zza(Object obj) throws RemoteException {
                ((u1s0) obj).zze();
            }
        });
    }

    @Override // p149l.h0u0
    /* JADX INFO: renamed from: b */
    public final void mo128978b(@NonNull final zzs zzsVar) {
        psv0 psv0Var = this.f151073h;
        if (psv0Var != null) {
            psv0Var.mo128978b(zzsVar);
        } else {
            auv0.m99090a(this.f151072g, new ztv0() { // from class: l.vrv0
                @Override // p149l.ztv0
                public final void zza(Object obj) throws RemoteException {
                    ((s3u0) obj).mo119144F3(zzsVar);
                }
            });
        }
    }

    @Override // p149l.zxt0
    /* JADX INFO: renamed from: k */
    public final void mo134396k(final zze zzeVar) {
        psv0 psv0Var = this.f151073h;
        if (psv0Var != null) {
            psv0Var.mo134396k(zzeVar);
        } else {
            auv0.m99090a(this.f151069d, new ztv0() { // from class: l.zrv0
                @Override // p149l.ztv0
                public final void zza(Object obj) throws RemoteException {
                    ((u1s0) obj).mo144231i0(zzeVar);
                }
            });
        }
    }

    @Override // p149l.dfy0
    /* JADX INFO: renamed from: m4 */
    public final void mo102686m4() {
        psv0 psv0Var = this.f151073h;
        if (psv0Var != null) {
            psv0Var.mo102686m4();
        } else {
            auv0.m99090a(this.f151071f, new ztv0() { // from class: l.nsv0
                @Override // p149l.ztv0
                public final void zza(Object obj) {
                    ((dfy0) obj).mo102686m4();
                }
            });
        }
    }

    @Override // p149l.dfy0
    /* JADX INFO: renamed from: m5 */
    public final void mo102687m5(final int i) {
        psv0 psv0Var = this.f151073h;
        if (psv0Var != null) {
            psv0Var.mo102687m5(i);
        } else {
            auv0.m99090a(this.f151071f, new ztv0() { // from class: l.jsv0
                @Override // p149l.ztv0
                public final void zza(Object obj) {
                    ((dfy0) obj).mo102687m5(i);
                }
            });
        }
    }

    @Override // p149l.puv0
    /* JADX INFO: renamed from: q */
    public final void mo138773q(puv0 puv0Var) {
        this.f151073h = (psv0) puv0Var;
    }

    @Override // p149l.mxt0
    /* JADX INFO: renamed from: u */
    public final void mo97693u(final zze zzeVar) {
        psv0 psv0Var = this.f151073h;
        if (psv0Var != null) {
            psv0Var.mo97693u(zzeVar);
        } else {
            auv0.m99090a(this.f151067b, new ztv0() { // from class: l.ksv0
                @Override // p149l.ztv0
                public final void zza(Object obj) throws RemoteException {
                    ((q1s0) obj).mo134007K7(zzeVar);
                }
            });
            auv0.m99090a(this.f151067b, new ztv0() { // from class: l.lsv0
                @Override // p149l.ztv0
                public final void zza(Object obj) throws RemoteException {
                    ((q1s0) obj).mo134008e(zzeVar.zza);
                }
            });
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m171253x() {
        psv0 psv0Var = this.f151073h;
        if (psv0Var != null) {
            psv0Var.m171253x();
            return;
        }
        this.f151066a.m212020a();
        auv0.m99090a(this.f151068c, new ztv0() { // from class: l.hsv0
            @Override // p149l.ztv0
            public final void zza(Object obj) throws RemoteException {
                ((r1s0) obj).zza();
            }
        });
        auv0.m99090a(this.f151069d, new ztv0() { // from class: l.isv0
            @Override // p149l.ztv0
            public final void zza(Object obj) throws RemoteException {
                ((u1s0) obj).zzc();
            }
        });
    }

    /* JADX INFO: renamed from: z */
    public final void m171254z(final n1s0 n1s0Var) {
        psv0 psv0Var = this.f151073h;
        if (psv0Var != null) {
            psv0Var.m171254z(n1s0Var);
        } else {
            auv0.m99090a(this.f151067b, new ztv0() { // from class: l.fsv0
                @Override // p149l.ztv0
                public final void zza(Object obj) throws RemoteException {
                    ((q1s0) obj).mo134006K3(n1s0Var);
                }
            });
        }
    }

    @Override // p149l.pzt0
    public final void zzg() {
        psv0 psv0Var = this.f151073h;
        if (psv0Var != null) {
            psv0Var.zzg();
        } else {
            auv0.m99090a(this.f151070e, new ztv0() { // from class: l.msv0
                @Override // p149l.ztv0
                public final void zza(Object obj) {
                    ((pzt0) obj).zzg();
                }
            });
        }
    }

    @Override // p149l.a7u0
    public final void zzs() {
        psv0 psv0Var = this.f151073h;
        if (psv0Var != null) {
            psv0Var.zzs();
        } else {
            auv0.m99090a(this.f151069d, new ztv0() { // from class: l.gsv0
                @Override // p149l.ztv0
                public final void zza(Object obj) throws RemoteException {
                    ((u1s0) obj).zzb();
                }
            });
        }
    }

    @Override // p149l.dfy0
    /* JADX INFO: renamed from: M6 */
    public final void mo102678M6() {
    }

    @Override // p149l.dfy0
    /* JADX INFO: renamed from: g7 */
    public final void mo102683g7() {
    }

    @Override // p149l.a7u0
    public final void zzbo() {
    }
}
