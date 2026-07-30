package p153l;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public final class vks0 extends p6s0 implements xks0 {
    public vks0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IMediaContent");
    }

    @Override // p153l.xks0
    public final float zze() throws RemoteException {
        Parcel parcelM171039P2 = m171039P2(2, m171038O());
        float f = parcelM171039P2.readFloat();
        parcelM171039P2.recycle();
        return f;
    }

    @Override // p153l.xks0
    public final p1m zzi() throws RemoteException {
        Parcel parcelM171039P2 = m171039P2(4, m171038O());
        p1m p1mVarM170217O = p1m.AbstractBinderC19271a.m170217O(parcelM171039P2.readStrongBinder());
        parcelM171039P2.recycle();
        return p1mVarM170217O;
    }

    @Override // p153l.xks0
    public final boolean zzk() throws RemoteException {
        Parcel parcelM171039P2 = m171039P2(10, m171038O());
        boolean zM180045g = r6s0.m180045g(parcelM171039P2);
        parcelM171039P2.recycle();
        return zM180045g;
    }

    @Override // p153l.xks0
    public final boolean zzl() throws RemoteException {
        Parcel parcelM171039P2 = m171039P2(8, m171038O());
        boolean zM180045g = r6s0.m180045g(parcelM171039P2);
        parcelM171039P2.recycle();
        return zM180045g;
    }
}
