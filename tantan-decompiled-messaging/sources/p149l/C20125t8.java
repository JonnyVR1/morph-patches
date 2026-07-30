package p149l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor;

/* JADX INFO: renamed from: l.t8 */
/* JADX INFO: loaded from: classes2.dex */
public class C20125t8 implements Function1 {

    /* JADX INFO: renamed from: a */
    public final AbstractTypeConstructor f168794a;

    public C20125t8(AbstractTypeConstructor abstractTypeConstructor) {
        this.f168794a = abstractTypeConstructor;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return AbstractTypeConstructor.m92535D(this.f168794a, (AbstractTypeConstructor.C15339b) obj);
    }
}
