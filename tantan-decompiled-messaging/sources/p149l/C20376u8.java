package p149l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;

/* JADX INFO: renamed from: l.u8 */
/* JADX INFO: loaded from: classes2.dex */
public class C20376u8 implements Function1 {

    /* JADX INFO: renamed from: a */
    public final AbstractTypeConstructor f175086a;

    public C20376u8(AbstractTypeConstructor abstractTypeConstructor) {
        this.f175086a = abstractTypeConstructor;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return AbstractTypeConstructor.m92536E(this.f175086a, (TypeConstructor) obj);
    }
}
