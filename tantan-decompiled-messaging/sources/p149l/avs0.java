package p149l;

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
public final class avs0 extends GoogleApi implements GeofencingClient {
    public avs0(@NonNull Activity activity) {
        super(activity, (Api<Api.ApiOptions.NoOptions>) pis0.f149685b, Api.ApiOptions.NO_OPTIONS, GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    @Override // com.google.android.gms.location.GeofencingClient
    public final Task<Void> addGeofences(GeofencingRequest geofencingRequest, final PendingIntent pendingIntent) {
        final GeofencingRequest geofencingRequestZza = geofencingRequest.zza(getContextAttributionTag());
        return doWrite(TaskApiCall.builder().run(new RemoteCall() { // from class: l.srs0
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) throws RemoteException {
                ((zvt0) obj).m220474i(geofencingRequestZza, pendingIntent, (sei0) obj2);
            }
        }).setMethodKey(2424).build());
    }

    @Override // com.google.android.gms.location.GeofencingClient
    public final Task<Void> removeGeofences(final PendingIntent pendingIntent) {
        return doWrite(TaskApiCall.builder().run(new RemoteCall() { // from class: l.wts0
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) throws RemoteException {
                ((zvt0) obj).m220481p(pendingIntent, (sei0) obj2);
            }
        }).setMethodKey(2425).build());
    }

    public avs0(@NonNull Context context) {
        super(context, (Api<Api.ApiOptions.NoOptions>) pis0.f149685b, Api.ApiOptions.NO_OPTIONS, GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    @Override // com.google.android.gms.location.GeofencingClient
    public final Task<Void> removeGeofences(final List<String> list) {
        return doWrite(TaskApiCall.builder().run(new RemoteCall() { // from class: l.uss0
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) throws RemoteException {
                ((zvt0) obj).m220482q(list, (sei0) obj2);
            }
        }).setMethodKey(2425).build());
    }
}
