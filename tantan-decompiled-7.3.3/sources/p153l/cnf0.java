package p153l;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class cnf0 {

    @NotNull
    public static final cnf0 INSTANCE = new cnf0();

    @NotNull
    /* JADX INFO: renamed from: a */
    public final String m111500a(@NotNull Constructor<?> constructor) {
        constructor.getClass();
        StringBuilder sb = new StringBuilder("(");
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        parameterTypes.getClass();
        for (Class<?> cls : parameterTypes) {
            cls.getClass();
            sb.append(ReflectClassUtilKt.m89883f(cls));
        }
        sb.append(")V");
        return sb.toString();
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final String m111501b(@NotNull Field field) {
        field.getClass();
        Class<?> type = field.getType();
        type.getClass();
        return ReflectClassUtilKt.m89883f(type);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final String m111502c(@NotNull Method method) {
        method.getClass();
        StringBuilder sb = new StringBuilder("(");
        Class<?>[] parameterTypes = method.getParameterTypes();
        parameterTypes.getClass();
        for (Class<?> cls : parameterTypes) {
            cls.getClass();
            sb.append(ReflectClassUtilKt.m89883f(cls));
        }
        sb.append(")");
        Class<?> returnType = method.getReturnType();
        returnType.getClass();
        sb.append(ReflectClassUtilKt.m89883f(returnType));
        return sb.toString();
    }
}
