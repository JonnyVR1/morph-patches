package p153l;

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
import com.google.android.gms.internal.location.C2329a;
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
public final class f5u0 extends GmsClient {

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ int f97340d = 0;

    /* JADX INFO: renamed from: a */
    public final oof0 f97341a;

    /* JADX INFO: renamed from: b */
    public final oof0 f97342b;

    /* JADX INFO: renamed from: c */
    public final oof0 f97343c;

    public f5u0(Context context, Looper looper, ClientSettings clientSettings, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 23, clientSettings, connectionCallbacks, onConnectionFailedListener);
        this.f97341a = new oof0();
        this.f97342b = new oof0();
        this.f97343c = new oof0();
    }

    /* JADX INFO: renamed from: c */
    public final void m124232c(boolean z, sni0 sni0Var) throws RemoteException {
        if (m124236g(zzm.zzg)) {
            ((oky0) getService()).mo168074V6(z, new rkt0(this, null, sni0Var));
        } else {
            ((oky0) getService()).mo168080d6(z);
            sni0Var.m186941c(null);
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        return iInterfaceQueryLocalInterface instanceof oky0 ? (oky0) iInterfaceQueryLocalInterface : new xgy0(iBinder);
    }

    /* JADX INFO: renamed from: d */
    public final void m124233d(ListenerHolder.ListenerKey listenerKey, boolean z, sni0 sni0Var) throws RemoteException {
        synchronized (this.f97342b) {
            try {
                yyt0 yyt0Var = (yyt0) this.f97342b.remove(listenerKey);
                if (yyt0Var == null) {
                    sni0Var.m186941c(Boolean.FALSE);
                    return;
                }
                yyt0Var.zzh();
                if (!z) {
                    sni0Var.m186941c(Boolean.TRUE);
                } else if (m124236g(zzm.zzj)) {
                    ((oky0) getService()).mo168076Z6(zzdb.m13820h(null, yyt0Var, null, null), new rkt0(this, Boolean.TRUE, sni0Var));
                } else {
                    ((oky0) getService()).mo168071P6(new zzdf(2, null, null, yyt0Var, null, new int0(Boolean.TRUE, sni0Var), null));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m124234e(ListenerHolder.ListenerKey listenerKey, boolean z, sni0 sni0Var) throws RemoteException {
        synchronized (this.f97341a) {
            try {
                u2u0 u2u0Var = (u2u0) this.f97341a.remove(listenerKey);
                if (u2u0Var == null) {
                    sni0Var.m186941c(Boolean.FALSE);
                    return;
                }
                u2u0Var.zzg();
                if (!z) {
                    sni0Var.m186941c(Boolean.TRUE);
                } else if (m124236g(zzm.zzj)) {
                    ((oky0) getService()).mo168076Z6(zzdb.m13821i(null, u2u0Var, null, null), new rkt0(this, Boolean.TRUE, sni0Var));
                } else {
                    ((oky0) getService()).mo168071P6(new zzdf(2, null, u2u0Var, null, null, new int0(Boolean.TRUE, sni0Var), null));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m124235f(PendingIntent pendingIntent, sni0 sni0Var, Object obj) throws RemoteException {
        if (m124236g(zzm.zzj)) {
            ((oky0) getService()).mo168076Z6(zzdb.m13819g(pendingIntent, null, null), new rkt0(this, null, sni0Var));
        } else {
            ((oky0) getService()).mo168071P6(new zzdf(2, null, null, null, pendingIntent, new int0(null, sni0Var), null));
        }
    }

    /* JADX INFO: renamed from: g */
    public final boolean m124236g(Feature feature) {
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
    public final LocationAvailability m124237h() throws RemoteException {
        return ((oky0) getService()).mo168083i(getContext().getPackageName());
    }

    /* JADX INFO: renamed from: i */
    public final void m124238i(GeofencingRequest geofencingRequest, PendingIntent pendingIntent, sni0 sni0Var) throws RemoteException {
        Preconditions.checkNotNull(geofencingRequest, "geofencingRequest can't be null.");
        Preconditions.checkNotNull(pendingIntent, "PendingIntent must be specified.");
        ((oky0) getService()).mo168068H2(geofencingRequest, pendingIntent, new cht0(sni0Var));
    }

    /* JADX INFO: renamed from: j */
    public final void m124239j(sni0 sni0Var) throws RemoteException {
        ((oky0) getService()).mo168084v7(new int0(null, sni0Var));
    }

    /* JADX INFO: renamed from: k */
    public final void m124240k(CurrentLocationRequest currentLocationRequest, gg4 gg4Var, final sni0 sni0Var) throws RemoteException {
        getContext();
        if (m124236g(zzm.zze)) {
            final ICancelToken iCancelTokenMo168073S7 = ((oky0) getService()).mo168073S7(currentLocationRequest, new amt0(this, sni0Var));
            if (gg4Var != null) {
                gg4Var.mo130139b(new yo50() { // from class: l.ddt0
                    @Override // p153l.yo50
                    public final void onCanceled() {
                        ICancelToken iCancelToken = iCancelTokenMo168073S7;
                        int i = f5u0.f97340d;
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
        ListenerHolder listenerHolderCreateListenerHolder = ListenerHolders.createListenerHolder(new jit0(this, sni0Var), C2329a.m13818a(), "GetCurrentLocation");
        final ListenerHolder.ListenerKey listenerKey = listenerHolderCreateListenerHolder.getListenerKey();
        listenerKey.getClass();
        qjt0 qjt0Var = new qjt0(this, listenerHolderCreateListenerHolder, sni0Var);
        sni0 sni0Var2 = new sni0();
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
        m124242m(qjt0Var, builder.build(), sni0Var2);
        sni0Var2.m186939a().addOnCompleteListener(new OnCompleteListener() { // from class: l.ket0
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                sni0 sni0Var3 = sni0Var;
                int i = f5u0.f97340d;
                if (task.mo15431p()) {
                    return;
                }
                Exception excMo15426k = task.mo15426k();
                excMo15426k.getClass();
                sni0Var3.m186942d(excMo15426k);
            }
        });
        if (gg4Var != null) {
            gg4Var.mo130139b(new yo50() { // from class: l.tft0
                @Override // p153l.yo50
                public final void onCanceled() {
                    try {
                        this.f174008a.m124233d(listenerKey, true, new sni0());
                    } catch (RemoteException unused) {
                    }
                }
            });
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m124241l(LastLocationRequest lastLocationRequest, sni0 sni0Var) throws RemoteException {
        getContext();
        if (m124236g(zzm.zzf)) {
            ((oky0) getService()).mo168078c6(lastLocationRequest, new amt0(this, sni0Var));
        } else {
            sni0Var.m186941c(((oky0) getService()).zzd());
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m124242m(utt0 utt0Var, LocationRequest locationRequest, sni0 sni0Var) throws RemoteException {
        yyt0 yyt0Var;
        ListenerHolder listenerHolderZza = utt0Var.zza();
        ListenerHolder.ListenerKey listenerKey = listenerHolderZza.getListenerKey();
        listenerKey.getClass();
        boolean zM124236g = m124236g(zzm.zzj);
        synchronized (this.f97342b) {
            try {
                yyt0 yyt0Var2 = (yyt0) this.f97342b.get(listenerKey);
                if (yyt0Var2 == null || zM124236g) {
                    yyt0 yyt0Var3 = new yyt0(utt0Var);
                    this.f97342b.put(listenerKey, yyt0Var3);
                    yyt0Var = yyt0Var3;
                } else {
                    yyt0Var2.m218007P2(listenerHolderZza);
                    yyt0Var = yyt0Var2;
                    yyt0Var2 = null;
                }
                getContext();
                String idString = listenerKey.toIdString();
                if (zM124236g) {
                    ((oky0) getService()).mo168082h2(zzdb.m13820h(yyt0Var2, yyt0Var, null, idString), locationRequest, new rkt0(this, null, sni0Var));
                } else {
                    oky0 oky0Var = (oky0) getService();
                    LocationRequest.Builder builder = new LocationRequest.Builder(locationRequest);
                    builder.zzb(null);
                    oky0Var.mo168071P6(new zzdf(1, zzdd.m13822g(null, builder.build()), null, yyt0Var, null, new wpt0(sni0Var, yyt0Var), idString));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m124243n(utt0 utt0Var, LocationRequest locationRequest, sni0 sni0Var) throws RemoteException {
        u2u0 u2u0Var;
        ListenerHolder listenerHolderZza = utt0Var.zza();
        ListenerHolder.ListenerKey listenerKey = listenerHolderZza.getListenerKey();
        listenerKey.getClass();
        boolean zM124236g = m124236g(zzm.zzj);
        synchronized (this.f97341a) {
            try {
                u2u0 u2u0Var2 = (u2u0) this.f97341a.get(listenerKey);
                if (u2u0Var2 == null || zM124236g) {
                    u2u0 u2u0Var3 = new u2u0(utt0Var);
                    this.f97341a.put(listenerKey, u2u0Var3);
                    u2u0Var = u2u0Var3;
                } else {
                    u2u0Var2.m194305P2(listenerHolderZza);
                    u2u0Var = u2u0Var2;
                    u2u0Var2 = null;
                }
                getContext();
                String idString = listenerKey.toIdString();
                if (zM124236g) {
                    ((oky0) getService()).mo168082h2(zzdb.m13821i(u2u0Var2, u2u0Var, null, idString), locationRequest, new rkt0(this, null, sni0Var));
                } else {
                    oky0 oky0Var = (oky0) getService();
                    LocationRequest.Builder builder = new LocationRequest.Builder(locationRequest);
                    builder.zzb(null);
                    oky0Var.mo168071P6(new zzdf(1, zzdd.m13822g(null, builder.build()), u2u0Var, null, null, new qot0(sni0Var, u2u0Var), idString));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m124244o(PendingIntent pendingIntent, LocationRequest locationRequest, sni0 sni0Var) throws RemoteException {
        getContext();
        if (m124236g(zzm.zzj)) {
            ((oky0) getService()).mo168082h2(zzdb.m13819g(pendingIntent, null, null), locationRequest, new rkt0(this, null, sni0Var));
            return;
        }
        oky0 oky0Var = (oky0) getService();
        LocationRequest.Builder builder = new LocationRequest.Builder(locationRequest);
        builder.zzb(null);
        oky0Var.mo168071P6(new zzdf(1, zzdd.m13822g(null, builder.build()), null, null, pendingIntent, new int0(null, sni0Var), "PendingIntent@" + pendingIntent.hashCode()));
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final void onConnectionSuspended(int i) {
        super.onConnectionSuspended(i);
        synchronized (this.f97341a) {
            this.f97341a.clear();
        }
        synchronized (this.f97342b) {
            this.f97342b.clear();
        }
        synchronized (this.f97343c) {
            this.f97343c.clear();
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m124245p(PendingIntent pendingIntent, sni0 sni0Var) throws RemoteException {
        Preconditions.checkNotNull(pendingIntent, "PendingIntent must be specified.");
        ((oky0) getService()).mo168079d5(pendingIntent, new cht0(sni0Var), getContext().getPackageName());
    }

    /* JADX INFO: renamed from: q */
    public final void m124246q(List list, sni0 sni0Var) throws RemoteException {
        Preconditions.checkArgument((list == null || list.isEmpty()) ? false : true, "geofenceRequestIds can't be null nor empty.");
        ((oky0) getService()).mo168072Q7((String[]) list.toArray(new String[0]), new cht0(sni0Var), getContext().getPackageName());
    }

    /* JADX INFO: renamed from: r */
    public final void m124247r(Location location, sni0 sni0Var) throws RemoteException {
        if (m124236g(zzm.zzh)) {
            ((oky0) getService()).mo168067F5(location, new rkt0(this, null, sni0Var));
        } else {
            ((oky0) getService()).mo168066E4(location);
            sni0Var.m186941c(null);
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final boolean usesClientTelemetry() {
        return true;
    }
}
