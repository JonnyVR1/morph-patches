package p149l;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public class tvd implements Function1 {

    /* JADX INFO: renamed from: a */
    public final DeserializedClassDescriptor.C15320b f172277a;

    /* JADX INFO: renamed from: b */
    public final DeserializedClassDescriptor f172278b;

    public tvd(DeserializedClassDescriptor.C15320b c15320b, DeserializedClassDescriptor deserializedClassDescriptor) {
        this.f172277a = c15320b;
        this.f172278b = deserializedClassDescriptor;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return DeserializedClassDescriptor.C15320b.m92346f(this.f172277a, this.f172278b, (Name) obj);
    }
}
