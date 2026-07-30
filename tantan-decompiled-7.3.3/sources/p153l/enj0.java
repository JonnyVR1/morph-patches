package p153l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer;

/* JADX INFO: loaded from: classes2.dex */
public class enj0 implements Function1 {

    /* JADX INFO: renamed from: a */
    public final TypeDeserializer f94790a;

    public enj0(TypeDeserializer typeDeserializer) {
        this.f94790a = typeDeserializer;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return TypeDeserializer.m93151v(this.f94790a, ((Number) obj).intValue());
    }
}
