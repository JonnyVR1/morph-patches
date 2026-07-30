package p153l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationTargetMapper;

/* JADX INFO: loaded from: classes2.dex */
public class ylq implements Function1 {
    public static final ylq INSTANCE = new ylq();

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return JavaAnnotationTargetMapper.m90418e((ModuleDescriptor) obj);
    }
}
