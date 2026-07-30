package p149l;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public final class yss0 extends i0r0 implements v4m {
    public yss0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IUiSettingsDelegate");
    }

    @Override // p149l.v4m
    /* JADX INFO: renamed from: E5 */
    public final void mo196999E5(boolean z) throws RemoteException {
        Parcel parcelM133904O = m133904O();
        sws0.m186356a(parcelM133904O, z);
        m133906Y2(18, parcelM133904O);
    }

    @Override // p149l.v4m
    /* JADX INFO: renamed from: m7 */
    public final void mo197000m7(boolean z) throws RemoteException {
        Parcel parcelM133904O = m133904O();
        sws0.m186356a(parcelM133904O, z);
        m133906Y2(1, parcelM133904O);
    }
}
