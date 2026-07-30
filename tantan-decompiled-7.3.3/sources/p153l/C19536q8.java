package p153l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* JADX INFO: renamed from: l.q8 */
/* JADX INFO: loaded from: classes2.dex */
public class C19536q8 implements Function1 {

    /* JADX INFO: renamed from: a */
    public final AbstractTypeConstructor f156012a;

    public C19536q8(AbstractTypeConstructor abstractTypeConstructor) {
        this.f156012a = abstractTypeConstructor;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return AbstractTypeConstructor.m93428F(this.f156012a, (KotlinType) obj);
    }
}
