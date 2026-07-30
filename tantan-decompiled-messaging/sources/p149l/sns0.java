package p149l;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.internal.ads.zzcag;

/* JADX INFO: loaded from: classes6.dex */
public final class sns0 extends jxr0 implements dos0 {
    public sns0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    @Override // p149l.dos0
    /* JADX INFO: renamed from: G0 */
    public final void mo105938G0(int i, String str) throws RemoteException {
        Parcel parcelM143822O = m143822O();
        parcelM143822O.writeInt(i);
        parcelM143822O.writeString(str);
        m143825Y2(22, parcelM143822O);
    }

    @Override // p149l.dos0
    /* JADX INFO: renamed from: L2 */
    public final void mo105939L2(zzcag zzcagVar) throws RemoteException {
        throw null;
    }

    @Override // p149l.dos0
    /* JADX INFO: renamed from: L7 */
    public final void mo105940L7(String str, String str2) throws RemoteException {
        Parcel parcelM143822O = m143822O();
        parcelM143822O.writeString(str);
        parcelM143822O.writeString(str2);
        m143825Y2(9, parcelM143822O);
    }

    @Override // p149l.dos0
    /* JADX INFO: renamed from: N1 */
    public final void mo105941N1(int i) throws RemoteException {
        throw null;
    }

    @Override // p149l.dos0
    /* JADX INFO: renamed from: N4 */
    public final void mo105942N4(zze zzeVar) throws RemoteException {
        Parcel parcelM143822O = m143822O();
        lxr0.m152087d(parcelM143822O, zzeVar);
        m143825Y2(23, parcelM143822O);
    }

    @Override // p149l.dos0
    /* JADX INFO: renamed from: b */
    public final void mo105943b() throws RemoteException {
        m143825Y2(11, m143822O());
    }

    @Override // p149l.dos0
    /* JADX INFO: renamed from: g */
    public final void mo105944g() throws RemoteException {
        m143825Y2(20, m143822O());
    }

    @Override // p149l.dos0
    /* JADX INFO: renamed from: h3 */
    public final void mo105945h3(vcs0 vcs0Var, String str) throws RemoteException {
        Parcel parcelM143822O = m143822O();
        lxr0.m152089f(parcelM143822O, vcs0Var);
        parcelM143822O.writeString(str);
        m143825Y2(10, parcelM143822O);
    }

    @Override // p149l.dos0
    /* JADX INFO: renamed from: k */
    public final void mo105946k() throws RemoteException {
        m143825Y2(15, m143822O());
    }

    @Override // p149l.dos0
    /* JADX INFO: renamed from: r */
    public final void mo105947r() throws RemoteException {
        m143825Y2(13, m143822O());
    }

    @Override // p149l.dos0
    /* JADX INFO: renamed from: u */
    public final void mo105948u(String str) throws RemoteException {
        Parcel parcelM143822O = m143822O();
        parcelM143822O.writeString(str);
        m143825Y2(21, parcelM143822O);
    }

    @Override // p149l.dos0
    /* JADX INFO: renamed from: u5 */
    public final void mo105949u5(zze zzeVar) throws RemoteException {
        Parcel parcelM143822O = m143822O();
        lxr0.m152087d(parcelM143822O, zzeVar);
        m143825Y2(24, parcelM143822O);
    }

    @Override // p149l.dos0
    /* JADX INFO: renamed from: v2 */
    public final void mo105950v2(cys0 cys0Var) throws RemoteException {
        Parcel parcelM143822O = m143822O();
        lxr0.m152089f(parcelM143822O, cys0Var);
        m143825Y2(16, parcelM143822O);
    }

    @Override // p149l.dos0
    public final void zze() throws RemoteException {
        m143825Y2(1, m143822O());
    }

    @Override // p149l.dos0
    public final void zzf() throws RemoteException {
        m143825Y2(2, m143822O());
    }

    @Override // p149l.dos0
    public final void zzg(int i) throws RemoteException {
        Parcel parcelM143822O = m143822O();
        parcelM143822O.writeInt(i);
        m143825Y2(3, parcelM143822O);
    }

    @Override // p149l.dos0
    public final void zzm() throws RemoteException {
        m143825Y2(8, m143822O());
    }

    @Override // p149l.dos0
    public final void zzn() throws RemoteException {
        m143825Y2(4, m143822O());
    }

    @Override // p149l.dos0
    public final void zzo() throws RemoteException {
        m143825Y2(6, m143822O());
    }

    @Override // p149l.dos0
    public final void zzp() throws RemoteException {
        m143825Y2(5, m143822O());
    }

    @Override // p149l.dos0
    public final void zzu() throws RemoteException {
        m143825Y2(18, m143822O());
    }
}
