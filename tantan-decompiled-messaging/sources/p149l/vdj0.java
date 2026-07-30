package p149l;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeAliasConstructorDescriptorImpl;

/* JADX INFO: loaded from: classes2.dex */
public class vdj0 implements Function0 {

    /* JADX INFO: renamed from: a */
    public final TypeAliasConstructorDescriptorImpl f181091a;

    /* JADX INFO: renamed from: b */
    public final ClassConstructorDescriptor f181092b;

    public vdj0(TypeAliasConstructorDescriptorImpl typeAliasConstructorDescriptorImpl, ClassConstructorDescriptor classConstructorDescriptor) {
        this.f181091a = typeAliasConstructorDescriptorImpl;
        this.f181092b = classConstructorDescriptor;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return TypeAliasConstructorDescriptorImpl.m88906k1(this.f181091a, this.f181092b);
    }
}
