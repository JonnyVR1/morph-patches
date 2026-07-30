package p149l;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public class ptq implements Function0 {

    /* JADX INFO: renamed from: a */
    public final LazyJavaClassDescriptor f151200a;

    /* JADX INFO: renamed from: b */
    public final ClassDescriptor f151201b;

    public ptq(LazyJavaClassDescriptor lazyJavaClassDescriptor, ClassDescriptor classDescriptor) {
        this.f151200a = lazyJavaClassDescriptor;
        this.f151201b = classDescriptor;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return JvmBuiltInsCustomizer.m88405u(this.f151200a, this.f151201b);
    }
}
