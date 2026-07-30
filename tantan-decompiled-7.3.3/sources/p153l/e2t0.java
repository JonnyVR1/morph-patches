package p153l;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public final class e2t0 extends o9r0 implements l7m {
    public e2t0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IUiSettingsDelegate");
    }

    @Override // p153l.l7m
    /* JADX INFO: renamed from: E5 */
    public final void mo119164E5(boolean z) throws RemoteException {
        Parcel parcelM166806O = m166806O();
        y5t0.m214318a(parcelM166806O, z);
        m166808Y2(18, parcelM166806O);
    }

    @Override // p153l.l7m
    /* JADX INFO: renamed from: m7 */
    public final void mo119165m7(boolean z) throws RemoteException {
        Parcel parcelM166806O = m166806O();
        y5t0.m214318a(parcelM166806O, z);
        m166808Y2(1, parcelM166806O);
    }
}
