package p149l;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt;

/* JADX INFO: loaded from: classes2.dex */
public class qr0 implements InvocationHandler {

    /* JADX INFO: renamed from: a */
    public final Class f155954a;

    /* JADX INFO: renamed from: b */
    public final Map f155955b;

    /* JADX INFO: renamed from: c */
    public final Lazy f155956c;

    /* JADX INFO: renamed from: d */
    public final Lazy f155957d;

    /* JADX INFO: renamed from: e */
    public final List f155958e;

    public qr0(Class cls, Map map, Lazy lazy, Lazy lazy2, List list) {
        this.f155954a = cls;
        this.f155955b = map;
        this.f155956c = lazy;
        this.f155957d = lazy2;
        this.f155958e = list;
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) {
        return AnnotationConstructorCallerKt.m88078o(this.f155954a, this.f155955b, this.f155956c, this.f155957d, this.f155958e, obj, method, objArr);
    }
}
