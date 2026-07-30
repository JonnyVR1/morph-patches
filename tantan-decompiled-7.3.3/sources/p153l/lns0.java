package p153l;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class lns0 extends p6s0 implements nns0 {
    public lns0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    @Override // p153l.nns0
    /* JADX INFO: renamed from: a */
    public final String mo99774a() throws RemoteException {
        Parcel parcelM171039P2 = m171039P2(2, m171038O());
        String string = parcelM171039P2.readString();
        parcelM171039P2.recycle();
        return string;
    }

    @Override // p153l.nns0
    /* JADX INFO: renamed from: b */
    public final List mo99775b() throws RemoteException {
        Parcel parcelM171039P2 = m171039P2(23, m171038O());
        ArrayList arrayListM180040b = r6s0.m180040b(parcelM171039P2);
        parcelM171039P2.recycle();
        return arrayListM180040b;
    }

    @Override // p153l.nns0
    /* JADX INFO: renamed from: g */
    public final void mo99776g() throws RemoteException {
        m171041Y2(13, m171038O());
    }

    @Override // p153l.nns0
    public final double zze() throws RemoteException {
        Parcel parcelM171039P2 = m171039P2(8, m171038O());
        double d = parcelM171039P2.readDouble();
        parcelM171039P2.recycle();
        return d;
    }

    @Override // p153l.nns0
    public final tlu0 zzg() throws RemoteException {
        Parcel parcelM171039P2 = m171039P2(31, m171038O());
        tlu0 tlu0VarM158822o8 = mku0.m158822o8(parcelM171039P2.readStrongBinder());
        parcelM171039P2.recycle();
        return tlu0VarM158822o8;
    }

    @Override // p153l.nns0
    public final lpu0 zzh() throws RemoteException {
        Parcel parcelM171039P2 = m171039P2(11, m171038O());
        lpu0 lpu0VarM126497o8 = fou0.m126497o8(parcelM171039P2.readStrongBinder());
        parcelM171039P2.recycle();
        return lpu0VarM126497o8;
    }

    @Override // p153l.nns0
    public final tks0 zzi() throws RemoteException {
        tks0 rks0Var;
        Parcel parcelM171039P2 = m171039P2(14, m171038O());
        IBinder strongBinder = parcelM171039P2.readStrongBinder();
        if (strongBinder == null) {
            rks0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
            rks0Var = iInterfaceQueryLocalInterface instanceof tks0 ? (tks0) iInterfaceQueryLocalInterface : new rks0(strongBinder);
        }
        parcelM171039P2.recycle();
        return rks0Var;
    }

    @Override // p153l.nns0
    public final xks0 zzj() throws RemoteException {
        xks0 vks0Var;
        Parcel parcelM171039P2 = m171039P2(29, m171038O());
        IBinder strongBinder = parcelM171039P2.readStrongBinder();
        if (strongBinder == null) {
            vks0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
            vks0Var = iInterfaceQueryLocalInterface instanceof xks0 ? (xks0) iInterfaceQueryLocalInterface : new vks0(strongBinder);
        }
        parcelM171039P2.recycle();
        return vks0Var;
    }

    @Override // p153l.nns0
    public final als0 zzk() throws RemoteException {
        als0 yks0Var;
        Parcel parcelM171039P2 = m171039P2(5, m171038O());
        IBinder strongBinder = parcelM171039P2.readStrongBinder();
        if (strongBinder == null) {
            yks0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            yks0Var = iInterfaceQueryLocalInterface instanceof als0 ? (als0) iInterfaceQueryLocalInterface : new yks0(strongBinder);
        }
        parcelM171039P2.recycle();
        return yks0Var;
    }

    @Override // p153l.nns0
    public final p1m zzl() throws RemoteException {
        Parcel parcelM171039P2 = m171039P2(19, m171038O());
        p1m p1mVarM170217O = p1m.AbstractBinderC19271a.m170217O(parcelM171039P2.readStrongBinder());
        parcelM171039P2.recycle();
        return p1mVarM170217O;
    }

    @Override // p153l.nns0
    public final p1m zzm() throws RemoteException {
        Parcel parcelM171039P2 = m171039P2(18, m171038O());
        p1m p1mVarM170217O = p1m.AbstractBinderC19271a.m170217O(parcelM171039P2.readStrongBinder());
        parcelM171039P2.recycle();
        return p1mVarM170217O;
    }

    @Override // p153l.nns0
    public final String zzn() throws RemoteException {
        Parcel parcelM171039P2 = m171039P2(7, m171038O());
        String string = parcelM171039P2.readString();
        parcelM171039P2.recycle();
        return string;
    }

    @Override // p153l.nns0
    public final String zzo() throws RemoteException {
        Parcel parcelM171039P2 = m171039P2(4, m171038O());
        String string = parcelM171039P2.readString();
        parcelM171039P2.recycle();
        return string;
    }

    @Override // p153l.nns0
    public final String zzp() throws RemoteException {
        Parcel parcelM171039P2 = m171039P2(6, m171038O());
        String string = parcelM171039P2.readString();
        parcelM171039P2.recycle();
        return string;
    }

    @Override // p153l.nns0
    public final String zzs() throws RemoteException {
        Parcel parcelM171039P2 = m171039P2(10, m171038O());
        String string = parcelM171039P2.readString();
        parcelM171039P2.recycle();
        return string;
    }

    @Override // p153l.nns0
    public final String zzt() throws RemoteException {
        Parcel parcelM171039P2 = m171039P2(9, m171038O());
        String string = parcelM171039P2.readString();
        parcelM171039P2.recycle();
        return string;
    }

    @Override // p153l.nns0
    public final List zzu() throws RemoteException {
        Parcel parcelM171039P2 = m171039P2(3, m171038O());
        ArrayList arrayListM180040b = r6s0.m180040b(parcelM171039P2);
        parcelM171039P2.recycle();
        return arrayListM180040b;
    }
}
