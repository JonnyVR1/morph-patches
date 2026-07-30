package p153l;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class oxs0 extends p6s0 implements IInterface {
    public oxs0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
    }

    /* JADX INFO: renamed from: M6 */
    public final als0 m169725M6() throws RemoteException {
        Parcel parcelM171039P2 = m171039P2(5, m171038O());
        als0 als0VarM220161o8 = zks0.m220161o8(parcelM171039P2.readStrongBinder());
        parcelM171039P2.recycle();
        return als0VarM220161o8;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m169726b() throws RemoteException {
        Parcel parcelM171039P2 = m171039P2(12, m171038O());
        boolean zM180045g = r6s0.m180045g(parcelM171039P2);
        parcelM171039P2.recycle();
        return zM180045g;
    }

    /* JADX INFO: renamed from: g7 */
    public final p1m m169727g7() throws RemoteException {
        Parcel parcelM171039P2 = m171039P2(20, m171038O());
        p1m p1mVarM170217O = p1m.AbstractBinderC19271a.m170217O(parcelM171039P2.readStrongBinder());
        parcelM171039P2.recycle();
        return p1mVarM170217O;
    }

    /* JADX INFO: renamed from: m4 */
    public final lpu0 m169728m4() throws RemoteException {
        Parcel parcelM171039P2 = m171039P2(16, m171038O());
        lpu0 lpu0VarM126497o8 = fou0.m126497o8(parcelM171039P2.readStrongBinder());
        parcelM171039P2.recycle();
        return lpu0VarM126497o8;
    }

    /* JADX INFO: renamed from: m5 */
    public final tks0 m169729m5() throws RemoteException {
        Parcel parcelM171039P2 = m171039P2(19, m171038O());
        tks0 tks0VarM186541o8 = sks0.m186541o8(parcelM171039P2.readStrongBinder());
        parcelM171039P2.recycle();
        return tks0VarM186541o8;
    }

    /* JADX INFO: renamed from: n8 */
    public final p1m m169730n8() throws RemoteException {
        Parcel parcelM171039P2 = m171039P2(21, m171038O());
        p1m p1mVarM170217O = p1m.AbstractBinderC19271a.m170217O(parcelM171039P2.readStrongBinder());
        parcelM171039P2.recycle();
        return p1mVarM170217O;
    }

    /* JADX INFO: renamed from: o8 */
    public final List m169731o8() throws RemoteException {
        Parcel parcelM171039P2 = m171039P2(3, m171038O());
        ArrayList arrayListM180040b = r6s0.m180040b(parcelM171039P2);
        parcelM171039P2.recycle();
        return arrayListM180040b;
    }

    /* JADX INFO: renamed from: p8 */
    public final void m169732p8(p1m p1mVar) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        r6s0.m180044f(parcelM171038O, p1mVar);
        m171041Y2(9, parcelM171038O);
    }

    /* JADX INFO: renamed from: q8 */
    public final void m169733q8(p1m p1mVar) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        r6s0.m180044f(parcelM171038O, p1mVar);
        m171041Y2(10, parcelM171038O);
    }

    /* JADX INFO: renamed from: r8 */
    public final void m169734r8(p1m p1mVar, p1m p1mVar2, p1m p1mVar3) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        r6s0.m180044f(parcelM171038O, p1mVar);
        r6s0.m180044f(parcelM171038O, p1mVar2);
        r6s0.m180044f(parcelM171038O, p1mVar3);
        m171041Y2(22, parcelM171038O);
    }

    /* JADX INFO: renamed from: s8 */
    public final void m169735s8(p1m p1mVar) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        r6s0.m180044f(parcelM171038O, p1mVar);
        m171041Y2(14, parcelM171038O);
    }

    /* JADX INFO: renamed from: t8 */
    public final boolean m169736t8() throws RemoteException {
        Parcel parcelM171039P2 = m171039P2(11, m171038O());
        boolean zM180045g = r6s0.m180045g(parcelM171039P2);
        parcelM171039P2.recycle();
        return zM180045g;
    }

    public final Bundle zze() throws RemoteException {
        Parcel parcelM171039P2 = m171039P2(13, m171038O());
        Bundle bundle = (Bundle) r6s0.m180039a(parcelM171039P2, Bundle.CREATOR);
        parcelM171039P2.recycle();
        return bundle;
    }

    public final p1m zzi() throws RemoteException {
        Parcel parcelM171039P2 = m171039P2(15, m171038O());
        p1m p1mVarM170217O = p1m.AbstractBinderC19271a.m170217O(parcelM171039P2.readStrongBinder());
        parcelM171039P2.recycle();
        return p1mVarM170217O;
    }

    public final String zzl() throws RemoteException {
        Parcel parcelM171039P2 = m171039P2(7, m171038O());
        String string = parcelM171039P2.readString();
        parcelM171039P2.recycle();
        return string;
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

    public final void zzr() throws RemoteException {
        m171041Y2(8, m171038O());
    }
}
