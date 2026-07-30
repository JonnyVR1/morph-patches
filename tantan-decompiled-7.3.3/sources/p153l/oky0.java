package p153l;

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
public interface oky0 extends IInterface {
    /* JADX INFO: renamed from: B5 */
    void mo168065B5(long j, boolean z, PendingIntent pendingIntent) throws RemoteException;

    @Deprecated
    /* JADX INFO: renamed from: E4 */
    void mo168066E4(Location location) throws RemoteException;

    /* JADX INFO: renamed from: F5 */
    void mo168067F5(Location location, IStatusCallback iStatusCallback) throws RemoteException;

    /* JADX INFO: renamed from: H2 */
    void mo168068H2(GeofencingRequest geofencingRequest, PendingIntent pendingIntent, ndy0 ndy0Var) throws RemoteException;

    /* JADX INFO: renamed from: N3 */
    void mo168069N3(ActivityTransitionRequest activityTransitionRequest, PendingIntent pendingIntent, IStatusCallback iStatusCallback) throws RemoteException;

    /* JADX INFO: renamed from: P0 */
    void mo168070P0(PendingIntent pendingIntent, SleepSegmentRequest sleepSegmentRequest, IStatusCallback iStatusCallback) throws RemoteException;

    @Deprecated
    /* JADX INFO: renamed from: P6 */
    void mo168071P6(zzdf zzdfVar) throws RemoteException;

    /* JADX INFO: renamed from: Q7 */
    void mo168072Q7(String[] strArr, ndy0 ndy0Var, String str) throws RemoteException;

    @Deprecated
    /* JADX INFO: renamed from: S7 */
    ICancelToken mo168073S7(CurrentLocationRequest currentLocationRequest, rqy0 rqy0Var) throws RemoteException;

    /* JADX INFO: renamed from: V6 */
    void mo168074V6(boolean z, IStatusCallback iStatusCallback) throws RemoteException;

    /* JADX INFO: renamed from: X2 */
    void mo168075X2(LocationSettingsRequest locationSettingsRequest, vuy0 vuy0Var, String str) throws RemoteException;

    /* JADX INFO: renamed from: Z6 */
    void mo168076Z6(zzdb zzdbVar, IStatusCallback iStatusCallback) throws RemoteException;

    /* JADX INFO: renamed from: c2 */
    void mo168077c2(PendingIntent pendingIntent, IStatusCallback iStatusCallback) throws RemoteException;

    @Deprecated
    /* JADX INFO: renamed from: c6 */
    void mo168078c6(LastLocationRequest lastLocationRequest, rqy0 rqy0Var) throws RemoteException;

    /* JADX INFO: renamed from: d5 */
    void mo168079d5(PendingIntent pendingIntent, ndy0 ndy0Var, String str) throws RemoteException;

    @Deprecated
    /* JADX INFO: renamed from: d6 */
    void mo168080d6(boolean z) throws RemoteException;

    /* JADX INFO: renamed from: f1 */
    void mo168081f1(PendingIntent pendingIntent, IStatusCallback iStatusCallback) throws RemoteException;

    /* JADX INFO: renamed from: h2 */
    void mo168082h2(zzdb zzdbVar, LocationRequest locationRequest, IStatusCallback iStatusCallback) throws RemoteException;

    @Deprecated
    /* JADX INFO: renamed from: i */
    LocationAvailability mo168083i(String str) throws RemoteException;

    /* JADX INFO: renamed from: v7 */
    void mo168084v7(h3y0 h3y0Var) throws RemoteException;

    /* JADX INFO: renamed from: x3 */
    void mo168085x3(PendingIntent pendingIntent) throws RemoteException;

    /* JADX INFO: renamed from: z2 */
    void mo168086z2(zzb zzbVar, PendingIntent pendingIntent, IStatusCallback iStatusCallback) throws RemoteException;

    @Deprecated
    Location zzd() throws RemoteException;
}
