package p153l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts;
import kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext;

/* JADX INFO: renamed from: l.c8 */
/* JADX INFO: loaded from: classes2.dex */
public class C16208c8 implements Function1 {

    /* JADX INFO: renamed from: a */
    public final AbstractSignatureParts f80170a;

    /* JADX INFO: renamed from: b */
    public final TypeSystemContext f80171b;

    public C16208c8(AbstractSignatureParts abstractSignatureParts, TypeSystemContext typeSystemContext) {
        this.f80170a = abstractSignatureParts;
        this.f80171b = typeSystemContext;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return AbstractSignatureParts.m90796M(this.f80170a, this.f80171b, (AbstractSignatureParts.C15328a) obj);
    }
}
