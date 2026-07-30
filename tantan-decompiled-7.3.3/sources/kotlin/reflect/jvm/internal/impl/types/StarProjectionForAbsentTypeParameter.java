package kotlin.reflect.jvm.internal.impl.types;

import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class StarProjectionForAbsentTypeParameter extends TypeProjectionBase {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final KotlinType f66916a;

    public StarProjectionForAbsentTypeParameter(@NotNull KotlinBuiltIns kotlinBuiltIns) {
        kotlinBuiltIns.getClass();
        SimpleType simpleTypeM89105J = kotlinBuiltIns.m89105J();
        simpleTypeM89105J.getClass();
        this.f66916a = simpleTypeM89105J;
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

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeProjection
    @NotNull
    public KotlinType getType() {
        return this.f66916a;
    }
}
