package p149l;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPropertyDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public class n8y implements Function0 {

    /* JADX INFO: renamed from: a */
    public final MemberDeserializer f137703a;

    /* JADX INFO: renamed from: b */
    public final ProtoBuf.Property f137704b;

    /* JADX INFO: renamed from: c */
    public final DeserializedPropertyDescriptor f137705c;

    public n8y(MemberDeserializer memberDeserializer, ProtoBuf.Property property, DeserializedPropertyDescriptor deserializedPropertyDescriptor) {
        this.f137703a = memberDeserializer;
        this.f137704b = property;
        this.f137705c = deserializedPropertyDescriptor;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return MemberDeserializer.m92202C(this.f137703a, this.f137704b, this.f137705c);
    }
}
