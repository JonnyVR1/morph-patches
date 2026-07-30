package p153l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;

/* JADX INFO: renamed from: l.r8 */
/* JADX INFO: loaded from: classes2.dex */
public class C19787r8 implements Function1 {

    /* JADX INFO: renamed from: a */
    public final AbstractTypeConstructor f161654a;

    public C19787r8(AbstractTypeConstructor abstractTypeConstructor) {
        this.f161654a = abstractTypeConstructor;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return AbstractTypeConstructor.m93429G(this.f161654a, (TypeConstructor) obj);
    }
}
