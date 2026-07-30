package p149l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts;

/* JADX INFO: renamed from: l.e8 */
/* JADX INFO: loaded from: classes2.dex */
public class C16560e8 implements Function1 {

    /* JADX INFO: renamed from: a */
    public final AbstractSignatureParts f89777a;

    /* JADX INFO: renamed from: b */
    public final AbstractSignatureParts.C15221a f89778b;

    public C16560e8(AbstractSignatureParts abstractSignatureParts, AbstractSignatureParts.C15221a c15221a) {
        this.f89777a = abstractSignatureParts;
        this.f89778b = c15221a;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return Boolean.valueOf(AbstractSignatureParts.m89913l(this.f89777a, this.f89778b, obj));
    }
}
