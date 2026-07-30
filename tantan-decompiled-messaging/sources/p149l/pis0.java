package p149l;

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
public final class pis0 extends GoogleApi implements FusedLocationProviderClient {

    /* JADX INFO: renamed from: a */
    public static final Api.ClientKey f149684a;

    /* JADX INFO: renamed from: b */
    public static final Api f149685b;

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        f149684a = clientKey;
        f149685b = new Api("LocationServices.API", new zes0(), clientKey);
    }

    public pis0(Activity activity) {
        super(activity, (Api<Api.ApiOptions.NoOptions>) f149685b, Api.ApiOptions.NO_OPTIONS, GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    /* JADX INFO: renamed from: b */
    public final Task m169762b(final LocationRequest locationRequest, ListenerHolder listenerHolder) {
        final shs0 shs0Var = new shs0(this, listenerHolder, new jgs0() { // from class: l.pvr0
            @Override // p149l.jgs0
            /* JADX INFO: renamed from: a */
            public final void mo139777a(zvt0 zvt0Var, ListenerHolder.ListenerKey listenerKey, boolean z, sei0 sei0Var) throws RemoteException {
                zvt0Var.m220469d(listenerKey, z, sei0Var);
            }
        });
        return doRegisterEventListener(RegistrationMethods.builder().register(new RemoteCall() { // from class: l.zwr0
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) throws RemoteException {
                Api.ClientKey clientKey = pis0.f149684a;
                ((zvt0) obj).m220478m(shs0Var, locationRequest, (sei0) obj2);
            }
        }).unregister(shs0Var).withHolder(listenerHolder).setMethodKey(2436).build());
    }

    /* JADX INFO: renamed from: c */
    public final Task m169763c(final LocationRequest locationRequest, ListenerHolder listenerHolder) {
        final shs0 shs0Var = new shs0(this, listenerHolder, new jgs0() { // from class: l.j4s0
            @Override // p149l.jgs0
            /* JADX INFO: renamed from: a */
            public final void mo139777a(zvt0 zvt0Var, ListenerHolder.ListenerKey listenerKey, boolean z, sei0 sei0Var) throws RemoteException {
                zvt0Var.m220470e(listenerKey, z, sei0Var);
            }
        });
        return doRegisterEventListener(RegistrationMethods.builder().register(new RemoteCall() { // from class: l.e6s0
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) throws RemoteException {
                Api.ClientKey clientKey = pis0.f149684a;
                ((zvt0) obj).m220479n(shs0Var, locationRequest, (sei0) obj2);
            }
        }).unregister(shs0Var).withHolder(listenerHolder).setMethodKey(2435).build());
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final Task<Void> flushLocations() {
        return doWrite(TaskApiCall.builder().run(new RemoteCall() { // from class: l.atr0
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) throws RemoteException {
                ((zvt0) obj).m220475j((sei0) obj2);
            }
        }).setMethodKey(2422).build());
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final Task<Location> getCurrentLocation(int i, @Nullable hf4 hf4Var) {
        CurrentLocationRequest.Builder builder = new CurrentLocationRequest.Builder();
        builder.setPriority(i);
        CurrentLocationRequest currentLocationRequestBuild = builder.build();
        if (hf4Var != null) {
            Preconditions.checkArgument(!hf4Var.mo130731a(), "cancellationToken may not be already canceled");
        }
        Task<Location> taskDoRead = doRead(TaskApiCall.builder().run(new m8s0(currentLocationRequestBuild, hf4Var)).setMethodKey(2415).build());
        if (hf4Var == null) {
            return taskDoRead;
        }
        sei0 sei0Var = new sei0(hf4Var);
        taskDoRead.mo15369h(new v9s0(sei0Var));
        return sei0Var.m183657a();
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final Task<Location> getLastLocation(final LastLocationRequest lastLocationRequest) {
        return doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: l.dbs0
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) throws RemoteException {
                Api.ClientKey clientKey = pis0.f149684a;
                ((zvt0) obj).m220477l(lastLocationRequest, (sei0) obj2);
            }
        }).setMethodKey(2414).setFeatures(zzm.zzf).build());
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final Task<LocationAvailability> getLocationAvailability() {
        return doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: l.y0s0
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                Api.ClientKey clientKey = pis0.f149684a;
                ((sei0) obj2).m183659c(((zvt0) obj).m220473h());
            }
        }).setMethodKey(2416).build());
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final Task<Void> removeLocationUpdates(final PendingIntent pendingIntent) {
        return doWrite(TaskApiCall.builder().run(new RemoteCall() { // from class: l.f7s0
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) throws RemoteException {
                Api.ClientKey clientKey = pis0.f149684a;
                ((zvt0) obj).m220471f(pendingIntent, (sei0) obj2, null);
            }
        }).setMethodKey(2418).build());
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final Task<Void> requestLocationUpdates(final LocationRequest locationRequest, final PendingIntent pendingIntent) {
        return doWrite(TaskApiCall.builder().run(new RemoteCall() { // from class: l.eyr0
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) throws RemoteException {
                Api.ClientKey clientKey = pis0.f149684a;
                ((zvt0) obj).m220480o(pendingIntent, locationRequest, (sei0) obj2);
            }
        }).setMethodKey(2417).build());
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final Task<Void> setMockLocation(final Location location) {
        Preconditions.checkArgument(location != null);
        return doWrite(TaskApiCall.builder().run(new RemoteCall() { // from class: l.hur0
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) throws RemoteException {
                Api.ClientKey clientKey = pis0.f149684a;
                ((zvt0) obj).m220483r(location, (sei0) obj2);
            }
        }).setMethodKey(2421).build());
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final Task<Void> setMockMode(final boolean z) {
        return doWrite(TaskApiCall.builder().run(new RemoteCall() { // from class: l.f2s0
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) throws RemoteException {
                Api.ClientKey clientKey = pis0.f149684a;
                ((zvt0) obj).m220468c(z, (sei0) obj2);
            }
        }).setMethodKey(2420).build());
    }

    public pis0(Context context) {
        super(context, (Api<Api.ApiOptions.NoOptions>) f149685b, Api.ApiOptions.NO_OPTIONS, GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final Task<Void> removeLocationUpdates(LocationCallback locationCallback) {
        return doUnregisterEventListener(ListenerHolders.createListenerKey(locationCallback, LocationCallback.class.getSimpleName()), 2418).mo15368g(jcs0.f117344a, new n16() { // from class: l.m3s0
            @Override // p149l.n16
            public final Object then(Task task) {
                Api.ClientKey clientKey = pis0.f149684a;
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
        return m169762b(locationRequest, ListenerHolders.createListenerHolder(locationCallback, looper, LocationCallback.class.getSimpleName()));
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final Task<Void> removeLocationUpdates(LocationListener locationListener) {
        return doUnregisterEventListener(ListenerHolders.createListenerKey(locationListener, LocationListener.class.getSimpleName()), 2418).mo15368g(jcs0.f117344a, new n16() { // from class: l.tds0
            @Override // p149l.n16
            public final Object then(Task task) {
                Api.ClientKey clientKey = pis0.f149684a;
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
        return m169763c(locationRequest, ListenerHolders.createListenerHolder(locationListener, looper, LocationListener.class.getSimpleName()));
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final Task<Location> getLastLocation() {
        return doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: l.j5s0
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) throws RemoteException {
                ((zvt0) obj).m220477l(new LastLocationRequest.Builder().build(), (sei0) obj2);
            }
        }).setMethodKey(2414).build());
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final Task<Void> requestLocationUpdates(LocationRequest locationRequest, Executor executor, LocationCallback locationCallback) {
        return m169762b(locationRequest, ListenerHolders.createListenerHolder(locationCallback, executor, LocationCallback.class.getSimpleName()));
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final Task<Void> requestLocationUpdates(LocationRequest locationRequest, Executor executor, LocationListener locationListener) {
        return m169763c(locationRequest, ListenerHolders.createListenerHolder(locationListener, executor, LocationListener.class.getSimpleName()));
    }

    @Override // com.google.android.gms.location.FusedLocationProviderClient
    public final Task<Location> getCurrentLocation(CurrentLocationRequest currentLocationRequest, @Nullable hf4 hf4Var) {
        if (hf4Var != null) {
            Preconditions.checkArgument(!hf4Var.mo130731a(), "cancellationToken may not be already canceled");
        }
        Task<Location> taskDoRead = doRead(TaskApiCall.builder().run(new m8s0(currentLocationRequest, hf4Var)).setMethodKey(2415).build());
        if (hf4Var == null) {
            return taskDoRead;
        }
        sei0 sei0Var = new sei0(hf4Var);
        taskDoRead.mo15369h(new v9s0(sei0Var));
        return sei0Var.m183657a();
    }
}
