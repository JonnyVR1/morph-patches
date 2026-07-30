package p149l;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPropertyDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public class g8y implements Function0 {

    /* JADX INFO: renamed from: a */
    public final MemberDeserializer f101529a;

    /* JADX INFO: renamed from: b */
    public final ProtoBuf.Property f101530b;

    /* JADX INFO: renamed from: c */
    public final DeserializedPropertyDescriptor f101531c;

    public g8y(MemberDeserializer memberDeserializer, ProtoBuf.Property property, DeserializedPropertyDescriptor deserializedPropertyDescriptor) {
        this.f101529a = memberDeserializer;
        this.f101530b = property;
        this.f101531c = deserializedPropertyDescriptor;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return MemberDeserializer.m92201B(this.f101529a, this.f101530b, this.f101531c);
    }
}
