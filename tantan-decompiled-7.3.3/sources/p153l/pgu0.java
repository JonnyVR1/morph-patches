package p153l;

import android.content.Intent;
import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzdw;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public interface pgu0 extends IInterface {
    void beginAdUnitExposure(String str, long j) throws RemoteException;

    void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException;

    void clearMeasurementEnabled(long j) throws RemoteException;

    void endAdUnitExposure(String str, long j) throws RemoteException;

    void generateEventId(wmu0 wmu0Var) throws RemoteException;

    void getAppInstanceId(wmu0 wmu0Var) throws RemoteException;

    void getCachedAppInstanceId(wmu0 wmu0Var) throws RemoteException;

    void getConditionalUserProperties(String str, String str2, wmu0 wmu0Var) throws RemoteException;

    void getCurrentScreenClass(wmu0 wmu0Var) throws RemoteException;

    void getCurrentScreenName(wmu0 wmu0Var) throws RemoteException;

    void getGmpAppId(wmu0 wmu0Var) throws RemoteException;

    void getMaxUserProperties(String str, wmu0 wmu0Var) throws RemoteException;

    void getSessionId(wmu0 wmu0Var) throws RemoteException;

    void getTestFlag(wmu0 wmu0Var, int i) throws RemoteException;

    void getUserProperties(String str, String str2, boolean z, wmu0 wmu0Var) throws RemoteException;

    void initForTests(Map map) throws RemoteException;

    void initialize(p1m p1mVar, zzdw zzdwVar, long j) throws RemoteException;

    void isDataCollectionEnabled(wmu0 wmu0Var) throws RemoteException;

    void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) throws RemoteException;

    void logEventAndBundle(String str, String str2, Bundle bundle, wmu0 wmu0Var, long j) throws RemoteException;

    void logHealthData(int i, String str, p1m p1mVar, p1m p1mVar2, p1m p1mVar3) throws RemoteException;

    void onActivityCreated(p1m p1mVar, Bundle bundle, long j) throws RemoteException;

    void onActivityDestroyed(p1m p1mVar, long j) throws RemoteException;

    void onActivityPaused(p1m p1mVar, long j) throws RemoteException;

    void onActivityResumed(p1m p1mVar, long j) throws RemoteException;

    void onActivitySaveInstanceState(p1m p1mVar, wmu0 wmu0Var, long j) throws RemoteException;

    void onActivityStarted(p1m p1mVar, long j) throws RemoteException;

    void onActivityStopped(p1m p1mVar, long j) throws RemoteException;

    void performAction(Bundle bundle, wmu0 wmu0Var, long j) throws RemoteException;

    void registerOnMeasurementEventListener(cou0 cou0Var) throws RemoteException;

    void resetAnalyticsData(long j) throws RemoteException;

    void setConditionalUserProperty(Bundle bundle, long j) throws RemoteException;

    void setConsent(Bundle bundle, long j) throws RemoteException;

    void setConsentThirdParty(Bundle bundle, long j) throws RemoteException;

    void setCurrentScreen(p1m p1mVar, String str, String str2, long j) throws RemoteException;

    void setDataCollectionEnabled(boolean z) throws RemoteException;

    void setDefaultEventParameters(Bundle bundle) throws RemoteException;

    void setEventInterceptor(cou0 cou0Var) throws RemoteException;

    void setInstanceIdProvider(buu0 buu0Var) throws RemoteException;

    void setMeasurementEnabled(boolean z, long j) throws RemoteException;

    void setMinimumSessionDuration(long j) throws RemoteException;

    void setSessionTimeoutDuration(long j) throws RemoteException;

    void setSgtmDebugInfo(Intent intent) throws RemoteException;

    void setUserId(String str, long j) throws RemoteException;

    void setUserProperty(String str, String str2, p1m p1mVar, boolean z, long j) throws RemoteException;

    void unregisterOnMeasurementEventListener(cou0 cou0Var) throws RemoteException;
}
