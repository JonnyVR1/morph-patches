package p153l;

import java.lang.reflect.Method;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClass;

/* JADX INFO: loaded from: classes2.dex */
public class vuc0 implements Function1 {

    /* JADX INFO: renamed from: a */
    public final ReflectJavaClass f185776a;

    public vuc0(ReflectJavaClass reflectJavaClass) {
        this.f185776a = reflectJavaClass;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return Boolean.valueOf(ReflectJavaClass.m89908K(this.f185776a, (Method) obj));
    }
}
