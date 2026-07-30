package p149l;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public final class sbs0 extends jxr0 implements ubs0 {
    public sbs0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    @Override // p149l.ubs0
    public final double zzb() throws RemoteException {
        Parcel parcelM143823P2 = m143823P2(3, m143822O());
        double d = parcelM143823P2.readDouble();
        parcelM143823P2.recycle();
        return d;
    }

    @Override // p149l.ubs0
    public final int zzc() throws RemoteException {
        Parcel parcelM143823P2 = m143823P2(5, m143822O());
        int i = parcelM143823P2.readInt();
        parcelM143823P2.recycle();
        return i;
    }

    @Override // p149l.ubs0
    public final int zzd() throws RemoteException {
        Parcel parcelM143823P2 = m143823P2(4, m143822O());
        int i = parcelM143823P2.readInt();
        parcelM143823P2.recycle();
        return i;
    }

    @Override // p149l.ubs0
    public final Uri zze() throws RemoteException {
        Parcel parcelM143823P2 = m143823P2(2, m143822O());
        Uri uri = (Uri) lxr0.m152084a(parcelM143823P2, Uri.CREATOR);
        parcelM143823P2.recycle();
        return uri;
    }

    @Override // p149l.ubs0
    public final uyl zzf() throws RemoteException {
        Parcel parcelM143823P2 = m143823P2(1, m143822O());
        uyl uylVarM196295O = uyl.AbstractBinderC20541a.m196295O(parcelM143823P2.readStrongBinder());
        parcelM143823P2.recycle();
        return uylVarM196295O;
    }
}
