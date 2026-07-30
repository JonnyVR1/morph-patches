package p149l;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class ios0 extends jxr0 implements IInterface {
    public ios0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
    }

    /* JADX INFO: renamed from: M6 */
    public final ubs0 m137377M6() throws RemoteException {
        Parcel parcelM143823P2 = m143823P2(5, m143822O());
        ubs0 ubs0VarM187903o8 = tbs0.m187903o8(parcelM143823P2.readStrongBinder());
        parcelM143823P2.recycle();
        return ubs0VarM187903o8;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m137378b() throws RemoteException {
        Parcel parcelM143823P2 = m143823P2(12, m143822O());
        boolean zM152090g = lxr0.m152090g(parcelM143823P2);
        parcelM143823P2.recycle();
        return zM152090g;
    }

    /* JADX INFO: renamed from: g7 */
    public final uyl m137379g7() throws RemoteException {
        Parcel parcelM143823P2 = m143823P2(20, m143822O());
        uyl uylVarM196295O = uyl.AbstractBinderC20541a.m196295O(parcelM143823P2.readStrongBinder());
        parcelM143823P2.recycle();
        return uylVarM196295O;
    }

    /* JADX INFO: renamed from: m4 */
    public final fgu0 m137380m4() throws RemoteException {
        Parcel parcelM143823P2 = m143823P2(16, m143822O());
        fgu0 fgu0VarM218417o8 = zeu0.m218417o8(parcelM143823P2.readStrongBinder());
        parcelM143823P2.recycle();
        return fgu0VarM218417o8;
    }

    /* JADX INFO: renamed from: m5 */
    public final nbs0 m137381m5() throws RemoteException {
        Parcel parcelM143823P2 = m143823P2(19, m143822O());
        nbs0 nbs0VarM153976o8 = mbs0.m153976o8(parcelM143823P2.readStrongBinder());
        parcelM143823P2.recycle();
        return nbs0VarM153976o8;
    }

    /* JADX INFO: renamed from: n8 */
    public final uyl m137382n8() throws RemoteException {
        Parcel parcelM143823P2 = m143823P2(21, m143822O());
        uyl uylVarM196295O = uyl.AbstractBinderC20541a.m196295O(parcelM143823P2.readStrongBinder());
        parcelM143823P2.recycle();
        return uylVarM196295O;
    }

    /* JADX INFO: renamed from: o8 */
    public final List m137383o8() throws RemoteException {
        Parcel parcelM143823P2 = m143823P2(3, m143822O());
        ArrayList arrayListM152085b = lxr0.m152085b(parcelM143823P2);
        parcelM143823P2.recycle();
        return arrayListM152085b;
    }

    /* JADX INFO: renamed from: p8 */
    public final void m137384p8(uyl uylVar) throws RemoteException {
        Parcel parcelM143822O = m143822O();
        lxr0.m152089f(parcelM143822O, uylVar);
        m143825Y2(9, parcelM143822O);
    }

    /* JADX INFO: renamed from: q8 */
    public final void m137385q8(uyl uylVar) throws RemoteException {
        Parcel parcelM143822O = m143822O();
        lxr0.m152089f(parcelM143822O, uylVar);
        m143825Y2(10, parcelM143822O);
    }

    /* JADX INFO: renamed from: r8 */
    public final void m137386r8(uyl uylVar, uyl uylVar2, uyl uylVar3) throws RemoteException {
        Parcel parcelM143822O = m143822O();
        lxr0.m152089f(parcelM143822O, uylVar);
        lxr0.m152089f(parcelM143822O, uylVar2);
        lxr0.m152089f(parcelM143822O, uylVar3);
        m143825Y2(22, parcelM143822O);
    }

    /* JADX INFO: renamed from: s8 */
    public final void m137387s8(uyl uylVar) throws RemoteException {
        Parcel parcelM143822O = m143822O();
        lxr0.m152089f(parcelM143822O, uylVar);
        m143825Y2(14, parcelM143822O);
    }

    /* JADX INFO: renamed from: t8 */
    public final boolean m137388t8() throws RemoteException {
        Parcel parcelM143823P2 = m143823P2(11, m143822O());
        boolean zM152090g = lxr0.m152090g(parcelM143823P2);
        parcelM143823P2.recycle();
        return zM152090g;
    }

    public final Bundle zze() throws RemoteException {
        Parcel parcelM143823P2 = m143823P2(13, m143822O());
        Bundle bundle = (Bundle) lxr0.m152084a(parcelM143823P2, Bundle.CREATOR);
        parcelM143823P2.recycle();
        return bundle;
    }

    public final uyl zzi() throws RemoteException {
        Parcel parcelM143823P2 = m143823P2(15, m143822O());
        uyl uylVarM196295O = uyl.AbstractBinderC20541a.m196295O(parcelM143823P2.readStrongBinder());
        parcelM143823P2.recycle();
        return uylVarM196295O;
    }

    public final String zzl() throws RemoteException {
        Parcel parcelM143823P2 = m143823P2(7, m143822O());
        String string = parcelM143823P2.readString();
        parcelM143823P2.recycle();
        return string;
    }

    public final String zzm() throws RemoteException {
        Parcel parcelM143823P2 = m143823P2(4, m143822O());
        String string = parcelM143823P2.readString();
        parcelM143823P2.recycle();
        return string;
    }

    public final String zzn() throws RemoteException {
        Parcel parcelM143823P2 = m143823P2(6, m143822O());
        String string = parcelM143823P2.readString();
        parcelM143823P2.recycle();
        return string;
    }

    public final String zzo() throws RemoteException {
        Parcel parcelM143823P2 = m143823P2(2, m143822O());
        String string = parcelM143823P2.readString();
        parcelM143823P2.recycle();
        return string;
    }

    public final void zzr() throws RemoteException {
        m143825Y2(8, m143822O());
    }
}
