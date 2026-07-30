package kotlin.reflect.jvm.internal;

import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.RuntimeModuleData;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import org.jetbrains.annotations.NotNull;
import p153l.wpp0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0002\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\"&\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0007¨\u0006\t"}, m88121d2 = {"Ljava/lang/Class;", "Lkotlin/reflect/jvm/internal/impl/descriptors/runtime/components/RuntimeModuleData;", "a", "(Ljava/lang/Class;)Lkotlin/reflect/jvm/internal/impl/descriptors/runtime/components/RuntimeModuleData;", "Ljava/util/concurrent/ConcurrentMap;", "Ll/wpp0;", "Ljava/lang/ref/WeakReference;", "Ljava/util/concurrent/ConcurrentMap;", "moduleByClassLoader", "kotlin-reflection"}, m88122k = 2, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class ModuleByClassLoaderKt {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final ConcurrentMap<wpp0, WeakReference<RuntimeModuleData>> f64392a = new ConcurrentHashMap();

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final RuntimeModuleData m88882a(@NotNull Class<?> cls) {
        cls.getClass();
        ClassLoader classLoaderM89887j = ReflectClassUtilKt.m89887j(cls);
        wpp0 wpp0Var = new wpp0(classLoaderM89887j);
        ConcurrentMap<wpp0, WeakReference<RuntimeModuleData>> concurrentMap = f64392a;
        WeakReference<RuntimeModuleData> weakReference = concurrentMap.get(wpp0Var);
        if (weakReference != null) {
            RuntimeModuleData runtimeModuleData = weakReference.get();
            if (runtimeModuleData != null) {
                return runtimeModuleData;
            }
            concurrentMap.remove(wpp0Var, weakReference);
        }
        RuntimeModuleData runtimeModuleDataM89854a = RuntimeModuleData.Companion.m89854a(classLoaderM89887j);
        while (true) {
            try {
                ConcurrentMap<wpp0, WeakReference<RuntimeModuleData>> concurrentMap2 = f64392a;
                WeakReference<RuntimeModuleData> weakReferencePutIfAbsent = concurrentMap2.putIfAbsent(wpp0Var, new WeakReference<>(runtimeModuleDataM89854a));
                if (weakReferencePutIfAbsent == null) {
                    wpp0Var.m207477a(null);
                    return runtimeModuleDataM89854a;
                }
                RuntimeModuleData runtimeModuleData2 = weakReferencePutIfAbsent.get();
                if (runtimeModuleData2 != null) {
                    wpp0Var.m207477a(null);
                    return runtimeModuleData2;
                }
                concurrentMap2.remove(wpp0Var, weakReferencePutIfAbsent);
            } catch (Throwable th) {
                wpp0Var.m207477a(null);
                throw th;
            }
        }
    }
}
