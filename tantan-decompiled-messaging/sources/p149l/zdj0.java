package p149l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer;

/* JADX INFO: loaded from: classes2.dex */
public class zdj0 implements Function1 {

    /* JADX INFO: renamed from: a */
    public final TypeDeserializer f202670a;

    public zdj0(TypeDeserializer typeDeserializer) {
        this.f202670a = typeDeserializer;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return TypeDeserializer.m92256f(this.f202670a, ((Number) obj).intValue());
    }
}
