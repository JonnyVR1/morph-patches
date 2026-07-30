package p149l;

import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts;

/* JADX INFO: renamed from: l.f8 */
/* JADX INFO: loaded from: classes2.dex */
public class C16772f8 implements Function0 {

    /* JADX INFO: renamed from: a */
    public final List f96306a;

    /* JADX INFO: renamed from: b */
    public final AbstractSignatureParts f96307b;

    public C16772f8(List list, AbstractSignatureParts abstractSignatureParts) {
        this.f96306a = list;
        this.f96307b = abstractSignatureParts;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return AbstractSignatureParts.m89906a(this.f96306a, this.f96307b);
    }
}
