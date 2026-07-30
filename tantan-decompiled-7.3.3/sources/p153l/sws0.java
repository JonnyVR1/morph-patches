package p153l;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public final class sws0 extends p6s0 implements uws0 {
    public sws0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    @Override // p153l.uws0
    /* JADX INFO: renamed from: c */
    public final boolean mo178536c(String str) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        parcelM171038O.writeString(str);
        Parcel parcelM171039P2 = m171039P2(2, parcelM171038O);
        boolean zM180045g = r6s0.m180045g(parcelM171039P2);
        parcelM171039P2.recycle();
        return zM180045g;
    }

    @Override // p153l.uws0
    /* JADX INFO: renamed from: z */
    public final boolean mo178537z(String str) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        parcelM171038O.writeString(str);
        Parcel parcelM171039P2 = m171039P2(4, parcelM171038O);
        boolean zM180045g = r6s0.m180045g(parcelM171039P2);
        parcelM171039P2.recycle();
        return zM180045g;
    }

    @Override // p153l.uws0
    public final xws0 zzb(String str) throws RemoteException {
        xws0 vws0Var;
        Parcel parcelM171038O = m171038O();
        parcelM171038O.writeString(str);
        Parcel parcelM171039P2 = m171039P2(1, parcelM171038O);
        IBinder strongBinder = parcelM171039P2.readStrongBinder();
        if (strongBinder == null) {
            vws0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            vws0Var = iInterfaceQueryLocalInterface instanceof xws0 ? (xws0) iInterfaceQueryLocalInterface : new vws0(strongBinder);
        }
        parcelM171039P2.recycle();
        return vws0Var;
    }

    @Override // p153l.uws0
    public final hzs0 zzc(String str) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        parcelM171038O.writeString(str);
        Parcel parcelM171039P2 = m171039P2(3, parcelM171038O);
        hzs0 hzs0VarM133122o8 = gzs0.m133122o8(parcelM171039P2.readStrongBinder());
        parcelM171039P2.recycle();
        return hzs0VarM133122o8;
    }
}
