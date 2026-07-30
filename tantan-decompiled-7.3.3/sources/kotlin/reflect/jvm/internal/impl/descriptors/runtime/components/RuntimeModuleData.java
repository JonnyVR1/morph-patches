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
    public final DeserializationComponents f65001a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final PackagePartScopeCache f65002b;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final RuntimeModuleData m89854a(@NotNull ClassLoader classLoader) {
            classLoader.getClass();
            ReflectKotlinClassFinder reflectKotlinClassFinder = new ReflectKotlinClassFinder(classLoader);
            DeserializationComponentsForJava.Companion companion = DeserializationComponentsForJava.Companion;
            ClassLoader classLoader2 = Unit.class.getClassLoader();
            classLoader2.getClass();
            DeserializationComponentsForJava.Companion.ModuleData moduleDataM91187a = companion.m91187a(reflectKotlinClassFinder, new ReflectKotlinClassFinder(classLoader2), new ReflectJavaClassFinder(classLoader), "runtime module for " + classLoader, RuntimeErrorReporter.INSTANCE, RuntimeSourceElementFactory.INSTANCE);
            return new RuntimeModuleData(moduleDataM91187a.m91188a().m91186a(), new PackagePartScopeCache(moduleDataM91187a.m91189b(), reflectKotlinClassFinder), null);
        }

        private Companion() {
        }
    }

    public RuntimeModuleData(DeserializationComponents deserializationComponents, PackagePartScopeCache packagePartScopeCache) {
        this.f65001a = deserializationComponents;
        this.f65002b = packagePartScopeCache;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final DeserializationComponents m89851a() {
        return this.f65001a;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final ModuleDescriptor m89852b() {
        return this.f65001a.m93056q();
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final PackagePartScopeCache m89853c() {
        return this.f65002b;
    }

    public /* synthetic */ RuntimeModuleData(DeserializationComponents deserializationComponents, PackagePartScopeCache packagePartScopeCache, DefaultConstructorMarker defaultConstructorMarker) {
        this(deserializationComponents, packagePartScopeCache);
    }
}
