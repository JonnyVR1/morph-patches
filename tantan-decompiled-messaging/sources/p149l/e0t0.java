package p149l;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzq;

/* JADX INFO: loaded from: classes6.dex */
public final class e0t0 extends jxr0 implements n2t0 {
    public e0t0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // p149l.n2t0
    /* JADX INFO: renamed from: E0 */
    public final y0t0 mo12235E0(uyl uylVar, ons0 ons0Var, int i) throws RemoteException {
        Parcel parcelM143822O = m143822O();
        lxr0.m152089f(parcelM143822O, uylVar);
        lxr0.m152089f(parcelM143822O, ons0Var);
        parcelM143822O.writeInt(240304000);
        Parcel parcelM143823P2 = m143823P2(14, parcelM143822O);
        y0t0 y0t0VarM206648o8 = x0t0.m206648o8(parcelM143823P2.readStrongBinder());
        parcelM143823P2.recycle();
        return y0t0VarM206648o8;
    }

    @Override // p149l.n2t0
    /* JADX INFO: renamed from: E2 */
    public final ips0 mo12236E2(uyl uylVar, zzq zzqVar, String str, ons0 ons0Var, int i) throws RemoteException {
        ips0 sms0Var;
        Parcel parcelM143822O = m143822O();
        lxr0.m152089f(parcelM143822O, uylVar);
        lxr0.m152087d(parcelM143822O, zzqVar);
        parcelM143822O.writeString(str);
        lxr0.m152089f(parcelM143822O, ons0Var);
        parcelM143822O.writeInt(240304000);
        Parcel parcelM143823P2 = m143823P2(2, parcelM143822O);
        IBinder strongBinder = parcelM143823P2.readStrongBinder();
        if (strongBinder == null) {
            sms0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            sms0Var = iInterfaceQueryLocalInterface instanceof ips0 ? (ips0) iInterfaceQueryLocalInterface : new sms0(strongBinder);
        }
        parcelM143823P2.recycle();
        return sms0Var;
    }

    @Override // p149l.n2t0
    /* JADX INFO: renamed from: E7 */
    public final ips0 mo12237E7(uyl uylVar, zzq zzqVar, String str, int i) throws RemoteException {
        ips0 sms0Var;
        Parcel parcelM143822O = m143822O();
        lxr0.m152089f(parcelM143822O, uylVar);
        lxr0.m152087d(parcelM143822O, zzqVar);
        parcelM143822O.writeString(str);
        parcelM143822O.writeInt(240304000);
        Parcel parcelM143823P2 = m143823P2(10, parcelM143822O);
        IBinder strongBinder = parcelM143823P2.readStrongBinder();
        if (strongBinder == null) {
            sms0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            sms0Var = iInterfaceQueryLocalInterface instanceof ips0 ? (ips0) iInterfaceQueryLocalInterface : new sms0(strongBinder);
        }
        parcelM143823P2.recycle();
        return sms0Var;
    }

    @Override // p149l.n2t0
    /* JADX INFO: renamed from: F1 */
    public final ujs0 mo12238F1(uyl uylVar, String str, ons0 ons0Var, int i) throws RemoteException {
        ujs0 xhs0Var;
        Parcel parcelM143822O = m143822O();
        lxr0.m152089f(parcelM143822O, uylVar);
        parcelM143822O.writeString(str);
        lxr0.m152089f(parcelM143822O, ons0Var);
        parcelM143822O.writeInt(240304000);
        Parcel parcelM143823P2 = m143823P2(3, parcelM143822O);
        IBinder strongBinder = parcelM143823P2.readStrongBinder();
        if (strongBinder == null) {
            xhs0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            xhs0Var = iInterfaceQueryLocalInterface instanceof ujs0 ? (ujs0) iInterfaceQueryLocalInterface : new xhs0(strongBinder);
        }
        parcelM143823P2.recycle();
        return xhs0Var;
    }

    @Override // p149l.n2t0
    /* JADX INFO: renamed from: Q2 */
    public final ips0 mo12239Q2(uyl uylVar, zzq zzqVar, String str, ons0 ons0Var, int i) throws RemoteException {
        ips0 sms0Var;
        Parcel parcelM143822O = m143822O();
        lxr0.m152089f(parcelM143822O, uylVar);
        lxr0.m152087d(parcelM143822O, zzqVar);
        parcelM143822O.writeString(str);
        lxr0.m152089f(parcelM143822O, ons0Var);
        parcelM143822O.writeInt(240304000);
        Parcel parcelM143823P2 = m143823P2(1, parcelM143822O);
        IBinder strongBinder = parcelM143823P2.readStrongBinder();
        if (strongBinder == null) {
            sms0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            sms0Var = iInterfaceQueryLocalInterface instanceof ips0 ? (ips0) iInterfaceQueryLocalInterface : new sms0(strongBinder);
        }
        parcelM143823P2.recycle();
        return sms0Var;
    }

