package p153l;

import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.KCallableImpl;

/* JADX INFO: loaded from: classes2.dex */
public class lwq implements Function0 {

    /* JADX INFO: renamed from: a */
    public final List f133846a;

    /* JADX INFO: renamed from: b */
    public final int f133847b;

    public lwq(List list, int i) {
        this.f133846a = list;
        this.f133847b = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return KCallableImpl.m88610t(this.f133846a, this.f133847b);
    }
}
