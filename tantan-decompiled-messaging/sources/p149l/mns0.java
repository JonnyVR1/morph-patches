package p149l;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public final class mns0 extends jxr0 implements ons0 {
    public mns0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    @Override // p149l.ons0
    /* JADX INFO: renamed from: c */
    public final boolean mo146589c(String str) throws RemoteException {
        Parcel parcelM143822O = m143822O();
        parcelM143822O.writeString(str);
        Parcel parcelM143823P2 = m143823P2(2, parcelM143822O);
        boolean zM152090g = lxr0.m152090g(parcelM143823P2);
        parcelM143823P2.recycle();
        return zM152090g;
    }

    @Override // p149l.ons0
    /* JADX INFO: renamed from: z */
    public final boolean mo146590z(String str) throws RemoteException {
        Parcel parcelM143822O = m143822O();
        parcelM143822O.writeString(str);
        Parcel parcelM143823P2 = m143823P2(4, parcelM143822O);
        boolean zM152090g = lxr0.m152090g(parcelM143823P2);
        parcelM143823P2.recycle();
        return zM152090g;
    }

    @Override // p149l.ons0
    public final rns0 zzb(String str) throws RemoteException {
        rns0 pns0Var;
        Parcel parcelM143822O = m143822O();
        parcelM143822O.writeString(str);
        Parcel parcelM143823P2 = m143823P2(1, parcelM143822O);
        IBinder strongBinder = parcelM143823P2.readStrongBinder();
        if (strongBinder == null) {
            pns0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            pns0Var = iInterfaceQueryLocalInterface instanceof rns0 ? (rns0) iInterfaceQueryLocalInterface : new pns0(strongBinder);
        }
        parcelM143823P2.recycle();
        return pns0Var;
    }

    @Override // p149l.ons0
    public final bqs0 zzc(String str) throws RemoteException {
        Parcel parcelM143822O = m143822O();
        parcelM143822O.writeString(str);
        Parcel parcelM143823P2 = m143823P2(3, parcelM143822O);
        bqs0 bqs0VarM98343o8 = aqs0.m98343o8(parcelM143823P2.readStrongBinder());
        parcelM143823P2.recycle();
        return bqs0VarM98343o8;
    }
}
