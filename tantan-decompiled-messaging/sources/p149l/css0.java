package p149l;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.offline.buffering.zza;

/* JADX INFO: loaded from: classes6.dex */
public final class css0 extends jxr0 implements ess0 {
    public css0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.offline.IOfflineUtils");
    }

    @Override // p149l.ess0
    /* JADX INFO: renamed from: O0 */
    public final void mo108558O0(String[] strArr, int[] iArr, uyl uylVar) throws RemoteException {
        Parcel parcelM143822O = m143822O();
        parcelM143822O.writeStringArray(strArr);
        parcelM143822O.writeIntArray(iArr);
        lxr0.m152089f(parcelM143822O, uylVar);
        m143825Y2(5, parcelM143822O);
    }

    @Override // p149l.ess0
    /* JADX INFO: renamed from: Y */
    public final void mo108559Y(uyl uylVar) throws RemoteException {
        Parcel parcelM143822O = m143822O();
        lxr0.m152089f(parcelM143822O, uylVar);
        m143825Y2(4, parcelM143822O);
    }

    @Override // p149l.ess0
    /* JADX INFO: renamed from: x0 */
    public final void mo108560x0(Intent intent) throws RemoteException {
        Parcel parcelM143822O = m143822O();
        lxr0.m152087d(parcelM143822O, intent);
        m143825Y2(1, parcelM143822O);
    }

    @Override // p149l.ess0
    /* JADX INFO: renamed from: y3 */
    public final void mo108561y3(uyl uylVar, zza zzaVar) throws RemoteException {
        Parcel parcelM143822O = m143822O();
        lxr0.m152089f(parcelM143822O, uylVar);
        lxr0.m152087d(parcelM143822O, zzaVar);
        m143825Y2(6, parcelM143822O);
    }

    @Override // p149l.ess0
    public final void zzh() throws RemoteException {
        m143825Y2(3, m143822O());
    }
}
