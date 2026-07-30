package p153l;

import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorEquivalenceForOverrides;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker;

/* JADX INFO: loaded from: classes2.dex */
public class wvd implements KotlinTypeChecker.TypeConstructorEquality {

    /* JADX INFO: renamed from: a */
    public final boolean f190956a;

    /* JADX INFO: renamed from: b */
    public final CallableDescriptor f190957b;

    /* JADX INFO: renamed from: c */
    public final CallableDescriptor f190958c;

    public wvd(boolean z, CallableDescriptor callableDescriptor, CallableDescriptor callableDescriptor2) {
        this.f190956a = z;
        this.f190957b = callableDescriptor;
        this.f190958c = callableDescriptor2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker.TypeConstructorEquality
    /* JADX INFO: renamed from: a */
    public boolean mo92739a(TypeConstructor typeConstructor, TypeConstructor typeConstructor2) {
        return DescriptorEquivalenceForOverrides.m92608h(this.f190956a, this.f190957b, this.f190958c, typeConstructor, typeConstructor2);
    }
}
