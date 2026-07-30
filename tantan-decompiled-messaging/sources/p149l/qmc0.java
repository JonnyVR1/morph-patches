package p149l;

import java.lang.reflect.Method;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClass;

/* JADX INFO: loaded from: classes2.dex */
public class qmc0 implements Function1 {

    /* JADX INFO: renamed from: a */
    public final ReflectJavaClass f155295a;

    public qmc0(ReflectJavaClass reflectJavaClass) {
        this.f155295a = reflectJavaClass;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return Boolean.valueOf(ReflectJavaClass.m89017K(this.f155295a, (Method) obj));
    }
}
