package p149l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* JADX INFO: loaded from: classes2.dex */
public class yud implements Function1 {
    public static final yud INSTANCE = new yud();

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return DescriptorRendererImpl.m91461A2((KotlinType) obj);
    }
}
