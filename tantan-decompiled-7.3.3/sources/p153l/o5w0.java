package p153l;

import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzs;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes6.dex */
public final class o5w0 implements gl50, k8u0, s6u0, i6u0, f7u0, n9u0, v3w0, ggu0 {

    /* JADX INFO: renamed from: a */
    public final d9w0 f145112a;

    /* JADX INFO: renamed from: b */
    public final AtomicReference f145113b = new AtomicReference();

    /* JADX INFO: renamed from: c */
    public final AtomicReference f145114c = new AtomicReference();

    /* JADX INFO: renamed from: d */
    public final AtomicReference f145115d = new AtomicReference();

    /* JADX INFO: renamed from: e */
    public final AtomicReference f145116e = new AtomicReference();

    /* JADX INFO: renamed from: f */
    public final AtomicReference f145117f = new AtomicReference();

    /* JADX INFO: renamed from: g */
    public final AtomicReference f145118g = new AtomicReference();

    /* JADX INFO: renamed from: h */
    public final AtomicReference f145119h = new AtomicReference();

    public o5w0(d9w0 d9w0Var) {
        this.f145112a = d9w0Var;
    }

    /* JADX INFO: renamed from: A */
    public final void m166172A(ycu0 ycu0Var) {
        this.f145119h.set(ycu0Var);
    }

    /* JADX INFO: renamed from: B */
    public final void m166173B(o7t0 o7t0Var) {
        this.f145115d.set(o7t0Var);
    }

    /* JADX INFO: renamed from: D */
    public final void m166174D(s7t0 s7t0Var) {
        this.f145114c.set(s7t0Var);
    }

    @Deprecated
    /* JADX INFO: renamed from: K */
    public final void m166175K(a7t0 a7t0Var) {
        this.f145116e.set(a7t0Var);
    }

    @Deprecated
    /* JADX INFO: renamed from: O */
    public final void m166176O(g5t0 g5t0Var) {
        this.f145118g.set(g5t0Var);
    }

    /* JADX INFO: renamed from: P */
    public final void m166177P(t7t0 t7t0Var) {
        this.f145117f.set(t7t0Var);
    }

    @Override // p153l.n9u0
    /* JADX INFO: renamed from: b */
    public final void mo162050b(@NonNull final zzs zzsVar) {
        g3w0.m128762a(this.f145119h, new f3w0() { // from class: l.z4w0
            @Override // p153l.f3w0
            public final void zza(Object obj) throws RemoteException {
                ((ycu0) obj).mo153539F3(zzsVar);
            }
        });
    }

    @Override // p153l.i6u0
    /* JADX INFO: renamed from: i */
    public final void mo107087i(final f5t0 f5t0Var, final String str, final String str2) {
        g3w0.m128762a(this.f145115d, new f3w0() { // from class: l.n5w0
            @Override // p153l.f3w0
            public final void zza(Object obj) throws RemoteException {
                f5t0 f5t0Var2 = f5t0Var;
                ((o7t0) obj).mo148751u6(new j8t0(f5t0Var2.zzc(), f5t0Var2.zzb()));
            }
        });
        g3w0.m128762a(this.f145117f, new f3w0() { // from class: l.p4w0
            @Override // p153l.f3w0
            public final void zza(Object obj) throws RemoteException {
                f5t0 f5t0Var2 = f5t0Var;
                ((t7t0) obj).m189634m4(new j8t0(f5t0Var2.zzc(), f5t0Var2.zzb()), str, str2);
            }
        });
        g3w0.m128762a(this.f145116e, new f3w0() { // from class: l.q4w0
            @Override // p153l.f3w0
            public final void zza(Object obj) throws RemoteException {
                ((a7t0) obj).mo96382e5(f5t0Var);
            }
        });
        g3w0.m128762a(this.f145118g, new f3w0() { // from class: l.r4w0
            @Override // p153l.f3w0
            public final void zza(Object obj) throws RemoteException {
                ((g5t0) obj).m129074m4(f5t0Var, str, str2);
            }
        });
    }

    @Override // p153l.f7u0
    /* JADX INFO: renamed from: k */
    public final void mo124507k(final zze zzeVar) {
        g3w0.m128762a(this.f145115d, new f3w0() { // from class: l.e5w0
            @Override // p153l.f3w0
            public final void zza(Object obj) throws RemoteException {
                ((o7t0) obj).mo148748a6(zzeVar);
            }
        });
        g3w0.m128762a(this.f145115d, new f3w0() { // from class: l.f5w0
            @Override // p153l.f3w0
            public final void zza(Object obj) throws RemoteException {
                ((o7t0) obj).zzh(zzeVar.zza);
            }
        });
    }

