package p149l;

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
public final class qcv0 implements fv0, r0u0, ezt0, mxt0, dyt0, b1r0, cxt0, h0u0, zxt0, a7u0 {

    /* JADX INFO: renamed from: i */
    @Nullable
    public final p3w0 f153841i;

    /* JADX INFO: renamed from: a */
    public final AtomicReference f153833a = new AtomicReference();

    /* JADX INFO: renamed from: b */
    public final AtomicReference f153834b = new AtomicReference();

    /* JADX INFO: renamed from: c */
    public final AtomicReference f153835c = new AtomicReference();

    /* JADX INFO: renamed from: d */
    public final AtomicReference f153836d = new AtomicReference();

    /* JADX INFO: renamed from: e */
    public final AtomicReference f153837e = new AtomicReference();

    /* JADX INFO: renamed from: f */
    public final AtomicBoolean f153838f = new AtomicBoolean(true);

    /* JADX INFO: renamed from: g */
    public final AtomicBoolean f153839g = new AtomicBoolean(false);

    /* JADX INFO: renamed from: h */
    public final AtomicBoolean f153840h = new AtomicBoolean(false);

    /* JADX INFO: renamed from: j */
    @VisibleForTesting
    public final BlockingQueue f153842j = new ArrayBlockingQueue(((Integer) d1s0.m109677c().m144697a(m7s0.f131973K8)).intValue());

    public qcv0(@Nullable p3w0 p3w0Var) {
        this.f153841i = p3w0Var;
    }

    /* JADX INFO: renamed from: S */
    private final void m173926S() {
        if (this.f153839g.get() && this.f153840h.get()) {
            for (final Pair pair : this.f153842j) {
                auv0.m99090a(this.f153834b, new ztv0() { // from class: l.vbv0
                    @Override // p149l.ztv0
                    public final void zza(Object obj) throws RemoteException {
                        Pair pair2 = pair;
                        ((sys0) obj).mo128293d0((String) pair2.first, (String) pair2.second);
                    }
                });
            }
            this.f153842j.clear();
            this.f153838f.set(false);
        }
    }

    @Override // p149l.r0u0
    /* JADX INFO: renamed from: A */
    public final void mo97687A(vxv0 vxv0Var) {
        this.f153838f.set(true);
        this.f153840h.set(false);
    }

    /* JADX INFO: renamed from: B */
    public final synchronized sys0 m173927B() {
        return (sys0) this.f153834b.get();
    }

    /* JADX INFO: renamed from: D */
    public final void m173928D(r8s0 r8s0Var) {
        this.f153833a.set(r8s0Var);
    }

    /* JADX INFO: renamed from: K */
    public final void m173929K(ocs0 ocs0Var) {
        this.f153836d.set(ocs0Var);
    }

    /* JADX INFO: renamed from: O */
    public final void m173930O(s3u0 s3u0Var) {
        this.f153835c.set(s3u0Var);
    }

    /* JADX INFO: renamed from: P */
    public final void m173931P(sys0 sys0Var) {
        this.f153834b.set(sys0Var);
        this.f153839g.set(true);
        m173926S();
    }

    /* JADX INFO: renamed from: R */
    public final void m173932R(s7t0 s7t0Var) {
        this.f153837e.set(s7t0Var);
    }

    @Override // p149l.dyt0
    /* JADX INFO: renamed from: a */
    public final void mo95459a() {
        auv0.m99090a(this.f153833a, new ztv0() { // from class: l.rbv0
            @Override // p149l.ztv0
            public final void zza(Object obj) throws RemoteException {
                ((r8s0) obj).zzg();
            }
        });
    }

    @Override // p149l.h0u0
    /* JADX INFO: renamed from: b */
    public final void mo128978b(@NonNull final zzs zzsVar) {
        auv0.m99090a(this.f153835c, new ztv0() { // from class: l.pcv0
            @Override // p149l.ztv0
            public final void zza(Object obj) throws RemoteException {
                ((s3u0) obj).mo119144F3(zzsVar);
            }
        });
    }

    @Override // p149l.zxt0
    /* JADX INFO: renamed from: k */
    public final void mo134396k(final zze zzeVar) {
        auv0.m99090a(this.f153837e, new ztv0() { // from class: l.bcv0
            @Override // p149l.ztv0
            public final void zza(Object obj) throws RemoteException {
                ((s7t0) obj).mo139872i0(zzeVar);
            }
        });
    }

