package p153l;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class pxs0 extends p6s0 implements rxs0 {
    public pxs0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    @Override // p153l.rxs0
    /* JADX INFO: renamed from: J */
    public final boolean mo174239J() throws RemoteException {
        Parcel parcelM171039P2 = m171039P2(17, m171038O());
        boolean zM180045g = r6s0.m180045g(parcelM171039P2);
        parcelM171039P2.recycle();
        return zM180045g;
    }

    @Override // p153l.rxs0
    /* JADX INFO: renamed from: a */
    public final String mo174240a() throws RemoteException {
        Parcel parcelM171039P2 = m171039P2(4, m171038O());
        String string = parcelM171039P2.readString();
        parcelM171039P2.recycle();
        return string;
    }

    @Override // p153l.rxs0
    /* JADX INFO: renamed from: b */
    public final List mo174241b() throws RemoteException {
        Parcel parcelM171039P2 = m171039P2(3, m171038O());
        ArrayList arrayListM180040b = r6s0.m180040b(parcelM171039P2);
        parcelM171039P2.recycle();
        return arrayListM180040b;
    }

    @Override // p153l.rxs0
    /* JADX INFO: renamed from: g */
    public final void mo174242g() throws RemoteException {
        m171041Y2(19, m171038O());
    }

    @Override // p153l.rxs0
    /* JADX INFO: renamed from: k7 */
    public final void mo174243k7(p1m p1mVar) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        r6s0.m180044f(parcelM171038O, p1mVar);
        m171041Y2(20, parcelM171038O);
    }

    @Override // p153l.rxs0
    /* JADX INFO: renamed from: o1 */
    public final void mo174244o1(p1m p1mVar, p1m p1mVar2, p1m p1mVar3) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        r6s0.m180044f(parcelM171038O, p1mVar);
        r6s0.m180044f(parcelM171038O, p1mVar2);
        r6s0.m180044f(parcelM171038O, p1mVar3);
        m171041Y2(21, parcelM171038O);
    }

    @Override // p153l.rxs0
    /* JADX INFO: renamed from: t */
    public final boolean mo174245t() throws RemoteException {
        Parcel parcelM171039P2 = m171039P2(18, m171038O());
        boolean zM180045g = r6s0.m180045g(parcelM171039P2);
        parcelM171039P2.recycle();
        return zM180045g;
    }

    @Override // p153l.rxs0
    /* JADX INFO: renamed from: y7 */
    public final void mo174246y7(p1m p1mVar) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        r6s0.m180044f(parcelM171038O, p1mVar);
        m171041Y2(22, parcelM171038O);
    }

    @Override // p153l.rxs0
    public final double zze() throws RemoteException {
        Parcel parcelM171039P2 = m171039P2(8, m171038O());
        double d = parcelM171039P2.readDouble();
        parcelM171039P2.recycle();
        return d;
    }

    @Override // p153l.rxs0
    public final float zzf() throws RemoteException {
        Parcel parcelM171039P2 = m171039P2(23, m171038O());
        float f = parcelM171039P2.readFloat();
        parcelM171039P2.recycle();
        return f;
    }

    @Override // p153l.rxs0
    public final float zzg() throws RemoteException {
        Parcel parcelM171039P2 = m171039P2(25, m171038O());
        float f = parcelM171039P2.readFloat();
        parcelM171039P2.recycle();
        return f;
    }

    @Override // p153l.rxs0
    public final float zzh() throws RemoteException {
        Parcel parcelM171039P2 = m171039P2(24, m171038O());
        float f = parcelM171039P2.readFloat();
        parcelM171039P2.recycle();
        return f;
    }

    @Override // p153l.rxs0
    public final Bundle zzi() throws RemoteException {
        Parcel parcelM171039P2 = m171039P2(16, m171038O());
        Bundle bundle = (Bundle) r6s0.m180039a(parcelM171039P2, Bundle.CREATOR);
        parcelM171039P2.recycle();
        return bundle;
    }

    @Override // p153l.rxs0
    public final lpu0 zzj() throws RemoteException {
        Parcel parcelM171039P2 = m171039P2(11, m171038O());
        lpu0 lpu0VarM126497o8 = fou0.m126497o8(parcelM171039P2.readStrongBinder());
        parcelM171039P2.recycle();
        return lpu0VarM126497o8;
    }

    @Override // p153l.rxs0
    public final tks0 zzk() throws RemoteException {
        Parcel parcelM171039P2 = m171039P2(12, m171038O());
        tks0 tks0VarM186541o8 = sks0.m186541o8(parcelM171039P2.readStrongBinder());
        parcelM171039P2.recycle();
        return tks0VarM186541o8;
    }

    @Override // p153l.rxs0
    public final als0 zzl() throws RemoteException {
        Parcel parcelM171039P2 = m171039P2(5, m171038O());
        als0 als0VarM220161o8 = zks0.m220161o8(parcelM171039P2.readStrongBinder());
        parcelM171039P2.recycle();
        return als0VarM220161o8;
    }

    @Override // p153l.rxs0
    public final p1m zzm() throws RemoteException {
        Parcel parcelM171039P2 = m171039P2(13, m171038O());
        p1m p1mVarM170217O = p1m.AbstractBinderC19271a.m170217O(parcelM171039P2.readStrongBinder());
        parcelM171039P2.recycle();
        return p1mVarM170217O;
    }

    @Override // p153l.rxs0
    public final p1m zzn() throws RemoteException {
        Parcel parcelM171039P2 = m171039P2(14, m171038O());
        p1m p1mVarM170217O = p1m.AbstractBinderC19271a.m170217O(parcelM171039P2.readStrongBinder());
        parcelM171039P2.recycle();
        return p1mVarM170217O;
    }

    @Override // p153l.rxs0
    public final p1m zzo() throws RemoteException {
        Parcel parcelM171039P2 = m171039P2(15, m171038O());
        p1m p1mVarM170217O = p1m.AbstractBinderC19271a.m170217O(parcelM171039P2.readStrongBinder());
        parcelM171039P2.recycle();
        return p1mVarM170217O;
    }

    @Override // p153l.rxs0
    public final String zzp() throws RemoteException {
        Parcel parcelM171039P2 = m171039P2(7, m171038O());
        String string = parcelM171039P2.readString();
        parcelM171039P2.recycle();
        return string;
    }

    @Override // p153l.rxs0
    public final String zzr() throws RemoteException {
        Parcel parcelM171039P2 = m171039P2(6, m171038O());
        String string = parcelM171039P2.readString();
        parcelM171039P2.recycle();
        return string;
    }

    @Override // p153l.rxs0
    public final String zzs() throws RemoteException {
        Parcel parcelM171039P2 = m171039P2(2, m171038O());
        String string = parcelM171039P2.readString();
        parcelM171039P2.recycle();
        return string;
    }

    @Override // p153l.rxs0
    public final String zzt() throws RemoteException {
        Parcel parcelM171039P2 = m171039P2(10, m171038O());
        String string = parcelM171039P2.readString();
        parcelM171039P2.recycle();
        return string;
    }

    @Override // p153l.rxs0
    public final String zzu() throws RemoteException {
        Parcel parcelM171039P2 = m171039P2(9, m171038O());
        String string = parcelM171039P2.readString();
        parcelM171039P2.recycle();
        return string;
    }
}
