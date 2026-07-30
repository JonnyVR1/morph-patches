package p149l;

import android.app.PendingIntent;
import android.content.Context;
import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.ConnectionCallbacks;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.common.api.internal.OnConnectionFailedListener;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.common.internal.ICancelToken;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.location.C2306a;
import com.google.android.gms.internal.location.zzdb;
import com.google.android.gms.internal.location.zzdd;
import com.google.android.gms.internal.location.zzdf;
import com.google.android.gms.location.CurrentLocationRequest;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.LastLocationRequest;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.zzm;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class zvt0 extends GmsClient {

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ int f205061d = 0;

    /* JADX INFO: renamed from: a */
    public final hgf0 f205062a;

    /* JADX INFO: renamed from: b */
    public final hgf0 f205063b;

    /* JADX INFO: renamed from: c */
    public final hgf0 f205064c;

    public zvt0(Context context, Looper looper, ClientSettings clientSettings, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 23, clientSettings, connectionCallbacks, onConnectionFailedListener);
        this.f205062a = new hgf0();
        this.f205063b = new hgf0();
        this.f205064c = new hgf0();
    }

    /* JADX INFO: renamed from: c */
    public final void m220468c(boolean z, sei0 sei0Var) throws RemoteException {
        if (m220472g(zzm.zzg)) {
            ((iby0) getService()).mo135285V6(z, new lbt0(this, null, sei0Var));
        } else {
            ((iby0) getService()).mo135291d6(z);
            sei0Var.m183659c(null);
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        return iInterfaceQueryLocalInterface instanceof iby0 ? (iby0) iInterfaceQueryLocalInterface : new r7y0(iBinder);
    }

    /* JADX INFO: renamed from: d */
    public final void m220469d(ListenerHolder.ListenerKey listenerKey, boolean z, sei0 sei0Var) throws RemoteException {
        synchronized (this.f205063b) {
            try {
                spt0 spt0Var = (spt0) this.f205063b.remove(listenerKey);
                if (spt0Var == null) {
                    sei0Var.m183659c(Boolean.FALSE);
                    return;
                }
                spt0Var.zzh();
                if (!z) {
                    sei0Var.m183659c(Boolean.TRUE);
                } else if (m220472g(zzm.zzj)) {
                    ((iby0) getService()).mo135287Z6(zzdb.m13766h(null, spt0Var, null, null), new lbt0(this, Boolean.TRUE, sei0Var));
                } else {
                    ((iby0) getService()).mo135282P6(new zzdf(2, null, null, spt0Var, null, new cet0(Boolean.TRUE, sei0Var), null));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m220470e(ListenerHolder.ListenerKey listenerKey, boolean z, sei0 sei0Var) throws RemoteException {
        synchronized (this.f205062a) {
            try {
                ott0 ott0Var = (ott0) this.f205062a.remove(listenerKey);
                if (ott0Var == null) {
                    sei0Var.m183659c(Boolean.FALSE);
                    return;
                }
                ott0Var.zzg();
                if (!z) {
                    sei0Var.m183659c(Boolean.TRUE);
                } else if (m220472g(zzm.zzj)) {
                    ((iby0) getService()).mo135287Z6(zzdb.m13767i(null, ott0Var, null, null), new lbt0(this, Boolean.TRUE, sei0Var));
                } else {
                    ((iby0) getService()).mo135282P6(new zzdf(2, null, ott0Var, null, null, new cet0(Boolean.TRUE, sei0Var), null));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m220471f(PendingIntent pendingIntent, sei0 sei0Var, Object obj) throws RemoteException {
        if (m220472g(zzm.zzj)) {
            ((iby0) getService()).mo135287Z6(zzdb.m13765g(pendingIntent, null, null), new lbt0(this, null, sei0Var));
        } else {
            ((iby0) getService()).mo135282P6(new zzdf(2, null, null, null, pendingIntent, new cet0(null, sei0Var), null));
        }
    }

    /* JADX INFO: renamed from: g */
    public final boolean m220472g(Feature feature) {
        Feature feature2;
        Feature[] availableFeatures = getAvailableFeatures();
        if (availableFeatures == null) {
            return false;
        }
        int length = availableFeatures.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                feature2 = null;
                break;
            }
            feature2 = availableFeatures[i];
            if (feature.getName().equals(feature2.getName())) {
                break;
            }
            i++;
        }
        return feature2 != null && feature2.getVersion() >= feature.getVersion();
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Feature[] getApiFeatures() {
        return zzm.zzl;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final int getMinApkVersion() {
        return 11717000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String getServiceDescriptor() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String getStartServiceAction() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    /* JADX INFO: renamed from: h */
    public final LocationAvailability m220473h() throws RemoteException {
        return ((iby0) getService()).mo135294i(getContext().getPackageName());
    }

    /* JADX INFO: renamed from: i */
    public final void m220474i(GeofencingRequest geofencingRequest, PendingIntent pendingIntent, sei0 sei0Var) throws RemoteException {
        Preconditions.checkNotNull(geofencingRequest, "geofencingRequest can't be null.");
        Preconditions.checkNotNull(pendingIntent, "PendingIntent must be specified.");
        ((iby0) getService()).mo135279H2(geofencingRequest, pendingIntent, new w7t0(sei0Var));
    }

    /* JADX INFO: renamed from: j */
    public final void m220475j(sei0 sei0Var) throws RemoteException {
        ((iby0) getService()).mo135295v7(new cet0(null, sei0Var));
    }

    /* JADX INFO: renamed from: k */
    public final void m220476k(CurrentLocationRequest currentLocationRequest, hf4 hf4Var, final sei0 sei0Var) throws RemoteException {
        getContext();
        if (m220472g(zzm.zze)) {
            final ICancelToken iCancelTokenMo135284S7 = ((iby0) getService()).mo135284S7(currentLocationRequest, new uct0(this, sei0Var));
            if (hf4Var != null) {
                hf4Var.mo130732b(new sg50() { // from class: l.x3t0
                    @Override // p149l.sg50
                    public final void onCanceled() {
                        ICancelToken iCancelToken = iCancelTokenMo135284S7;
                        int i = zvt0.f205061d;
                        try {
                            iCancelToken.cancel();
                        } catch (RemoteException unused) {
                        }
                    }
                });
                return;
            }
            return;
        }
        ListenerHolder listenerHolderCreateListenerHolder = ListenerHolders.createListenerHolder(new d9t0(this, sei0Var), C2306a.m13764a(), "GetCurrentLocation");
        final ListenerHolder.ListenerKey listenerKey = listenerHolderCreateListenerHolder.getListenerKey();
        listenerKey.getClass();
        kat0 kat0Var = new kat0(this, listenerHolderCreateListenerHolder, sei0Var);
        sei0 sei0Var2 = new sei0();
        LocationRequest.Builder builder = new LocationRequest.Builder(currentLocationRequest.getPriority(), 0L);
        builder.setMinUpdateIntervalMillis(0L);
        builder.setDurationMillis(currentLocationRequest.getDurationMillis());
        builder.setGranularity(currentLocationRequest.getGranularity());
        builder.setMaxUpdateAgeMillis(currentLocationRequest.getMaxUpdateAgeMillis());
        builder.zza(currentLocationRequest.zze());
        builder.zzc(currentLocationRequest.zza());
        builder.setWaitForAccurateLocation(true);
        builder.zzb(currentLocationRequest.zzd());
        builder.zzd(currentLocationRequest.zzb());
        m220478m(kat0Var, builder.build(), sei0Var2);
        sei0Var2.m183657a().addOnCompleteListener(new OnCompleteListener() { // from class: l.e5t0
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                sei0 sei0Var3 = sei0Var;
                int i = zvt0.f205061d;
                if (task.mo15377p()) {
                    return;
                }
                Exception excMo15372k = task.mo15372k();
                excMo15372k.getClass();
                sei0Var3.m183660d(excMo15372k);
            }
        });
        if (hf4Var != null) {
            hf4Var.mo130732b(new sg50() { // from class: l.n6t0
                @Override // p149l.sg50
                public final void onCanceled() {
                    try {
                        this.f137443a.m220469d(listenerKey, true, new sei0());
                    } catch (RemoteException unused) {
                    }
                }
            });
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m220477l(LastLocationRequest lastLocationRequest, sei0 sei0Var) throws RemoteException {
        getContext();
        if (m220472g(zzm.zzf)) {
            ((iby0) getService()).mo135289c6(lastLocationRequest, new uct0(this, sei0Var));
        } else {
            sei0Var.m183659c(((iby0) getService()).zzd());
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m220478m(okt0 okt0Var, LocationRequest locationRequest, sei0 sei0Var) throws RemoteException {
        spt0 spt0Var;
        ListenerHolder listenerHolderZza = okt0Var.zza();
        ListenerHolder.ListenerKey listenerKey = listenerHolderZza.getListenerKey();
        listenerKey.getClass();
        boolean zM220472g = m220472g(zzm.zzj);
        synchronized (this.f205063b) {
            try {
                spt0 spt0Var2 = (spt0) this.f205063b.get(listenerKey);
                if (spt0Var2 == null || zM220472g) {
                    spt0 spt0Var3 = new spt0(okt0Var);
                    this.f205063b.put(listenerKey, spt0Var3);
                    spt0Var = spt0Var3;
                } else {
                    spt0Var2.m185389P2(listenerHolderZza);
                    spt0Var = spt0Var2;
                    spt0Var2 = null;
                }
                getContext();
                String idString = listenerKey.toIdString();
                if (zM220472g) {
                    ((iby0) getService()).mo135293h2(zzdb.m13766h(spt0Var2, spt0Var, null, idString), locationRequest, new lbt0(this, null, sei0Var));
                } else {
                    iby0 iby0Var = (iby0) getService();
                    LocationRequest.Builder builder = new LocationRequest.Builder(locationRequest);
                    builder.zzb(null);
                    iby0Var.mo135282P6(new zzdf(1, zzdd.m13768g(null, builder.build()), null, spt0Var, null, new qgt0(sei0Var, spt0Var), idString));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m220479n(okt0 okt0Var, LocationRequest locationRequest, sei0 sei0Var) throws RemoteException {
        ott0 ott0Var;
        ListenerHolder listenerHolderZza = okt0Var.zza();
        ListenerHolder.ListenerKey listenerKey = listenerHolderZza.getListenerKey();
        listenerKey.getClass();
        boolean zM220472g = m220472g(zzm.zzj);
        synchronized (this.f205062a) {
            try {
                ott0 ott0Var2 = (ott0) this.f205062a.get(listenerKey);
                if (ott0Var2 == null || zM220472g) {
                    ott0 ott0Var3 = new ott0(okt0Var);
                    this.f205062a.put(listenerKey, ott0Var3);
                    ott0Var = ott0Var3;
                } else {
                    ott0Var2.m165971P2(listenerHolderZza);
                    ott0Var = ott0Var2;
                    ott0Var2 = null;
                }
                getContext();
                String idString = listenerKey.toIdString();
                if (zM220472g) {
                    ((iby0) getService()).mo135293h2(zzdb.m13767i(ott0Var2, ott0Var, null, idString), locationRequest, new lbt0(this, null, sei0Var));
                } else {
                    iby0 iby0Var = (iby0) getService();
                    LocationRequest.Builder builder = new LocationRequest.Builder(locationRequest);
                    builder.zzb(null);
                    iby0Var.mo135282P6(new zzdf(1, zzdd.m13768g(null, builder.build()), ott0Var, null, null, new kft0(sei0Var, ott0Var), idString));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m220480o(PendingIntent pendingIntent, LocationRequest locationRequest, sei0 sei0Var) throws RemoteException {
        getContext();
        if (m220472g(zzm.zzj)) {
            ((iby0) getService()).mo135293h2(zzdb.m13765g(pendingIntent, null, null), locationRequest, new lbt0(this, null, sei0Var));
            return;
        }
        iby0 iby0Var = (iby0) getService();
        LocationRequest.Builder builder = new LocationRequest.Builder(locationRequest);
        builder.zzb(null);
        iby0Var.mo135282P6(new zzdf(1, zzdd.m13768g(null, builder.build()), null, null, pendingIntent, new cet0(null, sei0Var), "PendingIntent@" + pendingIntent.hashCode()));
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final void onConnectionSuspended(int i) {
        super.onConnectionSuspended(i);
        synchronized (this.f205062a) {
            this.f205062a.clear();
        }
        synchronized (this.f205063b) {
            this.f205063b.clear();
        }
        synchronized (this.f205064c) {
            this.f205064c.clear();
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m220481p(PendingIntent pendingIntent, sei0 sei0Var) throws RemoteException {
        Preconditions.checkNotNull(pendingIntent, "PendingIntent must be specified.");
        ((iby0) getService()).mo135290d5(pendingIntent, new w7t0(sei0Var), getContext().getPackageName());
    }

    /* JADX INFO: renamed from: q */
    public final void m220482q(List list, sei0 sei0Var) throws RemoteException {
        Preconditions.checkArgument((list == null || list.isEmpty()) ? false : true, "geofenceRequestIds can't be null nor empty.");
        ((iby0) getService()).mo135283Q7((String[]) list.toArray(new String[0]), new w7t0(sei0Var), getContext().getPackageName());
    }

    /* JADX INFO: renamed from: r */
    public final void m220483r(Location location, sei0 sei0Var) throws RemoteException {
        if (m220472g(zzm.zzh)) {
            ((iby0) getService()).mo135278F5(location, new lbt0(this, null, sei0Var));
        } else {
            ((iby0) getService()).mo135277E4(location);
            sei0Var.m183659c(null);
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final boolean usesClientTelemetry() {
        return true;
    }
}
