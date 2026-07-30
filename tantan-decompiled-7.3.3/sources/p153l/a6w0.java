package p153l;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes6.dex */
public final class a6w0 extends zyu0.AbstractRunnableC21938a {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Bundle f68769e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Activity f68770f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ zyu0.C21941d f68771g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a6w0(zyu0.C21941d c21941d, Bundle bundle, Activity activity) {
        super(zyu0.this);
        this.f68769e = bundle;
        this.f68770f = activity;
        this.f68771g = c21941d;
    }

    @Override // p153l.zyu0.AbstractRunnableC21938a
    /* JADX INFO: renamed from: a */
    public final void mo96344a() throws RemoteException {
        Bundle bundle;
        if (this.f68769e != null) {
            bundle = new Bundle();
            if (this.f68769e.containsKey("com.google.app_measurement.screen_service")) {
                Object obj = this.f68769e.get("com.google.app_measurement.screen_service");
                if (obj instanceof Bundle) {
                    bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                }
            }
        } else {
            bundle = null;
        }
        ((pgu0) Preconditions.checkNotNull(zyu0.this.f206644i)).onActivityCreated(h950.m134038Y2(this.f68770f), bundle, this.f206646b);
    }
}
