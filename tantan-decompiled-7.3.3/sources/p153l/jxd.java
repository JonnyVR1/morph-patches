package p153l;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public class jxd implements Function0 {

    /* JADX INFO: renamed from: a */
    public final DeserializedClassDescriptor f123019a;

    /* JADX INFO: renamed from: b */
    public final ProtoBuf.EnumEntry f123020b;

    public jxd(DeserializedClassDescriptor deserializedClassDescriptor, ProtoBuf.EnumEntry enumEntry) {
        this.f123019a = deserializedClassDescriptor;
        this.f123020b = enumEntry;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return DeserializedClassDescriptor.C15427b.m93238g(this.f123019a, this.f123020b);
    }
}
