package p149l;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.KTypeParameterImpl;
import kotlin.reflect.jvm.internal.KTypeParameterOwnerImpl;

/* JADX INFO: loaded from: classes2.dex */
public class ywq implements Function0 {

    /* JADX INFO: renamed from: a */
    public final KTypeParameterOwnerImpl f200522a;

    /* JADX INFO: renamed from: b */
    public final KTypeParameterImpl f200523b;

    public ywq(KTypeParameterOwnerImpl kTypeParameterOwnerImpl, KTypeParameterImpl kTypeParameterImpl) {
        this.f200522a = kTypeParameterOwnerImpl;
        this.f200523b = kTypeParameterImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return KTypeParameterImpl.m87982d(this.f200522a, this.f200523b);
    }
}
