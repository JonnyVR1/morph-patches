package p153l;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzcag;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final class wev0 extends d7t0 implements g8u0 {

    /* JADX INFO: renamed from: a */
    public e7t0 f188726a;

    /* JADX INFO: renamed from: b */
    public f8u0 f188727b;

    /* JADX INFO: renamed from: c */
    public zgu0 f188728c;

    @Override // p153l.e7t0
    /* JADX INFO: renamed from: D1 */
    public final synchronized void mo119769D1(p1m p1mVar, int i) throws RemoteException {
        zgu0 zgu0Var = this.f188728c;
        if (zgu0Var != null) {
            dct0.m115298g("Fail to initialize adapter ".concat(String.valueOf(((piv0) zgu0Var).f152622c.f167347a)));
        }
    }

    @Override // p153l.e7t0
    /* JADX INFO: renamed from: E */
    public final synchronized void mo108327E(p1m p1mVar) throws RemoteException {
        e7t0 e7t0Var = this.f188726a;
        if (e7t0Var != null) {
            ((qiv0) e7t0Var).f157890a.mo113755P2();
        }
    }

    @Override // p153l.g8u0
    /* JADX INFO: renamed from: P3 */
    public final synchronized void mo129463P3(f8u0 f8u0Var) {
        this.f188727b = f8u0Var;
    }

    @Override // p153l.e7t0
    /* JADX INFO: renamed from: U2 */
    public final synchronized void mo108328U2(p1m p1mVar, zzcag zzcagVar) throws RemoteException {
        e7t0 e7t0Var = this.f188726a;
        if (e7t0Var != null) {
            ((qiv0) e7t0Var).f157893d.mo137038f0(zzcagVar);
        }
    }

    @Override // p153l.e7t0
    /* JADX INFO: renamed from: W3 */
    public final synchronized void mo119770W3(p1m p1mVar) throws RemoteException {
        e7t0 e7t0Var = this.f188726a;
        if (e7t0Var != null) {
            ((qiv0) e7t0Var).f157892c.zzb();
        }
    }

    @Override // p153l.e7t0
    /* JADX INFO: renamed from: Z */
    public final synchronized void mo108329Z(p1m p1mVar) throws RemoteException {
        e7t0 e7t0Var = this.f188726a;
        if (e7t0Var != null) {
            e7t0Var.mo108329Z(p1mVar);
        }
    }

    @Override // p153l.e7t0
    /* JADX INFO: renamed from: Z3 */
    public final synchronized void mo108330Z3(p1m p1mVar) throws RemoteException {
        zgu0 zgu0Var = this.f188728c;
        if (zgu0Var != null) {
            Executor executor = ((piv0) zgu0Var).f152623d.f163400b;
            final scv0 scv0Var = ((piv0) zgu0Var).f152622c;
            final q6w0 q6w0Var = ((piv0) zgu0Var).f152621b;
            final b7w0 b7w0Var = ((piv0) zgu0Var).f152620a;
            final piv0 piv0Var = (piv0) zgu0Var;
            executor.execute(new Runnable() { // from class: l.oiv0
                @Override // java.lang.Runnable
                public final void run() {
                    riv0 riv0Var = piv0Var.f152623d;
                    riv0.m181610e(b7w0Var, q6w0Var, scv0Var);
                }
            });
        }
    }

    @Override // p153l.e7t0
    /* JADX INFO: renamed from: c0 */
    public final synchronized void mo108331c0(p1m p1mVar) throws RemoteException {
        f8u0 f8u0Var = this.f188727b;
        if (f8u0Var != null) {
            f8u0Var.zzd();
        }
    }

    @Override // p153l.e7t0
    /* JADX INFO: renamed from: i5 */
    public final synchronized void mo108332i5(p1m p1mVar) throws RemoteException {
        e7t0 e7t0Var = this.f188726a;
        if (e7t0Var != null) {
            ((qiv0) e7t0Var).f157893d.zzc();
        }
    }

    /* JADX INFO: renamed from: p8 */
    public final synchronized void m206031p8(e7t0 e7t0Var) {
        this.f188726a = e7t0Var;
    }

    @Override // p153l.e7t0
    /* JADX INFO: renamed from: q0 */
    public final synchronized void mo108333q0(p1m p1mVar, int i) throws RemoteException {
        f8u0 f8u0Var = this.f188727b;
        if (f8u0Var != null) {
            f8u0Var.zza(i);
        }
    }

    /* JADX INFO: renamed from: q8 */
    public final synchronized void m206032q8(zgu0 zgu0Var) {
        this.f188728c = zgu0Var;
    }

    @Override // p153l.e7t0
    /* JADX INFO: renamed from: y4 */
    public final synchronized void mo108334y4(p1m p1mVar) throws RemoteException {
        e7t0 e7t0Var = this.f188726a;
        if (e7t0Var != null) {
            ((qiv0) e7t0Var).f157892c.zze();
        }
    }

    @Override // p153l.e7t0
    public final synchronized void zze(p1m p1mVar) throws RemoteException {
        e7t0 e7t0Var = this.f188726a;
        if (e7t0Var != null) {
            ((qiv0) e7t0Var).f157891b.onAdClicked();
        }
    }
}
