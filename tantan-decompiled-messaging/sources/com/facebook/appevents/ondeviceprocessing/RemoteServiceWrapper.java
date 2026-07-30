package com.facebook.appevents.ondeviceprocessing;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.annotation.RestrictTo;
import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import com.facebook.C1577c;
import com.facebook.appevents.AppEvent;
import com.facebook.internal.C1657e;
import com.google.firebase.iid.GmsRpc;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.lsb;
import p149l.nv0;
import p149l.o1m;
import p149l.qvf;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\bÇ\u0002\u0018\u00002\u00020\u0001:\u0003\u001f\u0018 B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u000f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J-\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001c\u001a\n \u001a*\u0004\u0018\u00010\u00070\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001bR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u001d¨\u0006!"}, m87232d2 = {"Lcom/facebook/appevents/ondeviceprocessing/RemoteServiceWrapper;", "", "<init>", "()V", "", "b", "()Z", "", "applicationId", "Lcom/facebook/appevents/ondeviceprocessing/RemoteServiceWrapper$ServiceResult;", "e", "(Ljava/lang/String;)Lcom/facebook/appevents/ondeviceprocessing/RemoteServiceWrapper$ServiceResult;", "", "Lcom/facebook/appevents/AppEvent;", "appEvents", "c", "(Ljava/lang/String;Ljava/util/List;)Lcom/facebook/appevents/ondeviceprocessing/RemoteServiceWrapper$ServiceResult;", "Lcom/facebook/appevents/ondeviceprocessing/RemoteServiceWrapper$EventType;", "eventType", Constants.INAPP_DATA_TAG, "(Lcom/facebook/appevents/ondeviceprocessing/RemoteServiceWrapper$EventType;Ljava/lang/String;Ljava/util/List;)Lcom/facebook/appevents/ondeviceprocessing/RemoteServiceWrapper$ServiceResult;", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "a", "(Landroid/content/Context;)Landroid/content/Intent;", "kotlin.jvm.PlatformType", "Ljava/lang/String;", "TAG", "Ljava/lang/Boolean;", "isServiceAvailable", "EventType", "ServiceResult", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class RemoteServiceWrapper {

    @NotNull
    public static final RemoteServiceWrapper INSTANCE = new RemoteServiceWrapper();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final String TAG = RemoteServiceWrapper.class.getSimpleName();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public static Boolean isServiceAvailable;

    @Metadata(m87231d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m87232d2 = {"Lcom/facebook/appevents/ondeviceprocessing/RemoteServiceWrapper$EventType;", "", "eventType", "", "(Ljava/lang/String;ILjava/lang/String;)V", "toString", "MOBILE_APP_INSTALL", "CUSTOM_APP_EVENTS", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public enum EventType {
        MOBILE_APP_INSTALL("MOBILE_APP_INSTALL"),
        CUSTOM_APP_EVENTS("CUSTOM_APP_EVENTS");


        @NotNull
        private final String eventType;

        EventType(String str) {
            this.eventType = str;
        }

        @Override // java.lang.Enum
        @NotNull
        public String toString() {
            return this.eventType;
        }
    }

    @Metadata(m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m87232d2 = {"Lcom/facebook/appevents/ondeviceprocessing/RemoteServiceWrapper$ServiceResult;", "", "(Ljava/lang/String;I)V", "OPERATION_SUCCESS", GmsRpc.ERROR_SERVICE_NOT_AVAILABLE, "SERVICE_ERROR", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public enum ServiceResult {
        OPERATION_SUCCESS,
        SERVICE_NOT_AVAILABLE,
        SERVICE_ERROR
    }

    /* JADX INFO: renamed from: com.facebook.appevents.ondeviceprocessing.RemoteServiceWrapper$a */
    @Metadata(m87231d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0011R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, m87232d2 = {"Lcom/facebook/appevents/ondeviceprocessing/RemoteServiceWrapper$a;", "Landroid/content/ServiceConnection;", "<init>", "()V", "Landroid/content/ComponentName;", AuthenticationTokenClaims.JSON_KEY_NAME, "Landroid/os/IBinder;", "serviceBinder", "", "onServiceConnected", "(Landroid/content/ComponentName;Landroid/os/IBinder;)V", "onNullBinding", "(Landroid/content/ComponentName;)V", "onServiceDisconnected", "a", "()Landroid/os/IBinder;", "Ljava/util/concurrent/CountDownLatch;", "Ljava/util/concurrent/CountDownLatch;", "latch", "b", "Landroid/os/IBinder;", "binder", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static final class ServiceConnectionC1572a implements ServiceConnection {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final CountDownLatch latch = new CountDownLatch(1);

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        public IBinder binder;

        @Nullable
        /* JADX INFO: renamed from: a */
        public final IBinder m7977a() throws InterruptedException {
            this.latch.await(5L, TimeUnit.SECONDS);
            return this.binder;
        }

        @Override // android.content.ServiceConnection
        public void onNullBinding(@NotNull ComponentName name) {
            name.getClass();
            this.latch.countDown();
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(@NotNull ComponentName name, @NotNull IBinder serviceBinder) {
            name.getClass();
            serviceBinder.getClass();
            this.binder = serviceBinder;
            this.latch.countDown();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(@NotNull ComponentName name) {
            name.getClass();
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static final boolean m7972b() {
        if (lsb.m151554d(RemoteServiceWrapper.class)) {
            return false;
        }
        try {
            if (isServiceAvailable == null) {
                isServiceAvailable = Boolean.valueOf(INSTANCE.m7975a(C1577c.m8047l()) != null);
            }
            Boolean bool = isServiceAvailable;
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        } catch (Throwable th) {
            lsb.m151552b(th, RemoteServiceWrapper.class);
            return false;
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: c */
    public static final ServiceResult m7973c(@NotNull String applicationId, @NotNull List<AppEvent> appEvents) {
        if (lsb.m151554d(RemoteServiceWrapper.class)) {
            return null;
        }
        try {
            applicationId.getClass();
            appEvents.getClass();
            return INSTANCE.m7976d(EventType.CUSTOM_APP_EVENTS, applicationId, appEvents);
        } catch (Throwable th) {
            lsb.m151552b(th, RemoteServiceWrapper.class);
            return null;
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: e */
    public static final ServiceResult m7974e(@NotNull String applicationId) {
        if (lsb.m151554d(RemoteServiceWrapper.class)) {
            return null;
        }
        try {
            applicationId.getClass();
            return INSTANCE.m7976d(EventType.MOBILE_APP_INSTALL, applicationId, CollectionsKt.emptyList());
        } catch (Throwable th) {
            lsb.m151552b(th, RemoteServiceWrapper.class);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final Intent m7975a(Context context) {
        if (lsb.m151554d(this)) {
            return null;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                Intent intent = new Intent("ReceiverService");
                intent.setPackage("com.facebook.katana");
                if (packageManager.resolveService(intent, 0) != null && qvf.m176697a(context, "com.facebook.katana")) {
                    return intent;
                }
                Intent intent2 = new Intent("ReceiverService");
                intent2.setPackage("com.facebook.wakizashi");
                if (packageManager.resolveService(intent2, 0) != null && qvf.m176697a(context, "com.facebook.wakizashi")) {
                    return intent2;
                }
            }
            return null;
        } catch (Throwable th) {
            lsb.m151552b(th, this);
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public final ServiceResult m7976d(EventType eventType, String applicationId, List<AppEvent> appEvents) {
        ServiceResult serviceResult;
        String str;
        if (lsb.m151554d(this)) {
            return null;
        }
        try {
            ServiceResult serviceResult2 = ServiceResult.SERVICE_NOT_AVAILABLE;
            nv0.m161519b();
            Context contextM8047l = C1577c.m8047l();
            Intent intentM7975a = m7975a(contextM8047l);
            if (intentM7975a == null) {
                return serviceResult2;
            }
            ServiceConnectionC1572a serviceConnectionC1572a = new ServiceConnectionC1572a();
            try {
                if (!contextM8047l.bindService(intentM7975a, serviceConnectionC1572a, 1)) {
                    return ServiceResult.SERVICE_ERROR;
                }
                try {
                    IBinder iBinderM7977a = serviceConnectionC1572a.m7977a();
                    if (iBinderM7977a != null) {
                        o1m o1mVarM162258O = o1m.AbstractBinderC18816a.m162258O(iBinderM7977a);
                        Bundle bundleM7984a = C1574b.m7984a(eventType, applicationId, appEvents);
                        if (bundleM7984a != null) {
                            o1mVarM162258O.mo162257H4(bundleM7984a);
                            C1657e.m8844j0(TAG, "Successfully sent events to the remote service: " + bundleM7984a);
                        }
                        serviceResult2 = ServiceResult.OPERATION_SUCCESS;
                    }
                    contextM8047l.unbindService(serviceConnectionC1572a);
                    C1657e.m8844j0(TAG, "Unbound from the remote service");
                    return serviceResult2;
                } catch (RemoteException e) {
                    serviceResult = ServiceResult.SERVICE_ERROR;
                    str = TAG;
                    C1657e.m8842i0(str, e);
                    contextM8047l.unbindService(serviceConnectionC1572a);
                    C1657e.m8844j0(str, "Unbound from the remote service");
                    return serviceResult;
                } catch (InterruptedException e2) {
                    serviceResult = ServiceResult.SERVICE_ERROR;
                    str = TAG;
                    C1657e.m8842i0(str, e2);
                    contextM8047l.unbindService(serviceConnectionC1572a);
                    C1657e.m8844j0(str, "Unbound from the remote service");
                    return serviceResult;
                }
            } catch (Throwable th) {
                contextM8047l.unbindService(serviceConnectionC1572a);
                C1657e.m8844j0(TAG, "Unbound from the remote service");
                throw th;
            }
        } catch (Throwable th2) {
            lsb.m151552b(th2, this);
            return null;
        }
    }
}
