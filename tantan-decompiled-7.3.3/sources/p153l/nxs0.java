package p153l;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class nxs0 extends p6s0 implements IInterface {
    public nxs0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
    }

    /* JADX INFO: renamed from: M6 */
    public final als0 m165270M6() throws RemoteException {
        Parcel parcelM171039P2 = m171039P2(5, m171038O());
        als0 als0VarM220161o8 = zks0.m220161o8(parcelM171039P2.readStrongBinder());
        parcelM171039P2.recycle();
        return als0VarM220161o8;
    }

    /* JADX INFO: renamed from: a */
    public final String m165271a() throws RemoteException {
        Parcel parcelM171039P2 = m171039P2(8, m171038O());
        String string = parcelM171039P2.readString();
        parcelM171039P2.recycle();
        return string;
    }

    /* JADX INFO: renamed from: g7 */
    public final p1m m165272g7() throws RemoteException {
        Parcel parcelM171039P2 = m171039P2(18, m171038O());
        p1m p1mVarM170217O = p1m.AbstractBinderC19271a.m170217O(parcelM171039P2.readStrongBinder());
        parcelM171039P2.recycle();
        return p1mVarM170217O;
    }

    /* JADX INFO: renamed from: k7 */
    public final void m165273k7(p1m p1mVar) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        r6s0.m180044f(parcelM171038O, p1mVar);
        m171041Y2(16, parcelM171038O);
    }

    /* JADX INFO: renamed from: m4 */
    public final lpu0 m165274m4() throws RemoteException {
        Parcel parcelM171039P2 = m171039P2(17, m171038O());
        lpu0 lpu0VarM126497o8 = fou0.m126497o8(parcelM171039P2.readStrongBinder());
        parcelM171039P2.recycle();
        return lpu0VarM126497o8;
    }

    /* JADX INFO: renamed from: m5 */
    public final tks0 m165275m5() throws RemoteException {
        Parcel parcelM171039P2 = m171039P2(19, m171038O());
        tks0 tks0VarM186541o8 = sks0.m186541o8(parcelM171039P2.readStrongBinder());
        parcelM171039P2.recycle();
        return tks0VarM186541o8;
    }

    /* JADX INFO: renamed from: n8 */
    public final p1m m165276n8() throws RemoteException {
        Parcel parcelM171039P2 = m171039P2(20, m171038O());
        p1m p1mVarM170217O = p1m.AbstractBinderC19271a.m170217O(parcelM171039P2.readStrongBinder());
        parcelM171039P2.recycle();
        return p1mVarM170217O;
    }

    /* JADX INFO: renamed from: o8 */
    public final List m165277o8() throws RemoteException {
        Parcel parcelM171039P2 = m171039P2(3, m171038O());
        ArrayList arrayListM180040b = r6s0.m180040b(parcelM171039P2);
        parcelM171039P2.recycle();
        return arrayListM180040b;
    }

    /* JADX INFO: renamed from: p8 */
    public final void m165278p8(p1m p1mVar) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        r6s0.m180044f(parcelM171038O, p1mVar);
        m171041Y2(11, parcelM171038O);
    }

    /* JADX INFO: renamed from: q8 */
    public final void m165279q8(p1m p1mVar) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        r6s0.m180044f(parcelM171038O, p1mVar);
        m171041Y2(12, parcelM171038O);
    }

    /* JADX INFO: renamed from: r8 */
    public final void m165280r8(p1m p1mVar, p1m p1mVar2, p1m p1mVar3) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        r6s0.m180044f(parcelM171038O, p1mVar);
        r6s0.m180044f(parcelM171038O, p1mVar2);
        r6s0.m180044f(parcelM171038O, p1mVar3);
        m171041Y2(22, parcelM171038O);
    }

    /* JADX INFO: renamed from: s8 */
    public final boolean m165281s8() throws RemoteException {
        Parcel parcelM171039P2 = m171039P2(14, m171038O());
        boolean zM180045g = r6s0.m180045g(parcelM171039P2);
        parcelM171039P2.recycle();
        return zM180045g;
    }

    /* JADX INFO: renamed from: t8 */
    public final boolean m165282t8() throws RemoteException {
        Parcel parcelM171039P2 = m171039P2(13, m171038O());
        boolean zM180045g = r6s0.m180045g(parcelM171039P2);
        parcelM171039P2.recycle();
        return zM180045g;
    }

    public final double zze() throws RemoteException {
        Parcel parcelM171039P2 = m171039P2(7, m171038O());
        double d = parcelM171039P2.readDouble();
        parcelM171039P2.recycle();
        return d;
    }

    public final Bundle zzf() throws RemoteException {
        Parcel parcelM171039P2 = m171039P2(15, m171038O());
        Bundle bundle = (Bundle) r6s0.m180039a(parcelM171039P2, Bundle.CREATOR);
        parcelM171039P2.recycle();
        return bundle;
    }

    public final p1m zzl() throws RemoteException {
        Parcel parcelM171039P2 = m171039P2(21, m171038O());
        p1m p1mVarM170217O = p1m.AbstractBinderC19271a.m170217O(parcelM171039P2.readStrongBinder());
        parcelM171039P2.recycle();
        return p1mVarM170217O;
    }

    public final String zzm() throws RemoteException {
        Parcel parcelM171039P2 = m171039P2(4, m171038O());
        String string = parcelM171039P2.readString();
        parcelM171039P2.recycle();
        return string;
    }

    public final String zzn() throws RemoteException {
        Parcel parcelM171039P2 = m171039P2(6, m171038O());
        String string = parcelM171039P2.readString();
        parcelM171039P2.recycle();
        return string;
    }

    public final String zzo() throws RemoteException {
        Parcel parcelM171039P2 = m171039P2(2, m171038O());
        String string = parcelM171039P2.readString();
        parcelM171039P2.recycle();
        return string;
    }

    public final String zzp() throws RemoteException {
        Parcel parcelM171039P2 = m171039P2(9, m171038O());
        String string = parcelM171039P2.readString();
        parcelM171039P2.recycle();
        return string;
    }

    public final void zzt() throws RemoteException {
        m171041Y2(10, m171038O());
    }
}
