package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class ReflectJavaField extends ReflectJavaMember implements JavaField {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Field f65034a;

    public ReflectJavaField(@NotNull Field field) {
        field.getClass();
        this.f65034a = field;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField
    /* JADX INFO: renamed from: F */
    public boolean mo89941F() {
        return mo89936J().isEnumConstant();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaMember
    @NotNull
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public Field mo89936J() {
        return this.f65034a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField
    @NotNull
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public ReflectJavaType getType() {
        ReflectJavaType.Factory factory = ReflectJavaType.f65042a;
        Type genericType = mo89936J().getGenericType();
        genericType.getClass();
        return factory.m89958a(genericType);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField
    /* JADX INFO: renamed from: w */
    public boolean mo89944w() {
        return false;
    }
}
