package p149l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* JADX INFO: loaded from: classes2.dex */
public class g700 implements Function1 {

    /* JADX INFO: renamed from: a */
    public final ModuleDescriptorImpl f101323a;

    public g700(ModuleDescriptorImpl moduleDescriptorImpl) {
        this.f101323a = moduleDescriptorImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return ModuleDescriptorImpl.m88818L0(this.f101323a, (FqName) obj);
    }
}
