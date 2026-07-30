package p149l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderImpl;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* JADX INFO: loaded from: classes2.dex */
public class j460 implements Function1 {

    /* JADX INFO: renamed from: a */
    public final FqName f116142a;

    public j460(FqName fqName) {
        this.f116142a = fqName;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return Boolean.valueOf(PackageFragmentProviderImpl.m88568g(this.f116142a, (FqName) obj));
    }
}
