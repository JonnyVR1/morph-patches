package p153l;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.location.GeofencingClient;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.tasks.Task;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class g4t0 extends GoogleApi implements GeofencingClient {
    public g4t0(@NonNull Activity activity) {
        super(activity, (Api<Api.ApiOptions.NoOptions>) vrs0.f185520b, Api.ApiOptions.NO_OPTIONS, GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    @Override // com.google.android.gms.location.GeofencingClient
    public final Task<Void> addGeofences(GeofencingRequest geofencingRequest, final PendingIntent pendingIntent) {
        final GeofencingRequest geofencingRequestZza = geofencingRequest.zza(getContextAttributionTag());
        return doWrite(TaskApiCall.builder().run(new RemoteCall() { // from class: l.y0t0
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) throws RemoteException {
                ((f5u0) obj).m124238i(geofencingRequestZza, pendingIntent, (sni0) obj2);
            }
        }).setMethodKey(2424).build());
    }

    @Override // com.google.android.gms.location.GeofencingClient
    public final Task<Void> removeGeofences(final PendingIntent pendingIntent) {
        return doWrite(TaskApiCall.builder().run(new RemoteCall() { // from class: l.c3t0
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) throws RemoteException {
                ((f5u0) obj).m124245p(pendingIntent, (sni0) obj2);
            }
        }).setMethodKey(2425).build());
    }

    public g4t0(@NonNull Context context) {
        super(context, (Api<Api.ApiOptions.NoOptions>) vrs0.f185520b, Api.ApiOptions.NO_OPTIONS, GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    @Override // com.google.android.gms.location.GeofencingClient
    public final Task<Void> removeGeofences(final List<String> list) {
        return doWrite(TaskApiCall.builder().run(new RemoteCall() { // from class: l.a2t0
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) throws RemoteException {
                ((f5u0) obj).m124246q(list, (sni0) obj2);
            }
        }).setMethodKey(2425).build());
    }
}
