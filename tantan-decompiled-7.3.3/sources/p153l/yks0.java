package p153l;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public final class yks0 extends p6s0 implements als0 {
    public yks0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    @Override // p153l.als0
    public final double zzb() throws RemoteException {
        Parcel parcelM171039P2 = m171039P2(3, m171038O());
        double d = parcelM171039P2.readDouble();
        parcelM171039P2.recycle();
        return d;
    }

    @Override // p153l.als0
    public final int zzc() throws RemoteException {
        Parcel parcelM171039P2 = m171039P2(5, m171038O());
        int i = parcelM171039P2.readInt();
        parcelM171039P2.recycle();
        return i;
    }

    @Override // p153l.als0
    public final int zzd() throws RemoteException {
        Parcel parcelM171039P2 = m171039P2(4, m171038O());
        int i = parcelM171039P2.readInt();
        parcelM171039P2.recycle();
        return i;
    }

    @Override // p153l.als0
    public final Uri zze() throws RemoteException {
        Parcel parcelM171039P2 = m171039P2(2, m171038O());
        Uri uri = (Uri) r6s0.m180039a(parcelM171039P2, Uri.CREATOR);
        parcelM171039P2.recycle();
        return uri;
    }

    @Override // p153l.als0
    public final p1m zzf() throws RemoteException {
        Parcel parcelM171039P2 = m171039P2(1, m171038O());
        p1m p1mVarM170217O = p1m.AbstractBinderC19271a.m170217O(parcelM171039P2.readStrongBinder());
        parcelM171039P2.recycle();
        return p1mVarM170217O;
    }
}
