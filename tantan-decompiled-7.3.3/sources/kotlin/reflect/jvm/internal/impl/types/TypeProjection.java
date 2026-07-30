package kotlin.reflect.jvm.internal.impl.types;

import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public interface TypeProjection extends TypeArgumentMarker {
    @NotNull
    /* JADX INFO: renamed from: a */
    TypeProjection mo93556a(@NotNull KotlinTypeRefiner kotlinTypeRefiner);

    /* JADX INFO: renamed from: b */
    boolean mo93557b();

    @NotNull
    /* JADX INFO: renamed from: c */
    Variance mo93558c();

    @NotNull
    KotlinType getType();
}
