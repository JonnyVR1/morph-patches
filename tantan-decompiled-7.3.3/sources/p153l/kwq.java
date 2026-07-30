package p153l;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.KCallableImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public class kwq implements Function0 {

    /* JADX INFO: renamed from: a */
    public final ReceiverParameterDescriptor f129087a;

    public kwq(ReceiverParameterDescriptor receiverParameterDescriptor) {
        this.f129087a = receiverParameterDescriptor;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return KCallableImpl.m88609p(this.f129087a);
    }
}
