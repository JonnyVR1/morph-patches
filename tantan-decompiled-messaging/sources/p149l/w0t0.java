package p149l;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzccx;

/* JADX INFO: loaded from: classes6.dex */
public final class w0t0 extends jxr0 implements y0t0 {
    public w0t0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    @Override // p149l.y0t0
    /* JADX INFO: renamed from: W6 */
    public final void mo157500W6(uyl uylVar, zzccx zzccxVar, v0t0 v0t0Var) throws RemoteException {
        Parcel parcelM143822O = m143822O();
        lxr0.m152089f(parcelM143822O, uylVar);
        lxr0.m152087d(parcelM143822O, zzccxVar);
        lxr0.m152089f(parcelM143822O, v0t0Var);
        m143825Y2(1, parcelM143822O);
    }
}
