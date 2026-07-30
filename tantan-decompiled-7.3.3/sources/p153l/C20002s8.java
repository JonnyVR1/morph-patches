package p153l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* JADX INFO: renamed from: l.s8 */
/* JADX INFO: loaded from: classes2.dex */
public class C20002s8 implements Function1 {

    /* JADX INFO: renamed from: a */
    public final AbstractTypeConstructor f166733a;

    public C20002s8(AbstractTypeConstructor abstractTypeConstructor) {
        this.f166733a = abstractTypeConstructor;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return AbstractTypeConstructor.m93430H(this.f166733a, (KotlinType) obj);
    }
}
