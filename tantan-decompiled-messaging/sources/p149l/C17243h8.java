package p149l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts;
import kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext;

/* JADX INFO: renamed from: l.h8 */
/* JADX INFO: loaded from: classes2.dex */
public class C17243h8 implements Function1 {

    /* JADX INFO: renamed from: a */
    public final AbstractSignatureParts f106360a;

    /* JADX INFO: renamed from: b */
    public final TypeSystemContext f106361b;

    public C17243h8(AbstractSignatureParts abstractSignatureParts, TypeSystemContext typeSystemContext) {
        this.f106360a = abstractSignatureParts;
        this.f106361b = typeSystemContext;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return AbstractSignatureParts.m89905M(this.f106360a, this.f106361b, (AbstractSignatureParts.C15221a) obj);
    }
}
