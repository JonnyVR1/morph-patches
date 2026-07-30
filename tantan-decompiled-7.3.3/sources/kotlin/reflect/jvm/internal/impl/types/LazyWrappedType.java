package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import org.jetbrains.annotations.NotNull;
import p153l.xbr;

/* JADX INFO: loaded from: classes2.dex */
public final class LazyWrappedType extends WrappedType {

    /* JADX INFO: renamed from: b */
    @NotNull
    public final StorageManager f66911b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final Function0<KotlinType> f66912c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final NotNullLazyValue<KotlinType> f66913d;

    /* JADX WARN: Multi-variable type inference failed */
    public LazyWrappedType(@NotNull StorageManager storageManager, @NotNull Function0<? extends KotlinType> function0) {
        storageManager.getClass();
        function0.getClass();
        this.f66911b = storageManager;
        this.f66912c = function0;
        this.f66913d = storageManager.mo93337e(function0);
    }

    /* JADX INFO: renamed from: O0 */
    public static final KotlinType m93538O0(KotlinTypeRefiner kotlinTypeRefiner, LazyWrappedType lazyWrappedType) {
        return kotlinTypeRefiner.mo93450a(lazyWrappedType.f66912c.invoke());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.WrappedType
    @NotNull
    /* JADX INFO: renamed from: K0 */
    public KotlinType mo93539K0() {
        return this.f66913d.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.WrappedType
    /* JADX INFO: renamed from: L0 */
    public boolean mo93540L0() {
        return this.f66913d.m93373d();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    /* JADX INFO: renamed from: N0, reason: merged with bridge method [inline-methods] */
    public LazyWrappedType mo93377Q0(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        kotlinTypeRefiner.getClass();
        return new LazyWrappedType(this.f66911b, new xbr(kotlinTypeRefiner, this));
    }
}
