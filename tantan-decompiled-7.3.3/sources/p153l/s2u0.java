package p153l;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;

/* JADX INFO: loaded from: classes6.dex */
public abstract class s2u0 extends q6s0 implements k5u0 {
    public s2u0() {
        super("com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
    }

    @Override // p153l.q6s0
    /* JADX INFO: renamed from: n8 */
    public final boolean mo96668n8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        zze zzeVar = (zze) r6s0.m180039a(parcel, zze.CREATOR);
        r6s0.m180041c(parcel);
        mo113733o5(zzeVar);
        parcel2.writeNoException();
        return true;
    }
}
