package p149l;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public class itq implements Function0 {

    /* JADX INFO: renamed from: a */
    public final ModuleDescriptor f114907a;

    /* JADX INFO: renamed from: b */
    public final boolean f114908b;

    public itq(ModuleDescriptor moduleDescriptor, boolean z) {
        this.f114907a = moduleDescriptor;
        this.f114908b = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return JvmBuiltIns.m88382O0(this.f114907a, this.f114908b);
    }
}
