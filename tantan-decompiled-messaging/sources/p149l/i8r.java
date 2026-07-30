package p149l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMember;

/* JADX INFO: loaded from: classes2.dex */
public class i8r implements Function1 {
    public static final i8r INSTANCE = new i8r();

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return Boolean.valueOf(LazyJavaClassMemberScope.m89701z0((JavaMember) obj));
    }
}
