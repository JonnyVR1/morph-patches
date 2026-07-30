package p149l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* JADX INFO: renamed from: l.v8 */
/* JADX INFO: loaded from: classes2.dex */
public class C20595v8 implements Function1 {

    /* JADX INFO: renamed from: a */
    public final AbstractTypeConstructor f180435a;

    public C20595v8(AbstractTypeConstructor abstractTypeConstructor) {
        this.f180435a = abstractTypeConstructor;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return AbstractTypeConstructor.m92537F(this.f180435a, (KotlinType) obj);
    }
}
