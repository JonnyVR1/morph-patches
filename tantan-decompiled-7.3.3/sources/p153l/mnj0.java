package p153l;

import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector;

/* JADX INFO: loaded from: classes2.dex */
public class mnj0 implements Function0 {

    /* JADX INFO: renamed from: a */
    public final Set f137709a;

    public mnj0(Set set) {
        this.f137709a = set;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return TypeIntersector.m93867f(this.f137709a);
    }
}
