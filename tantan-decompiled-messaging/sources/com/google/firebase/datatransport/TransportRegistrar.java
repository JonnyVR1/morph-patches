package com.google.firebase.datatransport;

import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.android.datatransport.TransportFactory;
import com.google.android.datatransport.cct.CCTDestination;
import com.google.android.datatransport.runtime.TransportRuntime;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.components.Qualified;
import com.google.firebase.datatransport.TransportRegistrar;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
@Keep
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ TransportFactory m16781a(ComponentContainer componentContainer) {
        TransportRuntime.initialize((Context) componentContainer.get(Context.class));
        return TransportRuntime.getInstance().newFactory(CCTDestination.INSTANCE);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ TransportFactory m16782b(ComponentContainer componentContainer) {
        TransportRuntime.initialize((Context) componentContainer.get(Context.class));
        return TransportRuntime.getInstance().newFactory(CCTDestination.LEGACY_INSTANCE);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ TransportFactory m16783c(ComponentContainer componentContainer) {
        TransportRuntime.initialize((Context) componentContainer.get(Context.class));
        return TransportRuntime.getInstance().newFactory(CCTDestination.LEGACY_INSTANCE);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @NonNull
    public List<Component<?>> getComponents() {
        return Arrays.asList(Component.builder(TransportFactory.class).name(LIBRARY_NAME).add(Dependency.required((Class<?>) Context.class)).factory(new ComponentFactory() { // from class: l.l9j0
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                return TransportRegistrar.m16783c(componentContainer);
            }
        }).build(), Component.builder(Qualified.qualified(LegacyTransportBackend.class, TransportFactory.class)).add(Dependency.required((Class<?>) Context.class)).factory(new ComponentFactory() { // from class: l.m9j0
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                return TransportRegistrar.m16782b(componentContainer);
            }
        }).build(), Component.builder(Qualified.qualified(TransportBackend.class, TransportFactory.class)).add(Dependency.required((Class<?>) Context.class)).factory(new ComponentFactory() { // from class: l.n9j0
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                return TransportRegistrar.m16781a(componentContainer);
            }
        }).build(), LibraryVersionComponent.create(LIBRARY_NAME, BuildConfig.VERSION_NAME));
    }
}
