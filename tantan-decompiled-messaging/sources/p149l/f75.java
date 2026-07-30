package p149l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.ClassDeclaredMemberIndex;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod;

/* JADX INFO: loaded from: classes2.dex */
public class f75 implements Function1 {

    /* JADX INFO: renamed from: a */
    public final ClassDeclaredMemberIndex f96196a;

    public f75(ClassDeclaredMemberIndex classDeclaredMemberIndex) {
        this.f96196a = classDeclaredMemberIndex;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return Boolean.valueOf(ClassDeclaredMemberIndex.m89631h(this.f96196a, (JavaMethod) obj));
    }
}
