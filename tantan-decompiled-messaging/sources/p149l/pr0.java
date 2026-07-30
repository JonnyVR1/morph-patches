package p149l;

import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt;

/* JADX INFO: loaded from: classes2.dex */
public class pr0 implements Function0 {

    /* JADX INFO: renamed from: a */
    public final Class f150825a;

    /* JADX INFO: renamed from: b */
    public final Map f150826b;

    public pr0(Class cls, Map map) {
        this.f150825a = cls;
        this.f150826b = map;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return AnnotationConstructorCallerKt.m88075l(this.f150825a, this.f150826b);
    }
}
