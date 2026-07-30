package p149l;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public class jvd implements Function0 {

    /* JADX INFO: renamed from: a */
    public final DeserializedClassDescriptor f119929a;

    public jvd(DeserializedClassDescriptor deserializedClassDescriptor) {
        this.f119929a = deserializedClassDescriptor;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return DeserializedClassDescriptor.m92306e1(this.f119929a);
    }
}
