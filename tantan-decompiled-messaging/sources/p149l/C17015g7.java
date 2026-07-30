package p149l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AbstractDeserializedPackageFragmentProvider;

/* JADX INFO: renamed from: l.g7 */
/* JADX INFO: loaded from: classes2.dex */
public class C17015g7 implements Function1 {

    /* JADX INFO: renamed from: a */
    public final AbstractDeserializedPackageFragmentProvider f101322a;

    public C17015g7(AbstractDeserializedPackageFragmentProvider abstractDeserializedPackageFragmentProvider) {
        this.f101322a = abstractDeserializedPackageFragmentProvider;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return AbstractDeserializedPackageFragmentProvider.m92118f(this.f101322a, (FqName) obj);
    }
}
