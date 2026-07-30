package p149l;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public final class gcu0 extends zeu0 {

    /* JADX INFO: renamed from: a */
    public final Object f102053a = new Object();

    /* JADX INFO: renamed from: b */
    public final fgu0 f102054b;

    /* JADX INFO: renamed from: c */
    public final los0 f102055c;

    public gcu0(fgu0 fgu0Var, los0 los0Var) {
        this.f102054b = fgu0Var;
        this.f102055c = los0Var;
    }

    @Override // p149l.fgu0
    /* JADX INFO: renamed from: X */
    public final void mo121267X(boolean z) throws RemoteException {
        throw new RemoteException();
    }

    @Override // p149l.fgu0
    /* JADX INFO: renamed from: a */
    public final boolean mo121268a() throws RemoteException {
        throw new RemoteException();
    }

    @Override // p149l.fgu0
    /* JADX INFO: renamed from: s1 */
    public final void mo121269s1(uju0 uju0Var) throws RemoteException {
        synchronized (this.f102053a) {
            try {
                fgu0 fgu0Var = this.f102054b;
                if (fgu0Var != null) {
                    fgu0Var.mo121269s1(uju0Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p149l.fgu0
    public final float zze() throws RemoteException {
        throw new RemoteException();
    }

    @Override // p149l.fgu0
    public final float zzf() throws RemoteException {
        los0 los0Var = this.f102055c;
        if (los0Var != null) {
            return los0Var.zzg();
        }
        return 0.0f;
    }

    @Override // p149l.fgu0
    public final float zzg() throws RemoteException {
        los0 los0Var = this.f102055c;
        if (los0Var != null) {
            return los0Var.zzh();
        }
        return 0.0f;
    }

    @Override // p149l.fgu0
    public final int zzh() throws RemoteException {
        throw new RemoteException();
    }

    @Override // p149l.fgu0
    public final uju0 zzi() throws RemoteException {
        synchronized (this.f102053a) {
            try {
                fgu0 fgu0Var = this.f102054b;
                if (fgu0Var == null) {
                    return null;
                }
                return fgu0Var.zzi();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p149l.fgu0
    public final void zzk() throws RemoteException {
        throw new RemoteException();
    }

    @Override // p149l.fgu0
    public final void zzl() throws RemoteException {
        throw new RemoteException();
    }

    @Override // p149l.fgu0
    public final void zzn() throws RemoteException {
        throw new RemoteException();
    }

    @Override // p149l.fgu0
    public final boolean zzo() throws RemoteException {
        throw new RemoteException();
    }

    @Override // p149l.fgu0
    public final boolean zzp() throws RemoteException {
        throw new RemoteException();
    }
}
