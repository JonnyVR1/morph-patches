package p149l;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.KCallableImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public class buq implements Function0 {

    /* JADX INFO: renamed from: a */
    public final CallableMemberDescriptor f77363a;

    /* JADX INFO: renamed from: b */
    public final int f77364b;

    public buq(CallableMemberDescriptor callableMemberDescriptor, int i) {
        this.f77363a = callableMemberDescriptor;
        this.f77364b = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return KCallableImpl.m87716n(this.f77363a, this.f77364b);
    }
}
