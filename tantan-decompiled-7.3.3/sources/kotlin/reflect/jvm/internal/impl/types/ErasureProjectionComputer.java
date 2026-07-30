package kotlin.reflect.jvm.internal.impl.types;

import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import org.jetbrains.annotations.NotNull;
import p153l.pr3;

/* JADX INFO: loaded from: classes2.dex */
public class ErasureProjectionComputer {
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ TypeProjection m93481b(ErasureProjectionComputer erasureProjectionComputer, TypeParameterDescriptor typeParameterDescriptor, ErasureTypeAttributes erasureTypeAttributes, TypeParameterUpperBoundEraser typeParameterUpperBoundEraser, KotlinType kotlinType, int i, Object obj) {
        if (obj != null) {
            pr3.m173429a("Super calls with default arguments not supported in this target, function: computeProjection");
            return null;
        }
        if ((i & 8) != 0) {
            kotlinType = typeParameterUpperBoundEraser.m93640e(typeParameterDescriptor, erasureTypeAttributes);
        }
        return erasureProjectionComputer.mo90768a(typeParameterDescriptor, erasureTypeAttributes, typeParameterUpperBoundEraser, kotlinType);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public TypeProjection mo90768a(@NotNull TypeParameterDescriptor typeParameterDescriptor, @NotNull ErasureTypeAttributes erasureTypeAttributes, @NotNull TypeParameterUpperBoundEraser typeParameterUpperBoundEraser, @NotNull KotlinType kotlinType) {
        typeParameterDescriptor.getClass();
        erasureTypeAttributes.getClass();
        typeParameterUpperBoundEraser.getClass();
        kotlinType.getClass();
        return new TypeProjectionImpl(Variance.OUT_VARIANCE, kotlinType);
    }
}
