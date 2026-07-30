package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassObjectAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class ReflectJavaClassObjectAnnotationArgument extends ReflectJavaAnnotationArgument implements JavaClassObjectAnnotationArgument {

    /* JADX INFO: renamed from: c */
    @NotNull
    public final Class<?> f64355c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReflectJavaClassObjectAnnotationArgument(@Nullable Name name, @NotNull Class<?> cls) {
        super(name, null);
        cls.getClass();
        this.f64355c = cls;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassObjectAnnotationArgument
    @NotNull
    /* JADX INFO: renamed from: b */
    public JavaType mo89039b() {
        return ReflectJavaType.f64368a.m89067a(this.f64355c);
    }
}
