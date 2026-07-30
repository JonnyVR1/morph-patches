package p153l;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.tencent.liteav.TXLiteAVCode;

/* JADX INFO: loaded from: classes6.dex */
public final class npr0 extends gwr0 implements jsr0 {
    public npr0(IBinder iBinder) {
        super(iBinder, "com.android.vending.billing.IInAppBillingService");
    }

    @Override // p153l.jsr0
    /* JADX INFO: renamed from: D4 */
    public final int mo146863D4(int i, String str, String str2) throws RemoteException {
        Parcel parcelM132697O = m132697O();
        parcelM132697O.writeInt(3);
        parcelM132697O.writeString(str);
        parcelM132697O.writeString(str2);
        Parcel parcelM132698P2 = m132698P2(5, parcelM132697O);
        int i2 = parcelM132698P2.readInt();
        parcelM132698P2.recycle();
        return i2;
    }

    @Override // p153l.jsr0
    /* JADX INFO: renamed from: F2 */
    public final Bundle mo146864F2(int i, String str, String str2, Bundle bundle, Bundle bundle2) throws RemoteException {
        Parcel parcelM132697O = m132697O();
        parcelM132697O.writeInt(i);
        parcelM132697O.writeString(str);
        parcelM132697O.writeString(str2);
        yyr0.m218005c(parcelM132697O, bundle);
        yyr0.m218005c(parcelM132697O, bundle2);
        Parcel parcelM132698P2 = m132698P2(901, parcelM132697O);
        Bundle bundle3 = (Bundle) yyr0.m218003a(parcelM132698P2, Bundle.CREATOR);
        parcelM132698P2.recycle();
        return bundle3;
    }

    @Override // p153l.jsr0
    /* JADX INFO: renamed from: F6 */
    public final int mo146865F6(int i, String str, String str2) throws RemoteException {
        Parcel parcelM132697O = m132697O();
        parcelM132697O.writeInt(i);
        parcelM132697O.writeString(str);
        parcelM132697O.writeString(str2);
        Parcel parcelM132698P2 = m132698P2(1, parcelM132697O);
        int i2 = parcelM132698P2.readInt();
        parcelM132698P2.recycle();
        return i2;
    }

    @Override // p153l.jsr0
    /* JADX INFO: renamed from: G5 */
    public final Bundle mo146866G5(int i, String str, String str2, String str3, String str4, Bundle bundle) throws RemoteException {
        Parcel parcelM132697O = m132697O();
        parcelM132697O.writeInt(i);
        parcelM132697O.writeString(str);
        parcelM132697O.writeString(str2);
        parcelM132697O.writeString(str3);
        parcelM132697O.writeString(null);
        yyr0.m218005c(parcelM132697O, bundle);
        Parcel parcelM132698P2 = m132698P2(8, parcelM132697O);
        Bundle bundle2 = (Bundle) yyr0.m218003a(parcelM132698P2, Bundle.CREATOR);
        parcelM132698P2.recycle();
        return bundle2;
    }

    @Override // p153l.jsr0
    /* JADX INFO: renamed from: K2 */
    public final Bundle mo146867K2(int i, String str, String str2, Bundle bundle) throws RemoteException {
        Parcel parcelM132697O = m132697O();
        parcelM132697O.writeInt(9);
        parcelM132697O.writeString(str);
        parcelM132697O.writeString(str2);
        yyr0.m218005c(parcelM132697O, bundle);
        Parcel parcelM132698P2 = m132698P2(12, parcelM132697O);
        Bundle bundle2 = (Bundle) yyr0.m218003a(parcelM132698P2, Bundle.CREATOR);
        parcelM132698P2.recycle();
        return bundle2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.jsr0
    /* JADX INFO: renamed from: V5 */
    public final void mo146868V5(int i, String str, Bundle bundle, cvr0 cvr0Var) throws RemoteException {
        Parcel parcelM132697O = m132697O();
        parcelM132697O.writeInt(12);
        parcelM132697O.writeString(str);
        yyr0.m218005c(parcelM132697O, bundle);
        parcelM132697O.writeStrongBinder(cvr0Var);
        m132700Y2(TXLiteAVCode.WARNING_MICROPHONE_DEVICE_EMPTY, parcelM132697O);
    }

    @Override // p153l.jsr0
    /* JADX INFO: renamed from: a2 */
    public final Bundle mo146869a2(int i, String str, String str2, String str3, Bundle bundle) throws RemoteException {
        Parcel parcelM132697O = m132697O();
        parcelM132697O.writeInt(i);
        parcelM132697O.writeString(str);
        parcelM132697O.writeString(str2);
        parcelM132697O.writeString(str3);
        yyr0.m218005c(parcelM132697O, bundle);
        Parcel parcelM132698P2 = m132698P2(11, parcelM132697O);
        Bundle bundle2 = (Bundle) yyr0.m218003a(parcelM132698P2, Bundle.CREATOR);
        parcelM132698P2.recycle();
        return bundle2;
    }

    @Override // p153l.jsr0
    /* JADX INFO: renamed from: e1 */
    public final Bundle mo146870e1(int i, String str, String str2, String str3) throws RemoteException {
        Parcel parcelM132697O = m132697O();
        parcelM132697O.writeInt(3);
        parcelM132697O.writeString(str);
        parcelM132697O.writeString(str2);
        parcelM132697O.writeString(str3);
        Parcel parcelM132698P2 = m132698P2(4, parcelM132697O);
        Bundle bundle = (Bundle) yyr0.m218003a(parcelM132698P2, Bundle.CREATOR);
        parcelM132698P2.recycle();
        return bundle;
    }

    @Override // p153l.jsr0
    /* JADX INFO: renamed from: e4 */
    public final int mo146871e4(int i, String str, String str2, Bundle bundle) throws RemoteException {
        Parcel parcelM132697O = m132697O();
        parcelM132697O.writeInt(i);
        parcelM132697O.writeString(str);
        parcelM132697O.writeString(str2);
        yyr0.m218005c(parcelM132697O, bundle);
        Parcel parcelM132698P2 = m132698P2(10, parcelM132697O);
        int i2 = parcelM132698P2.readInt();
        parcelM132698P2.recycle();
        return i2;
    }

    @Override // p153l.jsr0
    /* JADX INFO: renamed from: n3 */
    public final Bundle mo146872n3(int i, String str, String str2, String str3, String str4) throws RemoteException {
        Parcel parcelM132697O = m132697O();
        parcelM132697O.writeInt(3);
        parcelM132697O.writeString(str);
        parcelM132697O.writeString(str2);
        parcelM132697O.writeString(str3);
        parcelM132697O.writeString(null);
        Parcel parcelM132698P2 = m132698P2(3, parcelM132697O);
        Bundle bundle = (Bundle) yyr0.m218003a(parcelM132698P2, Bundle.CREATOR);
        parcelM132698P2.recycle();
        return bundle;
    }

    @Override // p153l.jsr0
    /* JADX INFO: renamed from: p4 */
    public final Bundle mo146873p4(int i, String str, String str2, Bundle bundle) throws RemoteException {
        Parcel parcelM132697O = m132697O();
        parcelM132697O.writeInt(9);
        parcelM132697O.writeString(str);
        parcelM132697O.writeString(str2);
        yyr0.m218005c(parcelM132697O, bundle);
        Parcel parcelM132698P2 = m132698P2(902, parcelM132697O);
        Bundle bundle2 = (Bundle) yyr0.m218003a(parcelM132698P2, Bundle.CREATOR);
        parcelM132698P2.recycle();
        return bundle2;
    }
}
