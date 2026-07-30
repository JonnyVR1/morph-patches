package p149l;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.offline.buffering.zza;

/* JADX INFO: loaded from: classes6.dex */
public final class els0 extends jxr0 implements tns0 {
    public els0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.util.IWorkManagerUtil");
    }

    @Override // p149l.tns0
    public final void zze(uyl uylVar) throws RemoteException {
        Parcel parcelM143822O = m143822O();
        lxr0.m152089f(parcelM143822O, uylVar);
        m143825Y2(2, parcelM143822O);
    }

    @Override // p149l.tns0
    public final boolean zzf(uyl uylVar, String str, String str2) throws RemoteException {
        Parcel parcelM143822O = m143822O();
        lxr0.m152089f(parcelM143822O, uylVar);
        parcelM143822O.writeString(str);
        parcelM143822O.writeString(str2);
        Parcel parcelM143823P2 = m143823P2(1, parcelM143822O);
        boolean zM152090g = lxr0.m152090g(parcelM143823P2);
        parcelM143823P2.recycle();
        return zM152090g;
    }

    @Override // p149l.tns0
    public final boolean zzg(uyl uylVar, zza zzaVar) throws RemoteException {
        Parcel parcelM143822O = m143822O();
        lxr0.m152089f(parcelM143822O, uylVar);
        lxr0.m152087d(parcelM143822O, zzaVar);
        Parcel parcelM143823P2 = m143823P2(3, parcelM143822O);
        boolean zM152090g = lxr0.m152090g(parcelM143823P2);
        parcelM143823P2.recycle();
        return zM152090g;
    }
}
