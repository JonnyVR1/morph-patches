package p149l;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPropertyDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public class f8y implements Function0 {

    /* JADX INFO: renamed from: a */
    public final MemberDeserializer f96432a;

    /* JADX INFO: renamed from: b */
    public final ProtoBuf.Property f96433b;

    /* JADX INFO: renamed from: c */
    public final DeserializedPropertyDescriptor f96434c;

    public f8y(MemberDeserializer memberDeserializer, ProtoBuf.Property property, DeserializedPropertyDescriptor deserializedPropertyDescriptor) {
        this.f96432a = memberDeserializer;
        this.f96433b = property;
        this.f96434c = deserializedPropertyDescriptor;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return MemberDeserializer.m92218z(this.f96432a, this.f96433b, this.f96434c);
    }
}
