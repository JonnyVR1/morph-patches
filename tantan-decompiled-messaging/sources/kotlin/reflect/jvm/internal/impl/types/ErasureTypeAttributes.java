package kotlin.reflect.jvm.internal.impl.types;

import java.util.Set;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public class ErasureTypeAttributes {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final TypeUsage f66216a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final Set<TypeParameterDescriptor> f66217b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public final SimpleType f66218c;

    /* JADX WARN: Multi-variable type inference failed */
    public ErasureTypeAttributes(@NotNull TypeUsage typeUsage, @Nullable Set<? extends TypeParameterDescriptor> set, @Nullable SimpleType simpleType) {
        typeUsage.getClass();
        this.f66216a = typeUsage;
        this.f66217b = set;
        this.f66218c = simpleType;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public SimpleType mo89845a() {
        return this.f66218c;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public TypeUsage mo89846b() {
        return this.f66216a;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public Set<TypeParameterDescriptor> mo89847c() {
        return this.f66217b;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public ErasureTypeAttributes mo89848d(@NotNull TypeParameterDescriptor typeParameterDescriptor) {
        Set of;
        typeParameterDescriptor.getClass();
        TypeUsage typeUsageMo89846b = mo89846b();
        Set<TypeParameterDescriptor> setMo89847c = mo89847c();
        if (setMo89847c == null || (of = SetsKt.plus(setMo89847c, typeParameterDescriptor)) == null) {
            of = SetsKt.setOf(typeParameterDescriptor);
        }
        return new ErasureTypeAttributes(typeUsageMo89846b, of, mo89845a());
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof ErasureTypeAttributes)) {
            return false;
        }
        ErasureTypeAttributes erasureTypeAttributes = (ErasureTypeAttributes) obj;
        return Intrinsics.m87488d(erasureTypeAttributes.mo89845a(), mo89845a()) && erasureTypeAttributes.mo89846b() == mo89846b();
    }

    public int hashCode() {
        SimpleType simpleTypeMo89845a = mo89845a();
        int iHashCode = simpleTypeMo89845a != null ? simpleTypeMo89845a.hashCode() : 0;
        return iHashCode + (iHashCode * 31) + mo89846b().hashCode();
    }
}
