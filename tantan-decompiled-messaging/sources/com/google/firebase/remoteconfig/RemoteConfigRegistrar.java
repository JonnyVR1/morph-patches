package com.google.firebase.remoteconfig;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.FirebaseApp;
import com.google.firebase.abt.FirebaseABTesting;
import com.google.firebase.abt.component.AbtComponent;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.annotations.concurrent.Blocking;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.components.Qualified;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import com.google.firebase.remoteconfig.RemoteConfigRegistrar;
import com.google.firebase.remoteconfig.interop.FirebaseRemoteConfigInterop;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes7.dex */
@Keep
public class RemoteConfigRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-rc";

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ RemoteConfigComponent m16848a(Qualified qualified, ComponentContainer componentContainer) {
        return new RemoteConfigComponent((Context) componentContainer.get(Context.class), (ScheduledExecutorService) componentContainer.get(qualified), (FirebaseApp) componentContainer.get(FirebaseApp.class), (FirebaseInstallationsApi) componentContainer.get(FirebaseInstallationsApi.class), ((AbtComponent) componentContainer.get(AbtComponent.class)).get(FirebaseABTesting.OriginService.REMOTE_CONFIG), componentContainer.getProvider(AnalyticsConnector.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<Component<?>> getComponents() {
        final Qualified qualified = Qualified.qualified(Blocking.class, ScheduledExecutorService.class);
        return Arrays.asList(Component.builder(RemoteConfigComponent.class, FirebaseRemoteConfigInterop.class).name(LIBRARY_NAME).add(Dependency.required((Class<?>) Context.class)).add(Dependency.required((Qualified<?>) qualified)).add(Dependency.required((Class<?>) FirebaseApp.class)).add(Dependency.required((Class<?>) FirebaseInstallationsApi.class)).add(Dependency.required((Class<?>) AbtComponent.class)).add(Dependency.optionalProvider((Class<?>) AnalyticsConnector.class)).factory(new ComponentFactory() { // from class: l.bqc0
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                return RemoteConfigRegistrar.m16848a(qualified, componentContainer);
            }
        }).eagerInDefaultApp().build(), LibraryVersionComponent.create(LIBRARY_NAME, BuildConfig.VERSION_NAME));
    }
}
