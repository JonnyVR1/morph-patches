package p149l;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public class kvd implements Function0 {

    /* JADX INFO: renamed from: a */
    public final DeserializedClassDescriptor f124764a;

    public kvd(DeserializedClassDescriptor deserializedClassDescriptor) {
        this.f124764a = deserializedClassDescriptor;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return DeserializedClassDescriptor.m92305V0(this.f124764a);
    }
}
