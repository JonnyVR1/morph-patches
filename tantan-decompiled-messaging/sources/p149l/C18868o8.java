package p149l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* JADX INFO: renamed from: l.o8 */
/* JADX INFO: loaded from: classes2.dex */
public class C18868o8 implements Function1 {

    /* JADX INFO: renamed from: a */
    public final AbstractTypeAliasDescriptor f142562a;

    public C18868o8(AbstractTypeAliasDescriptor abstractTypeAliasDescriptor) {
        this.f142562a = abstractTypeAliasDescriptor;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return AbstractTypeAliasDescriptor.m88667G0(this.f142562a, (KotlinTypeRefiner) obj);
    }
}
