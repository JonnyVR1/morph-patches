package p153l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* JADX INFO: loaded from: classes2.dex */
public class pf00 implements Function1 {

    /* JADX INFO: renamed from: a */
    public final ModuleDescriptorImpl f152147a;

    public pf00(ModuleDescriptorImpl moduleDescriptorImpl) {
        this.f152147a = moduleDescriptorImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return ModuleDescriptorImpl.m89709L0(this.f152147a, (FqName) obj);
    }
}
