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
import p149l.l9r;

/* JADX INFO: loaded from: classes2.dex */
public final class RawProjectionComputer extends ErasureProjectionComputer {

    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f64949a;

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
            f64949a = iArr;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ErasureProjectionComputer
    @NotNull
    /* JADX INFO: renamed from: a */
    public TypeProjection mo89877a(@NotNull TypeParameterDescriptor typeParameterDescriptor, @NotNull ErasureTypeAttributes erasureTypeAttributes, @NotNull TypeParameterUpperBoundEraser typeParameterUpperBoundEraser, @NotNull KotlinType kotlinType) {
        typeParameterDescriptor.getClass();
        erasureTypeAttributes.getClass();
        typeParameterUpperBoundEraser.getClass();
        kotlinType.getClass();
        if (!(erasureTypeAttributes instanceof JavaTypeAttributes)) {
            return super.mo89877a(typeParameterDescriptor, erasureTypeAttributes, typeParameterUpperBoundEraser, kotlinType);
        }
        JavaTypeAttributes javaTypeAttributesM89855l = (JavaTypeAttributes) erasureTypeAttributes;
        if (!javaTypeAttributesM89855l.m89852i()) {
            javaTypeAttributesM89855l = javaTypeAttributesM89855l.m89855l(JavaTypeFlexibility.INFLEXIBLE);
        }
        int i = WhenMappings.f64949a[javaTypeAttributesM89855l.m89850g().ordinal()];
        if (i == 1) {
            return new TypeProjectionImpl(Variance.INVARIANT, kotlinType);
        }
        if (i != 2 && i != 3) {
            l9r.m149037a();
            return null;
        }
        if (!typeParameterDescriptor.mo88601h().getAllowsOutPosition()) {
            return new TypeProjectionImpl(Variance.INVARIANT, DescriptorUtilsKt.m91980m(typeParameterDescriptor).m88213I());
        }
        List<TypeParameterDescriptor> parameters = kotlinType.mo91890G0().getParameters();
        parameters.getClass();
        if (!parameters.isEmpty()) {
            return new TypeProjectionImpl(Variance.OUT_VARIANCE, kotlinType);
        }
        TypeProjection typeProjectionM92809t = TypeUtils.m92809t(typeParameterDescriptor, javaTypeAttributesM89855l);
        typeProjectionM92809t.getClass();
        return typeProjectionM92809t;
    }
}
