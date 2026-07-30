package p149l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;

/* JADX INFO: renamed from: l.w8 */
/* JADX INFO: loaded from: classes2.dex */
public class C20830w8 implements Function1 {

    /* JADX INFO: renamed from: a */
    public final AbstractTypeConstructor f185123a;

    public C20830w8(AbstractTypeConstructor abstractTypeConstructor) {
        this.f185123a = abstractTypeConstructor;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return AbstractTypeConstructor.m92538G(this.f185123a, (TypeConstructor) obj);
    }
}
