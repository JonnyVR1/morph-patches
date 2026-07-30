package p149l;

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
public final class pns0 extends jxr0 implements rns0 {
    public pns0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    @Override // p149l.rns0
    /* JADX INFO: renamed from: D3 */
    public final void mo170444D3(uyl uylVar, zzl zzlVar, String str, String str2, dos0 dos0Var) throws RemoteException {
        Parcel parcelM143822O = m143822O();
        lxr0.m152089f(parcelM143822O, uylVar);
        lxr0.m152087d(parcelM143822O, zzlVar);
        parcelM143822O.writeString(str);
        parcelM143822O.writeString(str2);
        lxr0.m152089f(parcelM143822O, dos0Var);
        m143825Y2(7, parcelM143822O);
    }

    @Override // p149l.rns0
    /* JADX INFO: renamed from: D5 */
    public final void mo170445D5(uyl uylVar, zzq zzqVar, zzl zzlVar, String str, String str2, dos0 dos0Var) throws RemoteException {
        Parcel parcelM143822O = m143822O();
        lxr0.m152089f(parcelM143822O, uylVar);
        lxr0.m152087d(parcelM143822O, zzqVar);
        lxr0.m152087d(parcelM143822O, zzlVar);
        parcelM143822O.writeString(str);
        parcelM143822O.writeString(str2);
        lxr0.m152089f(parcelM143822O, dos0Var);
        m143825Y2(35, parcelM143822O);
    }

    @Override // p149l.rns0
    /* JADX INFO: renamed from: E1 */
    public final void mo170446E1(uyl uylVar, cjs0 cjs0Var, List list) throws RemoteException {
        Parcel parcelM143822O = m143822O();
        lxr0.m152089f(parcelM143822O, uylVar);
        lxr0.m152089f(parcelM143822O, cjs0Var);
        parcelM143822O.writeTypedList(list);
        m143825Y2(31, parcelM143822O);
    }

    @Override // p149l.rns0
    /* JADX INFO: renamed from: L4 */
    public final void mo170447L4(uyl uylVar) throws RemoteException {
        Parcel parcelM143822O = m143822O();
        lxr0.m152089f(parcelM143822O, uylVar);
        m143825Y2(30, parcelM143822O);
    }

    @Override // p149l.rns0
    /* JADX INFO: renamed from: M */
    public final void mo170448M() throws RemoteException {
        m143825Y2(8, m143822O());
    }

    @Override // p149l.rns0
    /* JADX INFO: renamed from: N2 */
    public final void mo170449N2(uyl uylVar, zzl zzlVar, String str, yxs0 yxs0Var, String str2) throws RemoteException {
        Parcel parcelM143822O = m143822O();
        lxr0.m152089f(parcelM143822O, uylVar);
        lxr0.m152087d(parcelM143822O, zzlVar);
        parcelM143822O.writeString(null);
        lxr0.m152089f(parcelM143822O, yxs0Var);
        parcelM143822O.writeString(str2);
        m143825Y2(10, parcelM143822O);
    }

    @Override // p149l.rns0
    /* JADX INFO: renamed from: O3 */
    public final void mo170450O3(uyl uylVar, zzl zzlVar, String str, dos0 dos0Var) throws RemoteException {
        Parcel parcelM143822O = m143822O();
        lxr0.m152089f(parcelM143822O, uylVar);
        lxr0.m152087d(parcelM143822O, zzlVar);
        parcelM143822O.writeString(str);
        lxr0.m152089f(parcelM143822O, dos0Var);
        m143825Y2(32, parcelM143822O);
    }

    @Override // p149l.rns0
    /* JADX INFO: renamed from: S1 */
    public final void mo170451S1(zzl zzlVar, String str) throws RemoteException {
        Parcel parcelM143822O = m143822O();
        lxr0.m152087d(parcelM143822O, zzlVar);
        parcelM143822O.writeString(str);
        m143825Y2(11, parcelM143822O);
    }

    @Override // p149l.rns0
    /* JADX INFO: renamed from: T4 */
    public final void mo170452T4(uyl uylVar) throws RemoteException {
        Parcel parcelM143822O = m143822O();
        lxr0.m152089f(parcelM143822O, uylVar);
        m143825Y2(37, parcelM143822O);
    }

