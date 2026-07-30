package p149l;

import kotlin.jvm.functions.Function2;
import kotlin.reflect.jvm.internal.KPackageImpl;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;

/* JADX INFO: loaded from: classes2.dex */
public class yvq implements Function2 {
    public static final yvq INSTANCE = new yvq();

    @Override // kotlin.jvm.functions.Function2
    public Object invoke(Object obj, Object obj2) {
        return KPackageImpl.m87892R((MemberDeserializer) obj, (ProtoBuf.Property) obj2);
    }
}
