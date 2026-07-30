package p153l;

import kotlin.jvm.functions.Function2;
import kotlin.reflect.jvm.internal.KPackageImpl;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;

/* JADX INFO: loaded from: classes2.dex */
public class zxq implements Function2 {
    public static final zxq INSTANCE = new zxq();

    @Override // kotlin.jvm.functions.Function2
    public Object invoke(Object obj, Object obj2) {
        return KPackageImpl.m88783R((MemberDeserializer) obj, (ProtoBuf.Property) obj2);
    }
}
