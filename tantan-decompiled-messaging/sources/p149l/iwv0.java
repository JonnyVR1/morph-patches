package p149l;

import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzs;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes6.dex */
public final class iwv0 implements zc50, ezt0, mxt0, cxt0, zxt0, h0u0, puv0, a7u0 {

    /* JADX INFO: renamed from: a */
    public final xzv0 f115300a;

    /* JADX INFO: renamed from: b */
    public final AtomicReference f115301b = new AtomicReference();

    /* JADX INFO: renamed from: c */
    public final AtomicReference f115302c = new AtomicReference();

    /* JADX INFO: renamed from: d */
    public final AtomicReference f115303d = new AtomicReference();

    /* JADX INFO: renamed from: e */
    public final AtomicReference f115304e = new AtomicReference();

    /* JADX INFO: renamed from: f */
    public final AtomicReference f115305f = new AtomicReference();

    /* JADX INFO: renamed from: g */
    public final AtomicReference f115306g = new AtomicReference();

    /* JADX INFO: renamed from: h */
    public final AtomicReference f115307h = new AtomicReference();

    public iwv0(xzv0 xzv0Var) {
        this.f115300a = xzv0Var;
    }

    /* JADX INFO: renamed from: A */
    public final void m138767A(s3u0 s3u0Var) {
        this.f115307h.set(s3u0Var);
    }

    /* JADX INFO: renamed from: B */
    public final void m138768B(iys0 iys0Var) {
        this.f115303d.set(iys0Var);
    }

    /* JADX INFO: renamed from: D */
    public final void m138769D(mys0 mys0Var) {
        this.f115302c.set(mys0Var);
    }

    @Deprecated
    /* JADX INFO: renamed from: K */
    public final void m138770K(uxs0 uxs0Var) {
        this.f115304e.set(uxs0Var);
    }

    @Deprecated
    /* JADX INFO: renamed from: O */
    public final void m138771O(aws0 aws0Var) {
        this.f115306g.set(aws0Var);
    }

    /* JADX INFO: renamed from: P */
    public final void m138772P(nys0 nys0Var) {
        this.f115305f.set(nys0Var);
    }

    @Override // p149l.h0u0
    /* JADX INFO: renamed from: b */
    public final void mo128978b(@NonNull final zzs zzsVar) {
        auv0.m99090a(this.f115307h, new ztv0() { // from class: l.tvv0
            @Override // p149l.ztv0
            public final void zza(Object obj) throws RemoteException {
                ((s3u0) obj).mo119144F3(zzsVar);
            }
        });
    }

    @Override // p149l.cxt0
    /* JADX INFO: renamed from: i */
    public final void mo100929i(final zvs0 zvs0Var, final String str, final String str2) {
        auv0.m99090a(this.f115303d, new ztv0() { // from class: l.hwv0
            @Override // p149l.ztv0
            public final void zza(Object obj) throws RemoteException {
                zvs0 zvs0Var2 = zvs0Var;
                ((iys0) obj).mo119021u6(new dzs0(zvs0Var2.zzc(), zvs0Var2.zzb()));
            }
        });
        auv0.m99090a(this.f115305f, new ztv0() { // from class: l.jvv0
            @Override // p149l.ztv0
            public final void zza(Object obj) throws RemoteException {
                zvs0 zvs0Var2 = zvs0Var;
                ((nys0) obj).m162032m4(new dzs0(zvs0Var2.zzc(), zvs0Var2.zzb()), str, str2);
            }
        });
        auv0.m99090a(this.f115304e, new ztv0() { // from class: l.kvv0
            @Override // p149l.ztv0
            public final void zza(Object obj) throws RemoteException {
                ((uxs0) obj).mo113942e5(zvs0Var);
            }
        });
        auv0.m99090a(this.f115306g, new ztv0() { // from class: l.lvv0
            @Override // p149l.ztv0
            public final void zza(Object obj) throws RemoteException {
                ((aws0) obj).m99324m4(zvs0Var, str, str2);
            }
        });
    }

    @Override // p149l.zxt0
    /* JADX INFO: renamed from: k */
    public final void mo134396k(final zze zzeVar) {
        auv0.m99090a(this.f115303d, new ztv0() { // from class: l.yvv0
            @Override // p149l.ztv0
            public final void zza(Object obj) throws RemoteException {
                ((iys0) obj).mo119018a6(zzeVar);
            }
        });
        auv0.m99090a(this.f115303d, new ztv0() { // from class: l.zvv0
            @Override // p149l.ztv0
            public final void zza(Object obj) throws RemoteException {
                ((iys0) obj).zzh(zzeVar.zza);
            }
        });
    }

