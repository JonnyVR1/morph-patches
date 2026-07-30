package p149l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;

/* JADX INFO: loaded from: classes2.dex */
public class zud implements Function1 {

    /* JADX INFO: renamed from: a */
    public final DescriptorRendererImpl f204850a;

    public zud(DescriptorRendererImpl descriptorRendererImpl) {
        this.f204850a = descriptorRendererImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return DescriptorRendererImpl.m91488t0(this.f204850a, (TypeProjection) obj);
    }
}