    @Override // p149l.n2t0
    /* JADX INFO: renamed from: W2 */
    public final fys0 mo12242W2(uyl uylVar, String str, ons0 ons0Var, int i) throws RemoteException {
        Parcel parcelM143822O = m143822O();
        lxr0.m152089f(parcelM143822O, uylVar);
        parcelM143822O.writeString(str);
        lxr0.m152089f(parcelM143822O, ons0Var);
        parcelM143822O.writeInt(240304000);
        Parcel parcelM143823P2 = m143823P2(12, parcelM143822O);
        fys0 fys0VarM118787o8 = eys0.m118787o8(parcelM143823P2.readStrongBinder());
        parcelM143823P2.recycle();
        return fys0VarM118787o8;
    }

    @Override // p149l.n2t0
    /* JADX INFO: renamed from: b1 */
    public final ybs0 mo12244b1(uyl uylVar, uyl uylVar2) throws RemoteException {
        Parcel parcelM143822O = m143822O();
        lxr0.m152089f(parcelM143822O, uylVar);
        lxr0.m152089f(parcelM143822O, uylVar2);
        Parcel parcelM143823P2 = m143823P2(5, parcelM143822O);
        ybs0 ybs0VarM207734o8 = xbs0.m207734o8(parcelM143823P2.readStrongBinder());
        parcelM143823P2.recycle();
        return ybs0VarM207734o8;
    }

    @Override // p149l.n2t0
    /* JADX INFO: renamed from: b4 */
    public final ips0 mo12245b4(uyl uylVar, zzq zzqVar, String str, ons0 ons0Var, int i) throws RemoteException {
        ips0 sms0Var;
        Parcel parcelM143822O = m143822O();
        lxr0.m152089f(parcelM143822O, uylVar);
        lxr0.m152087d(parcelM143822O, zzqVar);
        parcelM143822O.writeString(str);
        lxr0.m152089f(parcelM143822O, ons0Var);
        parcelM143822O.writeInt(240304000);
        Parcel parcelM143823P2 = m143823P2(13, parcelM143822O);
        IBinder strongBinder = parcelM143823P2.readStrongBinder();
        if (strongBinder == null) {
            sms0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            sms0Var = iInterfaceQueryLocalInterface instanceof ips0 ? (ips0) iInterfaceQueryLocalInterface : new sms0(strongBinder);
        }
        parcelM143823P2.recycle();
        return sms0Var;
    }

    @Override // p149l.n2t0
    /* JADX INFO: renamed from: g0 */
    public final lss0 mo12246g0(uyl uylVar) throws RemoteException {
        Parcel parcelM143822O = m143822O();
        lxr0.m152089f(parcelM143822O, uylVar);
        Parcel parcelM143823P2 = m143823P2(8, parcelM143822O);
        lss0 lss0VarM147103o8 = kss0.m147103o8(parcelM143823P2.readStrongBinder());
        parcelM143823P2.recycle();
        return lss0VarM147103o8;
    }

    @Override // p149l.n2t0
    /* JADX INFO: renamed from: o6 */
    public final n7u0 mo12247o6(uyl uylVar, ons0 ons0Var, int i) throws RemoteException {
        n7u0 y4u0Var;
        Parcel parcelM143822O = m143822O();
        lxr0.m152089f(parcelM143822O, uylVar);
        lxr0.m152089f(parcelM143822O, ons0Var);
        parcelM143822O.writeInt(240304000);
        Parcel parcelM143823P2 = m143823P2(17, parcelM143822O);
        IBinder strongBinder = parcelM143823P2.readStrongBinder();
        if (strongBinder == null) {
            y4u0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTester");
            y4u0Var = iInterfaceQueryLocalInterface instanceof n7u0 ? (n7u0) iInterfaceQueryLocalInterface : new y4u0(strongBinder);
        }
        parcelM143823P2.recycle();
        return y4u0Var;
    }

    @Override // p149l.n2t0
    /* JADX INFO: renamed from: q0 */
    public final gft0 mo12248q0(uyl uylVar, int i) throws RemoteException {
        gft0 rct0Var;
        Parcel parcelM143822O = m143822O();
        lxr0.m152089f(parcelM143822O, uylVar);
        parcelM143822O.writeInt(240304000);
        Parcel parcelM143823P2 = m143823P2(9, parcelM143822O);
        IBinder strongBinder = parcelM143823P2.readStrongBinder();
        if (strongBinder == null) {
            rct0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            rct0Var = iInterfaceQueryLocalInterface instanceof gft0 ? (gft0) iInterfaceQueryLocalInterface : new rct0(strongBinder);
        }
        parcelM143823P2.recycle();
        return rct0Var;
    }

    @Override // p149l.n2t0
    /* JADX INFO: renamed from: t1 */
    public final ess0 mo12249t1(uyl uylVar, ons0 ons0Var, int i) throws RemoteException {
        Parcel parcelM143822O = m143822O();
        lxr0.m152089f(parcelM143822O, uylVar);
        lxr0.m152089f(parcelM143822O, ons0Var);
        parcelM143822O.writeInt(240304000);
        Parcel parcelM143823P2 = m143823P2(15, parcelM143822O);
        ess0 ess0VarM113495o8 = dss0.m113495o8(parcelM143823P2.readStrongBinder());
        parcelM143823P2.recycle();
        return ess0VarM113495o8;
    }
}
