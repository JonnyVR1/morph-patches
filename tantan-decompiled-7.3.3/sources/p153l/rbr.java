package p153l;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.LazyPackageViewDescriptorImpl;

/* JADX INFO: loaded from: classes2.dex */
public class rbr implements Function0 {

    /* JADX INFO: renamed from: a */
    public final LazyPackageViewDescriptorImpl f162038a;

    public rbr(LazyPackageViewDescriptorImpl lazyPackageViewDescriptorImpl) {
        this.f162038a = lazyPackageViewDescriptorImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return Boolean.valueOf(LazyPackageViewDescriptorImpl.m89685E0(this.f162038a));
    }
}
