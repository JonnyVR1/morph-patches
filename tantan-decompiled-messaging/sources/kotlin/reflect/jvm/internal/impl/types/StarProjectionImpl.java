package kotlin.reflect.jvm.internal.impl.types;

import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import org.jetbrains.annotations.NotNull;
import p149l.ztf0;

/* JADX INFO: loaded from: classes2.dex */
public final class StarProjectionImpl extends TypeProjectionBase {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final TypeParameterDescriptor f66243a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Lazy f66244b;

    public StarProjectionImpl(@NotNull TypeParameterDescriptor typeParameterDescriptor) {
        typeParameterDescriptor.getClass();
        this.f66243a = typeParameterDescriptor;
        this.f66244b = LazyKt__LazyJVMKt.m87228a(LazyThreadSafetyMode.PUBLICATION, new ztf0(this));
    }

    /* JADX INFO: renamed from: d */
    public static final KotlinType m92668d(StarProjectionImpl starProjectionImpl) {
        return StarProjectionImplKt.m92672b(starProjectionImpl.f66243a);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeProjection
    @NotNull
    /* JADX INFO: renamed from: a */
    public TypeProjection mo92665a(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        kotlinTypeRefiner.getClass();
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeProjection
    /* JADX INFO: renamed from: b */
    public boolean mo92666b() {
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeProjection
    @NotNull
    /* JADX INFO: renamed from: c */
    public Variance mo92667c() {
        return Variance.OUT_VARIANCE;
    }

    /* JADX INFO: renamed from: f */
    public final KotlinType m92670f() {
        return (KotlinType) this.f66244b.getValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeProjection
    @NotNull
    public KotlinType getType() {
        return m92670f();
    }
}
