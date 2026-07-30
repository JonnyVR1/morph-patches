package p149l;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.LazyPackageViewDescriptorImpl;

/* JADX INFO: loaded from: classes2.dex */
public class p9r implements Function0 {

    /* JADX INFO: renamed from: a */
    public final LazyPackageViewDescriptorImpl f147787a;

    public p9r(LazyPackageViewDescriptorImpl lazyPackageViewDescriptorImpl) {
        this.f147787a = lazyPackageViewDescriptorImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return Boolean.valueOf(LazyPackageViewDescriptorImpl.m88794E0(this.f147787a));
    }
}
