package p149l;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzdw;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public abstract class dbu0 extends vss0 implements j7u0 {
    public dbu0() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    public static j7u0 asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        return iInterfaceQueryLocalInterface instanceof j7u0 ? (j7u0) iInterfaceQueryLocalInterface : new w9u0(iBinder);
    }

    @Override // p149l.vss0
    /* JADX INFO: renamed from: O */
    public final boolean mo110648O(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        qdu0 cgu0Var = null;
        qdu0 cgu0Var2 = null;
        qdu0 cgu0Var3 = null;
        qdu0 cgu0Var4 = null;
        weu0 hhu0Var = null;
        weu0 hhu0Var2 = null;
        weu0 hhu0Var3 = null;
        qdu0 cgu0Var5 = null;
        qdu0 cgu0Var6 = null;
        qdu0 cgu0Var7 = null;
        qdu0 cgu0Var8 = null;
        qdu0 cgu0Var9 = null;
        qdu0 cgu0Var10 = null;
        vku0 rju0Var = null;
        qdu0 cgu0Var11 = null;
        qdu0 cgu0Var12 = null;
        qdu0 cgu0Var13 = null;
        qdu0 cgu0Var14 = null;
        qdu0 cgu0Var15 = null;
        switch (i) {
            case 1:
                uyl uylVarM196295O = uyl.AbstractBinderC20541a.m196295O(parcel.readStrongBinder());
                zzdw zzdwVar = (zzdw) trs0.m190428a(parcel, zzdw.CREATOR);
                long j = parcel.readLong();
                trs0.m190433f(parcel);
                initialize(uylVarM196295O, zzdwVar, j);
                break;
            case 2:
                String string = parcel.readString();
                String string2 = parcel.readString();
                Bundle bundle = (Bundle) trs0.m190428a(parcel, Bundle.CREATOR);
                boolean zM190435h = trs0.m190435h(parcel);
                boolean zM190435h2 = trs0.m190435h(parcel);
                long j2 = parcel.readLong();
                trs0.m190433f(parcel);
                logEvent(string, string2, bundle, zM190435h, zM190435h2, j2);
                break;
            case 3:
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                Bundle bundle2 = (Bundle) trs0.m190428a(parcel, Bundle.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    cgu0Var = iInterfaceQueryLocalInterface instanceof qdu0 ? (qdu0) iInterfaceQueryLocalInterface : new cgu0(strongBinder);
                }
                long j3 = parcel.readLong();
                trs0.m190433f(parcel);
                logEventAndBundle(string3, string4, bundle2, cgu0Var, j3);
                break;
            case 4:
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                uyl uylVarM196295O2 = uyl.AbstractBinderC20541a.m196295O(parcel.readStrongBinder());
                boolean zM190435h3 = trs0.m190435h(parcel);
                long j4 = parcel.readLong();
                trs0.m190433f(parcel);
                setUserProperty(string5, string6, uylVarM196295O2, zM190435h3, j4);
                break;
            case 5:
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                boolean zM190435h4 = trs0.m190435h(parcel);
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    cgu0Var15 = iInterfaceQueryLocalInterface2 instanceof qdu0 ? (qdu0) iInterfaceQueryLocalInterface2 : new cgu0(strongBinder2);
                }
                trs0.m190433f(parcel);
                getUserProperties(string7, string8, zM190435h4, cgu0Var15);
                break;
            case 6:
                String string9 = parcel.readString();
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    cgu0Var14 = iInterfaceQueryLocalInterface3 instanceof qdu0 ? (qdu0) iInterfaceQueryLocalInterface3 : new cgu0(strongBinder3);
                }
                trs0.m190433f(parcel);
                getMaxUserProperties(string9, cgu0Var14);
                break;
            case 7:
                String string10 = parcel.readString();
                long j5 = parcel.readLong();
                trs0.m190433f(parcel);
                setUserId(string10, j5);
                break;
            case 8:
                Bundle bundle3 = (Bundle) trs0.m190428a(parcel, Bundle.CREATOR);
                long j6 = parcel.readLong();
                trs0.m190433f(parcel);
                setConditionalUserProperty(bundle3, j6);
                break;
            case 9:
                String string11 = parcel.readString();
                String string12 = parcel.readString();
                Bundle bundle4 = (Bundle) trs0.m190428a(parcel, Bundle.CREATOR);
                trs0.m190433f(parcel);
                clearConditionalUserProperty(string11, string12, bundle4);
                break;
            case 10:
                String string13 = parcel.readString();
                String string14 = parcel.readString();
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    cgu0Var13 = iInterfaceQueryLocalInterface4 instanceof qdu0 ? (qdu0) iInterfaceQueryLocalInterface4 : new cgu0(strongBinder4);
                }
                trs0.m190433f(parcel);
                getConditionalUserProperties(string13, string14, cgu0Var13);
                break;
            case 11:
                boolean zM190435h5 = trs0.m190435h(parcel);
                long j7 = parcel.readLong();
                trs0.m190433f(parcel);
                setMeasurementEnabled(zM190435h5, j7);
                break;
            case 12:
                long j8 = parcel.readLong();
                trs0.m190433f(parcel);
                resetAnalyticsData(j8);
                break;
            case 13:
                long j9 = parcel.readLong();
                trs0.m190433f(parcel);
                setMinimumSessionDuration(j9);
                break;
            case 14:
                long j10 = parcel.readLong();
                trs0.m190433f(parcel);
                setSessionTimeoutDuration(j10);
                break;
            case 15:
                uyl uylVarM196295O3 = uyl.AbstractBinderC20541a.m196295O(parcel.readStrongBinder());
                String string15 = parcel.readString();
                String string16 = parcel.readString();
                long j11 = parcel.readLong();
                trs0.m190433f(parcel);
                setCurrentScreen(uylVarM196295O3, string15, string16, j11);
                break;
            case 16:
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    cgu0Var12 = iInterfaceQueryLocalInterface5 instanceof qdu0 ? (qdu0) iInterfaceQueryLocalInterface5 : new cgu0(strongBinder5);
                }
                trs0.m190433f(parcel);
                getCurrentScreenName(cgu0Var12);
                break;
            case 17:
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    cgu0Var11 = iInterfaceQueryLocalInterface6 instanceof qdu0 ? (qdu0) iInterfaceQueryLocalInterface6 : new cgu0(strongBinder6);
                }
                trs0.m190433f(parcel);
                getCurrentScreenClass(cgu0Var11);
                break;
            case 18:
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.measurement.api.internal.IStringProvider");
                    rju0Var = iInterfaceQueryLocalInterface7 instanceof vku0 ? (vku0) iInterfaceQueryLocalInterface7 : new rju0(strongBinder7);
                }
                trs0.m190433f(parcel);
                setInstanceIdProvider(rju0Var);
                break;
            case 19:
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    cgu0Var10 = iInterfaceQueryLocalInterface8 instanceof qdu0 ? (qdu0) iInterfaceQueryLocalInterface8 : new cgu0(strongBinder8);
                }
                trs0.m190433f(parcel);
                getCachedAppInstanceId(cgu0Var10);
                break;
            case 20:
                IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 != null) {
                    IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    cgu0Var9 = iInterfaceQueryLocalInterface9 instanceof qdu0 ? (qdu0) iInterfaceQueryLocalInterface9 : new cgu0(strongBinder9);
                }
                trs0.m190433f(parcel);
                getAppInstanceId(cgu0Var9);
                break;
            case 21:
                IBinder strongBinder10 = parcel.readStrongBinder();
                if (strongBinder10 != null) {
                    IInterface iInterfaceQueryLocalInterface10 = strongBinder10.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    cgu0Var8 = iInterfaceQueryLocalInterface10 instanceof qdu0 ? (qdu0) iInterfaceQueryLocalInterface10 : new cgu0(strongBinder10);
                }
                trs0.m190433f(parcel);
                getGmpAppId(cgu0Var8);
                break;
            case 22:
                IBinder strongBinder11 = parcel.readStrongBinder();
                if (strongBinder11 != null) {
                    IInterface iInterfaceQueryLocalInterface11 = strongBinder11.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    cgu0Var7 = iInterfaceQueryLocalInterface11 instanceof qdu0 ? (qdu0) iInterfaceQueryLocalInterface11 : new cgu0(strongBinder11);
                }
                trs0.m190433f(parcel);
                generateEventId(cgu0Var7);
                break;
            case 23:
                String string17 = parcel.readString();
                long j12 = parcel.readLong();
                trs0.m190433f(parcel);
                beginAdUnitExposure(string17, j12);
                break;
            case 24:
                String string18 = parcel.readString();
                long j13 = parcel.readLong();
                trs0.m190433f(parcel);
                endAdUnitExposure(string18, j13);
                break;
            case 25:
                uyl uylVarM196295O4 = uyl.AbstractBinderC20541a.m196295O(parcel.readStrongBinder());
                long j14 = parcel.readLong();
                trs0.m190433f(parcel);
                onActivityStarted(uylVarM196295O4, j14);
                break;
            case 26:
                uyl uylVarM196295O5 = uyl.AbstractBinderC20541a.m196295O(parcel.readStrongBinder());
                long j15 = parcel.readLong();
                trs0.m190433f(parcel);
                onActivityStopped(uylVarM196295O5, j15);
                break;
            case 27:
                uyl uylVarM196295O6 = uyl.AbstractBinderC20541a.m196295O(parcel.readStrongBinder());
                Bundle bundle5 = (Bundle) trs0.m190428a(parcel, Bundle.CREATOR);
                long j16 = parcel.readLong();
                trs0.m190433f(parcel);
                onActivityCreated(uylVarM196295O6, bundle5, j16);
                break;
            case 28:
                uyl uylVarM196295O7 = uyl.AbstractBinderC20541a.m196295O(parcel.readStrongBinder());
                long j17 = parcel.readLong();
                trs0.m190433f(parcel);
                onActivityDestroyed(uylVarM196295O7, j17);
                break;
            case 29:
                uyl uylVarM196295O8 = uyl.AbstractBinderC20541a.m196295O(parcel.readStrongBinder());
                long j18 = parcel.readLong();
                trs0.m190433f(parcel);
                onActivityPaused(uylVarM196295O8, j18);
                break;
            case 30:
                uyl uylVarM196295O9 = uyl.AbstractBinderC20541a.m196295O(parcel.readStrongBinder());
                long j19 = parcel.readLong();
                trs0.m190433f(parcel);
                onActivityResumed(uylVarM196295O9, j19);
                break;
            case 31:
                uyl uylVarM196295O10 = uyl.AbstractBinderC20541a.m196295O(parcel.readStrongBinder());
                IBinder strongBinder12 = parcel.readStrongBinder();
                if (strongBinder12 != null) {
                    IInterface iInterfaceQueryLocalInterface12 = strongBinder12.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    cgu0Var6 = iInterfaceQueryLocalInterface12 instanceof qdu0 ? (qdu0) iInterfaceQueryLocalInterface12 : new cgu0(strongBinder12);
                }
                long j20 = parcel.readLong();
                trs0.m190433f(parcel);
                onActivitySaveInstanceState(uylVarM196295O10, cgu0Var6, j20);
                break;
            case 32:
                Bundle bundle6 = (Bundle) trs0.m190428a(parcel, Bundle.CREATOR);
                IBinder strongBinder13 = parcel.readStrongBinder();
                if (strongBinder13 != null) {
                    IInterface iInterfaceQueryLocalInterface13 = strongBinder13.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    cgu0Var5 = iInterfaceQueryLocalInterface13 instanceof qdu0 ? (qdu0) iInterfaceQueryLocalInterface13 : new cgu0(strongBinder13);
                }
                long j21 = parcel.readLong();
                trs0.m190433f(parcel);
                performAction(bundle6, cgu0Var5, j21);
                break;
            case 33:
                int i3 = parcel.readInt();
                String string19 = parcel.readString();
                uyl uylVarM196295O11 = uyl.AbstractBinderC20541a.m196295O(parcel.readStrongBinder());
                uyl uylVarM196295O12 = uyl.AbstractBinderC20541a.m196295O(parcel.readStrongBinder());
                uyl uylVarM196295O13 = uyl.AbstractBinderC20541a.m196295O(parcel.readStrongBinder());
                trs0.m190433f(parcel);
                logHealthData(i3, string19, uylVarM196295O11, uylVarM196295O12, uylVarM196295O13);
                break;
            case 34:
                IBinder strongBinder14 = parcel.readStrongBinder();
                if (strongBinder14 != null) {
                    IInterface iInterfaceQueryLocalInterface14 = strongBinder14.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    hhu0Var3 = iInterfaceQueryLocalInterface14 instanceof weu0 ? (weu0) iInterfaceQueryLocalInterface14 : new hhu0(strongBinder14);
                }
                trs0.m190433f(parcel);
                setEventInterceptor(hhu0Var3);
                break;
            case 35:
                IBinder strongBinder15 = parcel.readStrongBinder();
                if (strongBinder15 != null) {
                    IInterface iInterfaceQueryLocalInterface15 = strongBinder15.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    hhu0Var2 = iInterfaceQueryLocalInterface15 instanceof weu0 ? (weu0) iInterfaceQueryLocalInterface15 : new hhu0(strongBinder15);
                }
                trs0.m190433f(parcel);
                registerOnMeasurementEventListener(hhu0Var2);
                break;
            case 36:
                IBinder strongBinder16 = parcel.readStrongBinder();
                if (strongBinder16 != null) {
                    IInterface iInterfaceQueryLocalInterface16 = strongBinder16.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    hhu0Var = iInterfaceQueryLocalInterface16 instanceof weu0 ? (weu0) iInterfaceQueryLocalInterface16 : new hhu0(strongBinder16);
                }
                trs0.m190433f(parcel);
                unregisterOnMeasurementEventListener(hhu0Var);
                break;
            case 37:
                HashMap mapM190429b = trs0.m190429b(parcel);
                trs0.m190433f(parcel);
                initForTests(mapM190429b);
                break;
            case 38:
                IBinder strongBinder17 = parcel.readStrongBinder();
                if (strongBinder17 != null) {
                    IInterface iInterfaceQueryLocalInterface17 = strongBinder17.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    cgu0Var4 = iInterfaceQueryLocalInterface17 instanceof qdu0 ? (qdu0) iInterfaceQueryLocalInterface17 : new cgu0(strongBinder17);
                }
                int i4 = parcel.readInt();
                trs0.m190433f(parcel);
                getTestFlag(cgu0Var4, i4);
                break;
            case 39:
                boolean zM190435h6 = trs0.m190435h(parcel);
                trs0.m190433f(parcel);
                setDataCollectionEnabled(zM190435h6);
                break;
            case 40:
                IBinder strongBinder18 = parcel.readStrongBinder();
                if (strongBinder18 != null) {
                    IInterface iInterfaceQueryLocalInterface18 = strongBinder18.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    cgu0Var3 = iInterfaceQueryLocalInterface18 instanceof qdu0 ? (qdu0) iInterfaceQueryLocalInterface18 : new cgu0(strongBinder18);
                }
                trs0.m190433f(parcel);
                isDataCollectionEnabled(cgu0Var3);
                break;
            case 41:
            case 47:
            default:
                return false;
            case 42:
                Bundle bundle7 = (Bundle) trs0.m190428a(parcel, Bundle.CREATOR);
                trs0.m190433f(parcel);
                setDefaultEventParameters(bundle7);
                break;
            case 43:
                long j22 = parcel.readLong();
                trs0.m190433f(parcel);
                clearMeasurementEnabled(j22);
                break;
            case 44:
                Bundle bundle8 = (Bundle) trs0.m190428a(parcel, Bundle.CREATOR);
                long j23 = parcel.readLong();
                trs0.m190433f(parcel);
                setConsent(bundle8, j23);
                break;
            case 45:
                Bundle bundle9 = (Bundle) trs0.m190428a(parcel, Bundle.CREATOR);
                long j24 = parcel.readLong();
                trs0.m190433f(parcel);
                setConsentThirdParty(bundle9, j24);
                break;
            case 46:
                IBinder strongBinder19 = parcel.readStrongBinder();
                if (strongBinder19 != null) {
                    IInterface iInterfaceQueryLocalInterface19 = strongBinder19.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    cgu0Var2 = iInterfaceQueryLocalInterface19 instanceof qdu0 ? (qdu0) iInterfaceQueryLocalInterface19 : new cgu0(strongBinder19);
                }
                trs0.m190433f(parcel);
                getSessionId(cgu0Var2);
                break;
            case 48:
                Intent intent = (Intent) trs0.m190428a(parcel, Intent.CREATOR);
                trs0.m190433f(parcel);
                setSgtmDebugInfo(intent);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
