package p153l;

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
public final class qoy0 extends GoogleApi<Api.ApiOptions.NoOptions> implements fx0 {

    /* JADX INFO: renamed from: c */
    public static final Api.ClientKey<g4u0> f158793c;

    /* JADX INFO: renamed from: d */
    public static final Api.AbstractClientBuilder<g4u0, Api.ApiOptions.NoOptions> f158794d;

    /* JADX INFO: renamed from: e */
    public static final Api<Api.ApiOptions.NoOptions> f158795e;

    /* JADX INFO: renamed from: a */
    public final Context f158796a;

    /* JADX INFO: renamed from: b */
    public final GoogleApiAvailabilityLight f158797b;

    static {
        Api.ClientKey<g4u0> clientKey = new Api.ClientKey<>();
        f158793c = clientKey;
        nhy0 nhy0Var = new nhy0();
        f158794d = nhy0Var;
        f158795e = new Api<>("AppSet.API", nhy0Var, clientKey);
    }

    public qoy0(Context context, GoogleApiAvailabilityLight googleApiAvailabilityLight) {
        super(context, f158795e, Api.ApiOptions.NO_OPTIONS, GoogleApi.Settings.DEFAULT_SETTINGS);
        this.f158796a = context;
        this.f158797b = googleApiAvailabilityLight;
    }

    @Override // p153l.fx0
    /* JADX INFO: renamed from: a */
    public final Task<gx0> mo13809a() {
        return this.f158797b.isGooglePlayServicesAvailable(this.f158796a, 212800000) == 0 ? doRead(TaskApiCall.builder().setFeatures(f2v0.f96931a).run(new RemoteCall() { // from class: l.bey0
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) throws RemoteException {
                ((pqw0) ((g4u0) obj).getService()).m173421Y2(new zza(null, null), new dly0(this.f76425a, (sni0) obj2));
            }
        }).setAutoResolveMissingFeatures(false).setMethodKey(27601).build()) : toi0.m192067e(new ApiException(new Status(17)));
    }
}
