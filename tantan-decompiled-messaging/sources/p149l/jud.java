package p149l;

import kotlin.jvm.functions.Function2;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorEquivalenceForOverrides;

/* JADX INFO: loaded from: classes2.dex */
public class jud implements Function2 {

    /* JADX INFO: renamed from: a */
    public final CallableDescriptor f119773a;

    /* JADX INFO: renamed from: b */
    public final CallableDescriptor f119774b;

    public jud(CallableDescriptor callableDescriptor, CallableDescriptor callableDescriptor2) {
        this.f119773a = callableDescriptor;
        this.f119774b = callableDescriptor2;
    }

    @Override // kotlin.jvm.functions.Function2
    public Object invoke(Object obj, Object obj2) {
        return Boolean.valueOf(DescriptorEquivalenceForOverrides.m91718i(this.f119773a, this.f119774b, (DeclarationDescriptor) obj, (DeclarationDescriptor) obj2));
    }
}
