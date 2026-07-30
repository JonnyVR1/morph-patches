package p149l;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public abstract class hds0 extends kxr0 implements ids0 {
    public hds0() {
        super("com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
    }

    /* JADX INFO: renamed from: o8 */
    public static ids0 m130611o8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
        return iInterfaceQueryLocalInterface instanceof ids0 ? (ids0) iInterfaceQueryLocalInterface : new gds0(iBinder);
    }

    @Override // p149l.kxr0
    /* JADX INFO: renamed from: n8 */
    public final boolean mo98344n8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        vcs0 tcs0Var;
        if (i != 1) {
            return false;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        if (strongBinder == null) {
            tcs0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
            tcs0Var = iInterfaceQueryLocalInterface instanceof vcs0 ? (vcs0) iInterfaceQueryLocalInterface : new tcs0(strongBinder);
        }
        lxr0.m152086c(parcel);
        mo125591A3(tcs0Var);
        parcel2.writeNoException();
        return true;
    }
}
