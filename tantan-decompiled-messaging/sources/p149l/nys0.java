package p149l;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public final class nys0 extends jxr0 implements IInterface {
    public nys0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
    }

    /* JADX INFO: renamed from: m4 */
    public final void m162032m4(cys0 cys0Var, String str, String str2) throws RemoteException {
        Parcel parcelM143822O = m143822O();
        lxr0.m152089f(parcelM143822O, cys0Var);
        parcelM143822O.writeString(str);
        parcelM143822O.writeString(str2);
        m143825Y2(2, parcelM143822O);
    }
}
