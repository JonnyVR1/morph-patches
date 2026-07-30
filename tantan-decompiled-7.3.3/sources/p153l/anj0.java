package p153l;

import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class anj0 {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final TypeParameterDescriptor f72357a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final KotlinType f72358b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final KotlinType f72359c;

    public anj0(@NotNull TypeParameterDescriptor typeParameterDescriptor, @NotNull KotlinType kotlinType, @NotNull KotlinType kotlinType2) {
        typeParameterDescriptor.getClass();
        kotlinType.getClass();
        kotlinType2.getClass();
        this.f72357a = typeParameterDescriptor;
        this.f72358b = kotlinType;
        this.f72359c = kotlinType2;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final KotlinType m98995a() {
        return this.f72358b;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final KotlinType m98996b() {
        return this.f72359c;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final TypeParameterDescriptor m98997c() {
        return this.f72357a;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m98998d() {
        return KotlinTypeChecker.f66972a.mo93795d(this.f72358b, this.f72359c);
    }
}
