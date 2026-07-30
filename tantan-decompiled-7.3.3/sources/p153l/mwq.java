package p153l;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.KCallableImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public class mwq implements Function0 {

    /* JADX INFO: renamed from: a */
    public final ReceiverParameterDescriptor f139141a;

    public mwq(ReceiverParameterDescriptor receiverParameterDescriptor) {
        this.f139141a = receiverParameterDescriptor;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return KCallableImpl.m88611u(this.f139141a);
    }
}
