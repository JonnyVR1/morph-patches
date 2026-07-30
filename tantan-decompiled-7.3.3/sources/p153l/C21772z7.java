package p153l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts;

/* JADX INFO: renamed from: l.z7 */
/* JADX INFO: loaded from: classes2.dex */
public class C21772z7 implements Function1 {

    /* JADX INFO: renamed from: a */
    public final AbstractSignatureParts f203207a;

    /* JADX INFO: renamed from: b */
    public final AbstractSignatureParts.C15328a f203208b;

    public C21772z7(AbstractSignatureParts abstractSignatureParts, AbstractSignatureParts.C15328a c15328a) {
        this.f203207a = abstractSignatureParts;
        this.f203208b = c15328a;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return Boolean.valueOf(AbstractSignatureParts.m90804l(this.f203207a, this.f203208b, obj));
    }
}
