package p153l;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public class jvq implements Function0 {

    /* JADX INFO: renamed from: a */
    public final ModuleDescriptor f122833a;

    /* JADX INFO: renamed from: b */
    public final boolean f122834b;

    public jvq(ModuleDescriptor moduleDescriptor, boolean z) {
        this.f122833a = moduleDescriptor;
        this.f122834b = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return JvmBuiltIns.m89273O0(this.f122833a, this.f122834b);
    }
}
