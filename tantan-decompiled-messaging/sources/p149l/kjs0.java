package p149l;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public abstract class kjs0 extends kxr0 implements ljs0 {
    public kjs0() {
        super("com.google.android.gms.ads.internal.instream.client.IInstreamAd");
    }

    @Override // p149l.kxr0
    /* JADX INFO: renamed from: n8 */
    public final boolean mo98344n8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        ojs0 mjs0Var;
        if (i == 3) {
            fgu0 fgu0VarZzb = zzb();
            parcel2.writeNoException();
            lxr0.m152089f(parcel2, fgu0VarZzb);
            return true;
        }
        if (i == 4) {
            zzd();
            parcel2.writeNoException();
            return true;
        }
        if (i == 5) {
            uyl uylVarM196295O = uyl.AbstractBinderC20541a.m196295O(parcel.readStrongBinder());
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                mjs0Var = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
                mjs0Var = iInterfaceQueryLocalInterface instanceof ojs0 ? (ojs0) iInterfaceQueryLocalInterface : new mjs0(strongBinder);
            }
            lxr0.m152086c(parcel);
            mo149855U3(uylVarM196295O, mjs0Var);
            parcel2.writeNoException();
            return true;
        }
        if (i == 6) {
            uyl uylVarM196295O2 = uyl.AbstractBinderC20541a.m196295O(parcel.readStrongBinder());
            lxr0.m152086c(parcel);
            zze(uylVarM196295O2);
            parcel2.writeNoException();
            return true;
        }
        if (i != 7) {
            return false;
        }
        rbs0 rbs0VarZzc = zzc();
        parcel2.writeNoException();
        lxr0.m152089f(parcel2, rbs0VarZzc);
        return true;
    }
}
