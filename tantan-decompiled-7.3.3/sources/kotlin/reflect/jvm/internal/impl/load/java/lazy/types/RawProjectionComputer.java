package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.ErasureProjectionComputer;
import kotlin.reflect.jvm.internal.impl.types.ErasureTypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeParameterUpperBoundEraser;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import org.jetbrains.annotations.NotNull;
import p153l.nbr;

/* JADX INFO: loaded from: classes2.dex */
public final class RawProjectionComputer extends ErasureProjectionComputer {

    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f65623a;

        static {
            int[] iArr = new int[JavaTypeFlexibility.values().length];
            try {
                iArr[JavaTypeFlexibility.FLEXIBLE_LOWER_BOUND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[JavaTypeFlexibility.FLEXIBLE_UPPER_BOUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[JavaTypeFlexibility.INFLEXIBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f65623a = iArr;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ErasureProjectionComputer
    @NotNull
    /* JADX INFO: renamed from: a */
    public TypeProjection mo90768a(@NotNull TypeParameterDescriptor typeParameterDescriptor, @NotNull ErasureTypeAttributes erasureTypeAttributes, @NotNull TypeParameterUpperBoundEraser typeParameterUpperBoundEraser, @NotNull KotlinType kotlinType) {
        typeParameterDescriptor.getClass();
        erasureTypeAttributes.getClass();
        typeParameterUpperBoundEraser.getClass();
        kotlinType.getClass();
        if (!(erasureTypeAttributes instanceof JavaTypeAttributes)) {
            return super.mo90768a(typeParameterDescriptor, erasureTypeAttributes, typeParameterUpperBoundEraser, kotlinType);
        }
        JavaTypeAttributes javaTypeAttributesM90746l = (JavaTypeAttributes) erasureTypeAttributes;
        if (!javaTypeAttributesM90746l.m90743i()) {
            javaTypeAttributesM90746l = javaTypeAttributesM90746l.m90746l(JavaTypeFlexibility.INFLEXIBLE);
        }
        int i = WhenMappings.f65623a[javaTypeAttributesM90746l.m90741g().ordinal()];
        if (i == 1) {
            return new TypeProjectionImpl(Variance.INVARIANT, kotlinType);
        }
        if (i != 2 && i != 3) {
            nbr.m162172a();
            return null;
        }
        if (!typeParameterDescriptor.mo89492h().getAllowsOutPosition()) {
            return new TypeProjectionImpl(Variance.INVARIANT, DescriptorUtilsKt.m92871m(typeParameterDescriptor).m89104I());
        }
        List<TypeParameterDescriptor> parameters = kotlinType.mo92781G0().getParameters();
        parameters.getClass();
        if (!parameters.isEmpty()) {
            return new TypeProjectionImpl(Variance.OUT_VARIANCE, kotlinType);
        }
        TypeProjection typeProjectionM93700t = TypeUtils.m93700t(typeParameterDescriptor, javaTypeAttributesM90746l);
        typeProjectionM93700t.getClass();
        return typeProjectionM93700t;
    }
}
