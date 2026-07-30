package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeEnhancementUtilsKt;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class TypeSignatureMappingKt {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final <T> T m90412a(@NotNull JvmTypeFactory<T> jvmTypeFactory, @NotNull T t, boolean z) {
        jvmTypeFactory.getClass();
        t.getClass();
        return z ? jvmTypeFactory.mo90353c(t) : t;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static final <T> T m90413b(@NotNull TypeSystemCommonBackendContext typeSystemCommonBackendContext, @NotNull KotlinTypeMarker kotlinTypeMarker, @NotNull JvmTypeFactory<T> jvmTypeFactory, @NotNull TypeMappingMode typeMappingMode) {
        typeSystemCommonBackendContext.getClass();
        kotlinTypeMarker.getClass();
        jvmTypeFactory.getClass();
        typeMappingMode.getClass();
        TypeConstructorMarker typeConstructorMarkerMo90225O = typeSystemCommonBackendContext.mo90225O(kotlinTypeMarker);
        if (!typeSystemCommonBackendContext.mo90240X(typeConstructorMarkerMo90225O)) {
            return null;
        }
        PrimitiveType primitiveTypeMo90290x0 = typeSystemCommonBackendContext.mo90290x0(typeConstructorMarkerMo90225O);
        if (primitiveTypeMo90290x0 != null) {
            return (T) m90412a(jvmTypeFactory, jvmTypeFactory.mo90354d(primitiveTypeMo90290x0), typeSystemCommonBackendContext.mo90292y0(kotlinTypeMarker) || TypeEnhancementUtilsKt.m90116c(typeSystemCommonBackendContext, kotlinTypeMarker));
        }
        PrimitiveType primitiveTypeMo90204D0 = typeSystemCommonBackendContext.mo90204D0(typeConstructorMarkerMo90225O);
        if (primitiveTypeMo90204D0 != null) {
            return jvmTypeFactory.mo90351a("[" + JvmPrimitiveType.get(primitiveTypeMo90204D0).getDesc());
        }
        if (typeSystemCommonBackendContext.mo90261j(typeConstructorMarkerMo90225O)) {
            FqNameUnsafe fqNameUnsafeMo90212H0 = typeSystemCommonBackendContext.mo90212H0(typeConstructorMarkerMo90225O);
            ClassId classIdM88356n = fqNameUnsafeMo90212H0 != null ? JavaToKotlinClassMap.INSTANCE.m88356n(fqNameUnsafeMo90212H0) : null;
            if (classIdM88356n != null) {
                if (!typeMappingMode.m90405a()) {
                    List<JavaToKotlinClassMap.PlatformMutabilityMapping> listM88351i = JavaToKotlinClassMap.INSTANCE.m88351i();
                    if (!(listM88351i instanceof Collection) || !listM88351i.isEmpty()) {
                        Iterator<T> it = listM88351i.iterator();
                        while (it.hasNext()) {
                            if (Intrinsics.m87488d(((JavaToKotlinClassMap.PlatformMutabilityMapping) it.next()).m88362d(), classIdM88356n)) {
                                return null;
                            }
                        }
                    }
                }
                String strM92018h = JvmClassName.m92018h(classIdM88356n);
                strM92018h.getClass();
                return jvmTypeFactory.mo90356f(strM92018h);
            }
        }
        return null;
    }
}
