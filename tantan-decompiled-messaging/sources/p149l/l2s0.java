package p149l;

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
public final class l2s0 extends exs0 {
    public l2s0(Context context, Looper looper, BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener baseOnConnectionFailedListener) {
        super(xvs0.m211305a(context), looper, 123, baseConnectionCallbacks, baseOnConnectionFailedListener, null);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m148304c() {
        return ((Boolean) d1s0.m109677c().m144697a(m7s0.f132038Q1)).booleanValue() && ArrayUtils.contains(getAvailableFeatures(), giw0.f102978a);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    @VisibleForTesting
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.cache.ICacheService");
        return iInterfaceQueryLocalInterface instanceof n2s0 ? (n2s0) iInterfaceQueryLocalInterface : new n2s0(iBinder);
    }

    /* JADX INFO: renamed from: d */
    public final n2s0 m148305d() throws DeadObjectException {
        return (n2s0) super.getService();
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Feature[] getApiFeatures() {
        return giw0.f102979b;
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
