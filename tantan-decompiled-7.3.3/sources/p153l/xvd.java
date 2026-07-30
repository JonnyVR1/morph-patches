package p153l;

import kotlin.jvm.functions.Function2;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorEquivalenceForOverrides;

/* JADX INFO: loaded from: classes2.dex */
public class xvd implements Function2 {

    /* JADX INFO: renamed from: a */
    public final CallableDescriptor f196381a;

    /* JADX INFO: renamed from: b */
    public final CallableDescriptor f196382b;

    public xvd(CallableDescriptor callableDescriptor, CallableDescriptor callableDescriptor2) {
        this.f196381a = callableDescriptor;
        this.f196382b = callableDescriptor2;
    }

    @Override // kotlin.jvm.functions.Function2
    public Object invoke(Object obj, Object obj2) {
        return Boolean.valueOf(DescriptorEquivalenceForOverrides.m92609i(this.f196381a, this.f196382b, (DeclarationDescriptor) obj, (DeclarationDescriptor) obj2));
    }
}
