package p153l;

import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt;

/* JADX INFO: loaded from: classes2.dex */
public class ur0 implements Function0 {

    /* JADX INFO: renamed from: a */
    public final Class f180551a;

    /* JADX INFO: renamed from: b */
    public final Map f180552b;

    public ur0(Class cls, Map map) {
        this.f180551a = cls;
        this.f180552b = map;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return AnnotationConstructorCallerKt.m88966l(this.f180551a, this.f180552b);
    }
}
