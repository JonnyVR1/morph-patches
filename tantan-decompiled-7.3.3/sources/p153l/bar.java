package p153l;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public class bar implements Function0 {

    /* JADX INFO: renamed from: a */
    public final LazyJavaClassDescriptor f75729a;

    public bar(LazyJavaClassDescriptor lazyJavaClassDescriptor) {
        this.f75729a = lazyJavaClassDescriptor;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return LazyJavaClassDescriptor.m90558P0(this.f75729a);
    }
}
