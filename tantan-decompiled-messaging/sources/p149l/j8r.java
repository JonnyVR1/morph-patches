package p149l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* JADX INFO: loaded from: classes2.dex */
public class j8r implements Function1 {

    /* JADX INFO: renamed from: a */
    public final SimpleFunctionDescriptor f116778a;

    /* JADX INFO: renamed from: b */
    public final LazyJavaClassMemberScope f116779b;

    public j8r(SimpleFunctionDescriptor simpleFunctionDescriptor, LazyJavaClassMemberScope lazyJavaClassMemberScope) {
        this.f116778a = simpleFunctionDescriptor;
        this.f116779b = lazyJavaClassMemberScope;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return LazyJavaClassMemberScope.m89686g1(this.f116778a, this.f116779b, (Name) obj);
    }
}
