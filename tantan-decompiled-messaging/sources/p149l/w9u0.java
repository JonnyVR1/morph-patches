package p149l;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzdw;

/* JADX INFO: loaded from: classes6.dex */
public final class w9u0 extends dps0 implements j7u0 {
    public w9u0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    @Override // p149l.j7u0
    public final void beginAdUnitExposure(String str, long j) throws RemoteException {
        Parcel parcelM112927O = m112927O();
        parcelM112927O.writeString(str);
        parcelM112927O.writeLong(j);
        m112929Y2(23, parcelM112927O);
    }

    @Override // p149l.j7u0
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException {
        Parcel parcelM112927O = m112927O();
        parcelM112927O.writeString(str);
        parcelM112927O.writeString(str2);
        trs0.m190431d(parcelM112927O, bundle);
        m112929Y2(9, parcelM112927O);
    }

    @Override // p149l.j7u0
    public final void clearMeasurementEnabled(long j) throws RemoteException {
        Parcel parcelM112927O = m112927O();
        parcelM112927O.writeLong(j);
        m112929Y2(43, parcelM112927O);
    }

    @Override // p149l.j7u0
    public final void endAdUnitExposure(String str, long j) throws RemoteException {
        Parcel parcelM112927O = m112927O();
        parcelM112927O.writeString(str);
        parcelM112927O.writeLong(j);
        m112929Y2(24, parcelM112927O);
    }

    @Override // p149l.j7u0
    public final void generateEventId(qdu0 qdu0Var) throws RemoteException {
        Parcel parcelM112927O = m112927O();
        trs0.m190430c(parcelM112927O, qdu0Var);
        m112929Y2(22, parcelM112927O);
    }

    @Override // p149l.j7u0
    public final void getAppInstanceId(qdu0 qdu0Var) throws RemoteException {
        Parcel parcelM112927O = m112927O();
        trs0.m190430c(parcelM112927O, qdu0Var);
        m112929Y2(20, parcelM112927O);
    }

    @Override // p149l.j7u0
    public final void getCachedAppInstanceId(qdu0 qdu0Var) throws RemoteException {
        Parcel parcelM112927O = m112927O();
        trs0.m190430c(parcelM112927O, qdu0Var);
        m112929Y2(19, parcelM112927O);
    }

    @Override // p149l.j7u0
    public final void getConditionalUserProperties(String str, String str2, qdu0 qdu0Var) throws RemoteException {
        Parcel parcelM112927O = m112927O();
        parcelM112927O.writeString(str);
        parcelM112927O.writeString(str2);
        trs0.m190430c(parcelM112927O, qdu0Var);
        m112929Y2(10, parcelM112927O);
    }

    @Override // p149l.j7u0
    public final void getCurrentScreenClass(qdu0 qdu0Var) throws RemoteException {
        Parcel parcelM112927O = m112927O();
        trs0.m190430c(parcelM112927O, qdu0Var);
        m112929Y2(17, parcelM112927O);
    }

    @Override // p149l.j7u0
    public final void getCurrentScreenName(qdu0 qdu0Var) throws RemoteException {
        Parcel parcelM112927O = m112927O();
        trs0.m190430c(parcelM112927O, qdu0Var);
        m112929Y2(16, parcelM112927O);
    }

    @Override // p149l.j7u0
    public final void getGmpAppId(qdu0 qdu0Var) throws RemoteException {
        Parcel parcelM112927O = m112927O();
        trs0.m190430c(parcelM112927O, qdu0Var);
        m112929Y2(21, parcelM112927O);
    }

    @Override // p149l.j7u0
    public final void getMaxUserProperties(String str, qdu0 qdu0Var) throws RemoteException {
        Parcel parcelM112927O = m112927O();
        parcelM112927O.writeString(str);
        trs0.m190430c(parcelM112927O, qdu0Var);
        m112929Y2(6, parcelM112927O);
    }

    @Override // p149l.j7u0
    public final void getSessionId(qdu0 qdu0Var) throws RemoteException {
        Parcel parcelM112927O = m112927O();
        trs0.m190430c(parcelM112927O, qdu0Var);
        m112929Y2(46, parcelM112927O);
    }

    @Override // p149l.j7u0
    public final void getTestFlag(qdu0 qdu0Var, int i) throws RemoteException {
        Parcel parcelM112927O = m112927O();
        trs0.m190430c(parcelM112927O, qdu0Var);
        parcelM112927O.writeInt(i);
        m112929Y2(38, parcelM112927O);
    }

