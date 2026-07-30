package p149l;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.measurement.internal.zzae;
import com.google.android.gms.measurement.internal.zzaj;
import com.google.android.gms.measurement.internal.zzbf;
import com.google.android.gms.measurement.internal.zzno;
import com.google.android.gms.measurement.internal.zzo;
import com.google.android.gms.measurement.internal.zzon;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class wkw0 extends dps0 implements cjw0 {
    public wkw0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // p149l.cjw0
    /* JADX INFO: renamed from: I0 */
    public final List<zzon> mo107259I0(String str, String str2, String str3, boolean z) throws RemoteException {
        Parcel parcelM112927O = m112927O();
        parcelM112927O.writeString(str);
        parcelM112927O.writeString(str2);
        parcelM112927O.writeString(str3);
        trs0.m190432e(parcelM112927O, z);
        Parcel parcelM112928P2 = m112928P2(15, parcelM112927O);
        ArrayList arrayListCreateTypedArrayList = parcelM112928P2.createTypedArrayList(zzon.CREATOR);
        parcelM112928P2.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // p149l.cjw0
    /* JADX INFO: renamed from: J6 */
    public final void mo107260J6(zzo zzoVar) throws RemoteException {
        Parcel parcelM112927O = m112927O();
        trs0.m190431d(parcelM112927O, zzoVar);
        m112929Y2(18, parcelM112927O);
    }

    @Override // p149l.cjw0
    /* JADX INFO: renamed from: K6 */
    public final void mo107261K6(Bundle bundle, zzo zzoVar) throws RemoteException {
        Parcel parcelM112927O = m112927O();
        trs0.m190431d(parcelM112927O, bundle);
        trs0.m190431d(parcelM112927O, zzoVar);
        m112929Y2(19, parcelM112927O);
    }

    @Override // p149l.cjw0
    /* JADX INFO: renamed from: L5 */
    public final zzaj mo107262L5(zzo zzoVar) throws RemoteException {
        Parcel parcelM112927O = m112927O();
        trs0.m190431d(parcelM112927O, zzoVar);
        Parcel parcelM112928P2 = m112928P2(21, parcelM112927O);
        zzaj zzajVar = (zzaj) trs0.m190428a(parcelM112928P2, zzaj.CREATOR);
        parcelM112928P2.recycle();
        return zzajVar;
    }

    @Override // p149l.cjw0
    /* JADX INFO: renamed from: L6 */
    public final void mo107263L6(zzo zzoVar) throws RemoteException {
        Parcel parcelM112927O = m112927O();
        trs0.m190431d(parcelM112927O, zzoVar);
        m112929Y2(20, parcelM112927O);
    }

    @Override // p149l.cjw0
    /* JADX INFO: renamed from: M7 */
    public final List<zzon> mo107264M7(String str, String str2, boolean z, zzo zzoVar) throws RemoteException {
        Parcel parcelM112927O = m112927O();
        parcelM112927O.writeString(str);
        parcelM112927O.writeString(str2);
        trs0.m190432e(parcelM112927O, z);
        trs0.m190431d(parcelM112927O, zzoVar);
        Parcel parcelM112928P2 = m112928P2(14, parcelM112927O);
        ArrayList arrayListCreateTypedArrayList = parcelM112928P2.createTypedArrayList(zzon.CREATOR);
        parcelM112928P2.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // p149l.cjw0
    /* JADX INFO: renamed from: Q4 */
    public final void mo107265Q4(zzon zzonVar, zzo zzoVar) throws RemoteException {
        Parcel parcelM112927O = m112927O();
        trs0.m190431d(parcelM112927O, zzonVar);
        trs0.m190431d(parcelM112927O, zzoVar);
        m112929Y2(2, parcelM112927O);
    }

    @Override // p149l.cjw0
    /* JADX INFO: renamed from: U6 */
    public final String mo107266U6(zzo zzoVar) throws RemoteException {
        Parcel parcelM112927O = m112927O();
        trs0.m190431d(parcelM112927O, zzoVar);
        Parcel parcelM112928P2 = m112928P2(11, parcelM112927O);
        String string = parcelM112928P2.readString();
        parcelM112928P2.recycle();
        return string;
    }

    @Override // p149l.cjw0
    /* JADX INFO: renamed from: U7 */
    public final void mo107267U7(zzo zzoVar) throws RemoteException {
        Parcel parcelM112927O = m112927O();
        trs0.m190431d(parcelM112927O, zzoVar);
        m112929Y2(26, parcelM112927O);
    }

    @Override // p149l.cjw0
    /* JADX INFO: renamed from: V1 */
    public final List<zzno> mo107268V1(zzo zzoVar, Bundle bundle) throws RemoteException {
        Parcel parcelM112927O = m112927O();
        trs0.m190431d(parcelM112927O, zzoVar);
        trs0.m190431d(parcelM112927O, bundle);
        Parcel parcelM112928P2 = m112928P2(24, parcelM112927O);
        ArrayList arrayListCreateTypedArrayList = parcelM112928P2.createTypedArrayList(zzno.CREATOR);
        parcelM112928P2.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // p149l.cjw0
    /* JADX INFO: renamed from: V7 */
    public final byte[] mo107269V7(zzbf zzbfVar, String str) throws RemoteException {
        Parcel parcelM112927O = m112927O();
        trs0.m190431d(parcelM112927O, zzbfVar);
        parcelM112927O.writeString(str);
        Parcel parcelM112928P2 = m112928P2(9, parcelM112927O);
        byte[] bArrCreateByteArray = parcelM112928P2.createByteArray();
        parcelM112928P2.recycle();
        return bArrCreateByteArray;
    }

    @Override // p149l.cjw0
    /* JADX INFO: renamed from: e7 */
    public final void mo107271e7(zzo zzoVar) throws RemoteException {
        Parcel parcelM112927O = m112927O();
        trs0.m190431d(parcelM112927O, zzoVar);
        m112929Y2(27, parcelM112927O);
    }

    @Override // p149l.cjw0
    /* JADX INFO: renamed from: g3 */
    public final void mo107272g3(zzae zzaeVar, zzo zzoVar) throws RemoteException {
        Parcel parcelM112927O = m112927O();
        trs0.m190431d(parcelM112927O, zzaeVar);
        trs0.m190431d(parcelM112927O, zzoVar);
        m112929Y2(12, parcelM112927O);
    }

    @Override // p149l.cjw0
    /* JADX INFO: renamed from: j1 */
    public final void mo107273j1(long j, String str, String str2, String str3) throws RemoteException {
        Parcel parcelM112927O = m112927O();
        parcelM112927O.writeLong(j);
        parcelM112927O.writeString(str);
        parcelM112927O.writeString(str2);
        parcelM112927O.writeString(str3);
        m112929Y2(10, parcelM112927O);
    }

    @Override // p149l.cjw0
    /* JADX INFO: renamed from: j8 */
    public final void mo107274j8(zzo zzoVar) throws RemoteException {
        Parcel parcelM112927O = m112927O();
        trs0.m190431d(parcelM112927O, zzoVar);
        m112929Y2(6, parcelM112927O);
    }

    @Override // p149l.cjw0
    /* JADX INFO: renamed from: m1 */
    public final List<zzae> mo107275m1(String str, String str2, String str3) throws RemoteException {
        Parcel parcelM112927O = m112927O();
        parcelM112927O.writeString(str);
        parcelM112927O.writeString(str2);
        parcelM112927O.writeString(str3);
        Parcel parcelM112928P2 = m112928P2(17, parcelM112927O);
        ArrayList arrayListCreateTypedArrayList = parcelM112928P2.createTypedArrayList(zzae.CREATOR);
        parcelM112928P2.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // p149l.cjw0
    /* JADX INFO: renamed from: n7 */
    public final void mo107276n7(zzae zzaeVar) throws RemoteException {
        Parcel parcelM112927O = m112927O();
        trs0.m190431d(parcelM112927O, zzaeVar);
        m112929Y2(13, parcelM112927O);
    }

    @Override // p149l.cjw0
    /* JADX INFO: renamed from: r4 */
    public final void mo107278r4(zzbf zzbfVar, zzo zzoVar) throws RemoteException {
        Parcel parcelM112927O = m112927O();
        trs0.m190431d(parcelM112927O, zzbfVar);
        trs0.m190431d(parcelM112927O, zzoVar);
        m112929Y2(1, parcelM112927O);
    }

    @Override // p149l.cjw0
    /* JADX INFO: renamed from: t6 */
    public final void mo107279t6(zzo zzoVar) throws RemoteException {
        Parcel parcelM112927O = m112927O();
        trs0.m190431d(parcelM112927O, zzoVar);
        m112929Y2(4, parcelM112927O);
    }

    @Override // p149l.cjw0
    /* JADX INFO: renamed from: x7 */
    public final void mo107280x7(zzo zzoVar) throws RemoteException {
        Parcel parcelM112927O = m112927O();
        trs0.m190431d(parcelM112927O, zzoVar);
        m112929Y2(25, parcelM112927O);
    }

    @Override // p149l.cjw0
    /* JADX INFO: renamed from: y5 */
    public final void mo107281y5(zzbf zzbfVar, String str, String str2) throws RemoteException {
        Parcel parcelM112927O = m112927O();
        trs0.m190431d(parcelM112927O, zzbfVar);
        parcelM112927O.writeString(str);
        parcelM112927O.writeString(str2);
        m112929Y2(5, parcelM112927O);
    }

    @Override // p149l.cjw0
    /* JADX INFO: renamed from: z0 */
    public final List<zzae> mo107282z0(String str, String str2, zzo zzoVar) throws RemoteException {
        Parcel parcelM112927O = m112927O();
        parcelM112927O.writeString(str);
        parcelM112927O.writeString(str2);
        trs0.m190431d(parcelM112927O, zzoVar);
        Parcel parcelM112928P2 = m112928P2(16, parcelM112927O);
        ArrayList arrayListCreateTypedArrayList = parcelM112928P2.createTypedArrayList(zzae.CREATOR);
        parcelM112928P2.recycle();
        return arrayListCreateTypedArrayList;
    }
}
