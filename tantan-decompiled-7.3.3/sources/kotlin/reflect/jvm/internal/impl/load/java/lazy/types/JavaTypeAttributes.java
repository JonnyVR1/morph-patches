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
    public final TypeUsage f65612d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final JavaTypeFlexibility f65613e;

    /* JADX INFO: renamed from: f */
    public final boolean f65614f;

    /* JADX INFO: renamed from: g */
    public final boolean f65615g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public final Set<TypeParameterDescriptor> f65616h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public final SimpleType f65617i;

    public /* synthetic */ JavaTypeAttributes(TypeUsage typeUsage, JavaTypeFlexibility javaTypeFlexibility, boolean z, boolean z2, Set set, SimpleType simpleType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(typeUsage, (i & 2) != 0 ? JavaTypeFlexibility.INFLEXIBLE : javaTypeFlexibility, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? null : set, (i & 32) != 0 ? null : simpleType);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    public static /* synthetic */ JavaTypeAttributes m90735f(JavaTypeAttributes javaTypeAttributes, TypeUsage typeUsage, JavaTypeFlexibility javaTypeFlexibility, boolean z, boolean z2, Set set, SimpleType simpleType, int i, Object obj) {
        if ((i & 1) != 0) {
            typeUsage = javaTypeAttributes.f65612d;
        }
        if ((i & 2) != 0) {
            javaTypeFlexibility = javaTypeAttributes.f65613e;
        }
        if ((i & 4) != 0) {
            z = javaTypeAttributes.f65614f;
        }
        if ((i & 8) != 0) {
            z2 = javaTypeAttributes.f65615g;
        }
        if ((i & 16) != 0) {
            set = javaTypeAttributes.f65616h;
        }
        if ((i & 32) != 0) {
            simpleType = javaTypeAttributes.f65617i;
        }
        Set set2 = set;
        SimpleType simpleType2 = simpleType;
        return javaTypeAttributes.m90740e(typeUsage, javaTypeFlexibility, z, z2, set2, simpleType2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ErasureTypeAttributes
    @Nullable
    /* JADX INFO: renamed from: a */
    public SimpleType mo90736a() {
        return this.f65617i;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ErasureTypeAttributes
    @NotNull
    /* JADX INFO: renamed from: b */
    public TypeUsage mo90737b() {
        return this.f65612d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ErasureTypeAttributes
    @Nullable
    /* JADX INFO: renamed from: c */
    public Set<TypeParameterDescriptor> mo90738c() {
        return this.f65616h;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final JavaTypeAttributes m90740e(@NotNull TypeUsage typeUsage, @NotNull JavaTypeFlexibility javaTypeFlexibility, boolean z, boolean z2, @Nullable Set<? extends TypeParameterDescriptor> set, @Nullable SimpleType simpleType) {
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
        return Intrinsics.m88377d(javaTypeAttributes.mo90736a(), mo90736a()) && javaTypeAttributes.mo90737b() == mo90737b() && javaTypeAttributes.f65613e == this.f65613e && javaTypeAttributes.f65614f == this.f65614f && javaTypeAttributes.f65615g == this.f65615g;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final JavaTypeFlexibility m90741g() {
        return this.f65613e;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m90742h() {
        return this.f65615g;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ErasureTypeAttributes
    public int hashCode() {
        SimpleType simpleTypeMo90736a = mo90736a();
        int iHashCode = simpleTypeMo90736a != null ? simpleTypeMo90736a.hashCode() : 0;
        int iHashCode2 = iHashCode + (iHashCode * 31) + mo90737b().hashCode();
        int iHashCode3 = iHashCode2 + (iHashCode2 * 31) + this.f65613e.hashCode();
        int i = iHashCode3 + (iHashCode3 * 31) + (this.f65614f ? 1 : 0);
        return i + (i * 31) + (this.f65615g ? 1 : 0);
    }

    /* JADX INFO: renamed from: i */
    public final boolean m90743i() {
        return this.f65614f;
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final JavaTypeAttributes m90744j(boolean z) {
        return m90735f(this, null, null, z, false, null, null, 59, null);
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public JavaTypeAttributes m90745k(@Nullable SimpleType simpleType) {
        return m90735f(this, null, null, false, false, null, simpleType, 31, null);
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final JavaTypeAttributes m90746l(@NotNull JavaTypeFlexibility javaTypeFlexibility) {
        javaTypeFlexibility.getClass();
        return m90735f(this, null, javaTypeFlexibility, false, false, null, null, 61, null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ErasureTypeAttributes
    @NotNull
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public JavaTypeAttributes mo90739d(@NotNull TypeParameterDescriptor typeParameterDescriptor) {
        typeParameterDescriptor.getClass();
        return m90735f(this, null, null, false, false, mo90738c() != null ? SetsKt.plus(mo90738c(), typeParameterDescriptor) : SetsKt.setOf(typeParameterDescriptor), null, 47, null);
    }

    @NotNull
    public String toString() {
        return "JavaTypeAttributes(howThisTypeIsUsed=" + this.f65612d + ", flexibility=" + this.f65613e + ", isRaw=" + this.f65614f + ", isForAnnotationParameter=" + this.f65615g + ", visitedTypeParameters=" + this.f65616h + ", defaultType=" + this.f65617i + ')';
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public JavaTypeAttributes(@NotNull TypeUsage typeUsage, @NotNull JavaTypeFlexibility javaTypeFlexibility, boolean z, boolean z2, @Nullable Set<? extends TypeParameterDescriptor> set, @Nullable SimpleType simpleType) {
        super(typeUsage, set, simpleType);
        typeUsage.getClass();
        javaTypeFlexibility.getClass();
        this.f65612d = typeUsage;
        this.f65613e = javaTypeFlexibility;
        this.f65614f = z;
        this.f65615g = z2;
        this.f65616h = set;
        this.f65617i = simpleType;
    }
}
