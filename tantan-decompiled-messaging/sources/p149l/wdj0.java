package p149l;

import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class wdj0 {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final TypeParameterDescriptor f185807a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final KotlinType f185808b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final KotlinType f185809c;

    public wdj0(@NotNull TypeParameterDescriptor typeParameterDescriptor, @NotNull KotlinType kotlinType, @NotNull KotlinType kotlinType2) {
        typeParameterDescriptor.getClass();
        kotlinType.getClass();
        kotlinType2.getClass();
        this.f185807a = typeParameterDescriptor;
        this.f185808b = kotlinType;
        this.f185809c = kotlinType2;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final KotlinType m202737a() {
        return this.f185808b;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final KotlinType m202738b() {
        return this.f185809c;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final TypeParameterDescriptor m202739c() {
        return this.f185807a;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m202740d() {
        return KotlinTypeChecker.f66298a.mo92904d(this.f185808b, this.f185809c);
    }
}