    @Override // p149l.rns0
    /* JADX INFO: renamed from: g8 */
    public final void mo170453g8(uyl uylVar, zzl zzlVar, String str, dos0 dos0Var) throws RemoteException {
        Parcel parcelM143822O = m143822O();
        lxr0.m152089f(parcelM143822O, uylVar);
        lxr0.m152087d(parcelM143822O, zzlVar);
        parcelM143822O.writeString(str);
        lxr0.m152089f(parcelM143822O, dos0Var);
        m143825Y2(38, parcelM143822O);
    }

    @Override // p149l.rns0
    /* JADX INFO: renamed from: h */
    public final ios0 mo170454h() throws RemoteException {
        ios0 ios0Var;
        Parcel parcelM143823P2 = m143823P2(16, m143822O());
        IBinder strongBinder = parcelM143823P2.readStrongBinder();
        if (strongBinder == null) {
            ios0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
            ios0Var = iInterfaceQueryLocalInterface instanceof ios0 ? (ios0) iInterfaceQueryLocalInterface : new ios0(strongBinder);
        }
        parcelM143823P2.recycle();
        return ios0Var;
    }

    @Override // p149l.rns0
    /* JADX INFO: renamed from: l4 */
    public final void mo170455l4(uyl uylVar, zzl zzlVar, String str, dos0 dos0Var) throws RemoteException {
        Parcel parcelM143822O = m143822O();
        lxr0.m152089f(parcelM143822O, uylVar);
        lxr0.m152087d(parcelM143822O, zzlVar);
        parcelM143822O.writeString(str);
        lxr0.m152089f(parcelM143822O, dos0Var);
        m143825Y2(28, parcelM143822O);
    }

    @Override // p149l.rns0
    /* JADX INFO: renamed from: m6 */
    public final void mo170456m6(uyl uylVar, zzq zzqVar, zzl zzlVar, String str, String str2, dos0 dos0Var) throws RemoteException {
        Parcel parcelM143822O = m143822O();
        lxr0.m152089f(parcelM143822O, uylVar);
        lxr0.m152087d(parcelM143822O, zzqVar);
        lxr0.m152087d(parcelM143822O, zzlVar);
        parcelM143822O.writeString(str);
        parcelM143822O.writeString(str2);
        lxr0.m152089f(parcelM143822O, dos0Var);
        m143825Y2(6, parcelM143822O);
    }

    @Override // p149l.rns0
    /* JADX INFO: renamed from: p */
    public final void mo170457p() throws RemoteException {
        m143825Y2(4, m143822O());
    }

    @Override // p149l.rns0
    /* JADX INFO: renamed from: s3 */
    public final void mo170458s3(uyl uylVar, zzl zzlVar, String str, String str2, dos0 dos0Var, zzbjb zzbjbVar, List list) throws RemoteException {
        Parcel parcelM143822O = m143822O();
        lxr0.m152089f(parcelM143822O, uylVar);
        lxr0.m152087d(parcelM143822O, zzlVar);
        parcelM143822O.writeString(str);
        parcelM143822O.writeString(str2);
        lxr0.m152089f(parcelM143822O, dos0Var);
        lxr0.m152087d(parcelM143822O, zzbjbVar);
        parcelM143822O.writeStringList(list);
        m143825Y2(14, parcelM143822O);
    }

    @Override // p149l.rns0
    /* JADX INFO: renamed from: t3 */
    public final void mo170459t3(uyl uylVar) throws RemoteException {
        Parcel parcelM143822O = m143822O();
        lxr0.m152089f(parcelM143822O, uylVar);
        m143825Y2(21, parcelM143822O);
    }

    @Override // p149l.rns0
    /* JADX INFO: renamed from: v4 */
    public final void mo170460v4(uyl uylVar) throws RemoteException {
        Parcel parcelM143822O = m143822O();
        lxr0.m152089f(parcelM143822O, uylVar);
        m143825Y2(39, parcelM143822O);
    }

    @Override // p149l.rns0
    /* JADX INFO: renamed from: w4 */
    public final void mo170461w4(uyl uylVar, yxs0 yxs0Var, List list) throws RemoteException {
        Parcel parcelM143822O = m143822O();
        lxr0.m152089f(parcelM143822O, uylVar);
        lxr0.m152089f(parcelM143822O, yxs0Var);
        parcelM143822O.writeStringList(list);
        m143825Y2(23, parcelM143822O);
    }

