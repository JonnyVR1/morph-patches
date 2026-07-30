package p153l;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPropertyDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public class khy implements Function0 {

    /* JADX INFO: renamed from: a */
    public final MemberDeserializer f126946a;

    /* JADX INFO: renamed from: b */
    public final ProtoBuf.Property f126947b;

    /* JADX INFO: renamed from: c */
    public final DeserializedPropertyDescriptor f126948c;

    public khy(MemberDeserializer memberDeserializer, ProtoBuf.Property property, DeserializedPropertyDescriptor deserializedPropertyDescriptor) {
        this.f126946a = memberDeserializer;
        this.f126947b = property;
        this.f126948c = deserializedPropertyDescriptor;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return MemberDeserializer.m93093C(this.f126946a, this.f126947b, this.f126948c);
    }
}
