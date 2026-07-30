package p153l;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.KCallableImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public class cwq implements Function0 {

    /* JADX INFO: renamed from: a */
    public final CallableMemberDescriptor f84139a;

    /* JADX INFO: renamed from: b */
    public final int f84140b;

    public cwq(CallableMemberDescriptor callableMemberDescriptor, int i) {
        this.f84139a = callableMemberDescriptor;
        this.f84140b = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return KCallableImpl.m88607n(this.f84139a, this.f84140b);
    }
}
