package p153l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* JADX INFO: loaded from: classes2.dex */
public class lar implements Function1 {

    /* JADX INFO: renamed from: a */
    public final SimpleFunctionDescriptor f130730a;

    /* JADX INFO: renamed from: b */
    public final LazyJavaClassMemberScope f130731b;

    public lar(SimpleFunctionDescriptor simpleFunctionDescriptor, LazyJavaClassMemberScope lazyJavaClassMemberScope) {
        this.f130730a = simpleFunctionDescriptor;
        this.f130731b = lazyJavaClassMemberScope;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return LazyJavaClassMemberScope.m90577g1(this.f130730a, this.f130731b, (Name) obj);
    }
}
