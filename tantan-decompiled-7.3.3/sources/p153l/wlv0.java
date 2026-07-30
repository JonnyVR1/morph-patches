package p153l;

import android.os.RemoteException;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.internal.ads.zzbze;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes6.dex */
public final class wlv0 implements mv0, x9u0, k8u0, s6u0, j7u0, har0, i6u0, n9u0, f7u0, ggu0 {

    /* JADX INFO: renamed from: i */
    @Nullable
    public final vcw0 f189743i;

    /* JADX INFO: renamed from: a */
    public final AtomicReference f189735a = new AtomicReference();

    /* JADX INFO: renamed from: b */
    public final AtomicReference f189736b = new AtomicReference();

    /* JADX INFO: renamed from: c */
    public final AtomicReference f189737c = new AtomicReference();

    /* JADX INFO: renamed from: d */
    public final AtomicReference f189738d = new AtomicReference();

    /* JADX INFO: renamed from: e */
    public final AtomicReference f189739e = new AtomicReference();

    /* JADX INFO: renamed from: f */
    public final AtomicBoolean f189740f = new AtomicBoolean(true);

    /* JADX INFO: renamed from: g */
    public final AtomicBoolean f189741g = new AtomicBoolean(false);

    /* JADX INFO: renamed from: h */
    public final AtomicBoolean f189742h = new AtomicBoolean(false);

    /* JADX INFO: renamed from: j */
    @VisibleForTesting
    public final BlockingQueue f189744j = new ArrayBlockingQueue(((Integer) jas0.m144075c().m176505a(sgs0.f168044K8)).intValue());

    public wlv0(@Nullable vcw0 vcw0Var) {
        this.f189743i = vcw0Var;
    }

    /* JADX INFO: renamed from: S */
    private final void m207073S() {
        if (this.f189741g.get() && this.f189742h.get()) {
            for (final Pair pair : this.f189744j) {
                g3w0.m128762a(this.f189736b, new f3w0() { // from class: l.blv0
                    @Override // p153l.f3w0
                    public final void zza(Object obj) throws RemoteException {
                        Pair pair2 = pair;
                        ((y7t0) obj).mo157062d0((String) pair2.first, (String) pair2.second);
                    }
                });
            }
            this.f189744j.clear();
            this.f189740f.set(false);
        }
    }

    @Override // p153l.x9u0
    /* JADX INFO: renamed from: A */
    public final void mo107082A(b7w0 b7w0Var) {
        this.f189740f.set(true);
        this.f189742h.set(false);
    }

    /* JADX INFO: renamed from: B */
    public final synchronized y7t0 m207074B() {
        return (y7t0) this.f189736b.get();
    }

    /* JADX INFO: renamed from: D */
    public final void m207075D(xhs0 xhs0Var) {
        this.f189735a.set(xhs0Var);
    }

    /* JADX INFO: renamed from: K */
    public final void m207076K(uls0 uls0Var) {
        this.f189738d.set(uls0Var);
    }

    /* JADX INFO: renamed from: O */
    public final void m207077O(ycu0 ycu0Var) {
        this.f189737c.set(ycu0Var);
    }

    /* JADX INFO: renamed from: P */
    public final void m207078P(y7t0 y7t0Var) {
        this.f189736b.set(y7t0Var);
        this.f189741g.set(true);
        m207073S();
    }

    /* JADX INFO: renamed from: R */
    public final void m207079R(ygt0 ygt0Var) {
        this.f189739e.set(ygt0Var);
    }

    @Override // p153l.j7u0
    /* JADX INFO: renamed from: a */
    public final void mo106809a() {
        g3w0.m128762a(this.f189735a, new f3w0() { // from class: l.xkv0
            @Override // p153l.f3w0
            public final void zza(Object obj) throws RemoteException {
                ((xhs0) obj).zzg();
            }
        });
    }

    @Override // p153l.n9u0
    /* JADX INFO: renamed from: b */
    public final void mo162050b(@NonNull final zzs zzsVar) {
        g3w0.m128762a(this.f189737c, new f3w0() { // from class: l.vlv0
            @Override // p153l.f3w0
            public final void zza(Object obj) throws RemoteException {
                ((ycu0) obj).mo153539F3(zzsVar);
            }
        });
    }

    @Override // p153l.f7u0
    /* JADX INFO: renamed from: k */
    public final void mo124507k(final zze zzeVar) {
        g3w0.m128762a(this.f189739e, new f3w0() { // from class: l.hlv0
            @Override // p153l.f3w0
            public final void zza(Object obj) throws RemoteException {
                ((ygt0) obj).mo172061i0(zzeVar);
            }
        });
    }

