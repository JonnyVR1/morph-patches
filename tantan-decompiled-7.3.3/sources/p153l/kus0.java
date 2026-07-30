package p153l;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.offline.buffering.zza;

/* JADX INFO: loaded from: classes6.dex */
public final class kus0 extends p6s0 implements zws0 {
    public kus0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.util.IWorkManagerUtil");
    }

    @Override // p153l.zws0
    public final void zze(p1m p1mVar) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        r6s0.m180044f(parcelM171038O, p1mVar);
        m171041Y2(2, parcelM171038O);
    }

    @Override // p153l.zws0
    public final boolean zzf(p1m p1mVar, String str, String str2) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        r6s0.m180044f(parcelM171038O, p1mVar);
        parcelM171038O.writeString(str);
        parcelM171038O.writeString(str2);
        Parcel parcelM171039P2 = m171039P2(1, parcelM171038O);
        boolean zM180045g = r6s0.m180045g(parcelM171039P2);
        parcelM171039P2.recycle();
        return zM180045g;
    }

    @Override // p153l.zws0
    public final boolean zzg(p1m p1mVar, zza zzaVar) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        r6s0.m180044f(parcelM171038O, p1mVar);
        r6s0.m180042d(parcelM171038O, zzaVar);
        Parcel parcelM171039P2 = m171039P2(3, parcelM171038O);
        boolean zM180045g = r6s0.m180045g(parcelM171039P2);
        parcelM171039P2.recycle();
        return zM180045g;
    }
}
