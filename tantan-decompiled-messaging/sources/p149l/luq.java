package p149l;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.KCallableImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public class luq implements Function0 {

    /* JADX INFO: renamed from: a */
    public final ReceiverParameterDescriptor f130085a;

    public luq(ReceiverParameterDescriptor receiverParameterDescriptor) {
        this.f130085a = receiverParameterDescriptor;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return KCallableImpl.m87720u(this.f130085a);
    }
}
