package p149l;

import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.KTypeImpl;

/* JADX INFO: loaded from: classes2.dex */
public class wwq implements Function0 {

    /* JADX INFO: renamed from: a */
    public final KTypeImpl f188398a;

    /* JADX INFO: renamed from: b */
    public final int f188399b;

    /* JADX INFO: renamed from: c */
    public final Lazy f188400c;

    public wwq(KTypeImpl kTypeImpl, int i, Lazy lazy) {
        this.f188398a = kTypeImpl;
        this.f188399b = i;
        this.f188400c = lazy;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return KTypeImpl.m87976x(this.f188398a, this.f188399b, this.f188400c);
    }
}
