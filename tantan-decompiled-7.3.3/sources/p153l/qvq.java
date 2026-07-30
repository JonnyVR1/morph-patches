package p153l;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public class qvq implements Function0 {

    /* JADX INFO: renamed from: a */
    public final LazyJavaClassDescriptor f159794a;

    /* JADX INFO: renamed from: b */
    public final ClassDescriptor f159795b;

    public qvq(LazyJavaClassDescriptor lazyJavaClassDescriptor, ClassDescriptor classDescriptor) {
        this.f159794a = lazyJavaClassDescriptor;
        this.f159795b = classDescriptor;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return JvmBuiltInsCustomizer.m89296u(this.f159794a, this.f159795b);
    }
}
