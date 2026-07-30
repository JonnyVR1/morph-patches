package p149l;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public final class tcs0 extends jxr0 implements vcs0 {
    public tcs0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    @Override // p149l.vcs0
    /* JADX INFO: renamed from: H */
    public final boolean mo184270H(uyl uylVar) throws RemoteException {
        Parcel parcelM143822O = m143822O();
        lxr0.m152089f(parcelM143822O, uylVar);
        Parcel parcelM143823P2 = m143823P2(17, parcelM143822O);
        boolean zM152090g = lxr0.m152090g(parcelM143823P2);
        parcelM143823P2.recycle();
        return zM152090g;
    }

    @Override // p149l.vcs0
    /* JADX INFO: renamed from: o0 */
    public final boolean mo184274o0(uyl uylVar) throws RemoteException {
        Parcel parcelM143822O = m143822O();
        lxr0.m152089f(parcelM143822O, uylVar);
        Parcel parcelM143823P2 = m143823P2(10, parcelM143822O);
        boolean zM152090g = lxr0.m152090g(parcelM143823P2);
        parcelM143823P2.recycle();
        return zM152090g;
    }

    @Override // p149l.vcs0
    public final uyl zzh() throws RemoteException {
        Parcel parcelM143823P2 = m143823P2(9, m143822O());
        uyl uylVarM196295O = uyl.AbstractBinderC20541a.m196295O(parcelM143823P2.readStrongBinder());
        parcelM143823P2.recycle();
        return uylVarM196295O;
    }

    @Override // p149l.vcs0
    public final String zzi() throws RemoteException {
        Parcel parcelM143823P2 = m143823P2(4, m143822O());
        String string = parcelM143823P2.readString();
        parcelM143823P2.recycle();
        return string;
    }
}
