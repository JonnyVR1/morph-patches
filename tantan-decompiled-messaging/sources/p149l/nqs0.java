package p149l;

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
public final class nqs0 implements GeofencingApi {
    /* JADX INFO: renamed from: a */
    public static /* bridge */ /* synthetic */ sei0 m160694a(final BaseImplementation.ResultHolder resultHolder) {
        sei0 sei0Var = new sei0();
        sei0Var.m183657a().addOnCompleteListener(new OnCompleteListener() { // from class: l.yjs0
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                BaseImplementation.ResultHolder resultHolder2 = resultHolder;
                if (task.mo15377p()) {
                    resultHolder2.setResult(Status.RESULT_SUCCESS);
                    return;
                }
                if (task.mo15375n()) {
                    resultHolder2.setFailedResult(Status.RESULT_CANCELED);
                    return;
                }
                Exception excMo15372k = task.mo15372k();
                if (excMo15372k instanceof ApiException) {
                    resultHolder2.setFailedResult(((ApiException) excMo15372k).getStatus());
                } else {
                    resultHolder2.setFailedResult(Status.RESULT_INTERNAL_ERROR);
                }
            }
        });
        return sei0Var;
    }

    @Override // com.google.android.gms.location.GeofencingApi
    @Deprecated
    public final PendingResult<Status> addGeofences(GoogleApiClient googleApiClient, List<Geofence> list, PendingIntent pendingIntent) {
        GeofencingRequest.Builder builder = new GeofencingRequest.Builder();
        builder.addGeofences(list);
        builder.setInitialTrigger(5);
        return googleApiClient.execute(new gls0(this, googleApiClient, builder.build(), pendingIntent));
    }

    @Override // com.google.android.gms.location.GeofencingApi
    public final PendingResult<Status> removeGeofences(GoogleApiClient googleApiClient, PendingIntent pendingIntent) {
        return googleApiClient.execute(new oms0(this, googleApiClient, pendingIntent));
    }

    @Override // com.google.android.gms.location.GeofencingApi
    public final PendingResult<Status> removeGeofences(GoogleApiClient googleApiClient, List<String> list) {
        return googleApiClient.execute(new wns0(this, googleApiClient, list));
    }

    @Override // com.google.android.gms.location.GeofencingApi
    public final PendingResult<Status> addGeofences(GoogleApiClient googleApiClient, GeofencingRequest geofencingRequest, PendingIntent pendingIntent) {
        return googleApiClient.execute(new gls0(this, googleApiClient, geofencingRequest, pendingIntent));
    }
}
