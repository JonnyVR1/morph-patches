package p153l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.calls.ValueClassAwareCaller;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public class w0l0 implements Function1 {
    public static final w0l0 INSTANCE = new w0l0();

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return Boolean.valueOf(ValueClassAwareCaller.m88991d((ClassDescriptor) obj));
    }
}
