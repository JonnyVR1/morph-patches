package p153l;

import android.app.PendingIntent;
import android.location.Location;
import android.os.IBinder;
import android.os.Parcel;
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
public final class xgy0 extends n9r0 implements oky0 {
    public xgy0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService");
    }

    @Override // p153l.oky0
    /* JADX INFO: renamed from: B5 */
    public final void mo168065B5(long j, boolean z, PendingIntent pendingIntent) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeLong(j);
        x5t0.m209432c(parcelZza, true);
        x5t0.m209433d(parcelZza, pendingIntent);
        zzc(5, parcelZza);
    }

    @Override // p153l.oky0
    /* JADX INFO: renamed from: E4 */
    public final void mo168066E4(Location location) throws RemoteException {
        Parcel parcelZza = zza();
        x5t0.m209433d(parcelZza, location);
        zzc(13, parcelZza);
    }

    @Override // p153l.oky0
    /* JADX INFO: renamed from: F5 */
    public final void mo168067F5(Location location, IStatusCallback iStatusCallback) throws RemoteException {
        Parcel parcelZza = zza();
        x5t0.m209433d(parcelZza, location);
        x5t0.m209434e(parcelZza, iStatusCallback);
        zzc(85, parcelZza);
    }

    @Override // p153l.oky0
    /* JADX INFO: renamed from: H2 */
    public final void mo168068H2(GeofencingRequest geofencingRequest, PendingIntent pendingIntent, ndy0 ndy0Var) throws RemoteException {
        Parcel parcelZza = zza();
        x5t0.m209433d(parcelZza, geofencingRequest);
        x5t0.m209433d(parcelZza, pendingIntent);
        x5t0.m209434e(parcelZza, ndy0Var);
        zzc(57, parcelZza);
    }

    @Override // p153l.oky0
    /* JADX INFO: renamed from: N3 */
    public final void mo168069N3(ActivityTransitionRequest activityTransitionRequest, PendingIntent pendingIntent, IStatusCallback iStatusCallback) throws RemoteException {
        Parcel parcelZza = zza();
        x5t0.m209433d(parcelZza, activityTransitionRequest);
        x5t0.m209433d(parcelZza, pendingIntent);
        x5t0.m209434e(parcelZza, iStatusCallback);
        zzc(72, parcelZza);
    }

    @Override // p153l.oky0
    /* JADX INFO: renamed from: P0 */
    public final void mo168070P0(PendingIntent pendingIntent, SleepSegmentRequest sleepSegmentRequest, IStatusCallback iStatusCallback) throws RemoteException {
        Parcel parcelZza = zza();
        x5t0.m209433d(parcelZza, pendingIntent);
        x5t0.m209433d(parcelZza, sleepSegmentRequest);
        x5t0.m209434e(parcelZza, iStatusCallback);
        zzc(79, parcelZza);
    }

    @Override // p153l.oky0
    /* JADX INFO: renamed from: P6 */
    public final void mo168071P6(zzdf zzdfVar) throws RemoteException {
        Parcel parcelZza = zza();
        x5t0.m209433d(parcelZza, zzdfVar);
        zzc(59, parcelZza);
    }

    @Override // p153l.oky0
    /* JADX INFO: renamed from: Q7 */
    public final void mo168072Q7(String[] strArr, ndy0 ndy0Var, String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeStringArray(strArr);
        x5t0.m209434e(parcelZza, ndy0Var);
        parcelZza.writeString(str);
        zzc(3, parcelZza);
    }

    @Override // p153l.oky0
    /* JADX INFO: renamed from: S7 */
    public final ICancelToken mo168073S7(CurrentLocationRequest currentLocationRequest, rqy0 rqy0Var) throws RemoteException {
        Parcel parcelZza = zza();
        x5t0.m209433d(parcelZza, currentLocationRequest);
        x5t0.m209434e(parcelZza, rqy0Var);
        Parcel parcelZzb = zzb(87, parcelZza);
        ICancelToken iCancelTokenAsInterface = ICancelToken.Stub.asInterface(parcelZzb.readStrongBinder());
        parcelZzb.recycle();
        return iCancelTokenAsInterface;
    }

    @Override // p153l.oky0
    /* JADX INFO: renamed from: V6 */
    public final void mo168074V6(boolean z, IStatusCallback iStatusCallback) throws RemoteException {
        Parcel parcelZza = zza();
        x5t0.m209432c(parcelZza, z);
        x5t0.m209434e(parcelZza, iStatusCallback);
        zzc(84, parcelZza);
    }

    @Override // p153l.oky0
    /* JADX INFO: renamed from: X2 */
    public final void mo168075X2(LocationSettingsRequest locationSettingsRequest, vuy0 vuy0Var, String str) throws RemoteException {
        Parcel parcelZza = zza();
        x5t0.m209433d(parcelZza, locationSettingsRequest);
        x5t0.m209434e(parcelZza, vuy0Var);
        parcelZza.writeString(null);
        zzc(63, parcelZza);
    }

    @Override // p153l.oky0
    /* JADX INFO: renamed from: Z6 */
    public final void mo168076Z6(zzdb zzdbVar, IStatusCallback iStatusCallback) throws RemoteException {
        Parcel parcelZza = zza();
        x5t0.m209433d(parcelZza, zzdbVar);
        x5t0.m209434e(parcelZza, iStatusCallback);
        zzc(89, parcelZza);
    }

    @Override // p153l.oky0
    /* JADX INFO: renamed from: c2 */
    public final void mo168077c2(PendingIntent pendingIntent, IStatusCallback iStatusCallback) throws RemoteException {
        Parcel parcelZza = zza();
        x5t0.m209433d(parcelZza, pendingIntent);
        x5t0.m209434e(parcelZza, iStatusCallback);
        zzc(69, parcelZza);
    }

    @Override // p153l.oky0
    /* JADX INFO: renamed from: c6 */
    public final void mo168078c6(LastLocationRequest lastLocationRequest, rqy0 rqy0Var) throws RemoteException {
        Parcel parcelZza = zza();
        x5t0.m209433d(parcelZza, lastLocationRequest);
        x5t0.m209434e(parcelZza, rqy0Var);
        zzc(82, parcelZza);
    }

    @Override // p153l.oky0
    /* JADX INFO: renamed from: d5 */
    public final void mo168079d5(PendingIntent pendingIntent, ndy0 ndy0Var, String str) throws RemoteException {
        Parcel parcelZza = zza();
        x5t0.m209433d(parcelZza, pendingIntent);
        x5t0.m209434e(parcelZza, ndy0Var);
        parcelZza.writeString(str);
        zzc(2, parcelZza);
    }

    @Override // p153l.oky0
    /* JADX INFO: renamed from: d6 */
    public final void mo168080d6(boolean z) throws RemoteException {
        Parcel parcelZza = zza();
        x5t0.m209432c(parcelZza, z);
        zzc(12, parcelZza);
    }

    @Override // p153l.oky0
    /* JADX INFO: renamed from: f1 */
    public final void mo168081f1(PendingIntent pendingIntent, IStatusCallback iStatusCallback) throws RemoteException {
        Parcel parcelZza = zza();
        x5t0.m209433d(parcelZza, pendingIntent);
        x5t0.m209434e(parcelZza, iStatusCallback);
        zzc(73, parcelZza);
    }

    @Override // p153l.oky0
    /* JADX INFO: renamed from: h2 */
    public final void mo168082h2(zzdb zzdbVar, LocationRequest locationRequest, IStatusCallback iStatusCallback) throws RemoteException {
        Parcel parcelZza = zza();
        x5t0.m209433d(parcelZza, zzdbVar);
        x5t0.m209433d(parcelZza, locationRequest);
        x5t0.m209434e(parcelZza, iStatusCallback);
        zzc(88, parcelZza);
    }

    @Override // p153l.oky0
    /* JADX INFO: renamed from: i */
    public final LocationAvailability mo168083i(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzb = zzb(34, parcelZza);
        LocationAvailability locationAvailability = (LocationAvailability) x5t0.m209430a(parcelZzb, LocationAvailability.CREATOR);
        parcelZzb.recycle();
        return locationAvailability;
    }

    @Override // p153l.oky0
    /* JADX INFO: renamed from: v7 */
    public final void mo168084v7(h3y0 h3y0Var) throws RemoteException {
        Parcel parcelZza = zza();
        x5t0.m209434e(parcelZza, h3y0Var);
        zzc(67, parcelZza);
    }

    @Override // p153l.oky0
    /* JADX INFO: renamed from: x3 */
    public final void mo168085x3(PendingIntent pendingIntent) throws RemoteException {
        Parcel parcelZza = zza();
        x5t0.m209433d(parcelZza, pendingIntent);
        zzc(6, parcelZza);
    }

    @Override // p153l.oky0
    /* JADX INFO: renamed from: z2 */
    public final void mo168086z2(zzb zzbVar, PendingIntent pendingIntent, IStatusCallback iStatusCallback) throws RemoteException {
        Parcel parcelZza = zza();
        x5t0.m209433d(parcelZza, zzbVar);
        x5t0.m209433d(parcelZza, pendingIntent);
        x5t0.m209434e(parcelZza, iStatusCallback);
        zzc(70, parcelZza);
    }

    @Override // p153l.oky0
    public final Location zzd() throws RemoteException {
        Parcel parcelZzb = zzb(7, zza());
        Location location = (Location) x5t0.m209430a(parcelZzb, Location.CREATOR);
        parcelZzb.recycle();
        return location;
    }
}
