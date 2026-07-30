package p153l;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes6.dex */
public abstract class hns0 extends q6s0 implements ins0 {
    /* JADX INFO: renamed from: o8 */
    public static ins0 m136273o8(IBinder iBinder) {
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IShouldDelayBannerRenderingListener");
        return iInterfaceQueryLocalInterface instanceof ins0 ? (ins0) iInterfaceQueryLocalInterface : new gns0(iBinder);
    }
}
