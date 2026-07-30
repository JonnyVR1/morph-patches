package p149l;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.offline.buffering.zza;

/* JADX INFO: loaded from: classes6.dex */
public abstract class lms0 extends kxr0 implements tns0 {
    public lms0() {
        super("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
    }

    @Override // p149l.kxr0
    /* JADX INFO: renamed from: n8 */
    public final boolean mo98344n8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            uyl uylVarM196295O = uyl.AbstractBinderC20541a.m196295O(parcel.readStrongBinder());
            String string = parcel.readString();
            String string2 = parcel.readString();
            lxr0.m152086c(parcel);
            boolean zZzf = zzf(uylVarM196295O, string, string2);
            parcel2.writeNoException();
            parcel2.writeInt(zZzf ? 1 : 0);
        } else if (i == 2) {
            uyl uylVarM196295O2 = uyl.AbstractBinderC20541a.m196295O(parcel.readStrongBinder());
            lxr0.m152086c(parcel);
            zze(uylVarM196295O2);
            parcel2.writeNoException();
        } else {
            if (i != 3) {
                return false;
            }
            uyl uylVarM196295O3 = uyl.AbstractBinderC20541a.m196295O(parcel.readStrongBinder());
            zza zzaVar = (zza) lxr0.m152084a(parcel, zza.CREATOR);
            lxr0.m152086c(parcel);
            boolean zZzg = zzg(uylVarM196295O3, zzaVar);
            parcel2.writeNoException();
            parcel2.writeInt(zZzg ? 1 : 0);
        }
        return true;
    }
}
