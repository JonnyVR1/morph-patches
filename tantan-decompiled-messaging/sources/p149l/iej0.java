package p149l;

import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector;

/* JADX INFO: loaded from: classes2.dex */
public class iej0 implements Function0 {

    /* JADX INFO: renamed from: a */
    public final Set f112808a;

    public iej0(Set set) {
        this.f112808a = set;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return TypeIntersector.m92976f(this.f112808a);
    }
}
