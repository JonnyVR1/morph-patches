package p153l;

import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzs;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes6.dex */
public final class v1w0 implements s6u0, v8u0, v3w0, joy0, n9u0, f7u0, ggu0 {

    /* JADX INFO: renamed from: a */
    public final d9w0 f182021a;

    /* JADX INFO: renamed from: b */
    public final AtomicReference f182022b = new AtomicReference();

    /* JADX INFO: renamed from: c */
    public final AtomicReference f182023c = new AtomicReference();

    /* JADX INFO: renamed from: d */
    public final AtomicReference f182024d = new AtomicReference();

    /* JADX INFO: renamed from: e */
    public final AtomicReference f182025e = new AtomicReference();

    /* JADX INFO: renamed from: f */
    public final AtomicReference f182026f = new AtomicReference();

    /* JADX INFO: renamed from: g */
    public final AtomicReference f182027g = new AtomicReference();

    /* JADX INFO: renamed from: h */
    public v1w0 f182028h = null;

    public v1w0(d9w0 d9w0Var) {
        this.f182021a = d9w0Var;
    }

    /* JADX INFO: renamed from: i */
    public static v1w0 m199083i(v1w0 v1w0Var) {
        v1w0 v1w0Var2 = new v1w0(v1w0Var.f182021a);
        v1w0Var2.f182028h = v1w0Var;
        return v1w0Var2;
    }

    /* JADX INFO: renamed from: A */
    public final void m199084A(joy0 joy0Var) {
        this.f182026f.set(joy0Var);
    }

    /* JADX INFO: renamed from: B */
    public final void m199085B(ycu0 ycu0Var) {
        this.f182027g.set(ycu0Var);
    }

    /* JADX INFO: renamed from: D */
    public final void m199086D(was0 was0Var) {
        this.f182022b.set(was0Var);
    }

    /* JADX INFO: renamed from: K */
    public final void m199087K(abs0 abs0Var) {
        this.f182024d.set(abs0Var);
    }

    @Override // p153l.joy0
    /* JADX INFO: renamed from: O */
    public final void mo113754O() {
        v1w0 v1w0Var = this.f182028h;
        if (v1w0Var != null) {
            v1w0Var.mo113754O();
        } else {
            g3w0.m128762a(this.f182026f, new f3w0() { // from class: l.e1w0
                @Override // p153l.f3w0
                public final void zza(Object obj) {
                    ((joy0) obj).mo113754O();
                }
            });
        }
    }

    @Override // p153l.joy0
    /* JADX INFO: renamed from: P2 */
    public final void mo113755P2() {
        v1w0 v1w0Var = this.f182028h;
        if (v1w0Var != null) {
            v1w0Var.mo113755P2();
            return;
        }
        g3w0.m128762a(this.f182026f, new f3w0() { // from class: l.u1w0
            @Override // p153l.f3w0
            public final void zza(Object obj) {
                ((joy0) obj).mo113755P2();
            }
        });
        g3w0.m128762a(this.f182024d, new f3w0() { // from class: l.c1w0
            @Override // p153l.f3w0
            public final void zza(Object obj) throws RemoteException {
                ((abs0) obj).zzf();
            }
        });
        g3w0.m128762a(this.f182024d, new f3w0() { // from class: l.d1w0
            @Override // p153l.f3w0
            public final void zza(Object obj) throws RemoteException {
                ((abs0) obj).zze();
            }
        });
    }

    @Override // p153l.n9u0
    /* JADX INFO: renamed from: b */
    public final void mo162050b(@NonNull final zzs zzsVar) {
        v1w0 v1w0Var = this.f182028h;
        if (v1w0Var != null) {
            v1w0Var.mo162050b(zzsVar);
        } else {
            g3w0.m128762a(this.f182027g, new f3w0() { // from class: l.b1w0
                @Override // p153l.f3w0
                public final void zza(Object obj) throws RemoteException {
                    ((ycu0) obj).mo153539F3(zzsVar);
                }
            });
        }
    }

    @Override // p153l.f7u0
    /* JADX INFO: renamed from: k */
    public final void mo124507k(final zze zzeVar) {
        v1w0 v1w0Var = this.f182028h;
        if (v1w0Var != null) {
            v1w0Var.mo124507k(zzeVar);
        } else {
            g3w0.m128762a(this.f182024d, new f3w0() { // from class: l.f1w0
                @Override // p153l.f3w0
                public final void zza(Object obj) throws RemoteException {
                    ((abs0) obj).mo96779i0(zzeVar);
                }
            });
        }
    }

