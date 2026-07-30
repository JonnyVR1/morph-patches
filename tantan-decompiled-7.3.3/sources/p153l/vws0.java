package p153l;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.internal.ads.zzbjb;
import com.google.android.gms.internal.ads.zzbvg;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class vws0 extends p6s0 implements xws0 {
    public vws0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    @Override // p153l.xws0
    /* JADX INFO: renamed from: D3 */
    public final void mo107055D3(p1m p1mVar, zzl zzlVar, String str, String str2, jxs0 jxs0Var) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        r6s0.m180044f(parcelM171038O, p1mVar);
        r6s0.m180042d(parcelM171038O, zzlVar);
        parcelM171038O.writeString(str);
        parcelM171038O.writeString(str2);
        r6s0.m180044f(parcelM171038O, jxs0Var);
        m171041Y2(7, parcelM171038O);
    }

    @Override // p153l.xws0
    /* JADX INFO: renamed from: D5 */
    public final void mo107056D5(p1m p1mVar, zzq zzqVar, zzl zzlVar, String str, String str2, jxs0 jxs0Var) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        r6s0.m180044f(parcelM171038O, p1mVar);
        r6s0.m180042d(parcelM171038O, zzqVar);
        r6s0.m180042d(parcelM171038O, zzlVar);
        parcelM171038O.writeString(str);
        parcelM171038O.writeString(str2);
        r6s0.m180044f(parcelM171038O, jxs0Var);
        m171041Y2(35, parcelM171038O);
    }

    @Override // p153l.xws0
    /* JADX INFO: renamed from: E1 */
    public final void mo107057E1(p1m p1mVar, iss0 iss0Var, List list) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        r6s0.m180044f(parcelM171038O, p1mVar);
        r6s0.m180044f(parcelM171038O, iss0Var);
        parcelM171038O.writeTypedList(list);
        m171041Y2(31, parcelM171038O);
    }

    @Override // p153l.xws0
    /* JADX INFO: renamed from: L4 */
    public final void mo107058L4(p1m p1mVar) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        r6s0.m180044f(parcelM171038O, p1mVar);
        m171041Y2(30, parcelM171038O);
    }

    @Override // p153l.xws0
    /* JADX INFO: renamed from: M */
    public final void mo107059M() throws RemoteException {
        m171041Y2(8, m171038O());
    }

    @Override // p153l.xws0
    /* JADX INFO: renamed from: N2 */
    public final void mo107060N2(p1m p1mVar, zzl zzlVar, String str, e7t0 e7t0Var, String str2) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        r6s0.m180044f(parcelM171038O, p1mVar);
        r6s0.m180042d(parcelM171038O, zzlVar);
        parcelM171038O.writeString(null);
        r6s0.m180044f(parcelM171038O, e7t0Var);
        parcelM171038O.writeString(str2);
        m171041Y2(10, parcelM171038O);
    }

    @Override // p153l.xws0
    /* JADX INFO: renamed from: O3 */
    public final void mo107061O3(p1m p1mVar, zzl zzlVar, String str, jxs0 jxs0Var) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        r6s0.m180044f(parcelM171038O, p1mVar);
        r6s0.m180042d(parcelM171038O, zzlVar);
        parcelM171038O.writeString(str);
        r6s0.m180044f(parcelM171038O, jxs0Var);
        m171041Y2(32, parcelM171038O);
    }

    @Override // p153l.xws0
    /* JADX INFO: renamed from: S1 */
    public final void mo107062S1(zzl zzlVar, String str) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        r6s0.m180042d(parcelM171038O, zzlVar);
        parcelM171038O.writeString(str);
        m171041Y2(11, parcelM171038O);
    }

    @Override // p153l.xws0
    /* JADX INFO: renamed from: T4 */
    public final void mo107063T4(p1m p1mVar) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        r6s0.m180044f(parcelM171038O, p1mVar);
        m171041Y2(37, parcelM171038O);
    }

    @Override // p153l.xws0
    /* JADX INFO: renamed from: g8 */
    public final void mo107066g8(p1m p1mVar, zzl zzlVar, String str, jxs0 jxs0Var) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        r6s0.m180044f(parcelM171038O, p1mVar);
        r6s0.m180042d(parcelM171038O, zzlVar);
        parcelM171038O.writeString(str);
        r6s0.m180044f(parcelM171038O, jxs0Var);
        m171041Y2(38, parcelM171038O);
    }

    @Override // p153l.xws0
    /* JADX INFO: renamed from: h */
    public final oxs0 mo107067h() throws RemoteException {
        oxs0 oxs0Var;
        Parcel parcelM171039P2 = m171039P2(16, m171038O());
        IBinder strongBinder = parcelM171039P2.readStrongBinder();
        if (strongBinder == null) {
            oxs0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
            oxs0Var = iInterfaceQueryLocalInterface instanceof oxs0 ? (oxs0) iInterfaceQueryLocalInterface : new oxs0(strongBinder);
        }
        parcelM171039P2.recycle();
        return oxs0Var;
    }

    @Override // p153l.xws0
    /* JADX INFO: renamed from: l4 */
    public final void mo107068l4(p1m p1mVar, zzl zzlVar, String str, jxs0 jxs0Var) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        r6s0.m180044f(parcelM171038O, p1mVar);
        r6s0.m180042d(parcelM171038O, zzlVar);
        parcelM171038O.writeString(str);
        r6s0.m180044f(parcelM171038O, jxs0Var);
        m171041Y2(28, parcelM171038O);
    }

    @Override // p153l.xws0
    /* JADX INFO: renamed from: m6 */
    public final void mo107070m6(p1m p1mVar, zzq zzqVar, zzl zzlVar, String str, String str2, jxs0 jxs0Var) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        r6s0.m180044f(parcelM171038O, p1mVar);
        r6s0.m180042d(parcelM171038O, zzqVar);
        r6s0.m180042d(parcelM171038O, zzlVar);
        parcelM171038O.writeString(str);
        parcelM171038O.writeString(str2);
        r6s0.m180044f(parcelM171038O, jxs0Var);
        m171041Y2(6, parcelM171038O);
    }

    @Override // p153l.xws0
    /* JADX INFO: renamed from: p */
    public final void mo107072p() throws RemoteException {
        m171041Y2(4, m171038O());
    }

    @Override // p153l.xws0
    /* JADX INFO: renamed from: s3 */
    public final void mo107074s3(p1m p1mVar, zzl zzlVar, String str, String str2, jxs0 jxs0Var, zzbjb zzbjbVar, List list) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        r6s0.m180044f(parcelM171038O, p1mVar);
        r6s0.m180042d(parcelM171038O, zzlVar);
        parcelM171038O.writeString(str);
        parcelM171038O.writeString(str2);
        r6s0.m180044f(parcelM171038O, jxs0Var);
        r6s0.m180042d(parcelM171038O, zzbjbVar);
        parcelM171038O.writeStringList(list);
        m171041Y2(14, parcelM171038O);
    }

    @Override // p153l.xws0
    /* JADX INFO: renamed from: t3 */
    public final void mo107075t3(p1m p1mVar) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        r6s0.m180044f(parcelM171038O, p1mVar);
        m171041Y2(21, parcelM171038O);
    }

    @Override // p153l.xws0
    /* JADX INFO: renamed from: v4 */
    public final void mo107076v4(p1m p1mVar) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        r6s0.m180044f(parcelM171038O, p1mVar);
        m171041Y2(39, parcelM171038O);
    }

    @Override // p153l.xws0
    /* JADX INFO: renamed from: w4 */
    public final void mo107077w4(p1m p1mVar, e7t0 e7t0Var, List list) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        r6s0.m180044f(parcelM171038O, p1mVar);
        r6s0.m180044f(parcelM171038O, e7t0Var);
        parcelM171038O.writeStringList(list);
        m171041Y2(23, parcelM171038O);
    }

    @Override // p153l.xws0
    /* JADX INFO: renamed from: y */
    public final boolean mo107078y() throws RemoteException {
        Parcel parcelM171039P2 = m171039P2(22, m171038O());
        boolean zM180045g = r6s0.m180045g(parcelM171039P2);
        parcelM171039P2.recycle();
        return zM180045g;
    }

    @Override // p153l.xws0
    public final void zzF() throws RemoteException {
        m171041Y2(9, m171038O());
    }

    @Override // p153l.xws0
    public final void zzG(boolean z) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        ClassLoader classLoader = r6s0.f161495a;
        parcelM171038O.writeInt(z ? 1 : 0);
        m171041Y2(25, parcelM171038O);
    }

    @Override // p153l.xws0
    public final void zzL() throws RemoteException {
        m171041Y2(12, m171038O());
    }

    @Override // p153l.xws0
    public final boolean zzN() throws RemoteException {
        Parcel parcelM171039P2 = m171039P2(13, m171038O());
        boolean zM180045g = r6s0.m180045g(parcelM171039P2);
        parcelM171039P2.recycle();
        return zM180045g;
    }

    @Override // p153l.xws0
    public final nxs0 zzO() throws RemoteException {
        nxs0 nxs0Var;
        Parcel parcelM171039P2 = m171039P2(15, m171038O());
        IBinder strongBinder = parcelM171039P2.readStrongBinder();
        if (strongBinder == null) {
            nxs0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
            nxs0Var = iInterfaceQueryLocalInterface instanceof nxs0 ? (nxs0) iInterfaceQueryLocalInterface : new nxs0(strongBinder);
        }
        parcelM171039P2.recycle();
        return nxs0Var;
    }

    @Override // p153l.xws0
    public final lpu0 zzh() throws RemoteException {
        Parcel parcelM171039P2 = m171039P2(26, m171038O());
        lpu0 lpu0VarM126497o8 = fou0.m126497o8(parcelM171039P2.readStrongBinder());
        parcelM171039P2.recycle();
        return lpu0VarM126497o8;
    }

    @Override // p153l.xws0
    public final mxs0 zzj() throws RemoteException {
        mxs0 kxs0Var;
        Parcel parcelM171039P2 = m171039P2(36, m171038O());
        IBinder strongBinder = parcelM171039P2.readStrongBinder();
        if (strongBinder == null) {
            kxs0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
            kxs0Var = iInterfaceQueryLocalInterface instanceof mxs0 ? (mxs0) iInterfaceQueryLocalInterface : new kxs0(strongBinder);
        }
        parcelM171039P2.recycle();
        return kxs0Var;
    }

    @Override // p153l.xws0
    public final rxs0 zzk() throws RemoteException {
        rxs0 pxs0Var;
        Parcel parcelM171039P2 = m171039P2(27, m171038O());
        IBinder strongBinder = parcelM171039P2.readStrongBinder();
        if (strongBinder == null) {
            pxs0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
            pxs0Var = iInterfaceQueryLocalInterface instanceof rxs0 ? (rxs0) iInterfaceQueryLocalInterface : new pxs0(strongBinder);
        }
        parcelM171039P2.recycle();
        return pxs0Var;
    }

    @Override // p153l.xws0
    public final zzbvg zzl() throws RemoteException {
        Parcel parcelM171039P2 = m171039P2(33, m171038O());
        zzbvg zzbvgVar = (zzbvg) r6s0.m180039a(parcelM171039P2, zzbvg.CREATOR);
        parcelM171039P2.recycle();
        return zzbvgVar;
    }

    @Override // p153l.xws0
    public final zzbvg zzm() throws RemoteException {
        Parcel parcelM171039P2 = m171039P2(34, m171038O());
        zzbvg zzbvgVar = (zzbvg) r6s0.m180039a(parcelM171039P2, zzbvg.CREATOR);
        parcelM171039P2.recycle();
        return zzbvgVar;
    }

    @Override // p153l.xws0
    public final p1m zzn() throws RemoteException {
        Parcel parcelM171039P2 = m171039P2(2, m171038O());
        p1m p1mVarM170217O = p1m.AbstractBinderC19271a.m170217O(parcelM171039P2.readStrongBinder());
        parcelM171039P2.recycle();
        return p1mVarM170217O;
    }

    @Override // p153l.xws0
    public final void zzo() throws RemoteException {
        m171041Y2(5, m171038O());
    }
}
