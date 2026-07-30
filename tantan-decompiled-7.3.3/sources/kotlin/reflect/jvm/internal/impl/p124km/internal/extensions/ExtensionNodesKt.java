package kotlin.reflect.jvm.internal.impl.p124km.internal.extensions;

import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.p124km.KmClass;
import kotlin.reflect.jvm.internal.impl.p124km.KmConstructor;
import kotlin.reflect.jvm.internal.impl.p124km.KmFunction;
import kotlin.reflect.jvm.internal.impl.p124km.KmProperty;
import kotlin.reflect.jvm.internal.impl.p124km.KmType;
import kotlin.reflect.jvm.internal.impl.p124km.KmTypeParameter;
import org.jetbrains.annotations.NotNull;
import p153l.xtq0;

/* JADX INFO: loaded from: classes2.dex */
public final class ExtensionNodesKt {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final KmClassExtension m90147a(@NotNull KmClass kmClass, @NotNull KmExtensionType kmExtensionType) {
        kmClass.getClass();
        kmExtensionType.getClass();
        return (KmClassExtension) m90153g(kmClass.m89997h(), kmExtensionType);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final KmConstructorExtension m90148b(@NotNull KmConstructor kmConstructor, @NotNull KmExtensionType kmExtensionType) {
        kmConstructor.getClass();
        kmExtensionType.getClass();
        return (KmConstructorExtension) m90153g(kmConstructor.m90013b(), kmExtensionType);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final KmFunctionExtension m90149c(@NotNull KmFunction kmFunction, @NotNull KmExtensionType kmExtensionType) {
        kmFunction.getClass();
        kmExtensionType.getClass();
        return (KmFunctionExtension) m90153g(kmFunction.m90032d(), kmExtensionType);
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public static final KmPropertyExtension m90150d(@NotNull KmProperty kmProperty, @NotNull KmExtensionType kmExtensionType) {
        kmProperty.getClass();
        kmExtensionType.getClass();
        return (KmPropertyExtension) m90153g(kmProperty.m90046f(), kmExtensionType);
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public static final KmTypeExtension m90151e(@NotNull KmType kmType, @NotNull KmExtensionType kmExtensionType) {
        kmType.getClass();
        kmExtensionType.getClass();
        return (KmTypeExtension) m90153g(kmType.m90063c(), kmExtensionType);
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public static final KmTypeParameterExtension m90152f(@NotNull KmTypeParameter kmTypeParameter, @NotNull KmExtensionType kmExtensionType) {
        kmTypeParameter.getClass();
        kmExtensionType.getClass();
        return (KmTypeParameterExtension) m90153g(kmTypeParameter.m90077a(), kmExtensionType);
    }

    /* JADX INFO: renamed from: g */
    public static final <N extends KmExtension> N m90153g(Collection<? extends N> collection, KmExtensionType kmExtensionType) {
        N n = null;
        for (N n2 : collection) {
            if (Intrinsics.m88377d(n2.getType(), kmExtensionType)) {
                if (n != null) {
                    xtq0.m213103a("Multiple extensions handle the same extension type: ", kmExtensionType);
                    return null;
                }
                n = n2;
            }
        }
        if (n != null) {
            return n;
        }
        xtq0.m213103a("No extensions handle the extension type: ", kmExtensionType);
        return null;
    }
}
