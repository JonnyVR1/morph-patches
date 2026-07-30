package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializationComponentsForJava;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class RuntimeModuleData {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: a */
    @NotNull
    public final DeserializationComponents f64327a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final PackagePartScopeCache f64328b;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final RuntimeModuleData m88963a(@NotNull ClassLoader classLoader) {
            classLoader.getClass();
            ReflectKotlinClassFinder reflectKotlinClassFinder = new ReflectKotlinClassFinder(classLoader);
            DeserializationComponentsForJava.Companion companion = DeserializationComponentsForJava.Companion;
            ClassLoader classLoader2 = Unit.class.getClassLoader();
            classLoader2.getClass();
            DeserializationComponentsForJava.Companion.ModuleData moduleDataM90296a = companion.m90296a(reflectKotlinClassFinder, new ReflectKotlinClassFinder(classLoader2), new ReflectJavaClassFinder(classLoader), "runtime module for " + classLoader, RuntimeErrorReporter.INSTANCE, RuntimeSourceElementFactory.INSTANCE);
            return new RuntimeModuleData(moduleDataM90296a.m90297a().m90295a(), new PackagePartScopeCache(moduleDataM90296a.m90298b(), reflectKotlinClassFinder), null);
        }

        private Companion() {
        }
    }

    public RuntimeModuleData(DeserializationComponents deserializationComponents, PackagePartScopeCache packagePartScopeCache) {
        this.f64327a = deserializationComponents;
        this.f64328b = packagePartScopeCache;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final DeserializationComponents m88960a() {
        return this.f64327a;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final ModuleDescriptor m88961b() {
        return this.f64327a.m92165q();
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final PackagePartScopeCache m88962c() {
        return this.f64328b;
    }

    public /* synthetic */ RuntimeModuleData(DeserializationComponents deserializationComponents, PackagePartScopeCache packagePartScopeCache, DefaultConstructorMarker defaultConstructorMarker) {
        this(deserializationComponents, packagePartScopeCache);
    }
}