    @Override // p153l.joy0
    /* JADX INFO: renamed from: m4 */
    public final void mo113768m4() {
        v1w0 v1w0Var = this.f182028h;
        if (v1w0Var != null) {
            v1w0Var.mo113768m4();
        } else {
            g3w0.m128762a(this.f182026f, new f3w0() { // from class: l.t1w0
                @Override // p153l.f3w0
                public final void zza(Object obj) {
                    ((joy0) obj).mo113768m4();
                }
            });
        }
    }

    @Override // p153l.joy0
    /* JADX INFO: renamed from: m5 */
    public final void mo113769m5(final int i) {
        v1w0 v1w0Var = this.f182028h;
        if (v1w0Var != null) {
            v1w0Var.mo113769m5(i);
        } else {
            g3w0.m128762a(this.f182026f, new f3w0() { // from class: l.p1w0
                @Override // p153l.f3w0
                public final void zza(Object obj) {
                    ((joy0) obj).mo113769m5(i);
                }
            });
        }
    }

    @Override // p153l.v3w0
    /* JADX INFO: renamed from: q */
    public final void mo166178q(v3w0 v3w0Var) {
        this.f182028h = (v1w0) v3w0Var;
    }

    @Override // p153l.s6u0
    /* JADX INFO: renamed from: u */
    public final void mo103145u(final zze zzeVar) {
        v1w0 v1w0Var = this.f182028h;
        if (v1w0Var != null) {
            v1w0Var.mo103145u(zzeVar);
        } else {
            g3w0.m128762a(this.f182022b, new f3w0() { // from class: l.q1w0
                @Override // p153l.f3w0
                public final void zza(Object obj) throws RemoteException {
                    ((was0) obj).mo166851K7(zzeVar);
                }
            });
            g3w0.m128762a(this.f182022b, new f3w0() { // from class: l.r1w0
                @Override // p153l.f3w0
                public final void zza(Object obj) throws RemoteException {
                    ((was0) obj).mo166852e(zzeVar.zza);
                }
            });
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m199088x() {
        v1w0 v1w0Var = this.f182028h;
        if (v1w0Var != null) {
            v1w0Var.m199088x();
            return;
        }
        this.f182021a.m115099a();
        g3w0.m128762a(this.f182023c, new f3w0() { // from class: l.n1w0
            @Override // p153l.f3w0
            public final void zza(Object obj) throws RemoteException {
                ((xas0) obj).zza();
            }
        });
        g3w0.m128762a(this.f182024d, new f3w0() { // from class: l.o1w0
            @Override // p153l.f3w0
            public final void zza(Object obj) throws RemoteException {
                ((abs0) obj).zzc();
            }
        });
    }

    /* JADX INFO: renamed from: z */
    public final void m199089z(final tas0 tas0Var) {
        v1w0 v1w0Var = this.f182028h;
        if (v1w0Var != null) {
            v1w0Var.m199089z(tas0Var);
        } else {
            g3w0.m128762a(this.f182022b, new f3w0() { // from class: l.l1w0
                @Override // p153l.f3w0
                public final void zza(Object obj) throws RemoteException {
                    ((was0) obj).mo166850K3(tas0Var);
                }
            });
        }
    }

    @Override // p153l.v8u0
    public final void zzg() {
        v1w0 v1w0Var = this.f182028h;
        if (v1w0Var != null) {
            v1w0Var.zzg();
        } else {
            g3w0.m128762a(this.f182025e, new f3w0() { // from class: l.s1w0
                @Override // p153l.f3w0
                public final void zza(Object obj) {
                    ((v8u0) obj).zzg();
                }
            });
        }
    }

    @Override // p153l.ggu0
    public final void zzs() {
        v1w0 v1w0Var = this.f182028h;
        if (v1w0Var != null) {
            v1w0Var.zzs();
        } else {
            g3w0.m128762a(this.f182024d, new f3w0() { // from class: l.m1w0
                @Override // p153l.f3w0
                public final void zza(Object obj) throws RemoteException {
                    ((abs0) obj).zzb();
                }
            });
        }
    }

    @Override // p153l.joy0
    /* JADX INFO: renamed from: M6 */
    public final void mo113753M6() {
    }

    @Override // p153l.joy0
    /* JADX INFO: renamed from: g7 */
    public final void mo113765g7() {
    }

    @Override // p153l.ggu0
    public final void zzbo() {
    }
}
