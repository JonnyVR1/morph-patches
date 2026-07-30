package p153l;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public abstract class rms0 extends q6s0 implements sms0 {
    public rms0() {
        super("com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
    }

    /* JADX INFO: renamed from: o8 */
    public static sms0 m182107o8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
        return iInterfaceQueryLocalInterface instanceof sms0 ? (sms0) iInterfaceQueryLocalInterface : new qms0(iBinder);
    }

    @Override // p153l.q6s0
    /* JADX INFO: renamed from: n8 */
    public final boolean mo96668n8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        oys0 oys0VarM137651o8 = hxs0.m137651o8(parcel.readStrongBinder());
        p1m p1mVarM170217O = p1m.AbstractBinderC19271a.m170217O(parcel.readStrongBinder());
        r6s0.m180041c(parcel);
        mo177143F4(oys0VarM137651o8, p1mVarM170217O);
        parcel2.writeNoException();
        return true;
    }
}
