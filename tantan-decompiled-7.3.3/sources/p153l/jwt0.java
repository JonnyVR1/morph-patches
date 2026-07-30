package p153l;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationCallback;

/* JADX INFO: loaded from: classes6.dex */
public final class jwt0 implements ListenerHolder.Notifier {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ LocationAvailability f122970a;

    public jwt0(yyt0 yyt0Var, LocationAvailability locationAvailability) {
        this.f122970a = locationAvailability;
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final /* synthetic */ void notifyListener(Object obj) {
        ((LocationCallback) obj).onLocationAvailability(this.f122970a);
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final void onNotifyListenerFailed() {
    }
}
