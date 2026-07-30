package p153l;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Ref;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField;

/* JADX INFO: loaded from: classes2.dex */
public class war implements Function0 {

    /* JADX INFO: renamed from: a */
    public final LazyJavaScope f188158a;

    /* JADX INFO: renamed from: b */
    public final JavaField f188159b;

    /* JADX INFO: renamed from: c */
    public final Ref.ObjectRef f188160c;

    public war(LazyJavaScope lazyJavaScope, JavaField javaField, Ref.ObjectRef objectRef) {
        this.f188158a = lazyJavaScope;
        this.f188159b = javaField;
        this.f188160c = objectRef;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return LazyJavaScope.m90676b0(this.f188158a, this.f188159b, this.f188160c);
    }
}
