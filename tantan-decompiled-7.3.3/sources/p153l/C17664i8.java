package p153l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;

/* JADX INFO: renamed from: l.i8 */
/* JADX INFO: loaded from: classes2.dex */
public class C17664i8 implements Function1 {

    /* JADX INFO: renamed from: a */
    public final AbstractTypeAliasDescriptor f113316a;

    public C17664i8(AbstractTypeAliasDescriptor abstractTypeAliasDescriptor) {
        this.f113316a = abstractTypeAliasDescriptor;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return AbstractTypeAliasDescriptor.m89560M0(this.f113316a, (UnwrappedType) obj);
    }
}
