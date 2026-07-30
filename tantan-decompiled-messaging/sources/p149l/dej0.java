package p149l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer;

/* JADX INFO: loaded from: classes2.dex */
public class dej0 implements Function1 {
    public static final dej0 INSTANCE = new dej0();

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return Integer.valueOf(TypeDeserializer.m92250A((ProtoBuf.Type) obj));
    }
}
