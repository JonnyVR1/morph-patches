package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import java.util.Set;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.ErasureTypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class JavaTypeAttributes extends ErasureTypeAttributes {

    /* JADX INFO: renamed from: d */
    @NotNull
    public final TypeUsage f64938d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final JavaTypeFlexibility f64939e;

    /* JADX INFO: renamed from: f */
    public final boolean f64940f;

    /* JADX INFO: renamed from: g */
    public final boolean f64941g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public final Set<TypeParameterDescriptor> f64942h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public final SimpleType f64943i;

    public /* synthetic */ JavaTypeAttributes(TypeUsage typeUsage, JavaTypeFlexibility javaTypeFlexibility, boolean z, boolean z2, Set set, SimpleType simpleType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(typeUsage, (i & 2) != 0 ? JavaTypeFlexibility.INFLEXIBLE : javaTypeFlexibility, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? null : set, (i & 32) != 0 ? null : simpleType);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    public static /* synthetic */ JavaTypeAttributes m89844f(JavaTypeAttributes javaTypeAttributes, TypeUsage typeUsage, JavaTypeFlexibility javaTypeFlexibility, boolean z, boolean z2, Set set, SimpleType simpleType, int i, Object obj) {
        if ((i & 1) != 0) {
            typeUsage = javaTypeAttributes.f64938d;
        }
        if ((i & 2) != 0) {
            javaTypeFlexibility = javaTypeAttributes.f64939e;
        }
        if ((i & 4) != 0) {
            z = javaTypeAttributes.f64940f;
        }
        if ((i & 8) != 0) {
            z2 = javaTypeAttributes.f64941g;
        }
        if ((i & 16) != 0) {
            set = javaTypeAttributes.f64942h;
        }
        if ((i & 32) != 0) {
            simpleType = javaTypeAttributes.f64943i;
        }
        Set set2 = set;
        SimpleType simpleType2 = simpleType;
        return javaTypeAttributes.m89849e(typeUsage, javaTypeFlexibility, z, z2, set2, simpleType2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ErasureTypeAttributes
    @Nullable
    /* JADX INFO: renamed from: a */
    public SimpleType mo89845a() {
        return this.f64943i;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ErasureTypeAttributes
    @NotNull
    /* JADX INFO: renamed from: b */
    public TypeUsage mo89846b() {
        return this.f64938d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ErasureTypeAttributes
    @Nullable
    /* JADX INFO: renamed from: c */
    public Set<TypeParameterDescriptor> mo89847c() {
        return this.f64942h;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final JavaTypeAttributes m89849e(@NotNull TypeUsage typeUsage, @NotNull JavaTypeFlexibility javaTypeFlexibility, boolean z, boolean z2, @Nullable Set<? extends TypeParameterDescriptor> set, @Nullable SimpleType simpleType) {
        typeUsage.getClass();
        javaTypeFlexibility.getClass();
        return new JavaTypeAttributes(typeUsage, javaTypeFlexibility, z, z2, set, simpleType);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ErasureTypeAttributes
    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof JavaTypeAttributes)) {
            return false;
        }
        JavaTypeAttributes javaTypeAttributes = (JavaTypeAttributes) obj;
        return Intrinsics.m87488d(javaTypeAttributes.mo89845a(), mo89845a()) && javaTypeAttributes.mo89846b() == mo89846b() && javaTypeAttributes.f64939e == this.f64939e && javaTypeAttributes.f64940f == this.f64940f && javaTypeAttributes.f64941g == this.f64941g;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final JavaTypeFlexibility m89850g() {
        return this.f64939e;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m89851h() {
        return this.f64941g;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ErasureTypeAttributes
    public int hashCode() {
        SimpleType simpleTypeMo89845a = mo89845a();
        int iHashCode = simpleTypeMo89845a != null ? simpleTypeMo89845a.hashCode() : 0;
        int iHashCode2 = iHashCode + (iHashCode * 31) + mo89846b().hashCode();
        int iHashCode3 = iHashCode2 + (iHashCode2 * 31) + this.f64939e.hashCode();
        int i = iHashCode3 + (iHashCode3 * 31) + (this.f64940f ? 1 : 0);
        return i + (i * 31) + (this.f64941g ? 1 : 0);
    }

    /* JADX INFO: renamed from: i */
    public final boolean m89852i() {
        return this.f64940f;
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final JavaTypeAttributes m89853j(boolean z) {
        return m89844f(this, null, null, z, false, null, null, 59, null);
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public JavaTypeAttributes m89854k(@Nullable SimpleType simpleType) {
        return m89844f(this, null, null, false, false, null, simpleType, 31, null);
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final JavaTypeAttributes m89855l(@NotNull JavaTypeFlexibility javaTypeFlexibility) {
        javaTypeFlexibility.getClass();
        return m89844f(this, null, javaTypeFlexibility, false, false, null, null, 61, null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ErasureTypeAttributes
    @NotNull
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public JavaTypeAttributes mo89848d(@NotNull TypeParameterDescriptor typeParameterDescriptor) {
        typeParameterDescriptor.getClass();
        return m89844f(this, null, null, false, false, mo89847c() != null ? SetsKt.plus(mo89847c(), typeParameterDescriptor) : SetsKt.setOf(typeParameterDescriptor), null, 47, null);
    }

    @NotNull
    public String toString() {
        return "JavaTypeAttributes(howThisTypeIsUsed=" + this.f64938d + ", flexibility=" + this.f64939e + ", isRaw=" + this.f64940f + ", isForAnnotationParameter=" + this.f64941g + ", visitedTypeParameters=" + this.f64942h + ", defaultType=" + this.f64943i + ')';
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public JavaTypeAttributes(@NotNull TypeUsage typeUsage, @NotNull JavaTypeFlexibility javaTypeFlexibility, boolean z, boolean z2, @Nullable Set<? extends TypeParameterDescriptor> set, @Nullable SimpleType simpleType) {
        super(typeUsage, set, simpleType);
        typeUsage.getClass();
        javaTypeFlexibility.getClass();
        this.f64938d = typeUsage;
        this.f64939e = javaTypeFlexibility;
        this.f64940f = z;
        this.f64941g = z2;
        this.f64942h = set;
        this.f64943i = simpleType;
    }
}
