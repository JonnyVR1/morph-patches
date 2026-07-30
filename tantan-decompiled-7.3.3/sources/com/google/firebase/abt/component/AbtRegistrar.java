package com.google.firebase.abt.component;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.abt.BuildConfig;
import com.google.firebase.abt.component.AbtRegistrar;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
@Keep
public class AbtRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-abt";

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ AbtComponent m16723a(ComponentContainer componentContainer) {
        return new AbtComponent((Context) componentContainer.get(Context.class), componentContainer.getProvider(AnalyticsConnector.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<Component<?>> getComponents() {
        return Arrays.asList(Component.builder(AbtComponent.class).name(LIBRARY_NAME).add(Dependency.required((Class<?>) Context.class)).add(Dependency.optionalProvider((Class<?>) AnalyticsConnector.class)).factory(new ComponentFactory() { // from class: l.v8
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                return AbtRegistrar.m16723a(componentContainer);
            }
        }).build(), LibraryVersionComponent.create(LIBRARY_NAME, BuildConfig.VERSION_NAME));
    }
}
