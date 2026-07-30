package p153l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor;

/* JADX INFO: renamed from: l.o8 */
/* JADX INFO: loaded from: classes2.dex */
public class C19048o8 implements Function1 {

    /* JADX INFO: renamed from: a */
    public final AbstractTypeConstructor f145342a;

    public C19048o8(AbstractTypeConstructor abstractTypeConstructor) {
        this.f145342a = abstractTypeConstructor;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return AbstractTypeConstructor.m93426D(this.f145342a, (AbstractTypeConstructor.C15446b) obj);
    }
}
