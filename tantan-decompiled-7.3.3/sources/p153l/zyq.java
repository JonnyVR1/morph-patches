package p153l;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.KTypeParameterImpl;
import kotlin.reflect.jvm.internal.KTypeParameterOwnerImpl;

/* JADX INFO: loaded from: classes2.dex */
public class zyq implements Function0 {

    /* JADX INFO: renamed from: a */
    public final KTypeParameterOwnerImpl f206628a;

    /* JADX INFO: renamed from: b */
    public final KTypeParameterImpl f206629b;

    public zyq(KTypeParameterOwnerImpl kTypeParameterOwnerImpl, KTypeParameterImpl kTypeParameterImpl) {
        this.f206628a = kTypeParameterOwnerImpl;
        this.f206629b = kTypeParameterImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return KTypeParameterImpl.m88873d(this.f206628a, this.f206629b);
    }
}
