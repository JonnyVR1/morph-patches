package p149l;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.signin.internal.zai;

/* JADX INFO: loaded from: classes6.dex */
public final class nyq0 extends nxq0 implements IInterface {
    public nyq0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    /* JADX INFO: renamed from: O */
    public final void m162028O(int i) throws RemoteException {
        Parcel parcelZaa = zaa();
        parcelZaa.writeInt(i);
        zac(7, parcelZaa);
    }

    /* JADX INFO: renamed from: P2 */
    public final void m162029P2(IAccountAccessor iAccountAccessor, int i, boolean z) throws RemoteException {
        Parcel parcelZaa = zaa();
        xxq0.m211536d(parcelZaa, iAccountAccessor);
        parcelZaa.writeInt(i);
        parcelZaa.writeInt(z ? 1 : 0);
        zac(9, parcelZaa);
    }

    /* JADX INFO: renamed from: Y2 */
    public final void m162030Y2(zai zaiVar, jyq0 jyq0Var) throws RemoteException {
        Parcel parcelZaa = zaa();
        xxq0.m211535c(parcelZaa, zaiVar);
        xxq0.m211536d(parcelZaa, jyq0Var);
        zac(12, parcelZaa);
    }
}
