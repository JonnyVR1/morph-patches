package p153l;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzq;

/* JADX INFO: loaded from: classes6.dex */
public final class k9t0 extends p6s0 implements tbt0 {
    public k9t0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // p153l.tbt0
    /* JADX INFO: renamed from: E0 */
    public final eat0 mo12289E0(p1m p1mVar, uws0 uws0Var, int i) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        r6s0.m180044f(parcelM171038O, p1mVar);
        r6s0.m180044f(parcelM171038O, uws0Var);
        parcelM171038O.writeInt(240304000);
        Parcel parcelM171039P2 = m171039P2(14, parcelM171038O);
        eat0 eat0VarM115136o8 = dat0.m115136o8(parcelM171039P2.readStrongBinder());
        parcelM171039P2.recycle();
        return eat0VarM115136o8;
    }

    @Override // p153l.tbt0
    /* JADX INFO: renamed from: E2 */
    public final oys0 mo12290E2(p1m p1mVar, zzq zzqVar, String str, uws0 uws0Var, int i) throws RemoteException {
        oys0 yvs0Var;
        Parcel parcelM171038O = m171038O();
        r6s0.m180044f(parcelM171038O, p1mVar);
        r6s0.m180042d(parcelM171038O, zzqVar);
        parcelM171038O.writeString(str);
        r6s0.m180044f(parcelM171038O, uws0Var);
        parcelM171038O.writeInt(240304000);
        Parcel parcelM171039P2 = m171039P2(2, parcelM171038O);
        IBinder strongBinder = parcelM171039P2.readStrongBinder();
        if (strongBinder == null) {
            yvs0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            yvs0Var = iInterfaceQueryLocalInterface instanceof oys0 ? (oys0) iInterfaceQueryLocalInterface : new yvs0(strongBinder);
        }
        parcelM171039P2.recycle();
        return yvs0Var;
    }

    @Override // p153l.tbt0
    /* JADX INFO: renamed from: E7 */
    public final oys0 mo12291E7(p1m p1mVar, zzq zzqVar, String str, int i) throws RemoteException {
        oys0 yvs0Var;
        Parcel parcelM171038O = m171038O();
        r6s0.m180044f(parcelM171038O, p1mVar);
        r6s0.m180042d(parcelM171038O, zzqVar);
        parcelM171038O.writeString(str);
        parcelM171038O.writeInt(240304000);
        Parcel parcelM171039P2 = m171039P2(10, parcelM171038O);
        IBinder strongBinder = parcelM171039P2.readStrongBinder();
        if (strongBinder == null) {
            yvs0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            yvs0Var = iInterfaceQueryLocalInterface instanceof oys0 ? (oys0) iInterfaceQueryLocalInterface : new yvs0(strongBinder);
        }
        parcelM171039P2.recycle();
        return yvs0Var;
    }

    @Override // p153l.tbt0
    /* JADX INFO: renamed from: F1 */
    public final ats0 mo12292F1(p1m p1mVar, String str, uws0 uws0Var, int i) throws RemoteException {
        ats0 drs0Var;
        Parcel parcelM171038O = m171038O();
        r6s0.m180044f(parcelM171038O, p1mVar);
        parcelM171038O.writeString(str);
        r6s0.m180044f(parcelM171038O, uws0Var);
        parcelM171038O.writeInt(240304000);
        Parcel parcelM171039P2 = m171039P2(3, parcelM171038O);
        IBinder strongBinder = parcelM171039P2.readStrongBinder();
        if (strongBinder == null) {
            drs0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            drs0Var = iInterfaceQueryLocalInterface instanceof ats0 ? (ats0) iInterfaceQueryLocalInterface : new drs0(strongBinder);
        }
        parcelM171039P2.recycle();
        return drs0Var;
    }

    @Override // p153l.tbt0
    /* JADX INFO: renamed from: Q2 */
    public final oys0 mo12293Q2(p1m p1mVar, zzq zzqVar, String str, uws0 uws0Var, int i) throws RemoteException {
        oys0 yvs0Var;
        Parcel parcelM171038O = m171038O();
        r6s0.m180044f(parcelM171038O, p1mVar);
        r6s0.m180042d(parcelM171038O, zzqVar);
        parcelM171038O.writeString(str);
        r6s0.m180044f(parcelM171038O, uws0Var);
        parcelM171038O.writeInt(240304000);
        Parcel parcelM171039P2 = m171039P2(1, parcelM171038O);
        IBinder strongBinder = parcelM171039P2.readStrongBinder();
        if (strongBinder == null) {
            yvs0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            yvs0Var = iInterfaceQueryLocalInterface instanceof oys0 ? (oys0) iInterfaceQueryLocalInterface : new yvs0(strongBinder);
        }
        parcelM171039P2.recycle();
        return yvs0Var;
    }

    @Override // p153l.tbt0
    /* JADX INFO: renamed from: W2 */
    public final l7t0 mo12296W2(p1m p1mVar, String str, uws0 uws0Var, int i) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        r6s0.m180044f(parcelM171038O, p1mVar);
        parcelM171038O.writeString(str);
        r6s0.m180044f(parcelM171038O, uws0Var);
        parcelM171038O.writeInt(240304000);
        Parcel parcelM171039P2 = m171039P2(12, parcelM171038O);
        l7t0 l7t0VarM148644o8 = k7t0.m148644o8(parcelM171039P2.readStrongBinder());
        parcelM171039P2.recycle();
        return l7t0VarM148644o8;
    }

    @Override // p153l.tbt0
    /* JADX INFO: renamed from: b1 */
    public final els0 mo12298b1(p1m p1mVar, p1m p1mVar2) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        r6s0.m180044f(parcelM171038O, p1mVar);
        r6s0.m180044f(parcelM171038O, p1mVar2);
        Parcel parcelM171039P2 = m171039P2(5, parcelM171038O);
        els0 els0VarM116863o8 = dls0.m116863o8(parcelM171039P2.readStrongBinder());
        parcelM171039P2.recycle();
        return els0VarM116863o8;
    }

    @Override // p153l.tbt0
    /* JADX INFO: renamed from: b4 */
    public final oys0 mo12299b4(p1m p1mVar, zzq zzqVar, String str, uws0 uws0Var, int i) throws RemoteException {
        oys0 yvs0Var;
        Parcel parcelM171038O = m171038O();
        r6s0.m180044f(parcelM171038O, p1mVar);
        r6s0.m180042d(parcelM171038O, zzqVar);
        parcelM171038O.writeString(str);
        r6s0.m180044f(parcelM171038O, uws0Var);
        parcelM171038O.writeInt(240304000);
        Parcel parcelM171039P2 = m171039P2(13, parcelM171038O);
        IBinder strongBinder = parcelM171039P2.readStrongBinder();
        if (strongBinder == null) {
            yvs0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            yvs0Var = iInterfaceQueryLocalInterface instanceof oys0 ? (oys0) iInterfaceQueryLocalInterface : new yvs0(strongBinder);
        }
        parcelM171039P2.recycle();
        return yvs0Var;
    }

    @Override // p153l.tbt0
    /* JADX INFO: renamed from: g0 */
    public final r1t0 mo12300g0(p1m p1mVar) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        r6s0.m180044f(parcelM171038O, p1mVar);
        Parcel parcelM171039P2 = m171039P2(8, parcelM171038O);
        r1t0 r1t0VarM174929o8 = q1t0.m174929o8(parcelM171039P2.readStrongBinder());
        parcelM171039P2.recycle();
        return r1t0VarM174929o8;
    }

    @Override // p153l.tbt0
    /* JADX INFO: renamed from: o6 */
    public final tgu0 mo12301o6(p1m p1mVar, uws0 uws0Var, int i) throws RemoteException {
        tgu0 eeu0Var;
        Parcel parcelM171038O = m171038O();
        r6s0.m180044f(parcelM171038O, p1mVar);
        r6s0.m180044f(parcelM171038O, uws0Var);
        parcelM171038O.writeInt(240304000);
        Parcel parcelM171039P2 = m171039P2(17, parcelM171038O);
        IBinder strongBinder = parcelM171039P2.readStrongBinder();
        if (strongBinder == null) {
            eeu0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTester");
            eeu0Var = iInterfaceQueryLocalInterface instanceof tgu0 ? (tgu0) iInterfaceQueryLocalInterface : new eeu0(strongBinder);
        }
        parcelM171039P2.recycle();
        return eeu0Var;
    }

    @Override // p153l.tbt0
    /* JADX INFO: renamed from: q0 */
    public final mot0 mo12302q0(p1m p1mVar, int i) throws RemoteException {
        mot0 xlt0Var;
        Parcel parcelM171038O = m171038O();
        r6s0.m180044f(parcelM171038O, p1mVar);
        parcelM171038O.writeInt(240304000);
        Parcel parcelM171039P2 = m171039P2(9, parcelM171038O);
        IBinder strongBinder = parcelM171039P2.readStrongBinder();
        if (strongBinder == null) {
            xlt0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            xlt0Var = iInterfaceQueryLocalInterface instanceof mot0 ? (mot0) iInterfaceQueryLocalInterface : new xlt0(strongBinder);
        }
        parcelM171039P2.recycle();
        return xlt0Var;
    }

    @Override // p153l.tbt0
    /* JADX INFO: renamed from: t1 */
    public final k1t0 mo12303t1(p1m p1mVar, uws0 uws0Var, int i) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        r6s0.m180044f(parcelM171038O, p1mVar);
        r6s0.m180044f(parcelM171038O, uws0Var);
        parcelM171038O.writeInt(240304000);
        Parcel parcelM171039P2 = m171039P2(15, parcelM171038O);
        k1t0 k1t0VarM143151o8 = j1t0.m143151o8(parcelM171039P2.readStrongBinder());
        parcelM171039P2.recycle();
        return k1t0VarM143151o8;
    }
}
