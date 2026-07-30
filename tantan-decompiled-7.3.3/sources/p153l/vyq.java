package p153l;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.KTypeImpl;

/* JADX INFO: loaded from: classes2.dex */
public class vyq implements Function0 {

    /* JADX INFO: renamed from: a */
    public final KTypeImpl f186415a;

    /* JADX INFO: renamed from: b */
    public final Function0 f186416b;

    public vyq(KTypeImpl kTypeImpl, Function0 function0) {
        this.f186415a = kTypeImpl;
        this.f186416b = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return KTypeImpl.m88864u(this.f186415a, this.f186416b);
    }
}
