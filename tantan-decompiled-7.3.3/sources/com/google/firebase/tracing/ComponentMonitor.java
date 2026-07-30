package com.google.firebase.tracing;

import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.ComponentRegistrarProcessor;
import com.google.firebase.tracing.ComponentMonitor;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class ComponentMonitor implements ComponentRegistrarProcessor {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Object m16928a(String str, Component component, ComponentContainer componentContainer) {
        try {
            FirebaseTrace.pushTrace(str);
            return component.getFactory().create(componentContainer);
        } finally {
            FirebaseTrace.popTrace();
        }
    }

    @Override // com.google.firebase.components.ComponentRegistrarProcessor
    public List<Component<?>> processRegistrar(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (final Component<?> componentWithFactory : componentRegistrar.getComponents()) {
            final String name = componentWithFactory.getName();
            if (name != null) {
                componentWithFactory = componentWithFactory.withFactory(new ComponentFactory() { // from class: l.ss5
                    @Override // com.google.firebase.components.ComponentFactory
                    public final Object create(ComponentContainer componentContainer) {
                        return ComponentMonitor.m16928a(name, componentWithFactory, componentContainer);
                    }
                });
            }
            arrayList.add(componentWithFactory);
        }
        return arrayList;
    }
}
