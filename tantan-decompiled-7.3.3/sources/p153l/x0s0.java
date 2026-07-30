package p153l;

import android.app.PendingIntent;
import android.location.Location;
import android.os.Looper;
import android.os.RemoteException;
import androidx.annotation.RequiresPermission;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.location.FusedLocationProviderApi;
import com.google.android.gms.location.LastLocationRequest;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes6.dex */
public final class x0s0 implements FusedLocationProviderApi {
    /* JADX INFO: renamed from: a */
    public static /* bridge */ /* synthetic */ sni0 m208892a(final BaseImplementation.ResultHolder resultHolder) {
        sni0 sni0Var = new sni0();
        sni0Var.m186939a().addOnCompleteListener(new OnCompleteListener() { // from class: l.dkr0
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

    @Override // com.google.android.gms.location.FusedLocationProviderApi
    public final PendingResult<Status> flushLocations(GoogleApiClient googleApiClient) {
        return googleApiClient.execute(new qmr0(this, googleApiClient));
    }

    @Override // com.google.android.gms.location.FusedLocationProviderApi
    @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public final Location getLastLocation(GoogleApiClient googleApiClient) throws Throwable {
        boolean zAwait;
        boolean z = false;
        Preconditions.checkArgument(googleApiClient != null, "GoogleApiClient parameter is required.");
        f5u0 f5u0Var = (f5u0) googleApiClient.getClient(vrs0.f185519a);
        final AtomicReference atomicReference = new AtomicReference();
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        sni0 sni0Var = new sni0();
        try {
            f5u0Var.m124241l(new LastLocationRequest.Builder().build(), sni0Var);
            sni0Var.m186939a().addOnCompleteListener(new OnCompleteListener() { // from class: l.flr0
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    AtomicReference atomicReference2 = atomicReference;
                    CountDownLatch countDownLatch2 = countDownLatch;
                    if (task.mo15431p()) {
                        atomicReference2.set((Location) task.mo15427l());
                    }
                    countDownLatch2.countDown();
                }
            });
            try {
                long jNanoTime = 30000000000L;
                long jNanoTime2 = System.nanoTime() + 30000000000L;
                while (true) {
                    try {
                        try {
                            zAwait = countDownLatch.await(jNanoTime, TimeUnit.NANOSECONDS);
                            break;
                        } catch (Throwable th) {
                            th = th;
                            z = true;
                            if (z) {
                                Thread.currentThread().interrupt();
                            }
                            throw th;
                        }
                    } catch (InterruptedException unused) {
                        jNanoTime = jNanoTime2 - System.nanoTime();
                        z = true;
                    }
                }
                if (z) {
                    Thread.currentThread().interrupt();
                }
                if (zAwait) {
                    return (Location) atomicReference.get();
                }
                return null;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // com.google.android.gms.location.FusedLocationProviderApi
    @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public final LocationAvailability getLocationAvailability(GoogleApiClient googleApiClient) {
        Preconditions.checkArgument(googleApiClient != null, "GoogleApiClient parameter is required.");
        try {
            return ((f5u0) googleApiClient.getClient(vrs0.f185519a)).m124237h();
        } catch (RemoteException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.location.FusedLocationProviderApi
    public final PendingResult<Status> removeLocationUpdates(GoogleApiClient googleApiClient, PendingIntent pendingIntent) {
        return googleApiClient.execute(new rtr0(this, googleApiClient, pendingIntent));
    }

    @Override // com.google.android.gms.location.FusedLocationProviderApi
    @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public final PendingResult<Status> requestLocationUpdates(GoogleApiClient googleApiClient, LocationRequest locationRequest, LocationCallback locationCallback, Looper looper) {
        if (looper == null) {
            looper = Looper.myLooper();
            Preconditions.checkNotNull(looper, "invalid null looper");
        }
        return googleApiClient.execute(new lpr0(this, googleApiClient, ListenerHolders.createListenerHolder(locationCallback, looper, LocationCallback.class.getSimpleName()), locationRequest));
    }

    @Override // com.google.android.gms.location.FusedLocationProviderApi
    public final PendingResult<Status> setMockLocation(GoogleApiClient googleApiClient, Location location) {
        return googleApiClient.execute(new oxr0(this, googleApiClient, location));
    }

    @Override // com.google.android.gms.location.FusedLocationProviderApi
    public final PendingResult<Status> setMockMode(GoogleApiClient googleApiClient, boolean z) {
        return googleApiClient.execute(new dwr0(this, googleApiClient, z));
    }

    @Override // com.google.android.gms.location.FusedLocationProviderApi
    public final PendingResult<Status> removeLocationUpdates(GoogleApiClient googleApiClient, LocationCallback locationCallback) {
        return googleApiClient.execute(new zur0(this, googleApiClient, locationCallback));
    }

    @Override // com.google.android.gms.location.FusedLocationProviderApi
    public final PendingResult<Status> removeLocationUpdates(GoogleApiClient googleApiClient, LocationListener locationListener) {
        return googleApiClient.execute(new gsr0(this, googleApiClient, locationListener));
    }

    @Override // com.google.android.gms.location.FusedLocationProviderApi
    @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public final PendingResult<Status> requestLocationUpdates(GoogleApiClient googleApiClient, LocationRequest locationRequest, PendingIntent pendingIntent) {
        return googleApiClient.execute(new uqr0(this, googleApiClient, pendingIntent, locationRequest));
    }

    @Override // com.google.android.gms.location.FusedLocationProviderApi
    @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public final PendingResult<Status> requestLocationUpdates(GoogleApiClient googleApiClient, LocationRequest locationRequest, LocationListener locationListener) {
        Looper looperMyLooper = Looper.myLooper();
        Preconditions.checkNotNull(looperMyLooper, "invalid null looper");
        return googleApiClient.execute(new dor0(this, googleApiClient, ListenerHolders.createListenerHolder(locationListener, looperMyLooper, LocationListener.class.getSimpleName()), locationRequest));
    }

    @Override // com.google.android.gms.location.FusedLocationProviderApi
    @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public final PendingResult<Status> requestLocationUpdates(GoogleApiClient googleApiClient, LocationRequest locationRequest, LocationListener locationListener, Looper looper) {
        if (looper == null) {
            looper = Looper.myLooper();
            Preconditions.checkNotNull(looper, "invalid null looper");
        }
        return googleApiClient.execute(new dor0(this, googleApiClient, ListenerHolders.createListenerHolder(locationListener, looper, LocationListener.class.getSimpleName()), locationRequest));
    }
}
