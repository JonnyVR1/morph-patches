package p153l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.ClassDeclaredMemberIndex;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod;

/* JADX INFO: loaded from: classes2.dex */
public class g85 implements Function1 {

    /* JADX INFO: renamed from: a */
    public final ClassDeclaredMemberIndex f102646a;

    public g85(ClassDeclaredMemberIndex classDeclaredMemberIndex) {
        this.f102646a = classDeclaredMemberIndex;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return Boolean.valueOf(ClassDeclaredMemberIndex.m90522h(this.f102646a, (JavaMethod) obj));
    }
}
