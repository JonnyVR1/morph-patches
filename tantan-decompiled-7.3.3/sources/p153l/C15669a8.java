package p153l;

import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts;

/* JADX INFO: renamed from: l.a8 */
/* JADX INFO: loaded from: classes2.dex */
public class C15669a8 implements Function0 {

    /* JADX INFO: renamed from: a */
    public final List f68871a;

    /* JADX INFO: renamed from: b */
    public final AbstractSignatureParts f68872b;

    public C15669a8(List list, AbstractSignatureParts abstractSignatureParts) {
        this.f68871a = list;
        this.f68872b = abstractSignatureParts;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return AbstractSignatureParts.m90797a(this.f68871a, this.f68872b);
    }
}
