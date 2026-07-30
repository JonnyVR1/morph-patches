package p149l;

import android.content.Intent;
import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzdw;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public interface j7u0 extends IInterface {
    void beginAdUnitExposure(String str, long j) throws RemoteException;

    void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException;

    void clearMeasurementEnabled(long j) throws RemoteException;

    void endAdUnitExposure(String str, long j) throws RemoteException;

    void generateEventId(qdu0 qdu0Var) throws RemoteException;

    void getAppInstanceId(qdu0 qdu0Var) throws RemoteException;

    void getCachedAppInstanceId(qdu0 qdu0Var) throws RemoteException;

    void getConditionalUserProperties(String str, String str2, qdu0 qdu0Var) throws RemoteException;

    void getCurrentScreenClass(qdu0 qdu0Var) throws RemoteException;

    void getCurrentScreenName(qdu0 qdu0Var) throws RemoteException;

    void getGmpAppId(qdu0 qdu0Var) throws RemoteException;

    void getMaxUserProperties(String str, qdu0 qdu0Var) throws RemoteException;

    void getSessionId(qdu0 qdu0Var) throws RemoteException;

    void getTestFlag(qdu0 qdu0Var, int i) throws RemoteException;

    void getUserProperties(String str, String str2, boolean z, qdu0 qdu0Var) throws RemoteException;

    void initForTests(Map map) throws RemoteException;

    void initialize(uyl uylVar, zzdw zzdwVar, long j) throws RemoteException;

    void isDataCollectionEnabled(qdu0 qdu0Var) throws RemoteException;

    void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) throws RemoteException;

    void logEventAndBundle(String str, String str2, Bundle bundle, qdu0 qdu0Var, long j) throws RemoteException;

    void logHealthData(int i, String str, uyl uylVar, uyl uylVar2, uyl uylVar3) throws RemoteException;

    void onActivityCreated(uyl uylVar, Bundle bundle, long j) throws RemoteException;

    void onActivityDestroyed(uyl uylVar, long j) throws RemoteException;

    void onActivityPaused(uyl uylVar, long j) throws RemoteException;

    void onActivityResumed(uyl uylVar, long j) throws RemoteException;

    void onActivitySaveInstanceState(uyl uylVar, qdu0 qdu0Var, long j) throws RemoteException;

    void onActivityStarted(uyl uylVar, long j) throws RemoteException;

    void onActivityStopped(uyl uylVar, long j) throws RemoteException;

    void performAction(Bundle bundle, qdu0 qdu0Var, long j) throws RemoteException;

    void registerOnMeasurementEventListener(weu0 weu0Var) throws RemoteException;

    void resetAnalyticsData(long j) throws RemoteException;

    void setConditionalUserProperty(Bundle bundle, long j) throws RemoteException;

    void setConsent(Bundle bundle, long j) throws RemoteException;

    void setConsentThirdParty(Bundle bundle, long j) throws RemoteException;

    void setCurrentScreen(uyl uylVar, String str, String str2, long j) throws RemoteException;

    void setDataCollectionEnabled(boolean z) throws RemoteException;

    void setDefaultEventParameters(Bundle bundle) throws RemoteException;

    void setEventInterceptor(weu0 weu0Var) throws RemoteException;

    void setInstanceIdProvider(vku0 vku0Var) throws RemoteException;

    void setMeasurementEnabled(boolean z, long j) throws RemoteException;

    void setMinimumSessionDuration(long j) throws RemoteException;

    void setSessionTimeoutDuration(long j) throws RemoteException;

    void setSgtmDebugInfo(Intent intent) throws RemoteException;

    void setUserId(String str, long j) throws RemoteException;

    void setUserProperty(String str, String str2, uyl uylVar, boolean z, long j) throws RemoteException;

    void unregisterOnMeasurementEventListener(weu0 weu0Var) throws RemoteException;
}
