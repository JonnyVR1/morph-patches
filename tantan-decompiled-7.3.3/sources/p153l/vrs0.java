package p153l;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.location.Location;
import android.os.Looper;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.common.api.internal.RegistrationMethods;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.location.CurrentLocationRequest;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LastLocationRequest;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.zzm;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final class vrs0 extends GoogleApi implements FusedLocationProviderClient {

    /* JADX INFO: renamed from: a */
    public static final Api.ClientKey f185519a;

    /* JADX INFO: renamed from: b */
    public static final Api f185520b;

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        f185519a = clientKey;
        f185520b = new Api("LocationServices.API", new fos0(), clientKey);
    }

    public vrs0(Activity activity) {
        super(activity, (Api<Api.ApiOptions.NoOptions>) f185520b, Api.ApiOptions.NO_OPTIONS, GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    /* JADX INFO: renamed from: b */
    public final Task m202537b(final LocationRequest locationRequest, ListenerHolder listenerHolder) {
        final yqs0 yqs0Var = new yqs0(this, listenerHolder, new pps0() { // from class: l.v4s0
            @Override // p153l.pps0
            /* JADX INFO: renamed from: a */
            public final void mo171884a(f5u0 f5u0Var, ListenerHolder.ListenerKey listenerKey, boolean z, sni0 sni0Var) throws RemoteException {
                f5u0Var.m124233d(listenerKey, z, sni0Var);
            }
        });
        return doRegisterEventListener(RegistrationMethods.builder().register(new RemoteCall() { // from class: l.f6s0
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) throws RemoteException {
                Api.ClientKey clientKey = vrs0.f185519a;
                ((f5u0) obj).m124242m(yqs0Var, locationRequest, (sni0) obj2);
            }
        }).unregister(yqs0Var).withHolder(listenerHolder).setMethodKey(2436).build());
    }

    /* JADX INFO: renamed from: c */
    public final Task m202538c(final LocationRequest locationRequest, ListenerHolder listenerHolder) {
        final yqs0 yqs0Var = new yqs0(this, listenerHolder, new pps0() { // from class: l.pds0
            @Override // p153l.pps0
            /* JADX INFO: renamed from: a */
            public final void mo171884a(f5u0 f5u0Var, ListenerHolder.ListenerKey listenerKey, boolean z, sni0 sni0Var) throws RemoteException {
                f5u0Var.m124234e(listenerKey, z, sni0Var);
            }
        });
        return doRegisterEventListener(RegistrationMethods.builder().register(new RemoteCall() { // from class: l.kfs0
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) throws RemoteException {
                Api.ClientKey clientKey = vrs0.f185519a;
                ((f5u0) obj).m124243n(yqs0Var, locationRequest, (sni0) obj2);
            }
        }).unregister(yqs0Var).withHolder(listenerHolder).setMethodKey(2435).build());
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final Task<Void> flushLocations() {
        return doWrite(TaskApiCall.builder().run(new RemoteCall() { // from class: l.g2s0
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) throws RemoteException {
                ((f5u0) obj).m124239j((sni0) obj2);
            }
        }).setMethodKey(2422).build());
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final Task<Location> getCurrentLocation(int i, @Nullable gg4 gg4Var) {
        CurrentLocationRequest.Builder builder = new CurrentLocationRequest.Builder();
        builder.setPriority(i);
        CurrentLocationRequest currentLocationRequestBuild = builder.build();
        if (gg4Var != null) {
            Preconditions.checkArgument(!gg4Var.mo130138a(), "cancellationToken may not be already canceled");
        }
        Task<Location> taskDoRead = doRead(TaskApiCall.builder().run(new shs0(currentLocationRequestBuild, gg4Var)).setMethodKey(2415).build());
        if (gg4Var == null) {
            return taskDoRead;
        }
        sni0 sni0Var = new sni0(gg4Var);
        taskDoRead.mo15423h(new bjs0(sni0Var));
        return sni0Var.m186939a();
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final Task<Location> getLastLocation(final LastLocationRequest lastLocationRequest) {
        return doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: l.jks0
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) throws RemoteException {
                Api.ClientKey clientKey = vrs0.f185519a;
                ((f5u0) obj).m124241l(lastLocationRequest, (sni0) obj2);
            }
        }).setMethodKey(2414).setFeatures(zzm.zzf).build());
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final Task<LocationAvailability> getLocationAvailability() {
        return doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: l.eas0
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                Api.ClientKey clientKey = vrs0.f185519a;
                ((sni0) obj2).m186941c(((f5u0) obj).m124237h());
            }
        }).setMethodKey(2416).build());
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final Task<Void> removeLocationUpdates(final PendingIntent pendingIntent) {
        return doWrite(TaskApiCall.builder().run(new RemoteCall() { // from class: l.lgs0
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) throws RemoteException {
                Api.ClientKey clientKey = vrs0.f185519a;
                ((f5u0) obj).m124235f(pendingIntent, (sni0) obj2, null);
            }
        }).setMethodKey(2418).build());
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final Task<Void> requestLocationUpdates(final LocationRequest locationRequest, final PendingIntent pendingIntent) {
        return doWrite(TaskApiCall.builder().run(new RemoteCall() { // from class: l.k7s0
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) throws RemoteException {
                Api.ClientKey clientKey = vrs0.f185519a;
                ((f5u0) obj).m124244o(pendingIntent, locationRequest, (sni0) obj2);
            }
        }).setMethodKey(2417).build());
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final Task<Void> setMockLocation(final Location location) {
        Preconditions.checkArgument(location != null);
        return doWrite(TaskApiCall.builder().run(new RemoteCall() { // from class: l.n3s0
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) throws RemoteException {
                Api.ClientKey clientKey = vrs0.f185519a;
                ((f5u0) obj).m124247r(location, (sni0) obj2);
            }
        }).setMethodKey(2421).build());
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final Task<Void> setMockMode(final boolean z) {
        return doWrite(TaskApiCall.builder().run(new RemoteCall() { // from class: l.lbs0
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) throws RemoteException {
                Api.ClientKey clientKey = vrs0.f185519a;
                ((f5u0) obj).m124232c(z, (sni0) obj2);
            }
        }).setMethodKey(2420).build());
    }

    public vrs0(Context context) {
        super(context, (Api<Api.ApiOptions.NoOptions>) f185520b, Api.ApiOptions.NO_OPTIONS, GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final Task<Void> removeLocationUpdates(LocationCallback locationCallback) {
        return doUnregisterEventListener(ListenerHolders.createListenerKey(locationCallback, LocationCallback.class.getSimpleName()), 2418).mo15422g(pls0.f153090a, new s26() { // from class: l.scs0
            @Override // p153l.s26
            public final Object then(Task task) {
                Api.ClientKey clientKey = vrs0.f185519a;
                return null;
            }
        });
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final Task<Void> requestLocationUpdates(LocationRequest locationRequest, LocationCallback locationCallback, @Nullable Looper looper) {
        if (looper == null) {
            looper = Looper.myLooper();
            Preconditions.checkNotNull(looper, "invalid null looper");
        }
        return m202537b(locationRequest, ListenerHolders.createListenerHolder(locationCallback, looper, LocationCallback.class.getSimpleName()));
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final Task<Void> removeLocationUpdates(LocationListener locationListener) {
        return doUnregisterEventListener(ListenerHolders.createListenerKey(locationListener, LocationListener.class.getSimpleName()), 2418).mo15422g(pls0.f153090a, new s26() { // from class: l.zms0
            @Override // p153l.s26
            public final Object then(Task task) {
                Api.ClientKey clientKey = vrs0.f185519a;
                return null;
            }
        });
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final Task<Void> requestLocationUpdates(LocationRequest locationRequest, LocationListener locationListener, @Nullable Looper looper) {
        if (looper == null) {
            looper = Looper.myLooper();
            Preconditions.checkNotNull(looper, "invalid null looper");
        }
        return m202538c(locationRequest, ListenerHolders.createListenerHolder(locationListener, looper, LocationListener.class.getSimpleName()));
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final Task<Location> getLastLocation() {
        return doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: l.pes0
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) throws RemoteException {
                ((f5u0) obj).m124241l(new LastLocationRequest.Builder().build(), (sni0) obj2);
            }
        }).setMethodKey(2414).build());
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final Task<Void> requestLocationUpdates(LocationRequest locationRequest, Executor executor, LocationCallback locationCallback) {
        return m202537b(locationRequest, ListenerHolders.createListenerHolder(locationCallback, executor, LocationCallback.class.getSimpleName()));
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final Task<Void> requestLocationUpdates(LocationRequest locationRequest, Executor executor, LocationListener locationListener) {
        return m202538c(locationRequest, ListenerHolders.createListenerHolder(locationListener, executor, LocationListener.class.getSimpleName()));
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final Task<Location> getCurrentLocation(CurrentLocationRequest currentLocationRequest, @Nullable gg4 gg4Var) {
        if (gg4Var != null) {
            Preconditions.checkArgument(!gg4Var.mo130138a(), "cancellationToken may not be already canceled");
        }
        Task<Location> taskDoRead = doRead(TaskApiCall.builder().run(new shs0(currentLocationRequest, gg4Var)).setMethodKey(2415).build());
        if (gg4Var == null) {
            return taskDoRead;
        }
        sni0 sni0Var = new sni0(gg4Var);
        taskDoRead.mo15423h(new bjs0(sni0Var));
        return sni0Var.m186939a();
    }
}
