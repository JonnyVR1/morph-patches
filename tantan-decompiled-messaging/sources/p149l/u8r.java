package p149l;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Ref;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField;

/* JADX INFO: loaded from: classes2.dex */
public class u8r implements Function0 {

    /* JADX INFO: renamed from: a */
    public final LazyJavaScope f175153a;

    /* JADX INFO: renamed from: b */
    public final JavaField f175154b;

    /* JADX INFO: renamed from: c */
    public final Ref.ObjectRef f175155c;

    public u8r(LazyJavaScope lazyJavaScope, JavaField javaField, Ref.ObjectRef objectRef) {
        this.f175153a = lazyJavaScope;
        this.f175154b = javaField;
        this.f175155c = objectRef;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return LazyJavaScope.m89785b0(this.f175153a, this.f175154b, this.f175155c);
    }
}
