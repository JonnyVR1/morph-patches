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
    public final TypeUsage f66890a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final Set<TypeParameterDescriptor> f66891b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public final SimpleType f66892c;

    /* JADX WARN: Multi-variable type inference failed */
    public ErasureTypeAttributes(@NotNull TypeUsage typeUsage, @Nullable Set<? extends TypeParameterDescriptor> set, @Nullable SimpleType simpleType) {
        typeUsage.getClass();
        this.f66890a = typeUsage;
        this.f66891b = set;
        this.f66892c = simpleType;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public SimpleType mo90736a() {
        return this.f66892c;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public TypeUsage mo90737b() {
        return this.f66890a;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public Set<TypeParameterDescriptor> mo90738c() {
        return this.f66891b;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public ErasureTypeAttributes mo90739d(@NotNull TypeParameterDescriptor typeParameterDescriptor) {
        Set of;
        typeParameterDescriptor.getClass();
        TypeUsage typeUsageMo90737b = mo90737b();
        Set<TypeParameterDescriptor> setMo90738c = mo90738c();
        if (setMo90738c == null || (of = SetsKt.plus(setMo90738c, typeParameterDescriptor)) == null) {
            of = SetsKt.setOf(typeParameterDescriptor);
        }
        return new ErasureTypeAttributes(typeUsageMo90737b, of, mo90736a());
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof ErasureTypeAttributes)) {
            return false;
        }
        ErasureTypeAttributes erasureTypeAttributes = (ErasureTypeAttributes) obj;
        return Intrinsics.m88377d(erasureTypeAttributes.mo90736a(), mo90736a()) && erasureTypeAttributes.mo90737b() == mo90737b();
    }

    public int hashCode() {
        SimpleType simpleTypeMo90736a = mo90736a();
        int iHashCode = simpleTypeMo90736a != null ? simpleTypeMo90736a.hashCode() : 0;
        return iHashCode + (iHashCode * 31) + mo90737b().hashCode();
    }
}
