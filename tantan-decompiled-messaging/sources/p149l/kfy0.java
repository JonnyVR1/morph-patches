package p149l;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.appset.zza;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes6.dex */
public final class kfy0 extends GoogleApi<Api.ApiOptions.NoOptions> implements yw0 {

    /* JADX INFO: renamed from: c */
    public static final Api.ClientKey<avt0> f122982c;

    /* JADX INFO: renamed from: d */
    public static final Api.AbstractClientBuilder<avt0, Api.ApiOptions.NoOptions> f122983d;

    /* JADX INFO: renamed from: e */
    public static final Api<Api.ApiOptions.NoOptions> f122984e;

    /* JADX INFO: renamed from: a */
    public final Context f122985a;

    /* JADX INFO: renamed from: b */
    public final GoogleApiAvailabilityLight f122986b;

    static {
        Api.ClientKey<avt0> clientKey = new Api.ClientKey<>();
        f122982c = clientKey;
        h8y0 h8y0Var = new h8y0();
        f122983d = h8y0Var;
        f122984e = new Api<>("AppSet.API", h8y0Var, clientKey);
    }

    public kfy0(Context context, GoogleApiAvailabilityLight googleApiAvailabilityLight) {
        super(context, f122984e, Api.ApiOptions.NO_OPTIONS, GoogleApi.Settings.DEFAULT_SETTINGS);
        this.f122985a = context;
        this.f122986b = googleApiAvailabilityLight;
    }

    @Override // p149l.yw0
    /* JADX INFO: renamed from: a */
    public final Task<zw0> mo13755a() {
        return this.f122986b.isGooglePlayServicesAvailable(this.f122985a, 212800000) == 0 ? doRead(TaskApiCall.builder().setFeatures(zsu0.f204645a).run(new RemoteCall() { // from class: l.v4y0
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) throws RemoteException {
                ((jhw0) ((avt0) obj).getService()).m141612Y2(new zza(null, null), new xby0(this.f179980a, (sei0) obj2));
            }
        }).setAutoResolveMissingFeatures(false).setMethodKey(27601).build()) : tfi0.m188733e(new ApiException(new Status(17)));
    }
}
