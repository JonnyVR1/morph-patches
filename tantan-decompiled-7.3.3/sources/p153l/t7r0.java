package p153l;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.signin.internal.zai;

/* JADX INFO: loaded from: classes6.dex */
public final class t7r0 extends t6r0 implements IInterface {
    public t7r0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    /* JADX INFO: renamed from: O */
    public final void m189630O(int i) throws RemoteException {
        Parcel parcelZaa = zaa();
        parcelZaa.writeInt(i);
        zac(7, parcelZaa);
    }

    /* JADX INFO: renamed from: P2 */
    public final void m189631P2(IAccountAccessor iAccountAccessor, int i, boolean z) throws RemoteException {
        Parcel parcelZaa = zaa();
        d7r0.m114758d(parcelZaa, iAccountAccessor);
        parcelZaa.writeInt(i);
        parcelZaa.writeInt(z ? 1 : 0);
        zac(9, parcelZaa);
    }

    /* JADX INFO: renamed from: Y2 */
    public final void m189632Y2(zai zaiVar, p7r0 p7r0Var) throws RemoteException {
        Parcel parcelZaa = zaa();
        d7r0.m114757c(parcelZaa, zaiVar);
        d7r0.m114758d(parcelZaa, p7r0Var);
        zac(12, parcelZaa);
    }
}
