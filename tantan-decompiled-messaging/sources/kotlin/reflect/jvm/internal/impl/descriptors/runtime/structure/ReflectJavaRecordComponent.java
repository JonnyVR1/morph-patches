package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaRecordComponent;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class ReflectJavaRecordComponent extends ReflectJavaMember implements JavaRecordComponent {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Object f64367a;

    public ReflectJavaRecordComponent(@NotNull Object obj) {
        obj.getClass();
        this.f64367a = obj;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaMember
    @NotNull
    /* JADX INFO: renamed from: J */
    public Member mo89045J() throws IllegalAccessException, InvocationTargetException {
        Method methodM88969c = Java16RecordComponentsLoader.INSTANCE.m88969c(this.f64367a);
        if (methodM88969c != null) {
            return methodM88969c;
        }
        throw new NoSuchMethodError("Can't find `getAccessor` method");
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaRecordComponent
    /* JADX INFO: renamed from: a */
    public boolean mo89066a() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaRecordComponent
    @NotNull
    public JavaType getType() throws IllegalAccessException, InvocationTargetException {
        Class<?> clsM88970d = Java16RecordComponentsLoader.INSTANCE.m88970d(this.f64367a);
        if (clsM88970d != null) {
            return new ReflectJavaClassifierType(clsM88970d);
        }
        throw new NoSuchMethodError("Can't find `getType` method");
    }
}
