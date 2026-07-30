package p153l;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeAliasConstructorDescriptorImpl;

/* JADX INFO: loaded from: classes2.dex */
public class zmj0 implements Function0 {

    /* JADX INFO: renamed from: a */
    public final TypeAliasConstructorDescriptorImpl f205082a;

    /* JADX INFO: renamed from: b */
    public final ClassConstructorDescriptor f205083b;

    public zmj0(TypeAliasConstructorDescriptorImpl typeAliasConstructorDescriptorImpl, ClassConstructorDescriptor classConstructorDescriptor) {
        this.f205082a = typeAliasConstructorDescriptorImpl;
        this.f205083b = classConstructorDescriptor;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return TypeAliasConstructorDescriptorImpl.m89797k1(this.f205082a, this.f205083b);
    }
}
