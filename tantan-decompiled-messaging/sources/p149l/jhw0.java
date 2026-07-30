package p149l;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.appset.zza;

/* JADX INFO: loaded from: classes6.dex */
public final class jhw0 extends b0r0 implements IInterface {
    public jhw0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.appset.internal.IAppSetService");
    }

    /* JADX INFO: renamed from: Y2 */
    public final void m141612Y2(zza zzaVar, nov0 nov0Var) throws RemoteException {
        Parcel parcelM99786O = m99786O();
        lws0.m152004b(parcelM99786O, zzaVar);
        lws0.m152005c(parcelM99786O, nov0Var);
        m99787P2(1, parcelM99786O);
    }
}
