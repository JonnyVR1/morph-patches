package p153l;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.util.ArrayUtils;

/* JADX INFO: loaded from: classes6.dex */
public final class rbs0 extends k6t0 {
    public rbs0(Context context, Looper looper, BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener baseOnConnectionFailedListener) {
        super(d5t0.m114319a(context), looper, 123, baseConnectionCallbacks, baseOnConnectionFailedListener, null);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m180759c() {
        return ((Boolean) jas0.m144075c().m176505a(sgs0.f168109Q1)).booleanValue() && ArrayUtils.contains(getAvailableFeatures(), mrw0.f138426a);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    @VisibleForTesting
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.cache.ICacheService");
        return iInterfaceQueryLocalInterface instanceof tbs0 ? (tbs0) iInterfaceQueryLocalInterface : new tbs0(iBinder);
    }

    /* JADX INFO: renamed from: d */
    public final tbs0 m180760d() throws DeadObjectException {
        return (tbs0) super.getService();
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Feature[] getApiFeatures() {
        return mrw0.f138427b;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    @VisibleForTesting
    public final String getServiceDescriptor() {
        return "com.google.android.gms.ads.internal.cache.ICacheService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    @VisibleForTesting
    public final String getStartServiceAction() {
        return "com.google.android.gms.ads.service.CACHE";
    }
}
