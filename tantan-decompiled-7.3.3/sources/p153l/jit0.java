package p153l;

import android.os.RemoteException;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationResult;

/* JADX INFO: loaded from: classes6.dex */
public final class jit0 extends LocationCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ sni0 f121119a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ f5u0 f121120b;

    public jit0(f5u0 f5u0Var, sni0 sni0Var) {
        this.f121120b = f5u0Var;
        this.f121119a = sni0Var;
    }

    @Override // com.google.android.gms.location.LocationCallback
    public final void onLocationResult(LocationResult locationResult) {
        this.f121119a.m186943e(locationResult.getLastLocation());
        try {
            this.f121120b.m124233d(ListenerHolders.createListenerKey(this, "GetCurrentLocation"), false, new sni0());
        } catch (RemoteException unused) {
        }
    }
}
