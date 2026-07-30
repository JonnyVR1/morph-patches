package p149l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.load.java.NullabilityAnnotationStatesImpl;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* JADX INFO: loaded from: classes2.dex */
public class tu40 implements Function1 {

    /* JADX INFO: renamed from: a */
    public final NullabilityAnnotationStatesImpl f172129a;

    public tu40(NullabilityAnnotationStatesImpl nullabilityAnnotationStatesImpl) {
        this.f172129a = nullabilityAnnotationStatesImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return NullabilityAnnotationStatesImpl.m89456c(this.f172129a, (FqName) obj);
    }
}
