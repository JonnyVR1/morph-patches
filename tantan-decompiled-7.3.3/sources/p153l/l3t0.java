package p153l;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.internal.BaseGmsClient;

/* JADX INFO: loaded from: classes6.dex */
public final class l3t0 extends k6t0 {
    public l3t0(Context context, Looper looper, BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener baseOnConnectionFailedListener) {
        super(d5t0.m114319a(context), looper, 8, baseConnectionCallbacks, baseOnConnectionFailedListener, null);
    }

    /* JADX INFO: renamed from: c */
    public final t3t0 m152737c() throws DeadObjectException {
        return (t3t0) super.getService();
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    @VisibleForTesting
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdRequestService");
        return iInterfaceQueryLocalInterface instanceof t3t0 ? (t3t0) iInterfaceQueryLocalInterface : new r3t0(iBinder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    @VisibleForTesting
    public final String getServiceDescriptor() {
        return "com.google.android.gms.ads.internal.request.IAdRequestService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    @VisibleForTesting
    public final String getStartServiceAction() {
        return "com.google.android.gms.ads.service.START";
    }
}
