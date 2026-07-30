package p153l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* JADX INFO: renamed from: l.j8 */
/* JADX INFO: loaded from: classes2.dex */
public class C17893j8 implements Function1 {

    /* JADX INFO: renamed from: a */
    public final AbstractTypeAliasDescriptor f118742a;

    public C17893j8(AbstractTypeAliasDescriptor abstractTypeAliasDescriptor) {
        this.f118742a = abstractTypeAliasDescriptor;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return AbstractTypeAliasDescriptor.m89558G0(this.f118742a, (KotlinTypeRefiner) obj);
    }
}
