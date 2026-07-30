package p153l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributes;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawSubstitution;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* JADX INFO: loaded from: classes2.dex */
public class slc0 implements Function1 {

    /* JADX INFO: renamed from: a */
    public final ClassDescriptor f169360a;

    /* JADX INFO: renamed from: b */
    public final RawSubstitution f169361b;

    /* JADX INFO: renamed from: c */
    public final SimpleType f169362c;

    /* JADX INFO: renamed from: d */
    public final JavaTypeAttributes f169363d;

    public slc0(ClassDescriptor classDescriptor, RawSubstitution rawSubstitution, SimpleType simpleType, JavaTypeAttributes javaTypeAttributes) {
        this.f169360a = classDescriptor;
        this.f169361b = rawSubstitution;
        this.f169362c = simpleType;
        this.f169363d = javaTypeAttributes;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return RawSubstitution.m90770k(this.f169360a, this.f169361b, this.f169362c, this.f169363d, (KotlinTypeRefiner) obj);
    }
}
