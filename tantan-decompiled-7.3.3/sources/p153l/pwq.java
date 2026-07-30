package p153l;

import kotlin.jvm.functions.Function2;
import kotlin.reflect.jvm.internal.KClassImpl;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;

/* JADX INFO: loaded from: classes2.dex */
public class pwq implements Function2 {
    public static final pwq INSTANCE = new pwq();

    @Override // kotlin.jvm.functions.Function2
    public Object invoke(Object obj, Object obj2) {
        return KClassImpl.m88637b0((MemberDeserializer) obj, (ProtoBuf.Property) obj2);
    }
}
