package p149l;

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
public final class r7y0 extends h0r0 implements iby0 {
    public r7y0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService");
    }

    @Override // p149l.iby0
    /* JADX INFO: renamed from: B5 */
    public final void mo135276B5(long j, boolean z, PendingIntent pendingIntent) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeLong(j);
        rws0.m181448c(parcelZza, true);
        rws0.m181449d(parcelZza, pendingIntent);
        zzc(5, parcelZza);
    }

    @Override // p149l.iby0
    /* JADX INFO: renamed from: E4 */
    public final void mo135277E4(Location location) throws RemoteException {
        Parcel parcelZza = zza();
        rws0.m181449d(parcelZza, location);
        zzc(13, parcelZza);
    }

    @Override // p149l.iby0
    /* JADX INFO: renamed from: F5 */
    public final void mo135278F5(Location location, IStatusCallback iStatusCallback) throws RemoteException {
        Parcel parcelZza = zza();
        rws0.m181449d(parcelZza, location);
        rws0.m181450e(parcelZza, iStatusCallback);
        zzc(85, parcelZza);
    }

    @Override // p149l.iby0
    /* JADX INFO: renamed from: H2 */
    public final void mo135279H2(GeofencingRequest geofencingRequest, PendingIntent pendingIntent, h4y0 h4y0Var) throws RemoteException {
        Parcel parcelZza = zza();
        rws0.m181449d(parcelZza, geofencingRequest);
        rws0.m181449d(parcelZza, pendingIntent);
        rws0.m181450e(parcelZza, h4y0Var);
        zzc(57, parcelZza);
    }

    @Override // p149l.iby0
    /* JADX INFO: renamed from: N3 */
    public final void mo135280N3(ActivityTransitionRequest activityTransitionRequest, PendingIntent pendingIntent, IStatusCallback iStatusCallback) throws RemoteException {
        Parcel parcelZza = zza();
        rws0.m181449d(parcelZza, activityTransitionRequest);
        rws0.m181449d(parcelZza, pendingIntent);
        rws0.m181450e(parcelZza, iStatusCallback);
        zzc(72, parcelZza);
    }

    @Override // p149l.iby0
    /* JADX INFO: renamed from: P0 */
    public final void mo135281P0(PendingIntent pendingIntent, SleepSegmentRequest sleepSegmentRequest, IStatusCallback iStatusCallback) throws RemoteException {
        Parcel parcelZza = zza();
        rws0.m181449d(parcelZza, pendingIntent);
        rws0.m181449d(parcelZza, sleepSegmentRequest);
        rws0.m181450e(parcelZza, iStatusCallback);
        zzc(79, parcelZza);
    }

    @Override // p149l.iby0
    /* JADX INFO: renamed from: P6 */
    public final void mo135282P6(zzdf zzdfVar) throws RemoteException {
        Parcel parcelZza = zza();
        rws0.m181449d(parcelZza, zzdfVar);
        zzc(59, parcelZza);
    }

    @Override // p149l.iby0
    /* JADX INFO: renamed from: Q7 */
    public final void mo135283Q7(String[] strArr, h4y0 h4y0Var, String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeStringArray(strArr);
        rws0.m181450e(parcelZza, h4y0Var);
        parcelZza.writeString(str);
        zzc(3, parcelZza);
    }

    @Override // p149l.iby0
    /* JADX INFO: renamed from: S7 */
    public final ICancelToken mo135284S7(CurrentLocationRequest currentLocationRequest, lhy0 lhy0Var) throws RemoteException {
        Parcel parcelZza = zza();
        rws0.m181449d(parcelZza, currentLocationRequest);
        rws0.m181450e(parcelZza, lhy0Var);
        Parcel parcelZzb = zzb(87, parcelZza);
        ICancelToken iCancelTokenAsInterface = ICancelToken.Stub.asInterface(parcelZzb.readStrongBinder());
        parcelZzb.recycle();
        return iCancelTokenAsInterface;
    }

    @Override // p149l.iby0
    /* JADX INFO: renamed from: V6 */
    public final void mo135285V6(boolean z, IStatusCallback iStatusCallback) throws RemoteException {
        Parcel parcelZza = zza();
        rws0.m181448c(parcelZza, z);
        rws0.m181450e(parcelZza, iStatusCallback);
        zzc(84, parcelZza);
    }

    @Override // p149l.iby0
    /* JADX INFO: renamed from: X2 */
    public final void mo135286X2(LocationSettingsRequest locationSettingsRequest, ply0 ply0Var, String str) throws RemoteException {
        Parcel parcelZza = zza();
        rws0.m181449d(parcelZza, locationSettingsRequest);
        rws0.m181450e(parcelZza, ply0Var);
        parcelZza.writeString(null);
        zzc(63, parcelZza);
    }

    @Override // p149l.iby0
    /* JADX INFO: renamed from: Z6 */
    public final void mo135287Z6(zzdb zzdbVar, IStatusCallback iStatusCallback) throws RemoteException {
        Parcel parcelZza = zza();
        rws0.m181449d(parcelZza, zzdbVar);
        rws0.m181450e(parcelZza, iStatusCallback);
        zzc(89, parcelZza);
    }

    @Override // p149l.iby0
    /* JADX INFO: renamed from: c2 */
    public final void mo135288c2(PendingIntent pendingIntent, IStatusCallback iStatusCallback) throws RemoteException {
        Parcel parcelZza = zza();
        rws0.m181449d(parcelZza, pendingIntent);
        rws0.m181450e(parcelZza, iStatusCallback);
        zzc(69, parcelZza);
    }

    @Override // p149l.iby0
    /* JADX INFO: renamed from: c6 */
    public final void mo135289c6(LastLocationRequest lastLocationRequest, lhy0 lhy0Var) throws RemoteException {
        Parcel parcelZza = zza();
        rws0.m181449d(parcelZza, lastLocationRequest);
        rws0.m181450e(parcelZza, lhy0Var);
        zzc(82, parcelZza);
    }

    @Override // p149l.iby0
    /* JADX INFO: renamed from: d5 */
    public final void mo135290d5(PendingIntent pendingIntent, h4y0 h4y0Var, String str) throws RemoteException {
        Parcel parcelZza = zza();
        rws0.m181449d(parcelZza, pendingIntent);
        rws0.m181450e(parcelZza, h4y0Var);
        parcelZza.writeString(str);
        zzc(2, parcelZza);
    }

    @Override // p149l.iby0
    /* JADX INFO: renamed from: d6 */
    public final void mo135291d6(boolean z) throws RemoteException {
        Parcel parcelZza = zza();
        rws0.m181448c(parcelZza, z);
        zzc(12, parcelZza);
    }

    @Override // p149l.iby0
    /* JADX INFO: renamed from: f1 */
    public final void mo135292f1(PendingIntent pendingIntent, IStatusCallback iStatusCallback) throws RemoteException {
        Parcel parcelZza = zza();
        rws0.m181449d(parcelZza, pendingIntent);
        rws0.m181450e(parcelZza, iStatusCallback);
        zzc(73, parcelZza);
    }

    @Override // p149l.iby0
    /* JADX INFO: renamed from: h2 */
    public final void mo135293h2(zzdb zzdbVar, LocationRequest locationRequest, IStatusCallback iStatusCallback) throws RemoteException {
        Parcel parcelZza = zza();
        rws0.m181449d(parcelZza, zzdbVar);
        rws0.m181449d(parcelZza, locationRequest);
        rws0.m181450e(parcelZza, iStatusCallback);
        zzc(88, parcelZza);
    }

    @Override // p149l.iby0
    /* JADX INFO: renamed from: i */
    public final LocationAvailability mo135294i(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzb = zzb(34, parcelZza);
        LocationAvailability locationAvailability = (LocationAvailability) rws0.m181446a(parcelZzb, LocationAvailability.CREATOR);
        parcelZzb.recycle();
        return locationAvailability;
    }

    @Override // p149l.iby0
    /* JADX INFO: renamed from: v7 */
    public final void mo135295v7(bux0 bux0Var) throws RemoteException {
        Parcel parcelZza = zza();
        rws0.m181450e(parcelZza, bux0Var);
        zzc(67, parcelZza);
    }

    @Override // p149l.iby0
    /* JADX INFO: renamed from: x3 */
    public final void mo135296x3(PendingIntent pendingIntent) throws RemoteException {
        Parcel parcelZza = zza();
        rws0.m181449d(parcelZza, pendingIntent);
        zzc(6, parcelZza);
    }

    @Override // p149l.iby0
    /* JADX INFO: renamed from: z2 */
    public final void mo135297z2(zzb zzbVar, PendingIntent pendingIntent, IStatusCallback iStatusCallback) throws RemoteException {
        Parcel parcelZza = zza();
        rws0.m181449d(parcelZza, zzbVar);
        rws0.m181449d(parcelZza, pendingIntent);
        rws0.m181450e(parcelZza, iStatusCallback);
        zzc(70, parcelZza);
    }

    @Override // p149l.iby0
    public final Location zzd() throws RemoteException {
        Parcel parcelZzb = zzb(7, zza());
        Location location = (Location) rws0.m181446a(parcelZzb, Location.CREATOR);
        parcelZzb.recycle();
        return location;
    }
}
