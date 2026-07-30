package p153l;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPropertyDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public class jhy implements Function0 {

    /* JADX INFO: renamed from: a */
    public final MemberDeserializer f121023a;

    /* JADX INFO: renamed from: b */
    public final ProtoBuf.Property f121024b;

    /* JADX INFO: renamed from: c */
    public final DeserializedPropertyDescriptor f121025c;

    public jhy(MemberDeserializer memberDeserializer, ProtoBuf.Property property, DeserializedPropertyDescriptor deserializedPropertyDescriptor) {
        this.f121023a = memberDeserializer;
        this.f121024b = property;
        this.f121025c = deserializedPropertyDescriptor;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return MemberDeserializer.m93091A(this.f121023a, this.f121024b, this.f121025c);
    }
}
