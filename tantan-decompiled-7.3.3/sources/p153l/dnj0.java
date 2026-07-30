package p153l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer;

/* JADX INFO: loaded from: classes2.dex */
public class dnj0 implements Function1 {

    /* JADX INFO: renamed from: a */
    public final TypeDeserializer f89811a;

    public dnj0(TypeDeserializer typeDeserializer) {
        this.f89811a = typeDeserializer;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return TypeDeserializer.m93147f(this.f89811a, ((Number) obj).intValue());
    }
}
