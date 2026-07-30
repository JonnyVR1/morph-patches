package com.google.firebase.messaging;

import androidx.annotation.Keep;
import com.google.android.datatransport.TransportFactory;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.FirebaseApp;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.components.Qualified;
import com.google.firebase.datatransport.TransportBackend;
import com.google.firebase.events.Subscriber;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.iid.internal.FirebaseInstanceIdInternal;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import com.google.firebase.platforminfo.UserAgentPublisher;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
@Keep
@KeepForSdk
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ FirebaseMessaging m16878a(Qualified qualified, ComponentContainer componentContainer) {
        return new FirebaseMessaging((FirebaseApp) componentContainer.get(FirebaseApp.class), (FirebaseInstanceIdInternal) componentContainer.get(FirebaseInstanceIdInternal.class), componentContainer.getProvider(UserAgentPublisher.class), componentContainer.getProvider(HeartBeatInfo.class), (FirebaseInstallationsApi) componentContainer.get(FirebaseInstallationsApi.class), componentContainer.getProvider(qualified), (Subscriber) componentContainer.get(Subscriber.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<Component<?>> getComponents() {
        final Qualified qualified = Qualified.qualified(TransportBackend.class, TransportFactory.class);
        return Arrays.asList(Component.builder(FirebaseMessaging.class).name(LIBRARY_NAME).add(Dependency.required((Class<?>) FirebaseApp.class)).add(Dependency.optional(FirebaseInstanceIdInternal.class)).add(Dependency.optionalProvider((Class<?>) UserAgentPublisher.class)).add(Dependency.optionalProvider((Class<?>) HeartBeatInfo.class)).add(Dependency.required((Class<?>) FirebaseInstallationsApi.class)).add(Dependency.optionalProvider((Qualified<?>) qualified)).add(Dependency.required((Class<?>) Subscriber.class)).factory(new ComponentFactory() { // from class: l.npi
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                return FirebaseMessagingRegistrar.m16878a(qualified, componentContainer);
            }
        }).alwaysEager().build(), LibraryVersionComponent.create(LIBRARY_NAME, BuildConfig.VERSION_NAME));
    }
}
