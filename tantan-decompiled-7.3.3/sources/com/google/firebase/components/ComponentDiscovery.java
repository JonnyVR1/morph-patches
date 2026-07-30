package com.google.firebase.components;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.firebase.components.ComponentDiscovery;
import com.google.firebase.inject.Provider;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public final class ComponentDiscovery<T> {
    private static final String COMPONENT_KEY_PREFIX = "com.google.firebase.components:";
    private static final String COMPONENT_SENTINEL_VALUE = "com.google.firebase.components.ComponentRegistrar";
    static final String TAG = "ComponentDiscovery";
    private final T context;
    private final RegistrarNameRetriever<T> retriever;

    public static class MetadataRegistrarNameRetriever implements RegistrarNameRetriever<Context> {
        private final Class<? extends Service> discoveryService;

        private MetadataRegistrarNameRetriever(Class<? extends Service> cls) {
            this.discoveryService = cls;
        }

        private Bundle getMetadata(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, this.discoveryService), 128);
                if (serviceInfo != null) {
                    return serviceInfo.metaData;
                }
                Objects.toString(this.discoveryService);
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        @Override // com.google.firebase.components.ComponentDiscovery.RegistrarNameRetriever
        public List<String> retrieve(Context context) {
            Bundle metadata = getMetadata(context);
            if (metadata == null) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            for (String str : metadata.keySet()) {
                if (ComponentDiscovery.COMPONENT_SENTINEL_VALUE.equals(metadata.get(str)) && str.startsWith(ComponentDiscovery.COMPONENT_KEY_PREFIX)) {
                    arrayList.add(str.substring(31));
                }
            }
            return arrayList;
        }
    }

    @VisibleForTesting
    public interface RegistrarNameRetriever<T> {
        List<String> retrieve(T t);
    }

    @VisibleForTesting
    public ComponentDiscovery(T t, RegistrarNameRetriever<T> registrarNameRetriever) {
        this.context = t;
        this.retriever = registrarNameRetriever;
    }

    public static ComponentDiscovery<Context> forContext(Context context, Class<? extends Service> cls) {
        return new ComponentDiscovery<>(context, new MetadataRegistrarNameRetriever(cls));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Nullable
    public static ComponentRegistrar instantiate(String str) {
        try {
            Class<?> cls = Class.forName(str);
            if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                return (ComponentRegistrar) cls.getDeclaredConstructor(null).newInstance(null);
            }
            throw new InvalidRegistrarException(String.format("Class %s is not an instance of %s", str, COMPONENT_SENTINEL_VALUE));
        } catch (ClassNotFoundException unused) {
            String.format("Class %s is not an found.", str);
            return null;
        } catch (IllegalAccessException e) {
            throw new InvalidRegistrarException(String.format("Could not instantiate %s.", str), e);
        } catch (InstantiationException e2) {
            throw new InvalidRegistrarException(String.format("Could not instantiate %s.", str), e2);
        } catch (NoSuchMethodException e3) {
            throw new InvalidRegistrarException(String.format("Could not instantiate %s", str), e3);
        } catch (InvocationTargetException e4) {
            throw new InvalidRegistrarException(String.format("Could not instantiate %s", str), e4);
        }
    }

    @Deprecated
    public List<ComponentRegistrar> discover() {
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = this.retriever.retrieve(this.context).iterator();
        while (it.hasNext()) {
            try {
                ComponentRegistrar componentRegistrarInstantiate = instantiate(it.next());
                if (componentRegistrarInstantiate != null) {
                    arrayList.add(componentRegistrarInstantiate);
                }
            } catch (InvalidRegistrarException unused) {
            }
        }
        return arrayList;
    }

    public List<Provider<ComponentRegistrar>> discoverLazy() {
        ArrayList arrayList = new ArrayList();
        for (final String str : this.retriever.retrieve(this.context)) {
            arrayList.add(new Provider() { // from class: l.rs5
                @Override // com.google.firebase.inject.Provider
                public final Object get() {
                    return ComponentDiscovery.instantiate(str);
                }
            });
        }
        return arrayList;
    }
}
