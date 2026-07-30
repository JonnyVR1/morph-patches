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
    public static final <T> T m91303a(@NotNull JvmTypeFactory<T> jvmTypeFactory, @NotNull T t, boolean z) {
        jvmTypeFactory.getClass();
        t.getClass();
        return z ? jvmTypeFactory.mo91244c(t) : t;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static final <T> T m91304b(@NotNull TypeSystemCommonBackendContext typeSystemCommonBackendContext, @NotNull KotlinTypeMarker kotlinTypeMarker, @NotNull JvmTypeFactory<T> jvmTypeFactory, @NotNull TypeMappingMode typeMappingMode) {
        typeSystemCommonBackendContext.getClass();
        kotlinTypeMarker.getClass();
        jvmTypeFactory.getClass();
        typeMappingMode.getClass();
        TypeConstructorMarker typeConstructorMarkerMo91116O = typeSystemCommonBackendContext.mo91116O(kotlinTypeMarker);
        if (!typeSystemCommonBackendContext.mo91131X(typeConstructorMarkerMo91116O)) {
            return null;
        }
        PrimitiveType primitiveTypeMo91181x0 = typeSystemCommonBackendContext.mo91181x0(typeConstructorMarkerMo91116O);
        if (primitiveTypeMo91181x0 != null) {
            return (T) m91303a(jvmTypeFactory, jvmTypeFactory.mo91245d(primitiveTypeMo91181x0), typeSystemCommonBackendContext.mo91183y0(kotlinTypeMarker) || TypeEnhancementUtilsKt.m91007c(typeSystemCommonBackendContext, kotlinTypeMarker));
        }
        PrimitiveType primitiveTypeMo91095D0 = typeSystemCommonBackendContext.mo91095D0(typeConstructorMarkerMo91116O);
        if (primitiveTypeMo91095D0 != null) {
            return jvmTypeFactory.mo91242a("[" + JvmPrimitiveType.get(primitiveTypeMo91095D0).getDesc());
        }
        if (typeSystemCommonBackendContext.mo91152j(typeConstructorMarkerMo91116O)) {
            FqNameUnsafe fqNameUnsafeMo91103H0 = typeSystemCommonBackendContext.mo91103H0(typeConstructorMarkerMo91116O);
            ClassId classIdM89247n = fqNameUnsafeMo91103H0 != null ? JavaToKotlinClassMap.INSTANCE.m89247n(fqNameUnsafeMo91103H0) : null;
            if (classIdM89247n != null) {
                if (!typeMappingMode.m91296a()) {
                    List<JavaToKotlinClassMap.PlatformMutabilityMapping> listM89242i = JavaToKotlinClassMap.INSTANCE.m89242i();
                    if (!(listM89242i instanceof Collection) || !listM89242i.isEmpty()) {
                        Iterator<T> it = listM89242i.iterator();
                        while (it.hasNext()) {
                            if (Intrinsics.m88377d(((JavaToKotlinClassMap.PlatformMutabilityMapping) it.next()).m89253d(), classIdM89247n)) {
                                return null;
                            }
                        }
                    }
                }
                String strM92909h = JvmClassName.m92909h(classIdM89247n);
                strM92909h.getClass();
                return jvmTypeFactory.mo91247f(strM92909h);
            }
        }
        return null;
    }
}