    @Override // p149l.b1r0
    public final void onAdClicked() {
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132323ma)).booleanValue()) {
            return;
        }
        auv0.m99090a(this.f153833a, ocv0.f143129a);
    }

    @Override // p149l.fv0
    /* JADX INFO: renamed from: q */
    public final synchronized void mo123249q(final String str, final String str2) {
        if (!this.f153838f.get()) {
            auv0.m99090a(this.f153834b, new ztv0() { // from class: l.ccv0
                @Override // p149l.ztv0
                public final void zza(Object obj) throws RemoteException {
                    ((sys0) obj).mo128293d0(str, str2);
                }
            });
            return;
        }
        if (!this.f153842j.offer(new Pair(str, str2))) {
            x2t0.m206864b("The queue for app events is full, dropping the new event.");
            p3w0 p3w0Var = this.f153841i;
            if (p3w0Var != null) {
                o3w0 o3w0VarM162489b = o3w0.m162489b("dae_action");
                o3w0VarM162489b.m162491a("dae_name", str);
                o3w0VarM162489b.m162491a("dae_data", str2);
                p3w0Var.mo124429a(o3w0VarM162489b);
            }
        }
    }

    @Override // p149l.mxt0
    /* JADX INFO: renamed from: u */
    public final void mo97693u(final zze zzeVar) {
        auv0.m99090a(this.f153833a, new ztv0() { // from class: l.wbv0
            @Override // p149l.ztv0
            public final void zza(Object obj) throws RemoteException {
                ((r8s0) obj).mo134665f(zzeVar);
            }
        });
        auv0.m99090a(this.f153833a, new ztv0() { // from class: l.xbv0
            @Override // p149l.ztv0
            public final void zza(Object obj) throws RemoteException {
                ((r8s0) obj).zze(zzeVar.zza);
            }
        });
        auv0.m99090a(this.f153836d, new ztv0() { // from class: l.ybv0
            @Override // p149l.ztv0
            public final void zza(Object obj) throws RemoteException {
                ((ocs0) obj).mo95571t0(zzeVar);
            }
        });
        this.f153838f.set(false);
        this.f153842j.clear();
    }

    /* JADX INFO: renamed from: z */
    public final synchronized r8s0 m173933z() {
        return (r8s0) this.f153833a.get();
    }

    @Override // p149l.cxt0
    public final void zza() {
        auv0.m99090a(this.f153833a, new ztv0() { // from class: l.sbv0
            @Override // p149l.ztv0
            public final void zza(Object obj) throws RemoteException {
                ((r8s0) obj).zzd();
            }
        });
        auv0.m99090a(this.f153837e, new ztv0() { // from class: l.tbv0
            @Override // p149l.ztv0
            public final void zza(Object obj) throws RemoteException {
                ((s7t0) obj).zzc();
            }
        });
    }

    @Override // p149l.cxt0
    public final void zzb() {
        auv0.m99090a(this.f153833a, new ztv0() { // from class: l.dcv0
            @Override // p149l.ztv0
            public final void zza(Object obj) throws RemoteException {
                ((r8s0) obj).zzh();
            }
        });
    }

    @Override // p149l.a7u0
    public final void zzbo() {
        auv0.m99090a(this.f153833a, new ztv0() { // from class: l.ecv0
            @Override // p149l.ztv0
            public final void zza(Object obj) throws RemoteException {
                ((r8s0) obj).zzk();
            }
        });
    }

    @Override // p149l.cxt0
    public final void zzc() {
        auv0.m99090a(this.f153833a, new ztv0() { // from class: l.fcv0
            @Override // p149l.ztv0
            public final void zza(Object obj) throws RemoteException {
                ((r8s0) obj).zzj();
            }
        });
        auv0.m99090a(this.f153837e, new ztv0() { // from class: l.mcv0
            @Override // p149l.ztv0
            public final void zza(Object obj) throws RemoteException {
                ((s7t0) obj).zzf();
            }
        });
        auv0.m99090a(this.f153837e, new ztv0() { // from class: l.ncv0
            @Override // p149l.ztv0
            public final void zza(Object obj) throws RemoteException {
                ((s7t0) obj).zze();
            }
        });
    }

    @Override // p149l.ezt0
    public final synchronized void zzr() {
        auv0.m99090a(this.f153833a, new ztv0() { // from class: l.zbv0
            @Override // p149l.ztv0
            public final void zza(Object obj) throws RemoteException {
                ((r8s0) obj).zzi();
            }
        });
        auv0.m99090a(this.f153836d, new ztv0() { // from class: l.acv0
            @Override // p149l.ztv0
            public final void zza(Object obj) throws RemoteException {
                ((ocs0) obj).zzc();
            }
        });
        this.f153840h.set(true);
        m173926S();
    }

    @Override // p149l.a7u0
    public final void zzs() {
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132323ma)).booleanValue()) {
            auv0.m99090a(this.f153833a, ocv0.f143129a);
        }
        auv0.m99090a(this.f153837e, new ztv0() { // from class: l.ubv0
            @Override // p149l.ztv0
            public final void zza(Object obj) throws RemoteException {
                ((s7t0) obj).zzb();
            }
        });
    }

    @Override // p149l.cxt0
    public final void zze() {
    }

    @Override // p149l.cxt0
    public final void zzf() {
    }

    @Override // p149l.r0u0
    /* JADX INFO: renamed from: x */
    public final void mo97694x(zzbze zzbzeVar) {
    }

    @Override // p149l.cxt0
    /* JADX INFO: renamed from: i */
    public final void mo100929i(zvs0 zvs0Var, String str, String str2) {
    }
}
