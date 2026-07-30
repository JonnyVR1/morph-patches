package p153l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* JADX INFO: loaded from: classes2.dex */
public class pwd implements Function1 {

    /* JADX INFO: renamed from: a */
    public final DescriptorRendererImpl f154394a;

    public pwd(DescriptorRendererImpl descriptorRendererImpl) {
        this.f154394a = descriptorRendererImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return DescriptorRendererImpl.m92380v2(this.f154394a, (KotlinType) obj);
    }
}
