package p153l;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.internal.BaseGmsClient;

/* JADX INFO: loaded from: classes6.dex */
public final class n3t0 extends BaseGmsClient {
    /* JADX WARN: Illegal instructions before constructor call */
    public n3t0(Context context, Looper looper, BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener baseOnConnectionFailedListener) {
        Context applicationContext = context.getApplicationContext();
        super(applicationContext != null ? applicationContext : context, looper, 8, baseConnectionCallbacks, baseOnConnectionFailedListener, null);
    }

    /* JADX INFO: renamed from: c */
    public final x3t0 m161354c() throws DeadObjectException {
        return (x3t0) super.getService();
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    @VisibleForTesting
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdsService");
        return iInterfaceQueryLocalInterface instanceof x3t0 ? (x3t0) iInterfaceQueryLocalInterface : new v3t0(iBinder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    @VisibleForTesting
    public final String getServiceDescriptor() {
        return "com.google.android.gms.ads.internal.request.IAdsService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    @VisibleForTesting
    public final String getStartServiceAction() {
        return "com.google.android.gms.ads.service.ADS";
    }
}
