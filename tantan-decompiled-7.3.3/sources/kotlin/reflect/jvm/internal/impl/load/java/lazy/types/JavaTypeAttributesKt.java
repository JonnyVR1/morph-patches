package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import kotlin.collections.SetsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class JavaTypeAttributesKt {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final JavaTypeAttributes m90748a(@NotNull TypeUsage typeUsage, boolean z, boolean z2, @Nullable TypeParameterDescriptor typeParameterDescriptor) {
        typeUsage.getClass();
        return new JavaTypeAttributes(typeUsage, null, z2, z, typeParameterDescriptor != null ? SetsKt.setOf(typeParameterDescriptor) : null, null, 34, null);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ JavaTypeAttributes m90749b(TypeUsage typeUsage, boolean z, boolean z2, TypeParameterDescriptor typeParameterDescriptor, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        if ((i & 4) != 0) {
            typeParameterDescriptor = null;
        }
        return m90748a(typeUsage, z, z2, typeParameterDescriptor);
    }
}
