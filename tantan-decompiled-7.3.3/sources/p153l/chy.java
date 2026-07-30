package p153l;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPropertyDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public class chy implements Function0 {

    /* JADX INFO: renamed from: a */
    public final MemberDeserializer f81881a;

    /* JADX INFO: renamed from: b */
    public final ProtoBuf.Property f81882b;

    /* JADX INFO: renamed from: c */
    public final DeserializedPropertyDescriptor f81883c;

    public chy(MemberDeserializer memberDeserializer, ProtoBuf.Property property, DeserializedPropertyDescriptor deserializedPropertyDescriptor) {
        this.f81881a = memberDeserializer;
        this.f81882b = property;
        this.f81883c = deserializedPropertyDescriptor;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return MemberDeserializer.m93109z(this.f81881a, this.f81882b, this.f81883c);
    }
}
