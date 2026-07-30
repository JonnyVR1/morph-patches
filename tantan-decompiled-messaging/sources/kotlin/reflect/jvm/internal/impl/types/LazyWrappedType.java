package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import org.jetbrains.annotations.NotNull;
import p149l.v9r;

/* JADX INFO: loaded from: classes2.dex */
public final class LazyWrappedType extends WrappedType {

    /* JADX INFO: renamed from: b */
    @NotNull
    public final StorageManager f66237b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final Function0<KotlinType> f66238c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final NotNullLazyValue<KotlinType> f66239d;

    /* JADX WARN: Multi-variable type inference failed */
    public LazyWrappedType(@NotNull StorageManager storageManager, @NotNull Function0<? extends KotlinType> function0) {
        storageManager.getClass();
        function0.getClass();
        this.f66237b = storageManager;
        this.f66238c = function0;
        this.f66239d = storageManager.mo92446e(function0);
    }

    /* JADX INFO: renamed from: O0 */
    public static final KotlinType m92647O0(KotlinTypeRefiner kotlinTypeRefiner, LazyWrappedType lazyWrappedType) {
        return kotlinTypeRefiner.mo92559a(lazyWrappedType.f66238c.invoke());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.WrappedType
    @NotNull
    /* JADX INFO: renamed from: K0 */
    public KotlinType mo92648K0() {
        return this.f66239d.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.WrappedType
    /* JADX INFO: renamed from: L0 */
    public boolean mo92649L0() {
        return this.f66239d.m92482d();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    /* JADX INFO: renamed from: N0, reason: merged with bridge method [inline-methods] */
    public LazyWrappedType mo92486Q0(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        kotlinTypeRefiner.getClass();
        return new LazyWrappedType(this.f66237b, new v9r(kotlinTypeRefiner, this));
    }
}
