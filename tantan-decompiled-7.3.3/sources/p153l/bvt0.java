package p153l;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationResult;

/* JADX INFO: loaded from: classes6.dex */
public final class bvt0 implements ListenerHolder.Notifier {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ LocationResult f78633a;

    public bvt0(yyt0 yyt0Var, LocationResult locationResult) {
        this.f78633a = locationResult;
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final /* synthetic */ void notifyListener(Object obj) {
        ((LocationCallback) obj).onLocationResult(this.f78633a);
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final void onNotifyListenerFailed() {
    }
}
