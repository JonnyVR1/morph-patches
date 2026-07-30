package com.google.firebase.crashlytics;

import android.os.Bundle;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.annotations.DeferredApi;
import com.google.firebase.crashlytics.AnalyticsDeferredProxy;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger;
import com.google.firebase.crashlytics.internal.analytics.BlockingAnalyticsEventLogger;
import com.google.firebase.crashlytics.internal.analytics.BreadcrumbAnalyticsEventReceiver;
import com.google.firebase.crashlytics.internal.analytics.CrashlyticsOriginAnalyticsEventLogger;
import com.google.firebase.crashlytics.internal.analytics.UnavailableAnalyticsEventLogger;
import com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbHandler;
import com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbSource;
import com.google.firebase.crashlytics.internal.breadcrumbs.DisabledBreadcrumbSource;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public class AnalyticsDeferredProxy {
    private final Deferred<AnalyticsConnector> analyticsConnectorDeferred;
    private volatile AnalyticsEventLogger analyticsEventLogger;

    @GuardedBy("this")
    private final List<BreadcrumbHandler> breadcrumbHandlerList;
    private volatile BreadcrumbSource breadcrumbSource;

    public AnalyticsDeferredProxy(Deferred<AnalyticsConnector> deferred, @NonNull BreadcrumbSource breadcrumbSource, @NonNull AnalyticsEventLogger analyticsEventLogger) {
        this.analyticsConnectorDeferred = deferred;
        this.breadcrumbSource = breadcrumbSource;
        this.breadcrumbHandlerList = new ArrayList();
        this.analyticsEventLogger = analyticsEventLogger;
        init();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m16714a(AnalyticsDeferredProxy analyticsDeferredProxy, Provider provider) {
        analyticsDeferredProxy.getClass();
        Logger.getLogger().m16721d("AnalyticsConnector now available.");
        AnalyticsConnector analyticsConnector = (AnalyticsConnector) provider.get();
        CrashlyticsOriginAnalyticsEventLogger crashlyticsOriginAnalyticsEventLogger = new CrashlyticsOriginAnalyticsEventLogger(analyticsConnector);
        CrashlyticsAnalyticsListener crashlyticsAnalyticsListener = new CrashlyticsAnalyticsListener();
        if (subscribeToAnalyticsEvents(analyticsConnector, crashlyticsAnalyticsListener) == null) {
            Logger.getLogger().m16729w("Could not register Firebase Analytics listener; a listener is already registered.");
            return;
        }
        Logger.getLogger().m16721d("Registered Firebase Analytics listener.");
        BreadcrumbAnalyticsEventReceiver breadcrumbAnalyticsEventReceiver = new BreadcrumbAnalyticsEventReceiver();
        BlockingAnalyticsEventLogger blockingAnalyticsEventLogger = new BlockingAnalyticsEventLogger(crashlyticsOriginAnalyticsEventLogger, 500, TimeUnit.MILLISECONDS);
        synchronized (analyticsDeferredProxy) {
            try {
                Iterator<BreadcrumbHandler> it = analyticsDeferredProxy.breadcrumbHandlerList.iterator();
                while (it.hasNext()) {
                    breadcrumbAnalyticsEventReceiver.registerBreadcrumbHandler(it.next());
                }
                crashlyticsAnalyticsListener.setBreadcrumbEventReceiver(breadcrumbAnalyticsEventReceiver);
                crashlyticsAnalyticsListener.setCrashlyticsOriginEventReceiver(blockingAnalyticsEventLogger);
                analyticsDeferredProxy.breadcrumbSource = breadcrumbAnalyticsEventReceiver;
                analyticsDeferredProxy.analyticsEventLogger = blockingAnalyticsEventLogger;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m16716c(AnalyticsDeferredProxy analyticsDeferredProxy, BreadcrumbHandler breadcrumbHandler) {
        synchronized (analyticsDeferredProxy) {
            try {
                if (analyticsDeferredProxy.breadcrumbSource instanceof DisabledBreadcrumbSource) {
                    analyticsDeferredProxy.breadcrumbHandlerList.add(breadcrumbHandler);
                }
                analyticsDeferredProxy.breadcrumbSource.registerBreadcrumbHandler(breadcrumbHandler);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void init() {
        this.analyticsConnectorDeferred.whenAvailable(new Deferred.DeferredHandler() { // from class: l.kk0
            @Override // com.google.firebase.inject.Deferred.DeferredHandler
            public final void handle(Provider provider) {
                AnalyticsDeferredProxy.m16714a(this.f123520a, provider);
            }
        });
    }

    @DeferredApi
    private static AnalyticsConnector.AnalyticsConnectorHandle subscribeToAnalyticsEvents(@NonNull AnalyticsConnector analyticsConnector, @NonNull CrashlyticsAnalyticsListener crashlyticsAnalyticsListener) {
        AnalyticsConnector.AnalyticsConnectorHandle analyticsConnectorHandleRegisterAnalyticsConnectorListener = analyticsConnector.registerAnalyticsConnectorListener("clx", crashlyticsAnalyticsListener);
        if (analyticsConnectorHandleRegisterAnalyticsConnectorListener != null) {
            return analyticsConnectorHandleRegisterAnalyticsConnectorListener;
        }
        Logger.getLogger().m16721d("Could not register AnalyticsConnectorListener with Crashlytics origin.");
        AnalyticsConnector.AnalyticsConnectorHandle analyticsConnectorHandleRegisterAnalyticsConnectorListener2 = analyticsConnector.registerAnalyticsConnectorListener("crash", crashlyticsAnalyticsListener);
        if (analyticsConnectorHandleRegisterAnalyticsConnectorListener2 != null) {
            Logger.getLogger().m16729w("A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.");
        }
        return analyticsConnectorHandleRegisterAnalyticsConnectorListener2;
    }

    public AnalyticsEventLogger getAnalyticsEventLogger() {
        return new AnalyticsEventLogger() { // from class: l.jk0
            @Override // com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger
            public final void logEvent(String str, Bundle bundle) {
                this.f118328a.analyticsEventLogger.logEvent(str, bundle);
            }
        };
    }

    public BreadcrumbSource getDeferredBreadcrumbSource() {
        return new BreadcrumbSource() { // from class: l.ik0
            @Override // com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbSource
            public final void registerBreadcrumbHandler(BreadcrumbHandler breadcrumbHandler) {
                AnalyticsDeferredProxy.m16716c(this.f113620a, breadcrumbHandler);
            }
        };
    }

    public AnalyticsDeferredProxy(Deferred<AnalyticsConnector> deferred) {
        this(deferred, new DisabledBreadcrumbSource(), new UnavailableAnalyticsEventLogger());
    }
}
