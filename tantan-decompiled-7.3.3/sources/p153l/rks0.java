package p153l;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class rks0 extends p6s0 implements tks0 {
    public rks0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    }

    @Override // p153l.tks0
    public final String zzg() throws RemoteException {
        Parcel parcelM171039P2 = m171039P2(2, m171038O());
        String string = parcelM171039P2.readString();
        parcelM171039P2.recycle();
        return string;
    }

    @Override // p153l.tks0
    public final List zzh() throws RemoteException {
        Parcel parcelM171039P2 = m171039P2(3, m171038O());
        ArrayList arrayListM180040b = r6s0.m180040b(parcelM171039P2);
        parcelM171039P2.recycle();
        return arrayListM180040b;
    }
}
