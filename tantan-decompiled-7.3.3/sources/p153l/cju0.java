package p153l;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzdw;

/* JADX INFO: loaded from: classes6.dex */
public final class cju0 extends jys0 implements pgu0 {
    public cju0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    @Override // p153l.pgu0
    public final void beginAdUnitExposure(String str, long j) throws RemoteException {
        Parcel parcelM147618O = m147618O();
        parcelM147618O.writeString(str);
        parcelM147618O.writeLong(j);
        m147620Y2(23, parcelM147618O);
    }

    @Override // p153l.pgu0
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException {
        Parcel parcelM147618O = m147618O();
        parcelM147618O.writeString(str);
        parcelM147618O.writeString(str2);
        z0t0.m218155d(parcelM147618O, bundle);
        m147620Y2(9, parcelM147618O);
    }

    @Override // p153l.pgu0
    public final void clearMeasurementEnabled(long j) throws RemoteException {
        Parcel parcelM147618O = m147618O();
        parcelM147618O.writeLong(j);
        m147620Y2(43, parcelM147618O);
    }

    @Override // p153l.pgu0
    public final void endAdUnitExposure(String str, long j) throws RemoteException {
        Parcel parcelM147618O = m147618O();
        parcelM147618O.writeString(str);
        parcelM147618O.writeLong(j);
        m147620Y2(24, parcelM147618O);
    }

    @Override // p153l.pgu0
    public final void generateEventId(wmu0 wmu0Var) throws RemoteException {
        Parcel parcelM147618O = m147618O();
        z0t0.m218154c(parcelM147618O, wmu0Var);
        m147620Y2(22, parcelM147618O);
    }

    @Override // p153l.pgu0
    public final void getAppInstanceId(wmu0 wmu0Var) throws RemoteException {
        Parcel parcelM147618O = m147618O();
        z0t0.m218154c(parcelM147618O, wmu0Var);
        m147620Y2(20, parcelM147618O);
    }

    @Override // p153l.pgu0
    public final void getCachedAppInstanceId(wmu0 wmu0Var) throws RemoteException {
        Parcel parcelM147618O = m147618O();
        z0t0.m218154c(parcelM147618O, wmu0Var);
        m147620Y2(19, parcelM147618O);
    }

    @Override // p153l.pgu0
    public final void getConditionalUserProperties(String str, String str2, wmu0 wmu0Var) throws RemoteException {
        Parcel parcelM147618O = m147618O();
        parcelM147618O.writeString(str);
        parcelM147618O.writeString(str2);
        z0t0.m218154c(parcelM147618O, wmu0Var);
        m147620Y2(10, parcelM147618O);
    }

    @Override // p153l.pgu0
    public final void getCurrentScreenClass(wmu0 wmu0Var) throws RemoteException {
        Parcel parcelM147618O = m147618O();
        z0t0.m218154c(parcelM147618O, wmu0Var);
        m147620Y2(17, parcelM147618O);
    }

    @Override // p153l.pgu0
    public final void getCurrentScreenName(wmu0 wmu0Var) throws RemoteException {
        Parcel parcelM147618O = m147618O();
        z0t0.m218154c(parcelM147618O, wmu0Var);
        m147620Y2(16, parcelM147618O);
    }

    @Override // p153l.pgu0
    public final void getGmpAppId(wmu0 wmu0Var) throws RemoteException {
        Parcel parcelM147618O = m147618O();
        z0t0.m218154c(parcelM147618O, wmu0Var);
        m147620Y2(21, parcelM147618O);
    }

    @Override // p153l.pgu0
    public final void getMaxUserProperties(String str, wmu0 wmu0Var) throws RemoteException {
        Parcel parcelM147618O = m147618O();
        parcelM147618O.writeString(str);
        z0t0.m218154c(parcelM147618O, wmu0Var);
        m147620Y2(6, parcelM147618O);
    }

    @Override // p153l.pgu0
    public final void getSessionId(wmu0 wmu0Var) throws RemoteException {
        Parcel parcelM147618O = m147618O();
        z0t0.m218154c(parcelM147618O, wmu0Var);
        m147620Y2(46, parcelM147618O);
    }

    @Override // p153l.pgu0
    public final void getTestFlag(wmu0 wmu0Var, int i) throws RemoteException {
        Parcel parcelM147618O = m147618O();
        z0t0.m218154c(parcelM147618O, wmu0Var);
        parcelM147618O.writeInt(i);
        m147620Y2(38, parcelM147618O);
    }

