package p149l;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbyi;
import com.google.android.gms.internal.ads.zzbym;

/* JADX INFO: loaded from: classes6.dex */
public final class pus0 extends jxr0 implements rus0 {
    public pus0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdsService");
    }

    @Override // p149l.rus0
    /* JADX INFO: renamed from: k2 */
    public final void mo171478k2(zzbym zzbymVar, uus0 uus0Var) throws RemoteException {
        Parcel parcelM143822O = m143822O();
        lxr0.m152087d(parcelM143822O, zzbymVar);
        lxr0.m152089f(parcelM143822O, uus0Var);
        m143825Y2(3, parcelM143822O);
    }

    @Override // p149l.rus0
    /* JADX INFO: renamed from: p5 */
    public final void mo171479p5(zzbyi zzbyiVar, uus0 uus0Var) throws RemoteException {
        Parcel parcelM143822O = m143822O();
        lxr0.m152087d(parcelM143822O, zzbyiVar);
        lxr0.m152089f(parcelM143822O, uus0Var);
        m143825Y2(1, parcelM143822O);
    }
}
