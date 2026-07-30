package p149l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* JADX INFO: loaded from: classes2.dex */
public class bvd implements Function1 {

    /* JADX INFO: renamed from: a */
    public final DescriptorRendererImpl f77425a;

    public bvd(DescriptorRendererImpl descriptorRendererImpl) {
        this.f77425a = descriptorRendererImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return DescriptorRendererImpl.m91489v2(this.f77425a, (KotlinType) obj);
    }
}
