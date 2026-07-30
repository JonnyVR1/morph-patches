package kotlin.reflect.jvm.internal;

import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.RuntimeModuleData;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import org.jetbrains.annotations.NotNull;
import p149l.sgp0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0002\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\"&\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0007¨\u0006\t"}, m87232d2 = {"Ljava/lang/Class;", "Lkotlin/reflect/jvm/internal/impl/descriptors/runtime/components/RuntimeModuleData;", "a", "(Ljava/lang/Class;)Lkotlin/reflect/jvm/internal/impl/descriptors/runtime/components/RuntimeModuleData;", "Ljava/util/concurrent/ConcurrentMap;", "Ll/sgp0;", "Ljava/lang/ref/WeakReference;", "Ljava/util/concurrent/ConcurrentMap;", "moduleByClassLoader", "kotlin-reflection"}, m87233k = 2, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class ModuleByClassLoaderKt {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final ConcurrentMap<sgp0, WeakReference<RuntimeModuleData>> f63718a = new ConcurrentHashMap();

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final RuntimeModuleData m87991a(@NotNull Class<?> cls) {
        cls.getClass();
        ClassLoader classLoaderM88996j = ReflectClassUtilKt.m88996j(cls);
        sgp0 sgp0Var = new sgp0(classLoaderM88996j);
        ConcurrentMap<sgp0, WeakReference<RuntimeModuleData>> concurrentMap = f63718a;
        WeakReference<RuntimeModuleData> weakReference = concurrentMap.get(sgp0Var);
        if (weakReference != null) {
            RuntimeModuleData runtimeModuleData = weakReference.get();
            if (runtimeModuleData != null) {
                return runtimeModuleData;
            }
            concurrentMap.remove(sgp0Var, weakReference);
        }
        RuntimeModuleData runtimeModuleDataM88963a = RuntimeModuleData.Companion.m88963a(classLoaderM88996j);
        while (true) {
            try {
                ConcurrentMap<sgp0, WeakReference<RuntimeModuleData>> concurrentMap2 = f63718a;
                WeakReference<RuntimeModuleData> weakReferencePutIfAbsent = concurrentMap2.putIfAbsent(sgp0Var, new WeakReference<>(runtimeModuleDataM88963a));
                if (weakReferencePutIfAbsent == null) {
                    sgp0Var.m184125a(null);
                    return runtimeModuleDataM88963a;
                }
                RuntimeModuleData runtimeModuleData2 = weakReferencePutIfAbsent.get();
                if (runtimeModuleData2 != null) {
                    sgp0Var.m184125a(null);
                    return runtimeModuleData2;
                }
                concurrentMap2.remove(sgp0Var, weakReferencePutIfAbsent);
            } catch (Throwable th) {
                sgp0Var.m184125a(null);
                throw th;
            }
        }
    }
}
