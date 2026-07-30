package p153l;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public final class zls0 extends p6s0 implements bms0 {
    public zls0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    @Override // p153l.bms0
    /* JADX INFO: renamed from: H */
    public final boolean mo105256H(p1m p1mVar) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        r6s0.m180044f(parcelM171038O, p1mVar);
        Parcel parcelM171039P2 = m171039P2(17, parcelM171038O);
        boolean zM180045g = r6s0.m180045g(parcelM171039P2);
        parcelM171039P2.recycle();
        return zM180045g;
    }

    @Override // p153l.bms0
    /* JADX INFO: renamed from: o0 */
    public final boolean mo105260o0(p1m p1mVar) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        r6s0.m180044f(parcelM171038O, p1mVar);
        Parcel parcelM171039P2 = m171039P2(10, parcelM171038O);
        boolean zM180045g = r6s0.m180045g(parcelM171039P2);
        parcelM171039P2.recycle();
        return zM180045g;
    }

    @Override // p153l.bms0
    public final p1m zzh() throws RemoteException {
        Parcel parcelM171039P2 = m171039P2(9, m171038O());
        p1m p1mVarM170217O = p1m.AbstractBinderC19271a.m170217O(parcelM171039P2.readStrongBinder());
        parcelM171039P2.recycle();
        return p1mVarM170217O;
    }

    @Override // p153l.bms0
    public final String zzi() throws RemoteException {
        Parcel parcelM171039P2 = m171039P2(4, m171038O());
        String string = parcelM171039P2.readString();
        parcelM171039P2.recycle();
        return string;
    }
}
