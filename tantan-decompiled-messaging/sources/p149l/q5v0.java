package p149l;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzcag;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final class q5v0 extends xxs0 implements azt0 {

    /* JADX INFO: renamed from: a */
    public yxs0 f152825a;

    /* JADX INFO: renamed from: b */
    public zyt0 f152826b;

    /* JADX INFO: renamed from: c */
    public t7u0 f152827c;

    @Override // p149l.yxs0
    /* JADX INFO: renamed from: D1 */
    public final synchronized void mo145117D1(uyl uylVar, int i) throws RemoteException {
        t7u0 t7u0Var = this.f152827c;
        if (t7u0Var != null) {
            x2t0.m206869g("Fail to initialize adapter ".concat(String.valueOf(((j9v0) t7u0Var).f116980c.f131186a)));
        }
    }

    @Override // p149l.yxs0
    /* JADX INFO: renamed from: E */
    public final synchronized void mo145118E(uyl uylVar) throws RemoteException {
        yxs0 yxs0Var = this.f152825a;
        if (yxs0Var != null) {
            ((k9v0) yxs0Var).f122073a.mo102681P2();
        }
    }

    @Override // p149l.azt0
    /* JADX INFO: renamed from: P3 */
    public final synchronized void mo99729P3(zyt0 zyt0Var) {
        this.f152826b = zyt0Var;
    }

    @Override // p149l.yxs0
    /* JADX INFO: renamed from: U2 */
    public final synchronized void mo145119U2(uyl uylVar, zzcag zzcagVar) throws RemoteException {
        yxs0 yxs0Var = this.f152825a;
        if (yxs0Var != null) {
            ((k9v0) yxs0Var).f122076d.mo102230f0(zzcagVar);
        }
    }

    @Override // p149l.yxs0
    /* JADX INFO: renamed from: W3 */
    public final synchronized void mo145120W3(uyl uylVar) throws RemoteException {
        yxs0 yxs0Var = this.f152825a;
        if (yxs0Var != null) {
            ((k9v0) yxs0Var).f122075c.zzb();
        }
    }

    @Override // p149l.yxs0
    /* JADX INFO: renamed from: Z */
    public final synchronized void mo145121Z(uyl uylVar) throws RemoteException {
        yxs0 yxs0Var = this.f152825a;
        if (yxs0Var != null) {
            yxs0Var.mo145121Z(uylVar);
        }
    }

    @Override // p149l.yxs0
    /* JADX INFO: renamed from: Z3 */
    public final synchronized void mo145122Z3(uyl uylVar) throws RemoteException {
        t7u0 t7u0Var = this.f152827c;
        if (t7u0Var != null) {
            Executor executor = ((j9v0) t7u0Var).f116981d.f127149b;
            final m3v0 m3v0Var = ((j9v0) t7u0Var).f116980c;
            final kxv0 kxv0Var = ((j9v0) t7u0Var).f116979b;
            final vxv0 vxv0Var = ((j9v0) t7u0Var).f116978a;
            final j9v0 j9v0Var = (j9v0) t7u0Var;
            executor.execute(new Runnable() { // from class: l.i9v0
                @Override // java.lang.Runnable
                public final void run() {
                    l9v0 l9v0Var = j9v0Var.f116981d;
                    l9v0.m149110e(vxv0Var, kxv0Var, m3v0Var);
                }
            });
        }
    }

    @Override // p149l.yxs0
    /* JADX INFO: renamed from: c0 */
    public final synchronized void mo145123c0(uyl uylVar) throws RemoteException {
        zyt0 zyt0Var = this.f152826b;
        if (zyt0Var != null) {
            zyt0Var.zzd();
        }
    }

    @Override // p149l.yxs0
    /* JADX INFO: renamed from: i5 */
    public final synchronized void mo145124i5(uyl uylVar) throws RemoteException {
        yxs0 yxs0Var = this.f152825a;
        if (yxs0Var != null) {
            ((k9v0) yxs0Var).f122076d.zzc();
        }
    }

    /* JADX INFO: renamed from: p8 */
    public final synchronized void m173102p8(yxs0 yxs0Var) {
        this.f152825a = yxs0Var;
    }

    @Override // p149l.yxs0
    /* JADX INFO: renamed from: q0 */
    public final synchronized void mo145125q0(uyl uylVar, int i) throws RemoteException {
        zyt0 zyt0Var = this.f152826b;
        if (zyt0Var != null) {
            zyt0Var.zza(i);
        }
    }

    /* JADX INFO: renamed from: q8 */
    public final synchronized void m173103q8(t7u0 t7u0Var) {
        this.f152827c = t7u0Var;
    }

    @Override // p149l.yxs0
    /* JADX INFO: renamed from: y4 */
    public final synchronized void mo145126y4(uyl uylVar) throws RemoteException {
        yxs0 yxs0Var = this.f152825a;
        if (yxs0Var != null) {
            ((k9v0) yxs0Var).f122075c.zze();
        }
    }

    @Override // p149l.yxs0
    public final synchronized void zze(uyl uylVar) throws RemoteException {
        yxs0 yxs0Var = this.f152825a;
        if (yxs0Var != null) {
            ((k9v0) yxs0Var).f122074b.onAdClicked();
        }
    }
}
