package p149l;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzff;
import com.google.android.gms.internal.ads.zzbpd;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class rct0 extends jxr0 implements gft0 {
    public rct0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    @Override // p149l.gft0
    /* JADX INFO: renamed from: C3 */
    public final void mo122260C3(ons0 ons0Var) throws RemoteException {
        Parcel parcelM143822O = m143822O();
        lxr0.m152089f(parcelM143822O, ons0Var);
        m143825Y2(11, parcelM143822O);
    }

    @Override // p149l.gft0
    /* JADX INFO: renamed from: G7 */
    public final void mo122261G7(zzff zzffVar) throws RemoteException {
        Parcel parcelM143822O = m143822O();
        lxr0.m152087d(parcelM143822O, zzffVar);
        m143825Y2(14, parcelM143822O);
    }

    @Override // p149l.gft0
    /* JADX INFO: renamed from: b5 */
    public final void mo122267b5(fjs0 fjs0Var) throws RemoteException {
        Parcel parcelM143822O = m143822O();
        lxr0.m152089f(parcelM143822O, fjs0Var);
        m143825Y2(12, parcelM143822O);
    }

    @Override // p149l.gft0
    /* JADX INFO: renamed from: j6 */
    public final void mo122268j6(String str, uyl uylVar) throws RemoteException {
        Parcel parcelM143822O = m143822O();
        parcelM143822O.writeString(null);
        lxr0.m152089f(parcelM143822O, uylVar);
        m143825Y2(6, parcelM143822O);
    }

    @Override // p149l.gft0
    /* JADX INFO: renamed from: p6 */
    public final void mo122269p6(String str) throws RemoteException {
        Parcel parcelM143822O = m143822O();
        parcelM143822O.writeString(str);
        m143825Y2(18, parcelM143822O);
    }

    @Override // p149l.gft0
    public final List zzg() throws RemoteException {
        Parcel parcelM143823P2 = m143823P2(13, m143822O());
        ArrayList arrayListCreateTypedArrayList = parcelM143823P2.createTypedArrayList(zzbpd.CREATOR);
        parcelM143823P2.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // p149l.gft0
    public final void zzk() throws RemoteException {
        m143825Y2(1, m143822O());
    }
}
