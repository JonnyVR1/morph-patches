package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class IndexedParametersSubstitution extends TypeSubstitution {

    /* JADX INFO: renamed from: b */
    @NotNull
    public final TypeParameterDescriptor[] f66900b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final TypeProjection[] f66901c;

    /* JADX INFO: renamed from: d */
    public final boolean f66902d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IndexedParametersSubstitution(@NotNull List<? extends TypeParameterDescriptor> list, @NotNull List<? extends TypeProjection> list2) {
        this((TypeParameterDescriptor[]) list.toArray(new TypeParameterDescriptor[0]), (TypeProjection[]) list2.toArray(new TypeProjection[0]), false, 4, null);
        list.getClass();
        list2.getClass();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    /* JADX INFO: renamed from: b */
    public boolean mo92798b() {
        return this.f66902d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    @Nullable
    /* JADX INFO: renamed from: e */
    public TypeProjection mo90772e(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        ClassifierDescriptor classifierDescriptorMo89207e = kotlinType.mo92781G0().mo89207e();
        TypeParameterDescriptor typeParameterDescriptor = classifierDescriptorMo89207e instanceof TypeParameterDescriptor ? (TypeParameterDescriptor) classifierDescriptorMo89207e : null;
        if (typeParameterDescriptor == null) {
            return null;
        }
        int index = typeParameterDescriptor.getIndex();
        TypeParameterDescriptor[] typeParameterDescriptorArr = this.f66900b;
        if (index >= typeParameterDescriptorArr.length || !Intrinsics.m88377d(typeParameterDescriptorArr[index].mo89196l(), typeParameterDescriptor.mo89196l())) {
            return null;
        }
        return this.f66901c[index];
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    /* JADX INFO: renamed from: f */
    public boolean mo90773f() {
        return this.f66901c.length == 0;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final TypeProjection[] m93500i() {
        return this.f66901c;
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final TypeParameterDescriptor[] m93501j() {
        return this.f66900b;
    }

    public /* synthetic */ IndexedParametersSubstitution(TypeParameterDescriptor[] typeParameterDescriptorArr, TypeProjection[] typeProjectionArr, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(typeParameterDescriptorArr, typeProjectionArr, (i & 4) != 0 ? false : z);
    }

    public IndexedParametersSubstitution(@NotNull TypeParameterDescriptor[] typeParameterDescriptorArr, @NotNull TypeProjection[] typeProjectionArr, boolean z) {
        typeParameterDescriptorArr.getClass();
        typeProjectionArr.getClass();
        this.f66900b = typeParameterDescriptorArr;
        this.f66901c = typeProjectionArr;
        this.f66902d = z;
        int length = typeParameterDescriptorArr.length;
        int length2 = typeProjectionArr.length;
    }
}
