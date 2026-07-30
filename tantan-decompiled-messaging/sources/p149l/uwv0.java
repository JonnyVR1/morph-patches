package p149l;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes6.dex */
public final class uwv0 extends tpu0.AbstractRunnableC20237a {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Bundle f178682e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Activity f178683f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ tpu0.C20240d f178684g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uwv0(tpu0.C20240d c20240d, Bundle bundle, Activity activity) {
        super(tpu0.this);
        this.f178682e = bundle;
        this.f178683f = activity;
        this.f178684g = c20240d;
    }

    @Override // p149l.tpu0.AbstractRunnableC20237a
    /* JADX INFO: renamed from: a */
    public final void mo102711a() throws RemoteException {
        Bundle bundle;
        if (this.f178682e != null) {
            bundle = new Bundle();
            if (this.f178682e.containsKey("com.google.app_measurement.screen_service")) {
                Object obj = this.f178682e.get("com.google.app_measurement.screen_service");
                if (obj instanceof Bundle) {
                    bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                }
            }
        } else {
            bundle = null;
        }
        ((j7u0) Preconditions.checkNotNull(tpu0.this.f171518i)).onActivityCreated(s050.m181848Y2(this.f178683f), bundle, this.f171520b);
    }
}
