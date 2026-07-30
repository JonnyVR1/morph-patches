package p149l;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Ref;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField;

/* JADX INFO: loaded from: classes2.dex */
public class v8r implements Function0 {

    /* JADX INFO: renamed from: a */
    public final LazyJavaScope f180579a;

    /* JADX INFO: renamed from: b */
    public final JavaField f180580b;

    /* JADX INFO: renamed from: c */
    public final Ref.ObjectRef f180581c;

    public v8r(LazyJavaScope lazyJavaScope, JavaField javaField, Ref.ObjectRef objectRef) {
        this.f180579a = lazyJavaScope;
        this.f180580b = javaField;
        this.f180581c = objectRef;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return LazyJavaScope.m89786c0(this.f180579a, this.f180580b, this.f180581c);
    }
}
