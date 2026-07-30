package p153l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.load.java.NullabilityAnnotationStatesImpl;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* JADX INFO: loaded from: classes2.dex */
public class i350 implements Function1 {

    /* JADX INFO: renamed from: a */
    public final NullabilityAnnotationStatesImpl f112688a;

    public i350(NullabilityAnnotationStatesImpl nullabilityAnnotationStatesImpl) {
        this.f112688a = nullabilityAnnotationStatesImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return NullabilityAnnotationStatesImpl.m90347c(this.f112688a, (FqName) obj);
    }
}
