package p149l;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public class vvd implements Function0 {

    /* JADX INFO: renamed from: a */
    public final DeserializedClassDescriptor f183208a;

    /* JADX INFO: renamed from: b */
    public final ProtoBuf.EnumEntry f183209b;

    public vvd(DeserializedClassDescriptor deserializedClassDescriptor, ProtoBuf.EnumEntry enumEntry) {
        this.f183208a = deserializedClassDescriptor;
        this.f183209b = enumEntry;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return DeserializedClassDescriptor.C15320b.m92347g(this.f183208a, this.f183209b);
    }
}
