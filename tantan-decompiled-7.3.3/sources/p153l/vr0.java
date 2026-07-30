package p153l;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt;

/* JADX INFO: loaded from: classes2.dex */
public class vr0 implements InvocationHandler {

    /* JADX INFO: renamed from: a */
    public final Class f185414a;

    /* JADX INFO: renamed from: b */
    public final Map f185415b;

    /* JADX INFO: renamed from: c */
    public final Lazy f185416c;

    /* JADX INFO: renamed from: d */
    public final Lazy f185417d;

    /* JADX INFO: renamed from: e */
    public final List f185418e;

    public vr0(Class cls, Map map, Lazy lazy, Lazy lazy2, List list) {
        this.f185414a = cls;
        this.f185415b = map;
        this.f185416c = lazy;
        this.f185417d = lazy2;
        this.f185418e = list;
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) {
        return AnnotationConstructorCallerKt.m88969o(this.f185414a, this.f185415b, this.f185416c, this.f185417d, this.f185418e, obj, method, objArr);
    }
}
