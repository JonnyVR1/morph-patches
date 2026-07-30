package p153l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderImpl;

/* JADX INFO: loaded from: classes2.dex */
public class oc60 implements Function1 {
    public static final oc60 INSTANCE = new oc60();

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return PackageFragmentProviderImpl.m89458f((PackageFragmentDescriptor) obj);
    }
}