    @Override // p153l.v3w0
    /* JADX INFO: renamed from: q */
    public final void mo166178q(v3w0 v3w0Var) {
        throw null;
    }

    @Override // p153l.s6u0
    /* JADX INFO: renamed from: u */
    public final void mo103145u(final zze zzeVar) {
        final int i = zzeVar.zza;
        g3w0.m128762a(this.f145114c, new f3w0() { // from class: l.h5w0
            @Override // p153l.f3w0
            public final void zza(Object obj) throws RemoteException {
                ((s7t0) obj).mo133955f(zzeVar);
            }
        });
        g3w0.m128762a(this.f145114c, new f3w0() { // from class: l.i5w0
            @Override // p153l.f3w0
            public final void zza(Object obj) throws RemoteException {
                ((s7t0) obj).zze(i);
            }
        });
        g3w0.m128762a(this.f145116e, new f3w0() { // from class: l.j5w0
            @Override // p153l.f3w0
            public final void zza(Object obj) throws RemoteException {
                ((a7t0) obj).zzg(i);
            }
        });
    }

    @Override // p153l.gl50
    /* JADX INFO: renamed from: x */
    public final void mo124324x() {
        g3w0.m128762a(this.f145113b, new f3w0() { // from class: l.c5w0
            @Override // p153l.f3w0
            public final void zza(Object obj) {
                ((gl50) obj).mo124324x();
            }
        });
    }

    /* JADX INFO: renamed from: z */
    public final void m166179z(gl50 gl50Var) {
        this.f145113b.set(gl50Var);
    }

    @Override // p153l.i6u0
    public final void zza() {
        this.f145112a.m115099a();
        g3w0.m128762a(this.f145115d, new f3w0() { // from class: l.k5w0
            @Override // p153l.f3w0
            public final void zza(Object obj) throws RemoteException {
                ((o7t0) obj).zzg();
            }
        });
        g3w0.m128762a(this.f145116e, new f3w0() { // from class: l.l5w0
            @Override // p153l.f3w0
            public final void zza(Object obj) throws RemoteException {
                ((a7t0) obj).zzf();
            }
        });
    }

    @Override // p153l.i6u0
    public final void zzb() {
        g3w0.m128762a(this.f145116e, new f3w0() { // from class: l.m5w0
            @Override // p153l.f3w0
            public final void zza(Object obj) throws RemoteException {
                ((a7t0) obj).zzh();
            }
        });
    }

    @Override // p153l.i6u0
    public final void zzc() {
        g3w0.m128762a(this.f145115d, new f3w0() { // from class: l.s4w0
            @Override // p153l.f3w0
            public final void zza(Object obj) throws RemoteException {
                ((o7t0) obj).zzj();
            }
        });
        g3w0.m128762a(this.f145116e, new f3w0() { // from class: l.t4w0
            @Override // p153l.f3w0
            public final void zza(Object obj) throws RemoteException {
                ((a7t0) obj).zzj();
            }
        });
        g3w0.m128762a(this.f145115d, new f3w0() { // from class: l.u4w0
            @Override // p153l.f3w0
            public final void zza(Object obj) throws RemoteException {
                ((o7t0) obj).zzf();
            }
        });
    }

    @Override // p153l.i6u0
    public final void zze() {
        g3w0.m128762a(this.f145116e, new f3w0() { // from class: l.g5w0
            @Override // p153l.f3w0
            public final void zza(Object obj) throws RemoteException {
                ((a7t0) obj).zzk();
            }
        });
    }

    @Override // p153l.i6u0
    public final void zzf() {
        g3w0.m128762a(this.f145116e, new f3w0() { // from class: l.o4w0
            @Override // p153l.f3w0
            public final void zza(Object obj) throws RemoteException {
                ((a7t0) obj).zzl();
            }
        });
    }

    @Override // p153l.k8u0
    public final void zzr() {
        g3w0.m128762a(this.f145114c, new f3w0() { // from class: l.a5w0
            @Override // p153l.f3w0
            public final void zza(Object obj) throws RemoteException {
                ((s7t0) obj).zzg();
            }
        });
        g3w0.m128762a(this.f145116e, new f3w0() { // from class: l.b5w0
            @Override // p153l.f3w0
            public final void zza(Object obj) throws RemoteException {
                ((a7t0) obj).zzi();
            }
        });
    }

    @Override // p153l.ggu0
    public final void zzs() {
        g3w0.m128762a(this.f145115d, new f3w0() { // from class: l.d5w0
            @Override // p153l.f3w0
            public final void zza(Object obj) throws RemoteException {
                ((o7t0) obj).zze();
            }
        });
    }

    @Override // p153l.ggu0
    public final void zzbo() {
    }
}
