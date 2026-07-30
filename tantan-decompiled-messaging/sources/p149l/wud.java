package p149l;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl;

/* JADX INFO: loaded from: classes2.dex */
public class wud implements Function0 {

    /* JADX INFO: renamed from: a */
    public final DescriptorRendererImpl f188108a;

    /* JADX INFO: renamed from: b */
    public final KotlinBuiltIns f188109b;

    public wud(DescriptorRendererImpl descriptorRendererImpl, KotlinBuiltIns kotlinBuiltIns) {
        this.f188108a = descriptorRendererImpl;
        this.f188109b = kotlinBuiltIns;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return DescriptorRendererImpl.m91466S1(this.f188108a, this.f188109b);
    }
}
