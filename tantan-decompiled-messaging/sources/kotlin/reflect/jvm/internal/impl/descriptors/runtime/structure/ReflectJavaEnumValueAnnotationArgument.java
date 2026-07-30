package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaEnumValueAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class ReflectJavaEnumValueAnnotationArgument extends ReflectJavaAnnotationArgument implements JavaEnumValueAnnotationArgument {

    /* JADX INFO: renamed from: c */
    @NotNull
    public final Enum<?> f64359c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReflectJavaEnumValueAnnotationArgument(@Nullable Name name, @NotNull Enum<?> r3) {
        super(name, null);
        r3.getClass();
        this.f64359c = r3;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaEnumValueAnnotationArgument
    @Nullable
    /* JADX INFO: renamed from: c */
    public ClassId mo89048c() {
        Class<?> enclosingClass = this.f64359c.getClass();
        if (!enclosingClass.isEnum()) {
            enclosingClass = enclosingClass.getEnclosingClass();
        }
        enclosingClass.getClass();
        return ReflectClassUtilKt.m88991e(enclosingClass);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaEnumValueAnnotationArgument
    @Nullable
    /* JADX INFO: renamed from: d */
    public Name mo89049d() {
        return Name.m91079i(this.f64359c.name());
    }
}
