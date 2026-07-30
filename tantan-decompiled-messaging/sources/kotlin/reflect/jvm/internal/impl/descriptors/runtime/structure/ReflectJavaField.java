package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class ReflectJavaField extends ReflectJavaMember implements JavaField {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Field f64360a;

    public ReflectJavaField(@NotNull Field field) {
        field.getClass();
        this.f64360a = field;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField
    /* JADX INFO: renamed from: F */
    public boolean mo89050F() {
        return mo89045J().isEnumConstant();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaMember
    @NotNull
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public Field mo89045J() {
        return this.f64360a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField
    @NotNull
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public ReflectJavaType getType() {
        ReflectJavaType.Factory factory = ReflectJavaType.f64368a;
        Type genericType = mo89045J().getGenericType();
        genericType.getClass();
        return factory.m89067a(genericType);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField
    /* JADX INFO: renamed from: w */
    public boolean mo89053w() {
        return false;
    }
}
