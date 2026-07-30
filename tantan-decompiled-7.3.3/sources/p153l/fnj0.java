package p153l;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer;

/* JADX INFO: loaded from: classes2.dex */
public class fnj0 implements Function0 {

    /* JADX INFO: renamed from: a */
    public final TypeDeserializer f99926a;

    /* JADX INFO: renamed from: b */
    public final ProtoBuf.Type f99927b;

    public fnj0(TypeDeserializer typeDeserializer, ProtoBuf.Type type) {
        this.f99926a = typeDeserializer;
        this.f99927b = type;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return TypeDeserializer.m93150r(this.f99926a, this.f99927b);
    }
}
