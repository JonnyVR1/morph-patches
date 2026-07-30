package p149l;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public final class eos0 extends jxr0 implements gos0 {
    public eos0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
    }

    @Override // p149l.gos0
    public final uyl zze() throws RemoteException {
        Parcel parcelM143823P2 = m143823P2(1, m143822O());
        uyl uylVarM196295O = uyl.AbstractBinderC20541a.m196295O(parcelM143823P2.readStrongBinder());
        parcelM143823P2.recycle();
        return uylVarM196295O;
    }

    @Override // p149l.gos0
    public final boolean zzf() throws RemoteException {
        Parcel parcelM143823P2 = m143823P2(2, m143822O());
        boolean zM152090g = lxr0.m152090g(parcelM143823P2);
        parcelM143823P2.recycle();
        return zM152090g;
    }
}
