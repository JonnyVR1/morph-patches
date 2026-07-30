package p153l;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl;

/* JADX INFO: loaded from: classes2.dex */
public class kwd implements Function0 {

    /* JADX INFO: renamed from: a */
    public final DescriptorRendererImpl f129047a;

    /* JADX INFO: renamed from: b */
    public final KotlinBuiltIns f129048b;

    public kwd(DescriptorRendererImpl descriptorRendererImpl, KotlinBuiltIns kotlinBuiltIns) {
        this.f129047a = descriptorRendererImpl;
        this.f129048b = kotlinBuiltIns;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return DescriptorRendererImpl.m92357S1(this.f129047a, this.f129048b);
    }
}
