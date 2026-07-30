package p153l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AbstractDeserializedPackageFragmentProvider;

/* JADX INFO: renamed from: l.b7 */
/* JADX INFO: loaded from: classes2.dex */
public class C15939b7 implements Function1 {

    /* JADX INFO: renamed from: a */
    public final AbstractDeserializedPackageFragmentProvider f75237a;

    public C15939b7(AbstractDeserializedPackageFragmentProvider abstractDeserializedPackageFragmentProvider) {
        this.f75237a = abstractDeserializedPackageFragmentProvider;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return AbstractDeserializedPackageFragmentProvider.m93009f(this.f75237a, (FqName) obj);
    }
}
