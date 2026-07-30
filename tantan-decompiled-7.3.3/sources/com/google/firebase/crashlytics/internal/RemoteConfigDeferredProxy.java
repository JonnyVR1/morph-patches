package com.google.firebase.crashlytics.internal;

import com.google.firebase.crashlytics.internal.RemoteConfigDeferredProxy;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import com.google.firebase.remoteconfig.interop.FirebaseRemoteConfigInterop;

/* JADX INFO: loaded from: classes7.dex */
public class RemoteConfigDeferredProxy {
    private final Deferred<FirebaseRemoteConfigInterop> remoteConfigInteropDeferred;

    public RemoteConfigDeferredProxy(Deferred<FirebaseRemoteConfigInterop> deferred) {
        this.remoteConfigInteropDeferred = deferred;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m16786a(CrashlyticsRemoteConfigListener crashlyticsRemoteConfigListener, Provider provider) {
        ((FirebaseRemoteConfigInterop) provider.get()).registerRolloutsStateSubscriber(RemoteConfigComponent.DEFAULT_NAMESPACE, crashlyticsRemoteConfigListener);
        Logger.getLogger().m16776d("Registering RemoteConfig Rollouts subscriber");
    }

    public void setupListener(UserMetadata userMetadata) {
        if (userMetadata == null) {
            Logger.getLogger().m16784w("Didn't successfully register with UserMetadata for rollouts listener");
        } else {
            final CrashlyticsRemoteConfigListener crashlyticsRemoteConfigListener = new CrashlyticsRemoteConfigListener(userMetadata);
            this.remoteConfigInteropDeferred.whenAvailable(new Deferred.DeferredHandler() { // from class: l.dyc0
                @Override // com.google.firebase.inject.Deferred.DeferredHandler
                public final void handle(Provider provider) {
                    RemoteConfigDeferredProxy.m16786a(crashlyticsRemoteConfigListener, provider);
                }
            });
        }
    }
}
