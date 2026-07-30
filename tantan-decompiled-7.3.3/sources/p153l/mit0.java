package p153l;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzen;

/* JADX INFO: loaded from: classes6.dex */
public final class mit0 extends p6s0 implements wkt0 {
    public mit0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.ILiteSdkInfo");
    }

    @Override // p153l.wkt0
    public final uws0 getAdapterCreator() throws RemoteException {
        Parcel parcelM171039P2 = m171039P2(2, m171038O());
        uws0 uws0VarM193369o8 = tws0.m193369o8(parcelM171039P2.readStrongBinder());
        parcelM171039P2.recycle();
        return uws0VarM193369o8;
    }

    @Override // p153l.wkt0
    public final zzen getLiteSdkVersion() throws RemoteException {
        Parcel parcelM171039P2 = m171039P2(1, m171038O());
        zzen zzenVar = (zzen) r6s0.m180039a(parcelM171039P2, zzen.CREATOR);
        parcelM171039P2.recycle();
        return zzenVar;
    }
}
