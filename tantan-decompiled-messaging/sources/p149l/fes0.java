package p149l;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class fes0 extends jxr0 implements hes0 {
    public fes0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    @Override // p149l.hes0
    /* JADX INFO: renamed from: a */
    public final String mo121066a() throws RemoteException {
        Parcel parcelM143823P2 = m143823P2(2, m143822O());
        String string = parcelM143823P2.readString();
        parcelM143823P2.recycle();
        return string;
    }

    @Override // p149l.hes0
    /* JADX INFO: renamed from: b */
    public final List mo121067b() throws RemoteException {
        Parcel parcelM143823P2 = m143823P2(23, m143822O());
        ArrayList arrayListM152085b = lxr0.m152085b(parcelM143823P2);
        parcelM143823P2.recycle();
        return arrayListM152085b;
    }

    @Override // p149l.hes0
    /* JADX INFO: renamed from: g */
    public final void mo121068g() throws RemoteException {
        m143825Y2(13, m143822O());
    }

    @Override // p149l.hes0
    public final double zze() throws RemoteException {
        Parcel parcelM143823P2 = m143823P2(8, m143822O());
        double d = parcelM143823P2.readDouble();
        parcelM143823P2.recycle();
        return d;
    }

    @Override // p149l.hes0
    public final ncu0 zzg() throws RemoteException {
        Parcel parcelM143823P2 = m143823P2(31, m143822O());
        ncu0 ncu0VarM125330o8 = gbu0.m125330o8(parcelM143823P2.readStrongBinder());
        parcelM143823P2.recycle();
        return ncu0VarM125330o8;
    }

    @Override // p149l.hes0
    public final fgu0 zzh() throws RemoteException {
        Parcel parcelM143823P2 = m143823P2(11, m143822O());
        fgu0 fgu0VarM218417o8 = zeu0.m218417o8(parcelM143823P2.readStrongBinder());
        parcelM143823P2.recycle();
        return fgu0VarM218417o8;
    }

    @Override // p149l.hes0
    public final nbs0 zzi() throws RemoteException {
        nbs0 lbs0Var;
        Parcel parcelM143823P2 = m143823P2(14, m143822O());
        IBinder strongBinder = parcelM143823P2.readStrongBinder();
        if (strongBinder == null) {
            lbs0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
            lbs0Var = iInterfaceQueryLocalInterface instanceof nbs0 ? (nbs0) iInterfaceQueryLocalInterface : new lbs0(strongBinder);
        }
        parcelM143823P2.recycle();
        return lbs0Var;
    }

    @Override // p149l.hes0
    public final rbs0 zzj() throws RemoteException {
        rbs0 pbs0Var;
        Parcel parcelM143823P2 = m143823P2(29, m143822O());
        IBinder strongBinder = parcelM143823P2.readStrongBinder();
        if (strongBinder == null) {
            pbs0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
            pbs0Var = iInterfaceQueryLocalInterface instanceof rbs0 ? (rbs0) iInterfaceQueryLocalInterface : new pbs0(strongBinder);
        }
        parcelM143823P2.recycle();
        return pbs0Var;
    }

    @Override // p149l.hes0
    public final ubs0 zzk() throws RemoteException {
        ubs0 sbs0Var;
        Parcel parcelM143823P2 = m143823P2(5, m143822O());
        IBinder strongBinder = parcelM143823P2.readStrongBinder();
        if (strongBinder == null) {
            sbs0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            sbs0Var = iInterfaceQueryLocalInterface instanceof ubs0 ? (ubs0) iInterfaceQueryLocalInterface : new sbs0(strongBinder);
        }
        parcelM143823P2.recycle();
        return sbs0Var;
    }

    @Override // p149l.hes0
    public final uyl zzl() throws RemoteException {
        Parcel parcelM143823P2 = m143823P2(19, m143822O());
        uyl uylVarM196295O = uyl.AbstractBinderC20541a.m196295O(parcelM143823P2.readStrongBinder());
        parcelM143823P2.recycle();
        return uylVarM196295O;
    }

    @Override // p149l.hes0
    public final uyl zzm() throws RemoteException {
        Parcel parcelM143823P2 = m143823P2(18, m143822O());
        uyl uylVarM196295O = uyl.AbstractBinderC20541a.m196295O(parcelM143823P2.readStrongBinder());
        parcelM143823P2.recycle();
        return uylVarM196295O;
    }

    @Override // p149l.hes0
    public final String zzn() throws RemoteException {
        Parcel parcelM143823P2 = m143823P2(7, m143822O());
        String string = parcelM143823P2.readString();
        parcelM143823P2.recycle();
        return string;
    }

    @Override // p149l.hes0
    public final String zzo() throws RemoteException {
        Parcel parcelM143823P2 = m143823P2(4, m143822O());
        String string = parcelM143823P2.readString();
        parcelM143823P2.recycle();
        return string;
    }

    @Override // p149l.hes0
    public final String zzp() throws RemoteException {
        Parcel parcelM143823P2 = m143823P2(6, m143822O());
        String string = parcelM143823P2.readString();
        parcelM143823P2.recycle();
        return string;
    }

    @Override // p149l.hes0
    public final String zzs() throws RemoteException {
        Parcel parcelM143823P2 = m143823P2(10, m143822O());
        String string = parcelM143823P2.readString();
        parcelM143823P2.recycle();
        return string;
    }

    @Override // p149l.hes0
    public final String zzt() throws RemoteException {
        Parcel parcelM143823P2 = m143823P2(9, m143822O());
        String string = parcelM143823P2.readString();
        parcelM143823P2.recycle();
        return string;
    }

    @Override // p149l.hes0
    public final List zzu() throws RemoteException {
        Parcel parcelM143823P2 = m143823P2(3, m143822O());
        ArrayList arrayListM152085b = lxr0.m152085b(parcelM143823P2);
        parcelM143823P2.recycle();
        return arrayListM152085b;
    }
}
