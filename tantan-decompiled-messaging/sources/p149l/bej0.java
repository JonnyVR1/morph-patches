package p149l;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer;

/* JADX INFO: loaded from: classes2.dex */
public class bej0 implements Function0 {

    /* JADX INFO: renamed from: a */
    public final TypeDeserializer f75164a;

    /* JADX INFO: renamed from: b */
    public final ProtoBuf.Type f75165b;

    public bej0(TypeDeserializer typeDeserializer, ProtoBuf.Type type) {
        this.f75164a = typeDeserializer;
        this.f75165b = type;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return TypeDeserializer.m92259r(this.f75164a, this.f75165b);
    }
}
