package p149l;

import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public abstract class f6u0 extends kxr0 implements n7u0 {
    public f6u0() {
        super("com.google.android.gms.ads.internal.client.IOutOfContextTester");
    }

    @Override // p149l.kxr0
    /* JADX INFO: renamed from: n8 */
    public final boolean mo98344n8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        String string = parcel.readString();
        uyl uylVarM196295O = uyl.AbstractBinderC20541a.m196295O(parcel.readStrongBinder());
        uyl uylVarM196295O2 = uyl.AbstractBinderC20541a.m196295O(parcel.readStrongBinder());
        lxr0.m152086c(parcel);
        mo158163X1(string, uylVarM196295O, uylVarM196295O2);
        parcel2.writeNoException();
        return true;
    }
}
