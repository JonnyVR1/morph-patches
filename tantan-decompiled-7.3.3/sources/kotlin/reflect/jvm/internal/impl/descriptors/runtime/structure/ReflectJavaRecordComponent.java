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
    public final Object f65041a;

    public ReflectJavaRecordComponent(@NotNull Object obj) {
        obj.getClass();
        this.f65041a = obj;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaMember
    @NotNull
    /* JADX INFO: renamed from: J */
    public Member mo89936J() throws IllegalAccessException, InvocationTargetException {
        Method methodM89860c = Java16RecordComponentsLoader.INSTANCE.m89860c(this.f65041a);
        if (methodM89860c != null) {
            return methodM89860c;
        }
        throw new NoSuchMethodError("Can't find `getAccessor` method");
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaRecordComponent
    /* JADX INFO: renamed from: a */
    public boolean mo89957a() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaRecordComponent
    @NotNull
    public JavaType getType() throws IllegalAccessException, InvocationTargetException {
        Class<?> clsM89861d = Java16RecordComponentsLoader.INSTANCE.m89861d(this.f65041a);
        if (clsM89861d != null) {
            return new ReflectJavaClassifierType(clsM89861d);
        }
        throw new NoSuchMethodError("Can't find `getType` method");
    }
}
