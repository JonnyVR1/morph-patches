package p149l;

import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt;

/* JADX INFO: loaded from: classes2.dex */
public class or0 implements Function0 {

    /* JADX INFO: renamed from: a */
    public final Map f145211a;

    public or0(Map map) {
        this.f145211a = map;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return Integer.valueOf(AnnotationConstructorCallerKt.m88073j(this.f145211a));
    }
}