    @Override // p153l.pgu0
    public final void getUserProperties(String str, String str2, boolean z, wmu0 wmu0Var) throws RemoteException {
        Parcel parcelM147618O = m147618O();
        parcelM147618O.writeString(str);
        parcelM147618O.writeString(str2);
        z0t0.m218156e(parcelM147618O, z);
        z0t0.m218154c(parcelM147618O, wmu0Var);
        m147620Y2(5, parcelM147618O);
    }

    @Override // p153l.pgu0
    public final void initialize(p1m p1mVar, zzdw zzdwVar, long j) throws RemoteException {
        Parcel parcelM147618O = m147618O();
        z0t0.m218154c(parcelM147618O, p1mVar);
        z0t0.m218155d(parcelM147618O, zzdwVar);
        parcelM147618O.writeLong(j);
        m147620Y2(1, parcelM147618O);
    }

    @Override // p153l.pgu0
    public final void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) throws RemoteException {
        Parcel parcelM147618O = m147618O();
        parcelM147618O.writeString(str);
        parcelM147618O.writeString(str2);
        z0t0.m218155d(parcelM147618O, bundle);
        z0t0.m218156e(parcelM147618O, z);
        z0t0.m218156e(parcelM147618O, z2);
        parcelM147618O.writeLong(j);
        m147620Y2(2, parcelM147618O);
    }

    @Override // p153l.pgu0
    public final void logHealthData(int i, String str, p1m p1mVar, p1m p1mVar2, p1m p1mVar3) throws RemoteException {
        Parcel parcelM147618O = m147618O();
        parcelM147618O.writeInt(i);
        parcelM147618O.writeString(str);
        z0t0.m218154c(parcelM147618O, p1mVar);
        z0t0.m218154c(parcelM147618O, p1mVar2);
        z0t0.m218154c(parcelM147618O, p1mVar3);
        m147620Y2(33, parcelM147618O);
    }

    @Override // p153l.pgu0
    public final void onActivityCreated(p1m p1mVar, Bundle bundle, long j) throws RemoteException {
        Parcel parcelM147618O = m147618O();
        z0t0.m218154c(parcelM147618O, p1mVar);
        z0t0.m218155d(parcelM147618O, bundle);
        parcelM147618O.writeLong(j);
        m147620Y2(27, parcelM147618O);
    }

    @Override // p153l.pgu0
    public final void onActivityDestroyed(p1m p1mVar, long j) throws RemoteException {
        Parcel parcelM147618O = m147618O();
        z0t0.m218154c(parcelM147618O, p1mVar);
        parcelM147618O.writeLong(j);
        m147620Y2(28, parcelM147618O);
    }

    @Override // p153l.pgu0
    public final void onActivityPaused(p1m p1mVar, long j) throws RemoteException {
        Parcel parcelM147618O = m147618O();
        z0t0.m218154c(parcelM147618O, p1mVar);
        parcelM147618O.writeLong(j);
        m147620Y2(29, parcelM147618O);
    }

    @Override // p153l.pgu0
    public final void onActivityResumed(p1m p1mVar, long j) throws RemoteException {
        Parcel parcelM147618O = m147618O();
        z0t0.m218154c(parcelM147618O, p1mVar);
        parcelM147618O.writeLong(j);
        m147620Y2(30, parcelM147618O);
    }

    @Override // p153l.pgu0
    public final void onActivitySaveInstanceState(p1m p1mVar, wmu0 wmu0Var, long j) throws RemoteException {
        Parcel parcelM147618O = m147618O();
        z0t0.m218154c(parcelM147618O, p1mVar);
        z0t0.m218154c(parcelM147618O, wmu0Var);
        parcelM147618O.writeLong(j);
        m147620Y2(31, parcelM147618O);
    }

    @Override // p153l.pgu0
    public final void onActivityStarted(p1m p1mVar, long j) throws RemoteException {
        Parcel parcelM147618O = m147618O();
        z0t0.m218154c(parcelM147618O, p1mVar);
        parcelM147618O.writeLong(j);
        m147620Y2(25, parcelM147618O);
    }

    @Override // p153l.pgu0
    public final void onActivityStopped(p1m p1mVar, long j) throws RemoteException {
        Parcel parcelM147618O = m147618O();
        z0t0.m218154c(parcelM147618O, p1mVar);
        parcelM147618O.writeLong(j);
        m147620Y2(26, parcelM147618O);
    }

    @Override // p153l.pgu0
    public final void performAction(Bundle bundle, wmu0 wmu0Var, long j) throws RemoteException {
        Parcel parcelM147618O = m147618O();
        z0t0.m218155d(parcelM147618O, bundle);
        z0t0.m218154c(parcelM147618O, wmu0Var);
        parcelM147618O.writeLong(j);
        m147620Y2(32, parcelM147618O);
    }

    @Override // p153l.pgu0
    public final void registerOnMeasurementEventListener(cou0 cou0Var) throws RemoteException {
        Parcel parcelM147618O = m147618O();
        z0t0.m218154c(parcelM147618O, cou0Var);
        m147620Y2(35, parcelM147618O);
    }

    @Override // p153l.pgu0
    public final void resetAnalyticsData(long j) throws RemoteException {
        Parcel parcelM147618O = m147618O();
        parcelM147618O.writeLong(j);
        m147620Y2(12, parcelM147618O);
    }

    @Override // p153l.pgu0
    public final void setConditionalUserProperty(Bundle bundle, long j) throws RemoteException {
        Parcel parcelM147618O = m147618O();
        z0t0.m218155d(parcelM147618O, bundle);
        parcelM147618O.writeLong(j);
        m147620Y2(8, parcelM147618O);
    }

    @Override // p153l.pgu0
    public final void setConsent(Bundle bundle, long j) throws RemoteException {
        Parcel parcelM147618O = m147618O();
        z0t0.m218155d(parcelM147618O, bundle);
        parcelM147618O.writeLong(j);
        m147620Y2(44, parcelM147618O);
    }

    @Override // p153l.pgu0
    public final void setConsentThirdParty(Bundle bundle, long j) throws RemoteException {
        Parcel parcelM147618O = m147618O();
        z0t0.m218155d(parcelM147618O, bundle);
        parcelM147618O.writeLong(j);
        m147620Y2(45, parcelM147618O);
    }

    @Override // p153l.pgu0
    public final void setCurrentScreen(p1m p1mVar, String str, String str2, long j) throws RemoteException {
        Parcel parcelM147618O = m147618O();
        z0t0.m218154c(parcelM147618O, p1mVar);
        parcelM147618O.writeString(str);
        parcelM147618O.writeString(str2);
        parcelM147618O.writeLong(j);
        m147620Y2(15, parcelM147618O);
    }

    @Override // p153l.pgu0
    public final void setDataCollectionEnabled(boolean z) throws RemoteException {
        Parcel parcelM147618O = m147618O();
        z0t0.m218156e(parcelM147618O, z);
        m147620Y2(39, parcelM147618O);
    }

    @Override // p153l.pgu0
    public final void setDefaultEventParameters(Bundle bundle) throws RemoteException {
        Parcel parcelM147618O = m147618O();
        z0t0.m218155d(parcelM147618O, bundle);
        m147620Y2(42, parcelM147618O);
    }

    @Override // p153l.pgu0
    public final void setEventInterceptor(cou0 cou0Var) throws RemoteException {
        Parcel parcelM147618O = m147618O();
        z0t0.m218154c(parcelM147618O, cou0Var);
        m147620Y2(34, parcelM147618O);
    }

    @Override // p153l.pgu0
    public final void setMeasurementEnabled(boolean z, long j) throws RemoteException {
        Parcel parcelM147618O = m147618O();
        z0t0.m218156e(parcelM147618O, z);
        parcelM147618O.writeLong(j);
        m147620Y2(11, parcelM147618O);
    }

    @Override // p153l.pgu0
    public final void setSessionTimeoutDuration(long j) throws RemoteException {
        Parcel parcelM147618O = m147618O();
        parcelM147618O.writeLong(j);
        m147620Y2(14, parcelM147618O);
    }

    @Override // p153l.pgu0
    public final void setSgtmDebugInfo(Intent intent) throws RemoteException {
        Parcel parcelM147618O = m147618O();
        z0t0.m218155d(parcelM147618O, intent);
        m147620Y2(48, parcelM147618O);
    }

    @Override // p153l.pgu0
    public final void setUserId(String str, long j) throws RemoteException {
        Parcel parcelM147618O = m147618O();
        parcelM147618O.writeString(str);
        parcelM147618O.writeLong(j);
        m147620Y2(7, parcelM147618O);
    }

    @Override // p153l.pgu0
    public final void setUserProperty(String str, String str2, p1m p1mVar, boolean z, long j) throws RemoteException {
        Parcel parcelM147618O = m147618O();
        parcelM147618O.writeString(str);
        parcelM147618O.writeString(str2);
        z0t0.m218154c(parcelM147618O, p1mVar);
        z0t0.m218156e(parcelM147618O, z);
        parcelM147618O.writeLong(j);
        m147620Y2(4, parcelM147618O);
    }

    @Override // p153l.pgu0
    public final void unregisterOnMeasurementEventListener(cou0 cou0Var) throws RemoteException {
        Parcel parcelM147618O = m147618O();
        z0t0.m218154c(parcelM147618O, cou0Var);
        m147620Y2(36, parcelM147618O);
    }
}
