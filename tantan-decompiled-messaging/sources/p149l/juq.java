package p149l;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.KCallableImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public class juq implements Function0 {

    /* JADX INFO: renamed from: a */
    public final ReceiverParameterDescriptor f119805a;

    public juq(ReceiverParameterDescriptor receiverParameterDescriptor) {
        this.f119805a = receiverParameterDescriptor;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return KCallableImpl.m87718p(this.f119805a);
    }
}
