package p149l;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl;

/* JADX INFO: loaded from: classes2.dex */
public class xud implements Function0 {

    /* JADX INFO: renamed from: a */
    public final DescriptorRendererImpl f194492a;

    /* JADX INFO: renamed from: b */
    public final KotlinBuiltIns f194493b;

    public xud(DescriptorRendererImpl descriptorRendererImpl, KotlinBuiltIns kotlinBuiltIns) {
        this.f194492a = descriptorRendererImpl;
        this.f194493b = kotlinBuiltIns;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return DescriptorRendererImpl.m91467T1(this.f194492a, this.f194493b);
    }
}
