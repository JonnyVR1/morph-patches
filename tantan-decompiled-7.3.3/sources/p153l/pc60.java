package p153l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderImpl;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* JADX INFO: loaded from: classes2.dex */
public class pc60 implements Function1 {

    /* JADX INFO: renamed from: a */
    public final FqName f151539a;

    public pc60(FqName fqName) {
        this.f151539a = fqName;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return Boolean.valueOf(PackageFragmentProviderImpl.m89459g(this.f151539a, (FqName) obj));
    }
}
