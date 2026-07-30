package p149l;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.types.LazyWrappedType;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* JADX INFO: loaded from: classes2.dex */
public class v9r implements Function0 {

    /* JADX INFO: renamed from: a */
    public final KotlinTypeRefiner f180670a;

    /* JADX INFO: renamed from: b */
    public final LazyWrappedType f180671b;

    public v9r(KotlinTypeRefiner kotlinTypeRefiner, LazyWrappedType lazyWrappedType) {
        this.f180670a = kotlinTypeRefiner;
        this.f180671b = lazyWrappedType;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return LazyWrappedType.m92647O0(this.f180670a, this.f180671b);
    }
}
