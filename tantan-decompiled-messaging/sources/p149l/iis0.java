package p149l;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzboq;

/* JADX INFO: loaded from: classes6.dex */
public final class iis0 extends jxr0 implements IInterface {
    public iis0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
    }

    /* JADX INFO: renamed from: m4 */
    public final void m136454m4(zzboq zzboqVar, his0 his0Var) throws RemoteException {
        Parcel parcelM143822O = m143822O();
        lxr0.m152087d(parcelM143822O, zzboqVar);
        lxr0.m152089f(parcelM143822O, his0Var);
        m143824P3(2, parcelM143822O);
    }
}
