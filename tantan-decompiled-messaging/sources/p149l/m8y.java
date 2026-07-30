package p149l;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPropertyDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public class m8y implements Function0 {

    /* JADX INFO: renamed from: a */
    public final MemberDeserializer f132640a;

    /* JADX INFO: renamed from: b */
    public final ProtoBuf.Property f132641b;

    /* JADX INFO: renamed from: c */
    public final DeserializedPropertyDescriptor f132642c;

    public m8y(MemberDeserializer memberDeserializer, ProtoBuf.Property property, DeserializedPropertyDescriptor deserializedPropertyDescriptor) {
        this.f132640a = memberDeserializer;
        this.f132641b = property;
        this.f132642c = deserializedPropertyDescriptor;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return MemberDeserializer.m92200A(this.f132640a, this.f132641b, this.f132642c);
    }
}
