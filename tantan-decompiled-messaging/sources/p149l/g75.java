package p149l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDeserializer;

/* JADX INFO: loaded from: classes2.dex */
public class g75 implements Function1 {

    /* JADX INFO: renamed from: a */
    public final ClassDeserializer f101332a;

    public g75(ClassDeserializer classDeserializer) {
        this.f101332a = classDeserializer;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return ClassDeserializer.m92140c(this.f101332a, (ClassDeserializer.C15315a) obj);
    }
}
