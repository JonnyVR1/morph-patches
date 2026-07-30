package p153l;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsResponse;
import com.google.android.gms.location.SettingsClient;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes6.dex */
public final class wbt0 extends GoogleApi implements SettingsClient {
    public wbt0(@NonNull Activity activity) {
        super(activity, (Api<Api.ApiOptions.NoOptions>) vrs0.f185520b, Api.ApiOptions.NO_OPTIONS, GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    @Override // com.google.android.gms.location.SettingsClient
    public final Task<LocationSettingsResponse> checkLocationSettings(final LocationSettingsRequest locationSettingsRequest) {
        return doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: l.oat0
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) throws RemoteException {
                LocationSettingsRequest locationSettingsRequest2 = locationSettingsRequest;
                f5u0 f5u0Var = (f5u0) obj;
                sni0 sni0Var = (sni0) obj2;
                Preconditions.checkArgument(locationSettingsRequest2 != null, "locationSettingsRequest can't be null");
                ((oky0) f5u0Var.getService()).mo168075X2(locationSettingsRequest2, new frt0(sni0Var), null);
            }
        }).setMethodKey(2426).build());
    }

    public wbt0(@NonNull Context context) {
        super(context, (Api<Api.ApiOptions.NoOptions>) vrs0.f185520b, Api.ApiOptions.NO_OPTIONS, GoogleApi.Settings.DEFAULT_SETTINGS);
    }
}
