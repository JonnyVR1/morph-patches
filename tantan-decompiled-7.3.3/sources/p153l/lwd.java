package p153l;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl;

/* JADX INFO: loaded from: classes2.dex */
public class lwd implements Function0 {

    /* JADX INFO: renamed from: a */
    public final DescriptorRendererImpl f133804a;

    /* JADX INFO: renamed from: b */
    public final KotlinBuiltIns f133805b;

    public lwd(DescriptorRendererImpl descriptorRendererImpl, KotlinBuiltIns kotlinBuiltIns) {
        this.f133804a = descriptorRendererImpl;
        this.f133805b = kotlinBuiltIns;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return DescriptorRendererImpl.m92358T1(this.f133804a, this.f133805b);
    }
}
