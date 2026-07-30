package kotlin.reflect.jvm.internal.impl.load.java.structure;

import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class JavaTypesKt {
    /* JADX INFO: renamed from: a */
    public static final boolean m90795a(@Nullable JavaType javaType) {
        JavaWildcardType javaWildcardType = javaType instanceof JavaWildcardType ? (JavaWildcardType) javaType : null;
        return (javaWildcardType == null || javaWildcardType.mo89964o() == null || javaWildcardType.isExtends()) ? false : true;
    }
}
