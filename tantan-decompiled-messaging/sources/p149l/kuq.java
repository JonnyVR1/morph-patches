package p149l;

import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.KCallableImpl;

/* JADX INFO: loaded from: classes2.dex */
public class kuq implements Function0 {

    /* JADX INFO: renamed from: a */
    public final List f124705a;

    /* JADX INFO: renamed from: b */
    public final int f124706b;

    public kuq(List list, int i) {
        this.f124705a = list;
        this.f124706b = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return KCallableImpl.m87719t(this.f124705a, this.f124706b);
    }
}
