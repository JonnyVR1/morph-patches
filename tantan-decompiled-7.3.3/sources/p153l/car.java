package p153l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* JADX INFO: loaded from: classes2.dex */
public class car implements Function1 {

    /* JADX INFO: renamed from: a */
    public final LazyJavaClassDescriptor f80613a;

    public car(LazyJavaClassDescriptor lazyJavaClassDescriptor) {
        this.f80613a = lazyJavaClassDescriptor;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return LazyJavaClassDescriptor.m90559Q0(this.f80613a, (KotlinTypeRefiner) obj);
    }
}
