package p153l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;

/* JADX INFO: renamed from: l.p8 */
/* JADX INFO: loaded from: classes2.dex */
public class C19322p8 implements Function1 {

    /* JADX INFO: renamed from: a */
    public final AbstractTypeConstructor f150980a;

    public C19322p8(AbstractTypeConstructor abstractTypeConstructor) {
        this.f150980a = abstractTypeConstructor;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return AbstractTypeConstructor.m93427E(this.f150980a, (TypeConstructor) obj);
    }
}
