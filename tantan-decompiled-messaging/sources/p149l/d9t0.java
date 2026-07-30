package p149l;

import android.os.RemoteException;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationResult;

/* JADX INFO: loaded from: classes6.dex */
public final class d9t0 extends LocationCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ sei0 f85154a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zvt0 f85155b;

    public d9t0(zvt0 zvt0Var, sei0 sei0Var) {
        this.f85155b = zvt0Var;
        this.f85154a = sei0Var;
    }

    @Override // com.google.android.gms.location.LocationCallback
    public final void onLocationResult(LocationResult locationResult) {
        this.f85154a.m183661e(locationResult.getLastLocation());
        try {
            this.f85155b.m220469d(ListenerHolders.createListenerKey(this, "GetCurrentLocation"), false, new sei0());
        } catch (RemoteException unused) {
        }
    }
}
