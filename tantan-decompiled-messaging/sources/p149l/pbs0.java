package p149l;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public final class pbs0 extends jxr0 implements rbs0 {
    public pbs0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IMediaContent");
    }

    @Override // p149l.rbs0
    public final float zze() throws RemoteException {
        Parcel parcelM143823P2 = m143823P2(2, m143822O());
        float f = parcelM143823P2.readFloat();
        parcelM143823P2.recycle();
        return f;
    }

    @Override // p149l.rbs0
    public final uyl zzi() throws RemoteException {
        Parcel parcelM143823P2 = m143823P2(4, m143822O());
        uyl uylVarM196295O = uyl.AbstractBinderC20541a.m196295O(parcelM143823P2.readStrongBinder());
        parcelM143823P2.recycle();
        return uylVarM196295O;
    }

    @Override // p149l.rbs0
    public final boolean zzk() throws RemoteException {
        Parcel parcelM143823P2 = m143823P2(10, m143822O());
        boolean zM152090g = lxr0.m152090g(parcelM143823P2);
        parcelM143823P2.recycle();
        return zM152090g;
    }

    @Override // p149l.rbs0
    public final boolean zzl() throws RemoteException {
        Parcel parcelM143823P2 = m143823P2(8, m143822O());
        boolean zM152090g = lxr0.m152090g(parcelM143823P2);
        parcelM143823P2.recycle();
        return zM152090g;
    }
}
