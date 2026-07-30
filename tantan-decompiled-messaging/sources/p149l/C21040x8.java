package p149l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* JADX INFO: renamed from: l.x8 */
/* JADX INFO: loaded from: classes2.dex */
public class C21040x8 implements Function1 {

    /* JADX INFO: renamed from: a */
    public final AbstractTypeConstructor f191422a;

    public C21040x8(AbstractTypeConstructor abstractTypeConstructor) {
        this.f191422a = abstractTypeConstructor;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return AbstractTypeConstructor.m92539H(this.f191422a, (KotlinType) obj);
    }
}
