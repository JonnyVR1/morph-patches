package p149l;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public abstract class qbs0 extends kxr0 implements rbs0 {
    public qbs0() {
        super("com.google.android.gms.ads.internal.formats.client.IMediaContent");
    }

    @Override // p149l.kxr0
    /* JADX INFO: renamed from: n8 */
    public final boolean mo98344n8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        jds0 jds0Var;
        switch (i) {
            case 2:
                float fZze = zze();
                parcel2.writeNoException();
                parcel2.writeFloat(fZze);
                return true;
            case 3:
                uyl uylVarM196295O = uyl.AbstractBinderC20541a.m196295O(parcel.readStrongBinder());
                lxr0.m152086c(parcel);
                mo173845E(uylVarM196295O);
                parcel2.writeNoException();
                return true;
            case 4:
                uyl uylVarZzi = zzi();
                parcel2.writeNoException();
                lxr0.m152089f(parcel2, uylVarZzi);
                return true;
            case 5:
                float fZzg = zzg();
                parcel2.writeNoException();
                parcel2.writeFloat(fZzg);
                return true;
            case 6:
                float fZzf = zzf();
                parcel2.writeNoException();
                parcel2.writeFloat(fZzf);
                return true;
            case 7:
                fgu0 fgu0VarZzh = zzh();
                parcel2.writeNoException();
                lxr0.m152089f(parcel2, fgu0VarZzh);
                return true;
            case 8:
                boolean zZzl = zzl();
                parcel2.writeNoException();
                ClassLoader classLoader = lxr0.f130430a;
                parcel2.writeInt(zZzl ? 1 : 0);
                return true;
            case 9:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    jds0Var = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnMediaContentChangedListener");
                    jds0Var = iInterfaceQueryLocalInterface instanceof jds0 ? (jds0) iInterfaceQueryLocalInterface : new jds0(strongBinder);
                }
                lxr0.m152086c(parcel);
                mo173846s2(jds0Var);
                parcel2.writeNoException();
                return true;
            case 10:
                boolean zZzk = zzk();
                parcel2.writeNoException();
                ClassLoader classLoader2 = lxr0.f130430a;
                parcel2.writeInt(zZzk ? 1 : 0);
                return true;
            default:
                return false;
        }
    }
}
