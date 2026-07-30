package p149l;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public final class y4u0 extends jxr0 implements n7u0 {
    public y4u0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOutOfContextTester");
    }

    @Override // p149l.n7u0
    /* JADX INFO: renamed from: X1 */
    public final void mo158163X1(String str, uyl uylVar, uyl uylVar2) throws RemoteException {
        Parcel parcelM143822O = m143822O();
        parcelM143822O.writeString(str);
        lxr0.m152089f(parcelM143822O, uylVar);
        lxr0.m152089f(parcelM143822O, uylVar2);
        m143825Y2(1, parcelM143822O);
    }
}
