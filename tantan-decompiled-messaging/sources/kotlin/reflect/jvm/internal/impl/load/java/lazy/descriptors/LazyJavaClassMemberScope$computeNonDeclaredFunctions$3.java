package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.Collection;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class LazyJavaClassMemberScope$computeNonDeclaredFunctions$3 extends FunctionReferenceImpl implements Function1<Name, Collection<? extends SimpleFunctionDescriptor>> {
    public LazyJavaClassMemberScope$computeNonDeclaredFunctions$3(Object obj) {
        super(1, obj, LazyJavaClassMemberScope.class, "searchMethodsByNameWithoutBuiltinMagic", "searchMethodsByNameWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Collection<SimpleFunctionDescriptor> invoke(Name name) {
        name.getClass();
        return ((LazyJavaClassMemberScope) this.receiver).m89741q1(name);
    }
}
