package p153l;

import android.app.PendingIntent;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.location.Geofence;
import com.google.android.gms.location.GeofencingApi;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class tzs0 implements GeofencingApi {
    /* JADX INFO: renamed from: a */
    public static /* bridge */ /* synthetic */ sni0 m193735a(final BaseImplementation.ResultHolder resultHolder) {
        sni0 sni0Var = new sni0();
        sni0Var.m186939a().addOnCompleteListener(new OnCompleteListener() { // from class: l.ets0
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                BaseImplementation.ResultHolder resultHolder2 = resultHolder;
                if (task.mo15431p()) {
                    resultHolder2.setResult(Status.RESULT_SUCCESS);
                    return;
                }
                if (task.mo15429n()) {
                    resultHolder2.setFailedResult(Status.RESULT_CANCELED);
                    return;
                }
                Exception excMo15426k = task.mo15426k();
                if (excMo15426k instanceof ApiException) {
                    resultHolder2.setFailedResult(((ApiException) excMo15426k).getStatus());
                } else {
                    resultHolder2.setFailedResult(Status.RESULT_INTERNAL_ERROR);
                }
            }
        });
        return sni0Var;
    }

    @Override // com.google.android.gms.location.GeofencingApi
    @Deprecated
    public final PendingResult<Status> addGeofences(GoogleApiClient googleApiClient, List<Geofence> list, PendingIntent pendingIntent) {
        GeofencingRequest.Builder builder = new GeofencingRequest.Builder();
        builder.addGeofences(list);
        builder.setInitialTrigger(5);
        return googleApiClient.execute(new mus0(this, googleApiClient, builder.build(), pendingIntent));
    }

    @Override // com.google.android.gms.location.GeofencingApi
    public final PendingResult<Status> removeGeofences(GoogleApiClient googleApiClient, PendingIntent pendingIntent) {
        return googleApiClient.execute(new uvs0(this, googleApiClient, pendingIntent));
    }

    @Override // com.google.android.gms.location.GeofencingApi
    public final PendingResult<Status> removeGeofences(GoogleApiClient googleApiClient, List<String> list) {
        return googleApiClient.execute(new cxs0(this, googleApiClient, list));
    }

    @Override // com.google.android.gms.location.GeofencingApi
    public final PendingResult<Status> addGeofences(GoogleApiClient googleApiClient, GeofencingRequest geofencingRequest, PendingIntent pendingIntent) {
        return googleApiClient.execute(new mus0(this, googleApiClient, geofencingRequest, pendingIntent));
    }
}
