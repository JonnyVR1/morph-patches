package p153l;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.offline.buffering.zza;

/* JADX INFO: loaded from: classes6.dex */
public final class i1t0 extends p6s0 implements k1t0 {
    public i1t0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.offline.IOfflineUtils");
    }

    @Override // p153l.k1t0
    /* JADX INFO: renamed from: O0 */
    public final void mo138150O0(String[] strArr, int[] iArr, p1m p1mVar) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        parcelM171038O.writeStringArray(strArr);
        parcelM171038O.writeIntArray(iArr);
        r6s0.m180044f(parcelM171038O, p1mVar);
        m171041Y2(5, parcelM171038O);
    }

    @Override // p153l.k1t0
    /* JADX INFO: renamed from: Y */
    public final void mo138151Y(p1m p1mVar) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        r6s0.m180044f(parcelM171038O, p1mVar);
        m171041Y2(4, parcelM171038O);
    }

    @Override // p153l.k1t0
    /* JADX INFO: renamed from: x0 */
    public final void mo138152x0(Intent intent) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        r6s0.m180042d(parcelM171038O, intent);
        m171041Y2(1, parcelM171038O);
    }

    @Override // p153l.k1t0
    /* JADX INFO: renamed from: y3 */
    public final void mo138153y3(p1m p1mVar, zza zzaVar) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        r6s0.m180044f(parcelM171038O, p1mVar);
        r6s0.m180042d(parcelM171038O, zzaVar);
        m171041Y2(6, parcelM171038O);
    }

    @Override // p153l.k1t0
    public final void zzh() throws RemoteException {
        m171041Y2(3, m171038O());
    }
}