    @Override // p149l.rns0
    /* JADX INFO: renamed from: y */
    public final boolean mo170462y() throws RemoteException {
        Parcel parcelM143823P2 = m143823P2(22, m143822O());
        boolean zM152090g = lxr0.m152090g(parcelM143823P2);
        parcelM143823P2.recycle();
        return zM152090g;
    }

    @Override // p149l.rns0
    public final void zzF() throws RemoteException {
        m143825Y2(9, m143822O());
    }

    @Override // p149l.rns0
    public final void zzG(boolean z) throws RemoteException {
        Parcel parcelM143822O = m143822O();
        ClassLoader classLoader = lxr0.f130430a;
        parcelM143822O.writeInt(z ? 1 : 0);
        m143825Y2(25, parcelM143822O);
    }

    @Override // p149l.rns0
    public final void zzL() throws RemoteException {
        m143825Y2(12, m143822O());
    }

    @Override // p149l.rns0
    public final boolean zzN() throws RemoteException {
        Parcel parcelM143823P2 = m143823P2(13, m143822O());
        boolean zM152090g = lxr0.m152090g(parcelM143823P2);
        parcelM143823P2.recycle();
        return zM152090g;
    }

    @Override // p149l.rns0
    public final hos0 zzO() throws RemoteException {
        hos0 hos0Var;
        Parcel parcelM143823P2 = m143823P2(15, m143822O());
        IBinder strongBinder = parcelM143823P2.readStrongBinder();
        if (strongBinder == null) {
            hos0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
            hos0Var = iInterfaceQueryLocalInterface instanceof hos0 ? (hos0) iInterfaceQueryLocalInterface : new hos0(strongBinder);
        }
        parcelM143823P2.recycle();
        return hos0Var;
    }

    @Override // p149l.rns0
    public final fgu0 zzh() throws RemoteException {
        Parcel parcelM143823P2 = m143823P2(26, m143822O());
        fgu0 fgu0VarM218417o8 = zeu0.m218417o8(parcelM143823P2.readStrongBinder());
        parcelM143823P2.recycle();
        return fgu0VarM218417o8;
    }

    @Override // p149l.rns0
    public final gos0 zzj() throws RemoteException {
        gos0 eos0Var;
        Parcel parcelM143823P2 = m143823P2(36, m143822O());
        IBinder strongBinder = parcelM143823P2.readStrongBinder();
        if (strongBinder == null) {
            eos0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
            eos0Var = iInterfaceQueryLocalInterface instanceof gos0 ? (gos0) iInterfaceQueryLocalInterface : new eos0(strongBinder);
        }
        parcelM143823P2.recycle();
        return eos0Var;
    }

    @Override // p149l.rns0
    public final los0 zzk() throws RemoteException {
        los0 jos0Var;
        Parcel parcelM143823P2 = m143823P2(27, m143822O());
        IBinder strongBinder = parcelM143823P2.readStrongBinder();
        if (strongBinder == null) {
            jos0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
            jos0Var = iInterfaceQueryLocalInterface instanceof los0 ? (los0) iInterfaceQueryLocalInterface : new jos0(strongBinder);
        }
        parcelM143823P2.recycle();
        return jos0Var;
    }

    @Override // p149l.rns0
    public final zzbvg zzl() throws RemoteException {
        Parcel parcelM143823P2 = m143823P2(33, m143822O());
        zzbvg zzbvgVar = (zzbvg) lxr0.m152084a(parcelM143823P2, zzbvg.CREATOR);
        parcelM143823P2.recycle();
        return zzbvgVar;
    }

    @Override // p149l.rns0
    public final zzbvg zzm() throws RemoteException {
        Parcel parcelM143823P2 = m143823P2(34, m143822O());
        zzbvg zzbvgVar = (zzbvg) lxr0.m152084a(parcelM143823P2, zzbvg.CREATOR);
        parcelM143823P2.recycle();
        return zzbvgVar;
    }

    @Override // p149l.rns0
    public final uyl zzn() throws RemoteException {
        Parcel parcelM143823P2 = m143823P2(2, m143822O());
        uyl uylVarM196295O = uyl.AbstractBinderC20541a.m196295O(parcelM143823P2.readStrongBinder());
        parcelM143823P2.recycle();
        return uylVarM196295O;
    }

    @Override // p149l.rns0
    public final void zzo() throws RemoteException {
        m143825Y2(5, m143822O());
    }
}
