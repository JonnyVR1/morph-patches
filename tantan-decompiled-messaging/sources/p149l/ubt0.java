package p149l;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public final class ubt0 extends jxr0 implements wbt0 {
    public ubt0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.measurement.IMeasurementManager");
    }

    @Override // p149l.wbt0
    /* JADX INFO: renamed from: c4 */
    public final void mo192935c4(uyl uylVar, tbt0 tbt0Var) throws RemoteException {
        Parcel parcelM143822O = m143822O();
        lxr0.m152089f(parcelM143822O, uylVar);
        lxr0.m152089f(parcelM143822O, tbt0Var);
        m143825Y2(2, parcelM143822O);
    }
}
