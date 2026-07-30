package p149l;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationCallback;

/* JADX INFO: loaded from: classes6.dex */
public final class dnt0 implements ListenerHolder.Notifier {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ LocationAvailability f87106a;

    public dnt0(spt0 spt0Var, LocationAvailability locationAvailability) {
        this.f87106a = locationAvailability;
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final /* synthetic */ void notifyListener(Object obj) {
        ((LocationCallback) obj).onLocationAvailability(this.f87106a);
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final void onNotifyListenerFailed() {
    }
}
