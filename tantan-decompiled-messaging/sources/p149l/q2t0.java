package p149l;

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
public final class q2t0 extends GoogleApi implements SettingsClient {
    public q2t0(@NonNull Activity activity) {
        super(activity, (Api<Api.ApiOptions.NoOptions>) pis0.f149685b, Api.ApiOptions.NO_OPTIONS, GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    @Override // com.google.android.gms.location.SettingsClient
    public final Task<LocationSettingsResponse> checkLocationSettings(final LocationSettingsRequest locationSettingsRequest) {
        return doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: l.i1t0
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) throws RemoteException {
                LocationSettingsRequest locationSettingsRequest2 = locationSettingsRequest;
                zvt0 zvt0Var = (zvt0) obj;
                sei0 sei0Var = (sei0) obj2;
                Preconditions.checkArgument(locationSettingsRequest2 != null, "locationSettingsRequest can't be null");
                ((iby0) zvt0Var.getService()).mo135286X2(locationSettingsRequest2, new zht0(sei0Var), null);
            }
        }).setMethodKey(2426).build());
    }

    public q2t0(@NonNull Context context) {
        super(context, (Api<Api.ApiOptions.NoOptions>) pis0.f149685b, Api.ApiOptions.NO_OPTIONS, GoogleApi.Settings.DEFAULT_SETTINGS);
    }
}
