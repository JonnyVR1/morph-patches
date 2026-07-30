package p149l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* JADX INFO: loaded from: classes2.dex */
public class a8r implements Function1 {

    /* JADX INFO: renamed from: a */
    public final LazyJavaClassDescriptor f68067a;

    public a8r(LazyJavaClassDescriptor lazyJavaClassDescriptor) {
        this.f68067a = lazyJavaClassDescriptor;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return LazyJavaClassDescriptor.m89668Q0(this.f68067a, (KotlinTypeRefiner) obj);
    }
}
