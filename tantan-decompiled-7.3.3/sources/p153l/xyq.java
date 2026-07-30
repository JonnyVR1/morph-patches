package p153l;

import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.KTypeImpl;

/* JADX INFO: loaded from: classes2.dex */
public class xyq implements Function0 {

    /* JADX INFO: renamed from: a */
    public final KTypeImpl f196777a;

    /* JADX INFO: renamed from: b */
    public final int f196778b;

    /* JADX INFO: renamed from: c */
    public final Lazy f196779c;

    public xyq(KTypeImpl kTypeImpl, int i, Lazy lazy) {
        this.f196777a = kTypeImpl;
        this.f196778b = i;
        this.f196779c = lazy;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return KTypeImpl.m88867x(this.f196777a, this.f196778b, this.f196779c);
    }
}
