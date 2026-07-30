package p153l;

import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public abstract class lfu0 extends q6s0 implements tgu0 {
    public lfu0() {
        super("com.google.android.gms.ads.internal.client.IOutOfContextTester");
    }

    @Override // p153l.q6s0
    /* JADX INFO: renamed from: n8 */
    public final boolean mo96668n8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        String string = parcel.readString();
        p1m p1mVarM170217O = p1m.AbstractBinderC19271a.m170217O(parcel.readStrongBinder());
        p1m p1mVarM170217O2 = p1m.AbstractBinderC19271a.m170217O(parcel.readStrongBinder());
        r6s0.m180041c(parcel);
        mo113639X1(string, p1mVarM170217O, p1mVarM170217O2);
        parcel2.writeNoException();
        return true;
    }
}
