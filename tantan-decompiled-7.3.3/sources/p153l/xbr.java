package p153l;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.types.LazyWrappedType;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* JADX INFO: loaded from: classes2.dex */
public class xbr implements Function0 {

    /* JADX INFO: renamed from: a */
    public final KotlinTypeRefiner f193199a;

    /* JADX INFO: renamed from: b */
    public final LazyWrappedType f193200b;

    public xbr(KotlinTypeRefiner kotlinTypeRefiner, LazyWrappedType lazyWrappedType) {
        this.f193199a = kotlinTypeRefiner;
        this.f193200b = lazyWrappedType;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return LazyWrappedType.m93538O0(this.f193199a, this.f193200b);
    }
}
