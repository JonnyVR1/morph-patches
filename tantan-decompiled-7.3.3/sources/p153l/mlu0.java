package p153l;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public final class mlu0 extends fou0 {

    /* JADX INFO: renamed from: a */
    public final Object f137450a = new Object();

    /* JADX INFO: renamed from: b */
    public final lpu0 f137451b;

    /* JADX INFO: renamed from: c */
    public final rxs0 f137452c;

    public mlu0(lpu0 lpu0Var, rxs0 rxs0Var) {
        this.f137451b = lpu0Var;
        this.f137452c = rxs0Var;
    }

    @Override // p153l.lpu0
    /* JADX INFO: renamed from: X */
    public final void mo155295X(boolean z) throws RemoteException {
        throw new RemoteException();
    }

    @Override // p153l.lpu0
    /* JADX INFO: renamed from: a */
    public final boolean mo155296a() throws RemoteException {
        throw new RemoteException();
    }

    @Override // p153l.lpu0
    /* JADX INFO: renamed from: s1 */
    public final void mo155297s1(atu0 atu0Var) throws RemoteException {
        synchronized (this.f137450a) {
            try {
                lpu0 lpu0Var = this.f137451b;
                if (lpu0Var != null) {
                    lpu0Var.mo155297s1(atu0Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p153l.lpu0
    public final float zze() throws RemoteException {
        throw new RemoteException();
    }

    @Override // p153l.lpu0
    public final float zzf() throws RemoteException {
        rxs0 rxs0Var = this.f137452c;
        if (rxs0Var != null) {
            return rxs0Var.zzg();
        }
        return 0.0f;
    }

    @Override // p153l.lpu0
    public final float zzg() throws RemoteException {
        rxs0 rxs0Var = this.f137452c;
        if (rxs0Var != null) {
            return rxs0Var.zzh();
        }
        return 0.0f;
    }

    @Override // p153l.lpu0
    public final int zzh() throws RemoteException {
        throw new RemoteException();
    }

    @Override // p153l.lpu0
    public final atu0 zzi() throws RemoteException {
        synchronized (this.f137450a) {
            try {
                lpu0 lpu0Var = this.f137451b;
                if (lpu0Var == null) {
                    return null;
                }
                return lpu0Var.zzi();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p153l.lpu0
    public final void zzk() throws RemoteException {
        throw new RemoteException();
    }

    @Override // p153l.lpu0
    public final void zzl() throws RemoteException {
        throw new RemoteException();
    }

    @Override // p153l.lpu0
    public final void zzn() throws RemoteException {
        throw new RemoteException();
    }

    @Override // p153l.lpu0
    public final boolean zzo() throws RemoteException {
        throw new RemoteException();
    }

    @Override // p153l.lpu0
    public final boolean zzp() throws RemoteException {
        throw new RemoteException();
    }
}
