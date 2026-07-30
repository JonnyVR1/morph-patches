package p149l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;

/* JADX INFO: renamed from: l.n8 */
/* JADX INFO: loaded from: classes2.dex */
public class C18631n8 implements Function1 {

    /* JADX INFO: renamed from: a */
    public final AbstractTypeAliasDescriptor f137568a;

    public C18631n8(AbstractTypeAliasDescriptor abstractTypeAliasDescriptor) {
        this.f137568a = abstractTypeAliasDescriptor;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return AbstractTypeAliasDescriptor.m88669M0(this.f137568a, (UnwrappedType) obj);
    }
}
