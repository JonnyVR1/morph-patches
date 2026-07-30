package p153l;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.internal.ads.zzcag;

/* JADX INFO: loaded from: classes6.dex */
public final class yws0 extends p6s0 implements jxs0 {
    public yws0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    @Override // p153l.jxs0
    /* JADX INFO: renamed from: G0 */
    public final void mo118714G0(int i, String str) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        parcelM171038O.writeInt(i);
        parcelM171038O.writeString(str);
        m171041Y2(22, parcelM171038O);
    }

    @Override // p153l.jxs0
    /* JADX INFO: renamed from: L2 */
    public final void mo104528L2(zzcag zzcagVar) throws RemoteException {
        throw null;
    }

    @Override // p153l.jxs0
    /* JADX INFO: renamed from: L7 */
    public final void mo118715L7(String str, String str2) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        parcelM171038O.writeString(str);
        parcelM171038O.writeString(str2);
        m171041Y2(9, parcelM171038O);
    }

    @Override // p153l.jxs0
    /* JADX INFO: renamed from: N1 */
    public final void mo118716N1(int i) throws RemoteException {
        throw null;
    }

    @Override // p153l.jxs0
    /* JADX INFO: renamed from: N4 */
    public final void mo118717N4(zze zzeVar) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        r6s0.m180042d(parcelM171038O, zzeVar);
        m171041Y2(23, parcelM171038O);
    }

    @Override // p153l.jxs0
    /* JADX INFO: renamed from: b */
    public final void mo104529b() throws RemoteException {
        m171041Y2(11, m171038O());
    }

    @Override // p153l.jxs0
    /* JADX INFO: renamed from: g */
    public final void mo118718g() throws RemoteException {
        m171041Y2(20, m171038O());
    }

    @Override // p153l.jxs0
    /* JADX INFO: renamed from: h3 */
    public final void mo118719h3(bms0 bms0Var, String str) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        r6s0.m180044f(parcelM171038O, bms0Var);
        parcelM171038O.writeString(str);
        m171041Y2(10, parcelM171038O);
    }

    @Override // p153l.jxs0
    /* JADX INFO: renamed from: k */
    public final void mo118720k() throws RemoteException {
        m171041Y2(15, m171038O());
    }

    @Override // p153l.jxs0
    /* JADX INFO: renamed from: r */
    public final void mo104530r() throws RemoteException {
        m171041Y2(13, m171038O());
    }

    @Override // p153l.jxs0
    /* JADX INFO: renamed from: u */
    public final void mo118721u(String str) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        parcelM171038O.writeString(str);
        m171041Y2(21, parcelM171038O);
    }

    @Override // p153l.jxs0
    /* JADX INFO: renamed from: u5 */
    public final void mo118722u5(zze zzeVar) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        r6s0.m180042d(parcelM171038O, zzeVar);
        m171041Y2(24, parcelM171038O);
    }

    @Override // p153l.jxs0
    /* JADX INFO: renamed from: v2 */
    public final void mo104531v2(i7t0 i7t0Var) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        r6s0.m180044f(parcelM171038O, i7t0Var);
        m171041Y2(16, parcelM171038O);
    }

    @Override // p153l.jxs0
    public final void zze() throws RemoteException {
        m171041Y2(1, m171038O());
    }

    @Override // p153l.jxs0
    public final void zzf() throws RemoteException {
        m171041Y2(2, m171038O());
    }

    @Override // p153l.jxs0
    public final void zzg(int i) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        parcelM171038O.writeInt(i);
        m171041Y2(3, parcelM171038O);
    }

    @Override // p153l.jxs0
    public final void zzm() throws RemoteException {
        m171041Y2(8, m171038O());
    }

    @Override // p153l.jxs0
    public final void zzn() throws RemoteException {
        m171041Y2(4, m171038O());
    }

    @Override // p153l.jxs0
    public final void zzo() throws RemoteException {
        m171041Y2(6, m171038O());
    }

    @Override // p153l.jxs0
    public final void zzp() throws RemoteException {
        m171041Y2(5, m171038O());
    }

    @Override // p153l.jxs0
    public final void zzu() throws RemoteException {
        m171041Y2(18, m171038O());
    }
}
