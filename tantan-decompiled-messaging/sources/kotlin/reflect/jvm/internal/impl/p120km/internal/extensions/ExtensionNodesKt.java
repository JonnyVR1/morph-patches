package kotlin.reflect.jvm.internal.impl.p120km.internal.extensions;

import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.p120km.KmClass;
import kotlin.reflect.jvm.internal.impl.p120km.KmConstructor;
import kotlin.reflect.jvm.internal.impl.p120km.KmFunction;
import kotlin.reflect.jvm.internal.impl.p120km.KmProperty;
import kotlin.reflect.jvm.internal.impl.p120km.KmType;
import kotlin.reflect.jvm.internal.impl.p120km.KmTypeParameter;
import org.jetbrains.annotations.NotNull;
import p149l.rkq0;

/* JADX INFO: loaded from: classes2.dex */
public final class ExtensionNodesKt {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final KmClassExtension m89256a(@NotNull KmClass kmClass, @NotNull KmExtensionType kmExtensionType) {
        kmClass.getClass();
        kmExtensionType.getClass();
        return (KmClassExtension) m89262g(kmClass.m89106h(), kmExtensionType);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final KmConstructorExtension m89257b(@NotNull KmConstructor kmConstructor, @NotNull KmExtensionType kmExtensionType) {
        kmConstructor.getClass();
        kmExtensionType.getClass();
        return (KmConstructorExtension) m89262g(kmConstructor.m89122b(), kmExtensionType);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final KmFunctionExtension m89258c(@NotNull KmFunction kmFunction, @NotNull KmExtensionType kmExtensionType) {
        kmFunction.getClass();
        kmExtensionType.getClass();
        return (KmFunctionExtension) m89262g(kmFunction.m89141d(), kmExtensionType);
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public static final KmPropertyExtension m89259d(@NotNull KmProperty kmProperty, @NotNull KmExtensionType kmExtensionType) {
        kmProperty.getClass();
        kmExtensionType.getClass();
        return (KmPropertyExtension) m89262g(kmProperty.m89155f(), kmExtensionType);
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public static final KmTypeExtension m89260e(@NotNull KmType kmType, @NotNull KmExtensionType kmExtensionType) {
        kmType.getClass();
        kmExtensionType.getClass();
        return (KmTypeExtension) m89262g(kmType.m89172c(), kmExtensionType);
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public static final KmTypeParameterExtension m89261f(@NotNull KmTypeParameter kmTypeParameter, @NotNull KmExtensionType kmExtensionType) {
        kmTypeParameter.getClass();
        kmExtensionType.getClass();
        return (KmTypeParameterExtension) m89262g(kmTypeParameter.m89186a(), kmExtensionType);
    }

    /* JADX INFO: renamed from: g */
    public static final <N extends KmExtension> N m89262g(Collection<? extends N> collection, KmExtensionType kmExtensionType) {
        N n = null;
        for (N n2 : collection) {
            if (Intrinsics.m87488d(n2.getType(), kmExtensionType)) {
                if (n != null) {
                    rkq0.m179764a("Multiple extensions handle the same extension type: ", kmExtensionType);
                    return null;
                }
                n = n2;
            }
        }
        if (n != null) {
            return n;
        }
        rkq0.m179764a("No extensions handle the extension type: ", kmExtensionType);
        return null;
    }
}
