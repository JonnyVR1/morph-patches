package kotlin.reflect.jvm.internal.impl.types;

import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class StarProjectionForAbsentTypeParameter extends TypeProjectionBase {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final KotlinType f66242a;

    public StarProjectionForAbsentTypeParameter(@NotNull KotlinBuiltIns kotlinBuiltIns) {
        kotlinBuiltIns.getClass();
        SimpleType simpleTypeM88214J = kotlinBuiltIns.m88214J();
        simpleTypeM88214J.getClass();
        this.f66242a = simpleTypeM88214J;
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

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeProjection
    @NotNull
    public KotlinType getType() {
        return this.f66242a;
    }
}
