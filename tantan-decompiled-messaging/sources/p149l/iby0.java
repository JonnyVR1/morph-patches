package p149l;

import android.app.PendingIntent;
import android.location.Location;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.common.internal.ICancelToken;
import com.google.android.gms.internal.location.zzdb;
import com.google.android.gms.internal.location.zzdf;
import com.google.android.gms.location.ActivityTransitionRequest;
import com.google.android.gms.location.CurrentLocationRequest;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.LastLocationRequest;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.SleepSegmentRequest;
import com.google.android.gms.location.zzb;

/* JADX INFO: loaded from: classes6.dex */
public interface iby0 extends IInterface {
    /* JADX INFO: renamed from: B5 */
    void mo135276B5(long j, boolean z, PendingIntent pendingIntent) throws RemoteException;

    @Deprecated
    /* JADX INFO: renamed from: E4 */
    void mo135277E4(Location location) throws RemoteException;

    /* JADX INFO: renamed from: F5 */
    void mo135278F5(Location location, IStatusCallback iStatusCallback) throws RemoteException;

    /* JADX INFO: renamed from: H2 */
    void mo135279H2(GeofencingRequest geofencingRequest, PendingIntent pendingIntent, h4y0 h4y0Var) throws RemoteException;

    /* JADX INFO: renamed from: N3 */
    void mo135280N3(ActivityTransitionRequest activityTransitionRequest, PendingIntent pendingIntent, IStatusCallback iStatusCallback) throws RemoteException;

    /* JADX INFO: renamed from: P0 */
    void mo135281P0(PendingIntent pendingIntent, SleepSegmentRequest sleepSegmentRequest, IStatusCallback iStatusCallback) throws RemoteException;

    @Deprecated
    /* JADX INFO: renamed from: P6 */
    void mo135282P6(zzdf zzdfVar) throws RemoteException;

    /* JADX INFO: renamed from: Q7 */
    void mo135283Q7(String[] strArr, h4y0 h4y0Var, String str) throws RemoteException;

    @Deprecated
    /* JADX INFO: renamed from: S7 */
    ICancelToken mo135284S7(CurrentLocationRequest currentLocationRequest, lhy0 lhy0Var) throws RemoteException;

    /* JADX INFO: renamed from: V6 */
    void mo135285V6(boolean z, IStatusCallback iStatusCallback) throws RemoteException;

    /* JADX INFO: renamed from: X2 */
    void mo135286X2(LocationSettingsRequest locationSettingsRequest, ply0 ply0Var, String str) throws RemoteException;

    /* JADX INFO: renamed from: Z6 */
    void mo135287Z6(zzdb zzdbVar, IStatusCallback iStatusCallback) throws RemoteException;

    /* JADX INFO: renamed from: c2 */
    void mo135288c2(PendingIntent pendingIntent, IStatusCallback iStatusCallback) throws RemoteException;

    @Deprecated
    /* JADX INFO: renamed from: c6 */
    void mo135289c6(LastLocationRequest lastLocationRequest, lhy0 lhy0Var) throws RemoteException;

    /* JADX INFO: renamed from: d5 */
    void mo135290d5(PendingIntent pendingIntent, h4y0 h4y0Var, String str) throws RemoteException;

    @Deprecated
    /* JADX INFO: renamed from: d6 */
    void mo135291d6(boolean z) throws RemoteException;

    /* JADX INFO: renamed from: f1 */
    void mo135292f1(PendingIntent pendingIntent, IStatusCallback iStatusCallback) throws RemoteException;

    /* JADX INFO: renamed from: h2 */
    void mo135293h2(zzdb zzdbVar, LocationRequest locationRequest, IStatusCallback iStatusCallback) throws RemoteException;

    @Deprecated
    /* JADX INFO: renamed from: i */
    LocationAvailability mo135294i(String str) throws RemoteException;

    /* JADX INFO: renamed from: v7 */
    void mo135295v7(bux0 bux0Var) throws RemoteException;

    /* JADX INFO: renamed from: x3 */
    void mo135296x3(PendingIntent pendingIntent) throws RemoteException;

    /* JADX INFO: renamed from: z2 */
    void mo135297z2(zzb zzbVar, PendingIntent pendingIntent, IStatusCallback iStatusCallback) throws RemoteException;

    @Deprecated
    Location zzd() throws RemoteException;
}
