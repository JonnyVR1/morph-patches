package p149l;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributes;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeResolver;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;

/* JADX INFO: loaded from: classes2.dex */
public class pkq implements Function0 {

    /* JADX INFO: renamed from: a */
    public final JavaTypeResolver f150015a;

    /* JADX INFO: renamed from: b */
    public final TypeParameterDescriptor f150016b;

    /* JADX INFO: renamed from: c */
    public final JavaTypeAttributes f150017c;

    /* JADX INFO: renamed from: d */
    public final TypeConstructor f150018d;

    /* JADX INFO: renamed from: e */
    public final JavaClassifierType f150019e;

    public pkq(JavaTypeResolver javaTypeResolver, TypeParameterDescriptor typeParameterDescriptor, JavaTypeAttributes javaTypeAttributes, TypeConstructor typeConstructor, JavaClassifierType javaClassifierType) {
        this.f150015a = javaTypeResolver;
        this.f150016b = typeParameterDescriptor;
        this.f150017c = javaTypeAttributes;
        this.f150018d = typeConstructor;
        this.f150019e = javaClassifierType;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return JavaTypeResolver.m89860e(this.f150015a, this.f150016b, this.f150017c, this.f150018d, this.f150019e);
    }
}
