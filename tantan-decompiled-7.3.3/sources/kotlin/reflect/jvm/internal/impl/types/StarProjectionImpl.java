package kotlin.reflect.jvm.internal.impl.types;

import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import org.jetbrains.annotations.NotNull;
import p153l.i2g0;

/* JADX INFO: loaded from: classes2.dex */
public final class StarProjectionImpl extends TypeProjectionBase {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final TypeParameterDescriptor f66917a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Lazy f66918b;

    public StarProjectionImpl(@NotNull TypeParameterDescriptor typeParameterDescriptor) {
        typeParameterDescriptor.getClass();
        this.f66917a = typeParameterDescriptor;
        this.f66918b = LazyKt__LazyJVMKt.m88117a(LazyThreadSafetyMode.PUBLICATION, new i2g0(this));
    }

    /* JADX INFO: renamed from: d */
    public static final KotlinType m93559d(StarProjectionImpl starProjectionImpl) {
        return StarProjectionImplKt.m93563b(starProjectionImpl.f66917a);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeProjection
    @NotNull
    /* JADX INFO: renamed from: a */
    public TypeProjection mo93556a(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        kotlinTypeRefiner.getClass();
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeProjection
    /* JADX INFO: renamed from: b */
    public boolean mo93557b() {
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeProjection
    @NotNull
    /* JADX INFO: renamed from: c */
    public Variance mo93558c() {
        return Variance.OUT_VARIANCE;
    }

    /* JADX INFO: renamed from: f */
    public final KotlinType m93561f() {
        return (KotlinType) this.f66918b.getValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeProjection
    @NotNull
    public KotlinType getType() {
        return m93561f();
    }
}
