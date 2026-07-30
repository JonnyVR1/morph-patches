package p149l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationTargetMapper;

/* JADX INFO: loaded from: classes2.dex */
public class zjq implements Function1 {
    public static final zjq INSTANCE = new zjq();

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return JavaAnnotationTargetMapper.m89527e((ModuleDescriptor) obj);
    }
}
