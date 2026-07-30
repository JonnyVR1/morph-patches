package p153l;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzdw;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public abstract class jku0 extends b2t0 implements pgu0 {
    public jku0() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    public static pgu0 asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        return iInterfaceQueryLocalInterface instanceof pgu0 ? (pgu0) iInterfaceQueryLocalInterface : new cju0(iBinder);
    }

    @Override // p153l.b2t0
    /* JADX INFO: renamed from: O */
    public final boolean mo102250O(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        wmu0 ipu0Var = null;
        wmu0 ipu0Var2 = null;
        wmu0 ipu0Var3 = null;
        wmu0 ipu0Var4 = null;
        cou0 nqu0Var = null;
        cou0 nqu0Var2 = null;
        cou0 nqu0Var3 = null;
        wmu0 ipu0Var5 = null;
        wmu0 ipu0Var6 = null;
        wmu0 ipu0Var7 = null;
        wmu0 ipu0Var8 = null;
        wmu0 ipu0Var9 = null;
        wmu0 ipu0Var10 = null;
        buu0 xsu0Var = null;
        wmu0 ipu0Var11 = null;
        wmu0 ipu0Var12 = null;
        wmu0 ipu0Var13 = null;
        wmu0 ipu0Var14 = null;
        wmu0 ipu0Var15 = null;
        switch (i) {
            case 1:
                p1m p1mVarM170217O = p1m.AbstractBinderC19271a.m170217O(parcel.readStrongBinder());
                zzdw zzdwVar = (zzdw) z0t0.m218152a(parcel, zzdw.CREATOR);
                long j = parcel.readLong();
                z0t0.m218157f(parcel);
                initialize(p1mVarM170217O, zzdwVar, j);
                break;
            case 2:
                String string = parcel.readString();
                String string2 = parcel.readString();
                Bundle bundle = (Bundle) z0t0.m218152a(parcel, Bundle.CREATOR);
                boolean zM218159h = z0t0.m218159h(parcel);
                boolean zM218159h2 = z0t0.m218159h(parcel);
                long j2 = parcel.readLong();
                z0t0.m218157f(parcel);
                logEvent(string, string2, bundle, zM218159h, zM218159h2, j2);
                break;
            case 3:
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                Bundle bundle2 = (Bundle) z0t0.m218152a(parcel, Bundle.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    ipu0Var = iInterfaceQueryLocalInterface instanceof wmu0 ? (wmu0) iInterfaceQueryLocalInterface : new ipu0(strongBinder);
                }
                long j3 = parcel.readLong();
                z0t0.m218157f(parcel);
                logEventAndBundle(string3, string4, bundle2, ipu0Var, j3);
                break;
            case 4:
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                p1m p1mVarM170217O2 = p1m.AbstractBinderC19271a.m170217O(parcel.readStrongBinder());
                boolean zM218159h3 = z0t0.m218159h(parcel);
                long j4 = parcel.readLong();
                z0t0.m218157f(parcel);
                setUserProperty(string5, string6, p1mVarM170217O2, zM218159h3, j4);
                break;
            case 5:
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                boolean zM218159h4 = z0t0.m218159h(parcel);
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    ipu0Var15 = iInterfaceQueryLocalInterface2 instanceof wmu0 ? (wmu0) iInterfaceQueryLocalInterface2 : new ipu0(strongBinder2);
                }
                z0t0.m218157f(parcel);
                getUserProperties(string7, string8, zM218159h4, ipu0Var15);
                break;
            case 6:
                String string9 = parcel.readString();
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    ipu0Var14 = iInterfaceQueryLocalInterface3 instanceof wmu0 ? (wmu0) iInterfaceQueryLocalInterface3 : new ipu0(strongBinder3);
                }
                z0t0.m218157f(parcel);
                getMaxUserProperties(string9, ipu0Var14);
                break;
            case 7:
                String string10 = parcel.readString();
                long j5 = parcel.readLong();
                z0t0.m218157f(parcel);
                setUserId(string10, j5);
                break;
            case 8:
                Bundle bundle3 = (Bundle) z0t0.m218152a(parcel, Bundle.CREATOR);
                long j6 = parcel.readLong();
                z0t0.m218157f(parcel);
                setConditionalUserProperty(bundle3, j6);
                break;
            case 9:
                String string11 = parcel.readString();
                String string12 = parcel.readString();
                Bundle bundle4 = (Bundle) z0t0.m218152a(parcel, Bundle.CREATOR);
                z0t0.m218157f(parcel);
                clearConditionalUserProperty(string11, string12, bundle4);
                break;
            case 10:
                String string13 = parcel.readString();
                String string14 = parcel.readString();
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    ipu0Var13 = iInterfaceQueryLocalInterface4 instanceof wmu0 ? (wmu0) iInterfaceQueryLocalInterface4 : new ipu0(strongBinder4);
                }
                z0t0.m218157f(parcel);
                getConditionalUserProperties(string13, string14, ipu0Var13);
                break;
            case 11:
                boolean zM218159h5 = z0t0.m218159h(parcel);
                long j7 = parcel.readLong();
                z0t0.m218157f(parcel);
                setMeasurementEnabled(zM218159h5, j7);
                break;
            case 12:
                long j8 = parcel.readLong();
                z0t0.m218157f(parcel);
                resetAnalyticsData(j8);
                break;
            case 13:
                long j9 = parcel.readLong();
                z0t0.m218157f(parcel);
                setMinimumSessionDuration(j9);
                break;
            case 14:
                long j10 = parcel.readLong();
                z0t0.m218157f(parcel);
                setSessionTimeoutDuration(j10);
                break;
            case 15:
                p1m p1mVarM170217O3 = p1m.AbstractBinderC19271a.m170217O(parcel.readStrongBinder());
                String string15 = parcel.readString();
                String string16 = parcel.readString();
                long j11 = parcel.readLong();
                z0t0.m218157f(parcel);
                setCurrentScreen(p1mVarM170217O3, string15, string16, j11);
                break;
            case 16:
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    ipu0Var12 = iInterfaceQueryLocalInterface5 instanceof wmu0 ? (wmu0) iInterfaceQueryLocalInterface5 : new ipu0(strongBinder5);
                }
                z0t0.m218157f(parcel);
                getCurrentScreenName(ipu0Var12);
                break;
            case 17:
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    ipu0Var11 = iInterfaceQueryLocalInterface6 instanceof wmu0 ? (wmu0) iInterfaceQueryLocalInterface6 : new ipu0(strongBinder6);
                }
                z0t0.m218157f(parcel);
                getCurrentScreenClass(ipu0Var11);
                break;
            case 18:
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.measurement.api.internal.IStringProvider");
                    xsu0Var = iInterfaceQueryLocalInterface7 instanceof buu0 ? (buu0) iInterfaceQueryLocalInterface7 : new xsu0(strongBinder7);
                }
                z0t0.m218157f(parcel);
                setInstanceIdProvider(xsu0Var);
                break;
            case 19:
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    ipu0Var10 = iInterfaceQueryLocalInterface8 instanceof wmu0 ? (wmu0) iInterfaceQueryLocalInterface8 : new ipu0(strongBinder8);
                }
                z0t0.m218157f(parcel);
                getCachedAppInstanceId(ipu0Var10);
                break;
            case 20:
                IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 != null) {
                    IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    ipu0Var9 = iInterfaceQueryLocalInterface9 instanceof wmu0 ? (wmu0) iInterfaceQueryLocalInterface9 : new ipu0(strongBinder9);
                }
                z0t0.m218157f(parcel);
                getAppInstanceId(ipu0Var9);
                break;
            case 21:
                IBinder strongBinder10 = parcel.readStrongBinder();
                if (strongBinder10 != null) {
                    IInterface iInterfaceQueryLocalInterface10 = strongBinder10.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    ipu0Var8 = iInterfaceQueryLocalInterface10 instanceof wmu0 ? (wmu0) iInterfaceQueryLocalInterface10 : new ipu0(strongBinder10);
                }
                z0t0.m218157f(parcel);
                getGmpAppId(ipu0Var8);
                break;
            case 22:
                IBinder strongBinder11 = parcel.readStrongBinder();
                if (strongBinder11 != null) {
                    IInterface iInterfaceQueryLocalInterface11 = strongBinder11.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    ipu0Var7 = iInterfaceQueryLocalInterface11 instanceof wmu0 ? (wmu0) iInterfaceQueryLocalInterface11 : new ipu0(strongBinder11);
                }
                z0t0.m218157f(parcel);
                generateEventId(ipu0Var7);
                break;
            case 23:
                String string17 = parcel.readString();
                long j12 = parcel.readLong();
                z0t0.m218157f(parcel);
                beginAdUnitExposure(string17, j12);
                break;
            case 24:
                String string18 = parcel.readString();
                long j13 = parcel.readLong();
                z0t0.m218157f(parcel);
                endAdUnitExposure(string18, j13);
                break;
            case 25:
                p1m p1mVarM170217O4 = p1m.AbstractBinderC19271a.m170217O(parcel.readStrongBinder());
                long j14 = parcel.readLong();
                z0t0.m218157f(parcel);
                onActivityStarted(p1mVarM170217O4, j14);
                break;
            case 26:
                p1m p1mVarM170217O5 = p1m.AbstractBinderC19271a.m170217O(parcel.readStrongBinder());
                long j15 = parcel.readLong();
                z0t0.m218157f(parcel);
                onActivityStopped(p1mVarM170217O5, j15);
                break;
            case 27:
                p1m p1mVarM170217O6 = p1m.AbstractBinderC19271a.m170217O(parcel.readStrongBinder());
                Bundle bundle5 = (Bundle) z0t0.m218152a(parcel, Bundle.CREATOR);
                long j16 = parcel.readLong();
                z0t0.m218157f(parcel);
                onActivityCreated(p1mVarM170217O6, bundle5, j16);
                break;
            case 28:
                p1m p1mVarM170217O7 = p1m.AbstractBinderC19271a.m170217O(parcel.readStrongBinder());
                long j17 = parcel.readLong();
                z0t0.m218157f(parcel);
                onActivityDestroyed(p1mVarM170217O7, j17);
                break;
            case 29:
                p1m p1mVarM170217O8 = p1m.AbstractBinderC19271a.m170217O(parcel.readStrongBinder());
                long j18 = parcel.readLong();
                z0t0.m218157f(parcel);
                onActivityPaused(p1mVarM170217O8, j18);
                break;
            case 30:
                p1m p1mVarM170217O9 = p1m.AbstractBinderC19271a.m170217O(parcel.readStrongBinder());
                long j19 = parcel.readLong();
                z0t0.m218157f(parcel);
                onActivityResumed(p1mVarM170217O9, j19);
                break;
            case 31:
                p1m p1mVarM170217O10 = p1m.AbstractBinderC19271a.m170217O(parcel.readStrongBinder());
                IBinder strongBinder12 = parcel.readStrongBinder();
                if (strongBinder12 != null) {
                    IInterface iInterfaceQueryLocalInterface12 = strongBinder12.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    ipu0Var6 = iInterfaceQueryLocalInterface12 instanceof wmu0 ? (wmu0) iInterfaceQueryLocalInterface12 : new ipu0(strongBinder12);
                }
                long j20 = parcel.readLong();
                z0t0.m218157f(parcel);
                onActivitySaveInstanceState(p1mVarM170217O10, ipu0Var6, j20);
                break;
            case 32:
                Bundle bundle6 = (Bundle) z0t0.m218152a(parcel, Bundle.CREATOR);
                IBinder strongBinder13 = parcel.readStrongBinder();
                if (strongBinder13 != null) {
                    IInterface iInterfaceQueryLocalInterface13 = strongBinder13.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    ipu0Var5 = iInterfaceQueryLocalInterface13 instanceof wmu0 ? (wmu0) iInterfaceQueryLocalInterface13 : new ipu0(strongBinder13);
                }
                long j21 = parcel.readLong();
                z0t0.m218157f(parcel);
                performAction(bundle6, ipu0Var5, j21);
                break;
            case 33:
                int i3 = parcel.readInt();
                String string19 = parcel.readString();
                p1m p1mVarM170217O11 = p1m.AbstractBinderC19271a.m170217O(parcel.readStrongBinder());
                p1m p1mVarM170217O12 = p1m.AbstractBinderC19271a.m170217O(parcel.readStrongBinder());
                p1m p1mVarM170217O13 = p1m.AbstractBinderC19271a.m170217O(parcel.readStrongBinder());
                z0t0.m218157f(parcel);
                logHealthData(i3, string19, p1mVarM170217O11, p1mVarM170217O12, p1mVarM170217O13);
                break;
            case 34:
                IBinder strongBinder14 = parcel.readStrongBinder();
                if (strongBinder14 != null) {
                    IInterface iInterfaceQueryLocalInterface14 = strongBinder14.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    nqu0Var3 = iInterfaceQueryLocalInterface14 instanceof cou0 ? (cou0) iInterfaceQueryLocalInterface14 : new nqu0(strongBinder14);
                }
                z0t0.m218157f(parcel);
                setEventInterceptor(nqu0Var3);
                break;
            case 35:
                IBinder strongBinder15 = parcel.readStrongBinder();
                if (strongBinder15 != null) {
                    IInterface iInterfaceQueryLocalInterface15 = strongBinder15.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    nqu0Var2 = iInterfaceQueryLocalInterface15 instanceof cou0 ? (cou0) iInterfaceQueryLocalInterface15 : new nqu0(strongBinder15);
                }
                z0t0.m218157f(parcel);
                registerOnMeasurementEventListener(nqu0Var2);
                break;
            case 36:
                IBinder strongBinder16 = parcel.readStrongBinder();
                if (strongBinder16 != null) {
                    IInterface iInterfaceQueryLocalInterface16 = strongBinder16.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    nqu0Var = iInterfaceQueryLocalInterface16 instanceof cou0 ? (cou0) iInterfaceQueryLocalInterface16 : new nqu0(strongBinder16);
                }
                z0t0.m218157f(parcel);
                unregisterOnMeasurementEventListener(nqu0Var);
                break;
            case 37:
                HashMap mapM218153b = z0t0.m218153b(parcel);
                z0t0.m218157f(parcel);
                initForTests(mapM218153b);
                break;
            case 38:
                IBinder strongBinder17 = parcel.readStrongBinder();
                if (strongBinder17 != null) {
                    IInterface iInterfaceQueryLocalInterface17 = strongBinder17.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    ipu0Var4 = iInterfaceQueryLocalInterface17 instanceof wmu0 ? (wmu0) iInterfaceQueryLocalInterface17 : new ipu0(strongBinder17);
                }
                int i4 = parcel.readInt();
                z0t0.m218157f(parcel);
                getTestFlag(ipu0Var4, i4);
                break;
            case 39:
                boolean zM218159h6 = z0t0.m218159h(parcel);
                z0t0.m218157f(parcel);
                setDataCollectionEnabled(zM218159h6);
                break;
            case 40:
                IBinder strongBinder18 = parcel.readStrongBinder();
                if (strongBinder18 != null) {
                    IInterface iInterfaceQueryLocalInterface18 = strongBinder18.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    ipu0Var3 = iInterfaceQueryLocalInterface18 instanceof wmu0 ? (wmu0) iInterfaceQueryLocalInterface18 : new ipu0(strongBinder18);
                }
                z0t0.m218157f(parcel);
                isDataCollectionEnabled(ipu0Var3);
                break;
            case 41:
            case 47:
            default:
                return false;
            case 42:
                Bundle bundle7 = (Bundle) z0t0.m218152a(parcel, Bundle.CREATOR);
                z0t0.m218157f(parcel);
                setDefaultEventParameters(bundle7);
                break;
            case 43:
                long j22 = parcel.readLong();
                z0t0.m218157f(parcel);
                clearMeasurementEnabled(j22);
                break;
            case 44:
                Bundle bundle8 = (Bundle) z0t0.m218152a(parcel, Bundle.CREATOR);
                long j23 = parcel.readLong();
                z0t0.m218157f(parcel);
                setConsent(bundle8, j23);
                break;
            case 45:
                Bundle bundle9 = (Bundle) z0t0.m218152a(parcel, Bundle.CREATOR);
                long j24 = parcel.readLong();
                z0t0.m218157f(parcel);
                setConsentThirdParty(bundle9, j24);
                break;
            case 46:
                IBinder strongBinder19 = parcel.readStrongBinder();
                if (strongBinder19 != null) {
                    IInterface iInterfaceQueryLocalInterface19 = strongBinder19.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    ipu0Var2 = iInterfaceQueryLocalInterface19 instanceof wmu0 ? (wmu0) iInterfaceQueryLocalInterface19 : new ipu0(strongBinder19);
                }
                z0t0.m218157f(parcel);
                getSessionId(ipu0Var2);
                break;
            case 48:
                Intent intent = (Intent) z0t0.m218152a(parcel, Intent.CREATOR);
                z0t0.m218157f(parcel);
                setSgtmDebugInfo(intent);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
