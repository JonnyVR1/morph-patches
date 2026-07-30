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
    public final TypeParameterDescriptor[] f66226b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final TypeProjection[] f66227c;

    /* JADX INFO: renamed from: d */
    public final boolean f66228d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IndexedParametersSubstitution(@NotNull List<? extends TypeParameterDescriptor> list, @NotNull List<? extends TypeProjection> list2) {
        this((TypeParameterDescriptor[]) list.toArray(new TypeParameterDescriptor[0]), (TypeProjection[]) list2.toArray(new TypeProjection[0]), false, 4, null);
        list.getClass();
        list2.getClass();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    /* JADX INFO: renamed from: b */
    public boolean mo91907b() {
        return this.f66228d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    @Nullable
    /* JADX INFO: renamed from: e */
    public TypeProjection mo89881e(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
        ClassifierDescriptor classifierDescriptorMo88316e = kotlinType.mo91890G0().mo88316e();
        TypeParameterDescriptor typeParameterDescriptor = classifierDescriptorMo88316e instanceof TypeParameterDescriptor ? (TypeParameterDescriptor) classifierDescriptorMo88316e : null;
        if (typeParameterDescriptor == null) {
            return null;
        }
        int index = typeParameterDescriptor.getIndex();
        TypeParameterDescriptor[] typeParameterDescriptorArr = this.f66226b;
        if (index >= typeParameterDescriptorArr.length || !Intrinsics.m87488d(typeParameterDescriptorArr[index].mo88305l(), typeParameterDescriptor.mo88305l())) {
            return null;
        }
        return this.f66227c[index];
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    /* JADX INFO: renamed from: f */
    public boolean mo89882f() {
        return this.f66227c.length == 0;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final TypeProjection[] m92609i() {
        return this.f66227c;
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final TypeParameterDescriptor[] m92610j() {
        return this.f66226b;
    }

    public /* synthetic */ IndexedParametersSubstitution(TypeParameterDescriptor[] typeParameterDescriptorArr, TypeProjection[] typeProjectionArr, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(typeParameterDescriptorArr, typeProjectionArr, (i & 4) != 0 ? false : z);
    }

    public IndexedParametersSubstitution(@NotNull TypeParameterDescriptor[] typeParameterDescriptorArr, @NotNull TypeProjection[] typeProjectionArr, boolean z) {
        typeParameterDescriptorArr.getClass();
        typeProjectionArr.getClass();
        this.f66226b = typeParameterDescriptorArr;
        this.f66227c = typeProjectionArr;
        this.f66228d = z;
        int length = typeParameterDescriptorArr.length;
        int length2 = typeProjectionArr.length;
    }
}
