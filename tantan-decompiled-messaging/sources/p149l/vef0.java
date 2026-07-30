package p149l;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class vef0 {

    @NotNull
    public static final vef0 INSTANCE = new vef0();

    @NotNull
    /* JADX INFO: renamed from: a */
    public final String m198177a(@NotNull Constructor<?> constructor) {
        constructor.getClass();
        StringBuilder sb = new StringBuilder("(");
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        parameterTypes.getClass();
        for (Class<?> cls : parameterTypes) {
            cls.getClass();
            sb.append(ReflectClassUtilKt.m88992f(cls));
        }
        sb.append(")V");
        return sb.toString();
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final String m198178b(@NotNull Field field) {
        field.getClass();
        Class<?> type = field.getType();
        type.getClass();
        return ReflectClassUtilKt.m88992f(type);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final String m198179c(@NotNull Method method) {
        method.getClass();
        StringBuilder sb = new StringBuilder("(");
        Class<?>[] parameterTypes = method.getParameterTypes();
        parameterTypes.getClass();
        for (Class<?> cls : parameterTypes) {
            cls.getClass();
            sb.append(ReflectClassUtilKt.m88992f(cls));
        }
        sb.append(")");
        Class<?> returnType = method.getReturnType();
        returnType.getClass();
        sb.append(ReflectClassUtilKt.m88992f(returnType));
        return sb.toString();
    }
}
