package p149l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer;

/* JADX INFO: loaded from: classes2.dex */
public class aej0 implements Function1 {

    /* JADX INFO: renamed from: a */
    public final TypeDeserializer f69047a;

    public aej0(TypeDeserializer typeDeserializer) {
        this.f69047a = typeDeserializer;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return TypeDeserializer.m92260v(this.f69047a, ((Number) obj).intValue());
    }
}
