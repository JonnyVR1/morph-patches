package p149l;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes6.dex */
public abstract class bes0 extends kxr0 implements ces0 {
    /* JADX INFO: renamed from: o8 */
    public static ces0 m101418o8(IBinder iBinder) {
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IShouldDelayBannerRenderingListener");
        return iInterfaceQueryLocalInterface instanceof ces0 ? (ces0) iInterfaceQueryLocalInterface : new aes0(iBinder);
    }
}
