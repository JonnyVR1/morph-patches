package p153l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public class hxd implements Function1 {

    /* JADX INFO: renamed from: a */
    public final DeserializedClassDescriptor.C15427b f111991a;

    /* JADX INFO: renamed from: b */
    public final DeserializedClassDescriptor f111992b;

    public hxd(DeserializedClassDescriptor.C15427b c15427b, DeserializedClassDescriptor deserializedClassDescriptor) {
        this.f111991a = c15427b;
        this.f111992b = deserializedClassDescriptor;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return DeserializedClassDescriptor.C15427b.m93237f(this.f111991a, this.f111992b, (Name) obj);
    }
}
