package p153l;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes6.dex */
public abstract class hms0 extends q6s0 implements ims0 {
    /* JADX INFO: renamed from: o8 */
    public static ims0 m135982o8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
        return iInterfaceQueryLocalInterface instanceof ims0 ? (ims0) iInterfaceQueryLocalInterface : new gms0(iBinder);
    }
}