    @Override // p153l.har0
    public final void onAdClicked() {
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168394ma)).booleanValue()) {
            return;
        }
        g3w0.m128762a(this.f189735a, ulv0.f179582a);
    }

    @Override // p153l.mv0
    /* JADX INFO: renamed from: q */
    public final synchronized void mo96610q(final String str, final String str2) {
        if (!this.f189740f.get()) {
            g3w0.m128762a(this.f189736b, new f3w0() { // from class: l.ilv0
                @Override // p153l.f3w0
                public final void zza(Object obj) throws RemoteException {
                    ((y7t0) obj).mo157062d0(str, str2);
                }
            });
            return;
        }
        if (!this.f189744j.offer(new Pair(str, str2))) {
            dct0.m115293b("The queue for app events is full, dropping the new event.");
            vcw0 vcw0Var = this.f189743i;
            if (vcw0Var != null) {
                ucw0 ucw0VarM195443b = ucw0.m195443b("dae_action");
                ucw0VarM195443b.m195445a("dae_name", str);
                ucw0VarM195443b.m195445a("dae_data", str2);
                vcw0Var.mo125151a(ucw0VarM195443b);
            }
        }
    }

    @Override // p153l.s6u0
    /* JADX INFO: renamed from: u */
    public final void mo103145u(final zze zzeVar) {
        g3w0.m128762a(this.f189735a, new f3w0() { // from class: l.clv0
            @Override // p153l.f3w0
            public final void zza(Object obj) throws RemoteException {
                ((xhs0) obj).mo127000f(zzeVar);
            }
        });
        g3w0.m128762a(this.f189735a, new f3w0() { // from class: l.dlv0
            @Override // p153l.f3w0
            public final void zza(Object obj) throws RemoteException {
                ((xhs0) obj).zze(zzeVar.zza);
            }
        });
        g3w0.m128762a(this.f189738d, new f3w0() { // from class: l.elv0
            @Override // p153l.f3w0
            public final void zza(Object obj) throws RemoteException {
                ((uls0) obj).mo130546t0(zzeVar);
            }
        });
        this.f189740f.set(false);
        this.f189744j.clear();
    }

    /* JADX INFO: renamed from: z */
    public final synchronized xhs0 m207080z() {
        return (xhs0) this.f189735a.get();
    }

    @Override // p153l.i6u0
    public final void zza() {
        g3w0.m128762a(this.f189735a, new f3w0() { // from class: l.ykv0
            @Override // p153l.f3w0
            public final void zza(Object obj) throws RemoteException {
                ((xhs0) obj).zzd();
            }
        });
        g3w0.m128762a(this.f189739e, new f3w0() { // from class: l.zkv0
            @Override // p153l.f3w0
            public final void zza(Object obj) throws RemoteException {
                ((ygt0) obj).zzc();
            }
        });
    }

    @Override // p153l.i6u0
    public final void zzb() {
        g3w0.m128762a(this.f189735a, new f3w0() { // from class: l.jlv0
            @Override // p153l.f3w0
            public final void zza(Object obj) throws RemoteException {
                ((xhs0) obj).zzh();
            }
        });
    }

    @Override // p153l.ggu0
    public final void zzbo() {
        g3w0.m128762a(this.f189735a, new f3w0() { // from class: l.klv0
            @Override // p153l.f3w0
            public final void zza(Object obj) throws RemoteException {
                ((xhs0) obj).zzk();
            }
        });
    }

    @Override // p153l.i6u0
    public final void zzc() {
        g3w0.m128762a(this.f189735a, new f3w0() { // from class: l.llv0
            @Override // p153l.f3w0
            public final void zza(Object obj) throws RemoteException {
                ((xhs0) obj).zzj();
            }
        });
        g3w0.m128762a(this.f189739e, new f3w0() { // from class: l.slv0
            @Override // p153l.f3w0
            public final void zza(Object obj) throws RemoteException {
                ((ygt0) obj).zzf();
            }
        });
        g3w0.m128762a(this.f189739e, new f3w0() { // from class: l.tlv0
            @Override // p153l.f3w0
            public final void zza(Object obj) throws RemoteException {
                ((ygt0) obj).zze();
            }
        });
    }

    @Override // p153l.k8u0
    public final synchronized void zzr() {
        g3w0.m128762a(this.f189735a, new f3w0() { // from class: l.flv0
            @Override // p153l.f3w0
            public final void zza(Object obj) throws RemoteException {
                ((xhs0) obj).zzi();
            }
        });
        g3w0.m128762a(this.f189738d, new f3w0() { // from class: l.glv0
            @Override // p153l.f3w0
            public final void zza(Object obj) throws RemoteException {
                ((uls0) obj).zzc();
            }
        });
        this.f189742h.set(true);
        m207073S();
    }

    @Override // p153l.ggu0
    public final void zzs() {
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168394ma)).booleanValue()) {
            g3w0.m128762a(this.f189735a, ulv0.f179582a);
        }
        g3w0.m128762a(this.f189739e, new f3w0() { // from class: l.alv0
            @Override // p153l.f3w0
            public final void zza(Object obj) throws RemoteException {
                ((ygt0) obj).zzb();
            }
        });
    }

    @Override // p153l.i6u0
    public final void zze() {
    }

    @Override // p153l.i6u0
    public final void zzf() {
    }

    @Override // p153l.x9u0
    /* JADX INFO: renamed from: x */
    public final void mo107088x(zzbze zzbzeVar) {
    }

    @Override // p153l.i6u0
    /* JADX INFO: renamed from: i */
    public final void mo107087i(f5t0 f5t0Var, String str, String str2) {
    }
}
