package p149l;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class jos0 extends jxr0 implements los0 {
    public jos0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    @Override // p149l.los0
    /* JADX INFO: renamed from: J */
    public final boolean mo142526J() throws RemoteException {
        Parcel parcelM143823P2 = m143823P2(17, m143822O());
        boolean zM152090g = lxr0.m152090g(parcelM143823P2);
        parcelM143823P2.recycle();
        return zM152090g;
    }

    @Override // p149l.los0
    /* JADX INFO: renamed from: a */
    public final String mo142527a() throws RemoteException {
        Parcel parcelM143823P2 = m143823P2(4, m143822O());
        String string = parcelM143823P2.readString();
        parcelM143823P2.recycle();
        return string;
    }

    @Override // p149l.los0
    /* JADX INFO: renamed from: b */
    public final List mo142528b() throws RemoteException {
        Parcel parcelM143823P2 = m143823P2(3, m143822O());
        ArrayList arrayListM152085b = lxr0.m152085b(parcelM143823P2);
        parcelM143823P2.recycle();
        return arrayListM152085b;
    }

    @Override // p149l.los0
    /* JADX INFO: renamed from: g */
    public final void mo142529g() throws RemoteException {
        m143825Y2(19, m143822O());
    }

    @Override // p149l.los0
    /* JADX INFO: renamed from: k7 */
    public final void mo142530k7(uyl uylVar) throws RemoteException {
        Parcel parcelM143822O = m143822O();
        lxr0.m152089f(parcelM143822O, uylVar);
        m143825Y2(20, parcelM143822O);
    }

    @Override // p149l.los0
    /* JADX INFO: renamed from: o1 */
    public final void mo142531o1(uyl uylVar, uyl uylVar2, uyl uylVar3) throws RemoteException {
        Parcel parcelM143822O = m143822O();
        lxr0.m152089f(parcelM143822O, uylVar);
        lxr0.m152089f(parcelM143822O, uylVar2);
        lxr0.m152089f(parcelM143822O, uylVar3);
        m143825Y2(21, parcelM143822O);
    }

    @Override // p149l.los0
    /* JADX INFO: renamed from: t */
    public final boolean mo142532t() throws RemoteException {
        Parcel parcelM143823P2 = m143823P2(18, m143822O());
        boolean zM152090g = lxr0.m152090g(parcelM143823P2);
        parcelM143823P2.recycle();
        return zM152090g;
    }

    @Override // p149l.los0
    /* JADX INFO: renamed from: y7 */
    public final void mo142533y7(uyl uylVar) throws RemoteException {
        Parcel parcelM143822O = m143822O();
        lxr0.m152089f(parcelM143822O, uylVar);
        m143825Y2(22, parcelM143822O);
    }

    @Override // p149l.los0
    public final double zze() throws RemoteException {
        Parcel parcelM143823P2 = m143823P2(8, m143822O());
        double d = parcelM143823P2.readDouble();
        parcelM143823P2.recycle();
        return d;
    }

    @Override // p149l.los0
    public final float zzf() throws RemoteException {
        Parcel parcelM143823P2 = m143823P2(23, m143822O());
        float f = parcelM143823P2.readFloat();
        parcelM143823P2.recycle();
        return f;
    }

    @Override // p149l.los0
    public final float zzg() throws RemoteException {
        Parcel parcelM143823P2 = m143823P2(25, m143822O());
        float f = parcelM143823P2.readFloat();
        parcelM143823P2.recycle();
        return f;
    }

    @Override // p149l.los0
    public final float zzh() throws RemoteException {
        Parcel parcelM143823P2 = m143823P2(24, m143822O());
        float f = parcelM143823P2.readFloat();
        parcelM143823P2.recycle();
        return f;
    }

    @Override // p149l.los0
    public final Bundle zzi() throws RemoteException {
        Parcel parcelM143823P2 = m143823P2(16, m143822O());
        Bundle bundle = (Bundle) lxr0.m152084a(parcelM143823P2, Bundle.CREATOR);
        parcelM143823P2.recycle();
        return bundle;
    }

    @Override // p149l.los0
    public final fgu0 zzj() throws RemoteException {
        Parcel parcelM143823P2 = m143823P2(11, m143822O());
        fgu0 fgu0VarM218417o8 = zeu0.m218417o8(parcelM143823P2.readStrongBinder());
        parcelM143823P2.recycle();
        return fgu0VarM218417o8;
    }

    @Override // p149l.los0
    public final nbs0 zzk() throws RemoteException {
        Parcel parcelM143823P2 = m143823P2(12, m143822O());
        nbs0 nbs0VarM153976o8 = mbs0.m153976o8(parcelM143823P2.readStrongBinder());
        parcelM143823P2.recycle();
        return nbs0VarM153976o8;
    }

    @Override // p149l.los0
    public final ubs0 zzl() throws RemoteException {
        Parcel parcelM143823P2 = m143823P2(5, m143822O());
        ubs0 ubs0VarM187903o8 = tbs0.m187903o8(parcelM143823P2.readStrongBinder());
        parcelM143823P2.recycle();
        return ubs0VarM187903o8;
    }

    @Override // p149l.los0
    public final uyl zzm() throws RemoteException {
        Parcel parcelM143823P2 = m143823P2(13, m143822O());
        uyl uylVarM196295O = uyl.AbstractBinderC20541a.m196295O(parcelM143823P2.readStrongBinder());
        parcelM143823P2.recycle();
        return uylVarM196295O;
    }

    @Override // p149l.los0
    public final uyl zzn() throws RemoteException {
        Parcel parcelM143823P2 = m143823P2(14, m143822O());
        uyl uylVarM196295O = uyl.AbstractBinderC20541a.m196295O(parcelM143823P2.readStrongBinder());
        parcelM143823P2.recycle();
        return uylVarM196295O;
    }

    @Override // p149l.los0
    public final uyl zzo() throws RemoteException {
        Parcel parcelM143823P2 = m143823P2(15, m143822O());
        uyl uylVarM196295O = uyl.AbstractBinderC20541a.m196295O(parcelM143823P2.readStrongBinder());
        parcelM143823P2.recycle();
        return uylVarM196295O;
    }

    @Override // p149l.los0
    public final String zzp() throws RemoteException {
        Parcel parcelM143823P2 = m143823P2(7, m143822O());
        String string = parcelM143823P2.readString();
        parcelM143823P2.recycle();
        return string;
    }

    @Override // p149l.los0
    public final String zzr() throws RemoteException {
        Parcel parcelM143823P2 = m143823P2(6, m143822O());
        String string = parcelM143823P2.readString();
        parcelM143823P2.recycle();
        return string;
    }

    @Override // p149l.los0
    public final String zzs() throws RemoteException {
        Parcel parcelM143823P2 = m143823P2(2, m143822O());
        String string = parcelM143823P2.readString();
        parcelM143823P2.recycle();
        return string;
    }

    @Override // p149l.los0
    public final String zzt() throws RemoteException {
        Parcel parcelM143823P2 = m143823P2(10, m143822O());
        String string = parcelM143823P2.readString();
        parcelM143823P2.recycle();
        return string;
    }

    @Override // p149l.los0
    public final String zzu() throws RemoteException {
        Parcel parcelM143823P2 = m143823P2(9, m143822O());
        String string = parcelM143823P2.readString();
        parcelM143823P2.recycle();
        return string;
    }
}
