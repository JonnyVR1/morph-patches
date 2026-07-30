package p153l;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Ref;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField;

/* JADX INFO: loaded from: classes2.dex */
public class xar implements Function0 {

    /* JADX INFO: renamed from: a */
    public final LazyJavaScope f193065a;

    /* JADX INFO: renamed from: b */
    public final JavaField f193066b;

    /* JADX INFO: renamed from: c */
    public final Ref.ObjectRef f193067c;

    public xar(LazyJavaScope lazyJavaScope, JavaField javaField, Ref.ObjectRef objectRef) {
        this.f193065a = lazyJavaScope;
        this.f193066b = javaField;
        this.f193067c = objectRef;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return LazyJavaScope.m90677c0(this.f193065a, this.f193066b, this.f193067c);
    }
}
