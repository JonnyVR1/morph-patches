package p153l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDeserializer;

/* JADX INFO: loaded from: classes2.dex */
public class h85 implements Function1 {

    /* JADX INFO: renamed from: a */
    public final ClassDeserializer f108207a;

    public h85(ClassDeserializer classDeserializer) {
        this.f108207a = classDeserializer;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return ClassDeserializer.m93031c(this.f108207a, (ClassDeserializer.C15422a) obj);
    }
}
