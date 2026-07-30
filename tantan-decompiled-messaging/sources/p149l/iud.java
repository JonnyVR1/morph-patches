package p149l;

import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorEquivalenceForOverrides;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker;

/* JADX INFO: loaded from: classes2.dex */
public class iud implements KotlinTypeChecker.TypeConstructorEquality {

    /* JADX INFO: renamed from: a */
    public final boolean f115002a;

    /* JADX INFO: renamed from: b */
    public final CallableDescriptor f115003b;

    /* JADX INFO: renamed from: c */
    public final CallableDescriptor f115004c;

    public iud(boolean z, CallableDescriptor callableDescriptor, CallableDescriptor callableDescriptor2) {
        this.f115002a = z;
        this.f115003b = callableDescriptor;
        this.f115004c = callableDescriptor2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker.TypeConstructorEquality
    /* JADX INFO: renamed from: a */
    public boolean mo91848a(TypeConstructor typeConstructor, TypeConstructor typeConstructor2) {
        return DescriptorEquivalenceForOverrides.m91717h(this.f115002a, this.f115003b, this.f115004c, typeConstructor, typeConstructor2);
    }
}
