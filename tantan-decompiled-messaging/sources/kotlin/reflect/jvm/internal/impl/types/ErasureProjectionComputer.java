package kotlin.reflect.jvm.internal.impl.types;

import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import org.jetbrains.annotations.NotNull;
import p149l.qq3;

/* JADX INFO: loaded from: classes2.dex */
public class ErasureProjectionComputer {
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ TypeProjection m92590b(ErasureProjectionComputer erasureProjectionComputer, TypeParameterDescriptor typeParameterDescriptor, ErasureTypeAttributes erasureTypeAttributes, TypeParameterUpperBoundEraser typeParameterUpperBoundEraser, KotlinType kotlinType, int i, Object obj) {
        if (obj != null) {
            qq3.m175877a("Super calls with default arguments not supported in this target, function: computeProjection");
            return null;
        }
        if ((i & 8) != 0) {
            kotlinType = typeParameterUpperBoundEraser.m92749e(typeParameterDescriptor, erasureTypeAttributes);
        }
        return erasureProjectionComputer.mo89877a(typeParameterDescriptor, erasureTypeAttributes, typeParameterUpperBoundEraser, kotlinType);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public TypeProjection mo89877a(@NotNull TypeParameterDescriptor typeParameterDescriptor, @NotNull ErasureTypeAttributes erasureTypeAttributes, @NotNull TypeParameterUpperBoundEraser typeParameterUpperBoundEraser, @NotNull KotlinType kotlinType) {
        typeParameterDescriptor.getClass();
        erasureTypeAttributes.getClass();
        typeParameterUpperBoundEraser.getClass();
        kotlinType.getClass();
        return new TypeProjectionImpl(Variance.OUT_VARIANCE, kotlinType);
    }
}
