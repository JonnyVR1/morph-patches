package p153l;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzccx;

/* JADX INFO: loaded from: classes6.dex */
public final class cat0 extends p6s0 implements eat0 {
    public cat0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    @Override // p153l.eat0
    /* JADX INFO: renamed from: W6 */
    public final void mo108508W6(p1m p1mVar, zzccx zzccxVar, bat0 bat0Var) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        r6s0.m180044f(parcelM171038O, p1mVar);
        r6s0.m180042d(parcelM171038O, zzccxVar);
        r6s0.m180044f(parcelM171038O, bat0Var);
        m171041Y2(1, parcelM171038O);
    }
}
