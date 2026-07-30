package p153l;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.appset.zza;

/* JADX INFO: loaded from: classes6.dex */
public final class pqw0 extends h9r0 implements IInterface {
    public pqw0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.appset.internal.IAppSetService");
    }

    /* JADX INFO: renamed from: Y2 */
    public final void m173421Y2(zza zzaVar, txv0 txv0Var) throws RemoteException {
        Parcel parcelM134082O = m134082O();
        r5t0.m179957b(parcelM134082O, zzaVar);
        r5t0.m179958c(parcelM134082O, txv0Var);
        m134083P2(1, parcelM134082O);
    }
}
