package kotlin.reflect.jvm.internal.impl.types;

import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public interface TypeProjection extends TypeArgumentMarker {
    @NotNull
    /* JADX INFO: renamed from: a */
    TypeProjection mo92665a(@NotNull KotlinTypeRefiner kotlinTypeRefiner);

    /* JADX INFO: renamed from: b */
    boolean mo92666b();

    @NotNull
    /* JADX INFO: renamed from: c */
    Variance mo92667c();

    @NotNull
    KotlinType getType();
}
