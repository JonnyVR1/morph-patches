package p149l;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.KTypeImpl;

/* JADX INFO: loaded from: classes2.dex */
public class uwq implements Function0 {

    /* JADX INFO: renamed from: a */
    public final KTypeImpl f178666a;

    /* JADX INFO: renamed from: b */
    public final Function0 f178667b;

    public uwq(KTypeImpl kTypeImpl, Function0 function0) {
        this.f178666a = kTypeImpl;
        this.f178667b = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return KTypeImpl.m87973u(this.f178666a, this.f178667b);
    }
}
