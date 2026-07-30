package p149l;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.internal.ads.zzbjb;
import com.google.android.gms.internal.ads.zzbpp;

/* JADX INFO: loaded from: classes6.dex */
public abstract class vis0 extends kxr0 implements ujs0 {
    public vis0() {
        super("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // p149l.kxr0
    /* JADX INFO: renamed from: n8 */
    public final boolean mo98344n8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        r8s0 i6s0Var = null;
        t3t0 t3t0Var = null;
        switch (i) {
            case 1:
                fgs0 fgs0VarZze = zze();
                parcel2.writeNoException();
                lxr0.m152089f(parcel2, fgs0VarZze);
                return true;
            case 2:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    i6s0Var = iInterfaceQueryLocalInterface instanceof r8s0 ? (r8s0) iInterfaceQueryLocalInterface : new i6s0(strongBinder);
                }
                lxr0.m152086c(parcel);
                mo131152T3(i6s0Var);
                parcel2.writeNoException();
                return true;
            case 3:
                zcs0 zcs0VarM214205o8 = ycs0.m214205o8(parcel.readStrongBinder());
                lxr0.m152086c(parcel);
                mo131158k6(zcs0VarM214205o8);
                parcel2.writeNoException();
                return true;
            case 4:
                cds0 cds0VarM101231o8 = bds0.m101231o8(parcel.readStrongBinder());
                lxr0.m152086c(parcel);
                mo131159l7(cds0VarM101231o8);
                parcel2.writeNoException();
                return true;
            case 5:
                String string = parcel.readString();
                ids0 ids0VarM130611o8 = hds0.m130611o8(parcel.readStrongBinder());
                fds0 fds0VarM115832o8 = eds0.m115832o8(parcel.readStrongBinder());
                lxr0.m152086c(parcel);
                mo131151B2(string, ids0VarM130611o8, fds0VarM115832o8);
                parcel2.writeNoException();
                return true;
            case 6:
                zzbjb zzbjbVar = (zzbjb) lxr0.m152084a(parcel, zzbjb.CREATOR);
                lxr0.m152086c(parcel);
                mo131154X0(zzbjbVar);
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    t3t0Var = iInterfaceQueryLocalInterface2 instanceof t3t0 ? (t3t0) iInterfaceQueryLocalInterface2 : new t3t0(strongBinder2);
                }
                lxr0.m152086c(parcel);
                mo131156a8(t3t0Var);
                parcel2.writeNoException();
                return true;
            case 8:
                mds0 mds0VarM149472o8 = lds0.m149472o8(parcel.readStrongBinder());
                zzq zzqVar = (zzq) lxr0.m152084a(parcel, zzq.CREATOR);
                lxr0.m152086c(parcel);
                mo131153W5(mds0VarM149472o8, zzqVar);
                parcel2.writeNoException();
                return true;
            case 9:
                PublisherAdViewOptions publisherAdViewOptions = (PublisherAdViewOptions) lxr0.m152084a(parcel, PublisherAdViewOptions.CREATOR);
                lxr0.m152086c(parcel);
                mo131160o4(publisherAdViewOptions);
                parcel2.writeNoException();
                return true;
            case 10:
                zds0 zds0VarM163713o8 = ods0.m163713o8(parcel.readStrongBinder());
                lxr0.m152086c(parcel);
                mo131157h4(zds0VarM163713o8);
                parcel2.writeNoException();
                return true;
            case 11:
            case 12:
            default:
                return false;
            case 13:
                zzbpp zzbppVar = (zzbpp) lxr0.m152084a(parcel, zzbpp.CREATOR);
                lxr0.m152086c(parcel);
                mo131163t2(zzbppVar);
                parcel2.writeNoException();
                return true;
            case 14:
                rjs0 rjs0VarM175037o8 = qjs0.m175037o8(parcel.readStrongBinder());
                lxr0.m152086c(parcel);
                mo131155Z5(rjs0VarM175037o8);
                parcel2.writeNoException();
                return true;
            case 15:
                AdManagerAdViewOptions adManagerAdViewOptions = (AdManagerAdViewOptions) lxr0.m152084a(parcel, AdManagerAdViewOptions.CREATOR);
                lxr0.m152086c(parcel);
                mo131162q4(adManagerAdViewOptions);
                parcel2.writeNoException();
                return true;
        }
    }
}
