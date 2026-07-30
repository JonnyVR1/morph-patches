package p149l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributes;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawSubstitution;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* JADX INFO: loaded from: classes2.dex */
public class ldc0 implements Function1 {

    /* JADX INFO: renamed from: a */
    public final ClassDescriptor f127535a;

    /* JADX INFO: renamed from: b */
    public final RawSubstitution f127536b;

    /* JADX INFO: renamed from: c */
    public final SimpleType f127537c;

    /* JADX INFO: renamed from: d */
    public final JavaTypeAttributes f127538d;

    public ldc0(ClassDescriptor classDescriptor, RawSubstitution rawSubstitution, SimpleType simpleType, JavaTypeAttributes javaTypeAttributes) {
        this.f127535a = classDescriptor;
        this.f127536b = rawSubstitution;
        this.f127537c = simpleType;
        this.f127538d = javaTypeAttributes;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return RawSubstitution.m89879k(this.f127535a, this.f127536b, this.f127537c, this.f127538d, (KotlinTypeRefiner) obj);
    }
}
