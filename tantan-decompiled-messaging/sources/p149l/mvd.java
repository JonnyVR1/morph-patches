package p149l;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public class mvd implements Function0 {

    /* JADX INFO: renamed from: a */
    public final DeserializedClassDescriptor f135895a;

    public mvd(DeserializedClassDescriptor deserializedClassDescriptor) {
        this.f135895a = deserializedClassDescriptor;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return DeserializedClassDescriptor.m92307f1(this.f135895a);
    }
}
