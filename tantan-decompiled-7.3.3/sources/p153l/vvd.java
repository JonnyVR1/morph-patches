package p153l;

import kotlin.jvm.functions.Function2;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorEquivalenceForOverrides;

/* JADX INFO: loaded from: classes2.dex */
public class vvd implements Function2 {
    public static final vvd INSTANCE = new vvd();

    @Override // kotlin.jvm.functions.Function2
    public Object invoke(Object obj, Object obj2) {
        return Boolean.valueOf(DescriptorEquivalenceForOverrides.m92607g((DeclarationDescriptor) obj, (DeclarationDescriptor) obj2));
    }
}