    @Override // p149l.puv0
    /* JADX INFO: renamed from: q */
    public final void mo138773q(puv0 puv0Var) {
        throw null;
    }

    @Override // p149l.mxt0
    /* JADX INFO: renamed from: u */
    public final void mo97693u(final zze zzeVar) {
        final int i = zzeVar.zza;
        auv0.m99090a(this.f115302c, new ztv0() { // from class: l.bwv0
            @Override // p149l.ztv0
            public final void zza(Object obj) throws RemoteException {
                ((mys0) obj).mo104644f(zzeVar);
            }
        });
        auv0.m99090a(this.f115302c, new ztv0() { // from class: l.cwv0
            @Override // p149l.ztv0
            public final void zza(Object obj) throws RemoteException {
                ((mys0) obj).zze(i);
            }
        });
        auv0.m99090a(this.f115304e, new ztv0() { // from class: l.dwv0
            @Override // p149l.ztv0
            public final void zza(Object obj) throws RemoteException {
                ((uxs0) obj).zzg(i);
            }
        });
    }

    @Override // p149l.zc50
    /* JADX INFO: renamed from: x */
    public final void mo128651x() {
        auv0.m99090a(this.f115301b, new ztv0() { // from class: l.wvv0
            @Override // p149l.ztv0
            public final void zza(Object obj) {
                ((zc50) obj).mo128651x();
            }
        });
    }

    /* JADX INFO: renamed from: z */
    public final void m138774z(zc50 zc50Var) {
        this.f115301b.set(zc50Var);
    }

    @Override // p149l.cxt0
    public final void zza() {
        this.f115300a.m212020a();
        auv0.m99090a(this.f115303d, new ztv0() { // from class: l.ewv0
            @Override // p149l.ztv0
            public final void zza(Object obj) throws RemoteException {
                ((iys0) obj).zzg();
            }
        });
        auv0.m99090a(this.f115304e, new ztv0() { // from class: l.fwv0
            @Override // p149l.ztv0
            public final void zza(Object obj) throws RemoteException {
                ((uxs0) obj).zzf();
            }
        });
    }

    @Override // p149l.cxt0
    public final void zzb() {
        auv0.m99090a(this.f115304e, new ztv0() { // from class: l.gwv0
            @Override // p149l.ztv0
            public final void zza(Object obj) throws RemoteException {
                ((uxs0) obj).zzh();
            }
        });
    }

    @Override // p149l.cxt0
    public final void zzc() {
        auv0.m99090a(this.f115303d, new ztv0() { // from class: l.mvv0
            @Override // p149l.ztv0
            public final void zza(Object obj) throws RemoteException {
                ((iys0) obj).zzj();
            }
        });
        auv0.m99090a(this.f115304e, new ztv0() { // from class: l.nvv0
            @Override // p149l.ztv0
            public final void zza(Object obj) throws RemoteException {
                ((uxs0) obj).zzj();
            }
        });
        auv0.m99090a(this.f115303d, new ztv0() { // from class: l.ovv0
            @Override // p149l.ztv0
            public final void zza(Object obj) throws RemoteException {
                ((iys0) obj).zzf();
            }
        });
    }

    @Override // p149l.cxt0
    public final void zze() {
        auv0.m99090a(this.f115304e, new ztv0() { // from class: l.awv0
            @Override // p149l.ztv0
            public final void zza(Object obj) throws RemoteException {
                ((uxs0) obj).zzk();
            }
        });
    }

    @Override // p149l.cxt0
    public final void zzf() {
        auv0.m99090a(this.f115304e, new ztv0() { // from class: l.ivv0
            @Override // p149l.ztv0
            public final void zza(Object obj) throws RemoteException {
                ((uxs0) obj).zzl();
            }
        });
    }

    @Override // p149l.ezt0
    public final void zzr() {
        auv0.m99090a(this.f115302c, new ztv0() { // from class: l.uvv0
            @Override // p149l.ztv0
            public final void zza(Object obj) throws RemoteException {
                ((mys0) obj).zzg();
            }
        });
        auv0.m99090a(this.f115304e, new ztv0() { // from class: l.vvv0
            @Override // p149l.ztv0
            public final void zza(Object obj) throws RemoteException {
                ((uxs0) obj).zzi();
            }
        });
    }

    @Override // p149l.a7u0
    public final void zzs() {
        auv0.m99090a(this.f115303d, new ztv0() { // from class: l.xvv0
            @Override // p149l.ztv0
            public final void zza(Object obj) throws RemoteException {
                ((iys0) obj).zze();
            }
        });
    }

    @Override // p149l.a7u0
    public final void zzbo() {
    }
}
