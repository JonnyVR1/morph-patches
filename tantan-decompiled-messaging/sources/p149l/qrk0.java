package p149l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.calls.ValueClassAwareCaller;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public class qrk0 implements Function1 {
    public static final qrk0 INSTANCE = new qrk0();

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return Boolean.valueOf(ValueClassAwareCaller.m88100d((ClassDescriptor) obj));
    }
}
