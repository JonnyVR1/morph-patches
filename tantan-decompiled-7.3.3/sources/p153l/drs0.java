package p153l;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbjb;

/* JADX INFO: loaded from: classes6.dex */
public final class drs0 extends p6s0 implements ats0 {
    public drs0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // p153l.ats0
    /* JADX INFO: renamed from: B2 */
    public final void mo100261B2(String str, oms0 oms0Var, lms0 lms0Var) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        parcelM171038O.writeString(str);
        r6s0.m180044f(parcelM171038O, oms0Var);
        r6s0.m180044f(parcelM171038O, lms0Var);
        m171041Y2(5, parcelM171038O);
    }

    @Override // p153l.ats0
    /* JADX INFO: renamed from: T3 */
    public final void mo100262T3(xhs0 xhs0Var) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        r6s0.m180044f(parcelM171038O, xhs0Var);
        m171041Y2(2, parcelM171038O);
    }

    @Override // p153l.ats0
    /* JADX INFO: renamed from: X0 */
    public final void mo100264X0(zzbjb zzbjbVar) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        r6s0.m180042d(parcelM171038O, zzbjbVar);
        m171041Y2(6, parcelM171038O);
    }

    @Override // p153l.ats0
    /* JADX INFO: renamed from: h4 */
    public final void mo100267h4(fns0 fns0Var) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        r6s0.m180044f(parcelM171038O, fns0Var);
        m171041Y2(10, parcelM171038O);
    }

    @Override // p153l.ats0
    public final lps0 zze() throws RemoteException {
        lps0 vms0Var;
        Parcel parcelM171039P2 = m171039P2(1, m171038O());
        IBinder strongBinder = parcelM171039P2.readStrongBinder();
        if (strongBinder == null) {
            vms0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoader");
            vms0Var = iInterfaceQueryLocalInterface instanceof lps0 ? (lps0) iInterfaceQueryLocalInterface : new vms0(strongBinder);
        }
        parcelM171039P2.recycle();
        return vms0Var;
    }
}
