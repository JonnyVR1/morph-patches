package p153l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer;

/* JADX INFO: loaded from: classes2.dex */
public class gnj0 implements Function1 {

    /* JADX INFO: renamed from: a */
    public final TypeDeserializer f105100a;

    public gnj0(TypeDeserializer typeDeserializer) {
        this.f105100a = typeDeserializer;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return TypeDeserializer.m93153z(this.f105100a, (ProtoBuf.Type) obj);
    }
}
