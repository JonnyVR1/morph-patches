package p149l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer;

/* JADX INFO: loaded from: classes2.dex */
public class cej0 implements Function1 {

    /* JADX INFO: renamed from: a */
    public final TypeDeserializer f80465a;

    public cej0(TypeDeserializer typeDeserializer) {
        this.f80465a = typeDeserializer;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return TypeDeserializer.m92262z(this.f80465a, (ProtoBuf.Type) obj);
    }
}