    @Override // p149l.j7u0
    public final void getUserProperties(String str, String str2, boolean z, qdu0 qdu0Var) throws RemoteException {
        Parcel parcelM112927O = m112927O();
        parcelM112927O.writeString(str);
        parcelM112927O.writeString(str2);
        trs0.m190432e(parcelM112927O, z);
        trs0.m190430c(parcelM112927O, qdu0Var);
        m112929Y2(5, parcelM112927O);
    }

    @Override // p149l.j7u0
    public final void initialize(uyl uylVar, zzdw zzdwVar, long j) throws RemoteException {
        Parcel parcelM112927O = m112927O();
        trs0.m190430c(parcelM112927O, uylVar);
        trs0.m190431d(parcelM112927O, zzdwVar);
        parcelM112927O.writeLong(j);
        m112929Y2(1, parcelM112927O);
    }

    @Override // p149l.j7u0
    public final void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) throws RemoteException {
        Parcel parcelM112927O = m112927O();
        parcelM112927O.writeString(str);
        parcelM112927O.writeString(str2);
        trs0.m190431d(parcelM112927O, bundle);
        trs0.m190432e(parcelM112927O, z);
        trs0.m190432e(parcelM112927O, z2);
        parcelM112927O.writeLong(j);
        m112929Y2(2, parcelM112927O);
    }

    @Override // p149l.j7u0
    public final void logHealthData(int i, String str, uyl uylVar, uyl uylVar2, uyl uylVar3) throws RemoteException {
        Parcel parcelM112927O = m112927O();
        parcelM112927O.writeInt(i);
        parcelM112927O.writeString(str);
        trs0.m190430c(parcelM112927O, uylVar);
        trs0.m190430c(parcelM112927O, uylVar2);
        trs0.m190430c(parcelM112927O, uylVar3);
        m112929Y2(33, parcelM112927O);
    }

    @Override // p149l.j7u0
    public final void onActivityCreated(uyl uylVar, Bundle bundle, long j) throws RemoteException {
        Parcel parcelM112927O = m112927O();
        trs0.m190430c(parcelM112927O, uylVar);
        trs0.m190431d(parcelM112927O, bundle);
        parcelM112927O.writeLong(j);
        m112929Y2(27, parcelM112927O);
    }

    @Override // p149l.j7u0
    public final void onActivityDestroyed(uyl uylVar, long j) throws RemoteException {
        Parcel parcelM112927O = m112927O();
        trs0.m190430c(parcelM112927O, uylVar);
        parcelM112927O.writeLong(j);
        m112929Y2(28, parcelM112927O);
    }

    @Override // p149l.j7u0
    public final void onActivityPaused(uyl uylVar, long j) throws RemoteException {
        Parcel parcelM112927O = m112927O();
        trs0.m190430c(parcelM112927O, uylVar);
        parcelM112927O.writeLong(j);
        m112929Y2(29, parcelM112927O);
    }

    @Override // p149l.j7u0
    public final void onActivityResumed(uyl uylVar, long j) throws RemoteException {
        Parcel parcelM112927O = m112927O();
        trs0.m190430c(parcelM112927O, uylVar);
        parcelM112927O.writeLong(j);
        m112929Y2(30, parcelM112927O);
    }

    @Override // p149l.j7u0
    public final void onActivitySaveInstanceState(uyl uylVar, qdu0 qdu0Var, long j) throws RemoteException {
        Parcel parcelM112927O = m112927O();
        trs0.m190430c(parcelM112927O, uylVar);
        trs0.m190430c(parcelM112927O, qdu0Var);
        parcelM112927O.writeLong(j);
        m112929Y2(31, parcelM112927O);
    }

    @Override // p149l.j7u0
    public final void onActivityStarted(uyl uylVar, long j) throws RemoteException {
        Parcel parcelM112927O = m112927O();
        trs0.m190430c(parcelM112927O, uylVar);
        parcelM112927O.writeLong(j);
        m112929Y2(25, parcelM112927O);
    }

    @Override // p149l.j7u0
    public final void onActivityStopped(uyl uylVar, long j) throws RemoteException {
        Parcel parcelM112927O = m112927O();
        trs0.m190430c(parcelM112927O, uylVar);
        parcelM112927O.writeLong(j);
        m112929Y2(26, parcelM112927O);
    }

    @Override // p149l.j7u0
    public final void performAction(Bundle bundle, qdu0 qdu0Var, long j) throws RemoteException {
        Parcel parcelM112927O = m112927O();
        trs0.m190431d(parcelM112927O, bundle);
        trs0.m190430c(parcelM112927O, qdu0Var);
        parcelM112927O.writeLong(j);
        m112929Y2(32, parcelM112927O);
    }

    @Override // p149l.j7u0
    public final void registerOnMeasurementEventListener(weu0 weu0Var) throws RemoteException {
        Parcel parcelM112927O = m112927O();
        trs0.m190430c(parcelM112927O, weu0Var);
        m112929Y2(35, parcelM112927O);
    }

    @Override // p149l.j7u0
    public final void resetAnalyticsData(long j) throws RemoteException {
        Parcel parcelM112927O = m112927O();
        parcelM112927O.writeLong(j);
        m112929Y2(12, parcelM112927O);
    }

    @Override // p149l.j7u0
    public final void setConditionalUserProperty(Bundle bundle, long j) throws RemoteException {
        Parcel parcelM112927O = m112927O();
        trs0.m190431d(parcelM112927O, bundle);
        parcelM112927O.writeLong(j);
        m112929Y2(8, parcelM112927O);
    }

    @Override // p149l.j7u0
    public final void setConsent(Bundle bundle, long j) throws RemoteException {
        Parcel parcelM112927O = m112927O();
        trs0.m190431d(parcelM112927O, bundle);
        parcelM112927O.writeLong(j);
        m112929Y2(44, parcelM112927O);
    }

    @Override // p149l.j7u0
    public final void setConsentThirdParty(Bundle bundle, long j) throws RemoteException {
        Parcel parcelM112927O = m112927O();
        trs0.m190431d(parcelM112927O, bundle);
        parcelM112927O.writeLong(j);
        m112929Y2(45, parcelM112927O);
    }

    @Override // p149l.j7u0
    public final void setCurrentScreen(uyl uylVar, String str, String str2, long j) throws RemoteException {
        Parcel parcelM112927O = m112927O();
        trs0.m190430c(parcelM112927O, uylVar);
        parcelM112927O.writeString(str);
        parcelM112927O.writeString(str2);
        parcelM112927O.writeLong(j);
        m112929Y2(15, parcelM112927O);
    }

    @Override // p149l.j7u0
    public final void setDataCollectionEnabled(boolean z) throws RemoteException {
        Parcel parcelM112927O = m112927O();
        trs0.m190432e(parcelM112927O, z);
        m112929Y2(39, parcelM112927O);
    }

    @Override // p149l.j7u0
    public final void setDefaultEventParameters(Bundle bundle) throws RemoteException {
        Parcel parcelM112927O = m112927O();
        trs0.m190431d(parcelM112927O, bundle);
        m112929Y2(42, parcelM112927O);
    }

    @Override // p149l.j7u0
    public final void setEventInterceptor(weu0 weu0Var) throws RemoteException {
        Parcel parcelM112927O = m112927O();
        trs0.m190430c(parcelM112927O, weu0Var);
        m112929Y2(34, parcelM112927O);
    }

    @Override // p149l.j7u0
    public final void setMeasurementEnabled(boolean z, long j) throws RemoteException {
        Parcel parcelM112927O = m112927O();
        trs0.m190432e(parcelM112927O, z);
        parcelM112927O.writeLong(j);
        m112929Y2(11, parcelM112927O);
    }

    @Override // p149l.j7u0
    public final void setSessionTimeoutDuration(long j) throws RemoteException {
        Parcel parcelM112927O = m112927O();
        parcelM112927O.writeLong(j);
        m112929Y2(14, parcelM112927O);
    }

    @Override // p149l.j7u0
    public final void setSgtmDebugInfo(Intent intent) throws RemoteException {
        Parcel parcelM112927O = m112927O();
        trs0.m190431d(parcelM112927O, intent);
        m112929Y2(48, parcelM112927O);
    }

    @Override // p149l.j7u0
    public final void setUserId(String str, long j) throws RemoteException {
        Parcel parcelM112927O = m112927O();
        parcelM112927O.writeString(str);
        parcelM112927O.writeLong(j);
        m112929Y2(7, parcelM112927O);
    }

    @Override // p149l.j7u0
    public final void setUserProperty(String str, String str2, uyl uylVar, boolean z, long j) throws RemoteException {
        Parcel parcelM112927O = m112927O();
        parcelM112927O.writeString(str);
        parcelM112927O.writeString(str2);
        trs0.m190430c(parcelM112927O, uylVar);
        trs0.m190432e(parcelM112927O, z);
        parcelM112927O.writeLong(j);
        m112929Y2(4, parcelM112927O);
    }

    @Override // p149l.j7u0
    public final void unregisterOnMeasurementEventListener(weu0 weu0Var) throws RemoteException {
        Parcel parcelM112927O = m112927O();
        trs0.m190430c(parcelM112927O, weu0Var);
        m112929Y2(36, parcelM112927O);
    }
}
