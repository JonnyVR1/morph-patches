package p153l;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes6.dex */
public abstract class gls0 extends q6s0 implements hls0 {
    /* JADX INFO: renamed from: o8 */
    public static hls0 m130697o8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
        return iInterfaceQueryLocalInterface instanceof hls0 ? (hls0) iInterfaceQueryLocalInterface : new fls0(iBinder);
    }
}
