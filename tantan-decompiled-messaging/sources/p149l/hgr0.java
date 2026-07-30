package p149l;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.tencent.liteav.TXLiteAVCode;

/* JADX INFO: loaded from: classes6.dex */
public final class hgr0 extends anr0 implements djr0 {
    public hgr0(IBinder iBinder) {
        super(iBinder, "com.android.vending.billing.IInAppBillingService");
    }

    @Override // p149l.djr0
    /* JADX INFO: renamed from: D4 */
    public final int mo112099D4(int i, String str, String str2) throws RemoteException {
        Parcel parcelM97809O = m97809O();
        parcelM97809O.writeInt(3);
        parcelM97809O.writeString(str);
        parcelM97809O.writeString(str2);
        Parcel parcelM97810P2 = m97810P2(5, parcelM97809O);
        int i2 = parcelM97810P2.readInt();
        parcelM97810P2.recycle();
        return i2;
    }

    @Override // p149l.djr0
    /* JADX INFO: renamed from: F2 */
    public final Bundle mo112100F2(int i, String str, String str2, Bundle bundle, Bundle bundle2) throws RemoteException {
        Parcel parcelM97809O = m97809O();
        parcelM97809O.writeInt(i);
        parcelM97809O.writeString(str);
        parcelM97809O.writeString(str2);
        spr0.m185387c(parcelM97809O, bundle);
        spr0.m185387c(parcelM97809O, bundle2);
        Parcel parcelM97810P2 = m97810P2(901, parcelM97809O);
        Bundle bundle3 = (Bundle) spr0.m185385a(parcelM97810P2, Bundle.CREATOR);
        parcelM97810P2.recycle();
        return bundle3;
    }

    @Override // p149l.djr0
    /* JADX INFO: renamed from: F6 */
    public final int mo112101F6(int i, String str, String str2) throws RemoteException {
        Parcel parcelM97809O = m97809O();
        parcelM97809O.writeInt(i);
        parcelM97809O.writeString(str);
        parcelM97809O.writeString(str2);
        Parcel parcelM97810P2 = m97810P2(1, parcelM97809O);
        int i2 = parcelM97810P2.readInt();
        parcelM97810P2.recycle();
        return i2;
    }

    @Override // p149l.djr0
    /* JADX INFO: renamed from: G5 */
    public final Bundle mo112102G5(int i, String str, String str2, String str3, String str4, Bundle bundle) throws RemoteException {
        Parcel parcelM97809O = m97809O();
        parcelM97809O.writeInt(i);
        parcelM97809O.writeString(str);
        parcelM97809O.writeString(str2);
        parcelM97809O.writeString(str3);
        parcelM97809O.writeString(null);
        spr0.m185387c(parcelM97809O, bundle);
        Parcel parcelM97810P2 = m97810P2(8, parcelM97809O);
        Bundle bundle2 = (Bundle) spr0.m185385a(parcelM97810P2, Bundle.CREATOR);
        parcelM97810P2.recycle();
        return bundle2;
    }

    @Override // p149l.djr0
    /* JADX INFO: renamed from: K2 */
    public final Bundle mo112103K2(int i, String str, String str2, Bundle bundle) throws RemoteException {
        Parcel parcelM97809O = m97809O();
        parcelM97809O.writeInt(9);
        parcelM97809O.writeString(str);
        parcelM97809O.writeString(str2);
        spr0.m185387c(parcelM97809O, bundle);
        Parcel parcelM97810P2 = m97810P2(12, parcelM97809O);
        Bundle bundle2 = (Bundle) spr0.m185385a(parcelM97810P2, Bundle.CREATOR);
        parcelM97810P2.recycle();
        return bundle2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.djr0
    /* JADX INFO: renamed from: V5 */
    public final void mo112104V5(int i, String str, Bundle bundle, wlr0 wlr0Var) throws RemoteException {
        Parcel parcelM97809O = m97809O();
        parcelM97809O.writeInt(12);
        parcelM97809O.writeString(str);
        spr0.m185387c(parcelM97809O, bundle);
        parcelM97809O.writeStrongBinder(wlr0Var);
        m97812Y2(TXLiteAVCode.WARNING_MICROPHONE_DEVICE_EMPTY, parcelM97809O);
    }

    @Override // p149l.djr0
    /* JADX INFO: renamed from: a2 */
    public final Bundle mo112105a2(int i, String str, String str2, String str3, Bundle bundle) throws RemoteException {
        Parcel parcelM97809O = m97809O();
        parcelM97809O.writeInt(i);
        parcelM97809O.writeString(str);
        parcelM97809O.writeString(str2);
        parcelM97809O.writeString(str3);
        spr0.m185387c(parcelM97809O, bundle);
        Parcel parcelM97810P2 = m97810P2(11, parcelM97809O);
        Bundle bundle2 = (Bundle) spr0.m185385a(parcelM97810P2, Bundle.CREATOR);
        parcelM97810P2.recycle();
        return bundle2;
    }

    @Override // p149l.djr0
    /* JADX INFO: renamed from: e1 */
    public final Bundle mo112106e1(int i, String str, String str2, String str3) throws RemoteException {
        Parcel parcelM97809O = m97809O();
        parcelM97809O.writeInt(3);
        parcelM97809O.writeString(str);
        parcelM97809O.writeString(str2);
        parcelM97809O.writeString(str3);
        Parcel parcelM97810P2 = m97810P2(4, parcelM97809O);
        Bundle bundle = (Bundle) spr0.m185385a(parcelM97810P2, Bundle.CREATOR);
        parcelM97810P2.recycle();
        return bundle;
    }

    @Override // p149l.djr0
    /* JADX INFO: renamed from: e4 */
    public final int mo112107e4(int i, String str, String str2, Bundle bundle) throws RemoteException {
        Parcel parcelM97809O = m97809O();
        parcelM97809O.writeInt(i);
        parcelM97809O.writeString(str);
        parcelM97809O.writeString(str2);
        spr0.m185387c(parcelM97809O, bundle);
        Parcel parcelM97810P2 = m97810P2(10, parcelM97809O);
        int i2 = parcelM97810P2.readInt();
        parcelM97810P2.recycle();
        return i2;
    }

    @Override // p149l.djr0
    /* JADX INFO: renamed from: n3 */
    public final Bundle mo112108n3(int i, String str, String str2, String str3, String str4) throws RemoteException {
        Parcel parcelM97809O = m97809O();
        parcelM97809O.writeInt(3);
        parcelM97809O.writeString(str);
        parcelM97809O.writeString(str2);
        parcelM97809O.writeString(str3);
        parcelM97809O.writeString(null);
        Parcel parcelM97810P2 = m97810P2(3, parcelM97809O);
        Bundle bundle = (Bundle) spr0.m185385a(parcelM97810P2, Bundle.CREATOR);
        parcelM97810P2.recycle();
        return bundle;
    }

    @Override // p149l.djr0
    /* JADX INFO: renamed from: p4 */
    public final Bundle mo112109p4(int i, String str, String str2, Bundle bundle) throws RemoteException {
        Parcel parcelM97809O = m97809O();
        parcelM97809O.writeInt(9);
        parcelM97809O.writeString(str);
        parcelM97809O.writeString(str2);
        spr0.m185387c(parcelM97809O, bundle);
        Parcel parcelM97810P2 = m97810P2(902, parcelM97809O);
        Bundle bundle2 = (Bundle) spr0.m185385a(parcelM97810P2, Bundle.CREATOR);
        parcelM97810P2.recycle();
        return bundle2;
    }
}
