package kotlin.reflect.jvm.internal.impl.resolve.calls.inference;

import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public interface CapturedTypeConstructor extends TypeConstructor, CapturedTypeConstructorMarker {
    @NotNull
    /* JADX INFO: renamed from: d */
    TypeProjection mo91894d();
}
