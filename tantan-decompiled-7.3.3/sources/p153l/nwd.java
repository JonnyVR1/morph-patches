package p153l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;

/* JADX INFO: loaded from: classes2.dex */
public class nwd implements Function1 {

    /* JADX INFO: renamed from: a */
    public final DescriptorRendererImpl f143952a;

    public nwd(DescriptorRendererImpl descriptorRendererImpl) {
        this.f143952a = descriptorRendererImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return DescriptorRendererImpl.m92379t0(this.f143952a, (TypeProjection) obj);
    }
}
